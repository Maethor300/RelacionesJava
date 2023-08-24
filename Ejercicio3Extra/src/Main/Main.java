package Main;

import ClientesServices.ClientesServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClientesServices cs = new ClientesServices();
        do {
            System.out.println("-----Menu-----");
            System.out.println("1: Registrarse");
            System.out.println("2: Mostrar Data");
            System.out.println("Digita alguna accion");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> cs.createCliente();
                case 2 -> cs.mostrarData();
            }
        }while(true);
    }
}