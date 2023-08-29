package Tiendas;

import Producto.Producto;

import java.util.ArrayList;

public class Tiendas {
      private int id;
      private String name;
      private ArrayList<Producto> productos = new ArrayList<>();
      private String direccion;
      private String representante;
      public Tiendas(){

      }

      public Tiendas(int id, ArrayList<Producto> productos, String direccion, String representante,String name) {
            this.id = id;
            this.productos = productos;
            this.direccion = direccion;
            this.representante = representante;
            this.name = name;
      }

      public int getId() {
            return id;
      }

      public void setId(int id) {
            this.id = id;
      }

      public ArrayList<Producto> getProductos() {
            return productos;
      }

      public void setProductos(ArrayList<Producto> productos) {
            this.productos = productos;
      }

      public String getDireccion() {
            return direccion;
      }

      public void setDireccion(String direccion) {
            this.direccion = direccion;
      }

      public String getRepresentante() {
            return representante;
      }

      public void setRepresentante(String representante) {
            this.representante = representante;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      @Override
      public String toString() {
            return "Tiendas{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", productos=" + productos +
                    ", direccion='" + direccion + '\'' +
                    ", representante='" + representante + '\'' +
                    '}';
      }
}
