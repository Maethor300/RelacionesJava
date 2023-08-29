package ProductoServices;

import Producto.Producto;
import Tiendas.Tiendas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ProductoServices {
      //private HashSet<Producto> productos1 = new HashSet<>();


      Scanner scanner = new Scanner(System.in);
      Producto producto;
      public ArrayList<Producto> CrearProducto(){
          int conteo = 0;
          ArrayList<Producto> productosActual = new ArrayList<>();
          do {

              System.out.println("Digita el nombre del producto:");
              String name = scanner.nextLine();
              System.out.println("Digita el Precio");
              double precio = scanner.nextDouble();

              productosActual.add(new Producto(conteo++, name, precio));
             // productos1.add(new Producto(conteo++, name, precio));
              scanner.nextLine();

              System.out.println("Quieres agregar Otro? 1 para si o 0 no ");
              int opcionSalir = scanner.nextInt();
              if(opcionSalir == 0){
                  break;
              }
              scanner.nextLine();
          }while (true);
          return productosActual;
      }
      public void modificarProducto(ArrayList<Producto> productos1){
          do {
              boolean salir = false;
              scanner.nextLine();
              System.out.println("Digita el nombre del producto:");
              String name = scanner.nextLine();
              for (int i = 0; i < productos1.size(); i++) {


                  if (productos1.get(i).getName().equals(name)) {
                      System.out.println("Digita el nuevo nombre:");
                      String newName = scanner.nextLine();
                      productos1.get(i).setName(newName);
                      System.out.println("Digita el nuevo Precio:");
                      double newPrice = scanner.nextDouble();
                      productos1.get(i).setPrecio(newPrice);
                      salir = true;

                  }
              }
              if(salir){
                  System.out.println("salir");
                  break;
              }else {
                  System.out.println("Producto No encotrado");
              }
          }while (true);

      }
      public void eliminarProductos(ArrayList<Producto> productosEliminar){
          do {
              boolean salir = false;
              scanner.nextLine();
              System.out.println("Digita el nombre del producto:");
              String name = scanner.nextLine();
              for (int i = 0; i < productosEliminar.size(); i++) {
                  if (productosEliminar.get(i).getName().equals(name)){
                      productosEliminar.remove(i);
                      
                  }
              }
              if(salir){
                  break;
              }
          }while (true);
      }
      /*public void mostrarProducts() {
          for (Producto i : productos1
          ) {
              System.out.println(i);
          }
      }*/
}
