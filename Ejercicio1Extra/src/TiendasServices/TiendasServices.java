package TiendasServices;

import ProductoServices.ProductoServices;
import Tiendas.Tiendas;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendasServices {
    ArrayList<Tiendas> tiendas1 = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ProductoServices productoServices = new ProductoServices();
    int conteo = 0;
    public void crearTiendas(){

        System.out.println("Digita el nombre de la Tienda:");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Digita la direccion de la tienda:");
        String direccion = scanner.nextLine();
        System.out.println("Digita el representante");
        String representante = scanner.nextLine();
        tiendas1.add(new Tiendas(conteo++,productoServices.CrearProducto(),direccion,representante,name));
    }
    public void modificarTienda(){
        System.out.println("Digita el nombre de la tienda:");
        String name = scanner.nextLine();
        for (Tiendas i : tiendas1
        ) {
            if(i.getName().equals(name)){
                System.out.println("Nuevo nombre");
                String nuevoNombre = scanner.next();
                i.setName(nuevoNombre);
                System.out.println("Modificar producto");

                    productoServices.modificarProducto(i.getProductos());

                System.out.println("Digita la nueva direccion");
                String direccionNueva = scanner.nextLine();
                i.setDireccion(direccionNueva);
                System.out.println("Digita el nuevo representante");
                String representante = scanner.nextLine();
                i.setRepresentante(representante);
            }
        }
    }
    public void eliminarProductos1(){
        System.out.println("Digita el nombre de la tienda:");
        String name = scanner.nextLine();
        for (Tiendas i : tiendas1
             ) {
            if(i.getName().equals(name)){
                productoServices.eliminarProductos(i.getProductos());
            }
        }
    }
    public void mostrarData(){
        for (Tiendas i : tiendas1
             ) {
            System.out.println(i);
        }
    }
}
