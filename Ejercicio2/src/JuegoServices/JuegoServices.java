package JuegoServices;

import Juego.Juego;
import Jugador.Jugador;
import JugadorServices.JugadorServices;
import RevolverAguaServices.RevolverAguaServices;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoServices {

    Scanner scanner = new Scanner(System.in);
    JugadorServices jugadorServices = new JugadorServices();

    RevolverAguaServices ras = new RevolverAguaServices();

    public ArrayList llenarJuego(ArrayList<Jugador> jugadores){
        System.out.println("Ingrese cuantos jugadores");
        int cantidad = scanner.nextInt();
        if(cantidad < 1 || cantidad > 6){
            cantidad = 6;
        }
        for (int i = 0; i < cantidad; i++) {
            Jugador jugador = new Jugador();
            System.out.println("Nombre del jugador:");
            jugador.setName(scanner.next());
            jugador.setMojado(jugadorServices.disparo());
            jugadores.add(jugador);
        }

        return jugadores;
    }

    public void ronda(ArrayList<Jugador> jugadores){

        do {
            llenarJuego(jugadores);
            ras.llenarRevolver();
           boolean salirDelJuego = jugadorServices.disparo();
            for (Jugador i: jugadores
                 ) {
                System.out.println(i);
            }
            for (int i = 0; i < jugadores.size(); i++) {
                if(!jugadores.get(i).isMojado()){
                    System.out.println("El jugador que se mojo fue:");
                    System.out.println(jugadores.get(i));
                    break;
                }
                ras.siguienteChorro();
            }
           if(!salirDelJuego){
               break;
           }
        }while(true);
    }
}
