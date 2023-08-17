package PerroServices;

import Perro.Perro;

import java.util.ArrayList;

public class PerroServices {

    public static ArrayList<Perro> perros = new ArrayList<Perro>();

    public void llenarData(){

        Perro perro1 = new Perro("Pulgas", "Coocker spaniel", 3, 34,false);
        Perro perro2 = new Perro("rayas", "Bulldog", 5, 60,false);
        Perro perro3 = new Perro("lupita", "Pastor aleman", 6, 50,false);
        Perro perro4 = new Perro("beto", "Labrador retriever", 8, 45,false);
        Perro perro5 = new Perro("blue", "Golden retriever", 7, 30,false);

        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
        perros.add(perro5);
    }

    public void MostrarData(){
        for (Perro i : perros
             ) {
            System.out.println(i);
        }
    }
}
