package Main;

import Simulador.Simulador;
import Voto.Voto;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Simulador simulador = new Simulador();
        Voto voto = new Voto();
        do {
            System.out.println("-----Menu-----");
            System.out.println("1: Introducir Info: Necesario para Ejecutar todo el programa");
            System.out.println("2: Mostrar Info");
            System.out.println("3: Mostrar Data votos");
            System.out.println("4: Recuento de votos: Necesario para Ejecutar el 5 ");
            System.out.println("5: Mostrar Data Facilitadores");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> simulador.crearData(voto.getAlumnosVotos());
                case 2 -> simulador.mostrarData();
                case 3 -> voto.mostrarData();
                case 4 -> simulador.recuentoVotos(10);
                case 5 -> simulador.mostrarDataVotosBig();
            }
        }while(true);
    }
}