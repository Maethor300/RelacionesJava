package Main;

import ProductoServices.ProductoServices;
import TiendasServices.TiendasServices;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProductoServices ps = new ProductoServices();
        TiendasServices tiendasServices = new TiendasServices();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese una opcion");
            int opcion = scanner.nextInt();
             switch (opcion){
                 case 1-> tiendasServices.crearTiendas();
                 case 2 -> tiendasServices.mostrarData();
                 case 3 -> tiendasServices.modificarTienda();
                 case 4 -> tiendasServices.eliminarProductos1();
             }
        }while (true);
    }
}