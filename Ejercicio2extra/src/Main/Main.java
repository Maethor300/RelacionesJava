package Main;


import Cine.Cine;
import CineServices.CineServices;
import Espectador.Espectador;
import EspectadorServices.EspectadorServices;
import Peliculas.Peliculas;
import PeliculasServices.PeliculaServices;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PeliculaServices ps = new PeliculaServices();
        EspectadorServices es = new EspectadorServices();
        Espectador espectador = new Espectador();
        Peliculas peliculas = new Peliculas();
        CineServices cineServices = new CineServices();
        Cine cine = new Cine();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Menu-----");
            System.out.println("1:Crear Peliculas");
            System.out.println("2:Mostrar Data");
            System.out.println("3:Crear persona");
            System.out.println("4:Mostrar Data Persona");
            System.out.println("5:Mostrar Data Peliculas");
            System.out.println("6:Mostrar Salas");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> ps.llenarDataPeliculas(cineServices.getDataInfoAllCine());
                case 2 -> cineServices.showAllData(cineServices.getDataInfoAllCine());
                case 3 -> ps.llenarEspectador(cineServices.getDataInfoAllCine());
                case 4 -> es.mostarInfoPersona(Espectador.espectadores);
                case 5 -> ps.mostrarInfo();
                case 6 -> cineServices.mostrarSalas();
            }
        }while(true);
    }
}