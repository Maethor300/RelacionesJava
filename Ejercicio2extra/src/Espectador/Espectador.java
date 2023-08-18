package Espectador;

import java.util.ArrayList;

public class Espectador {
    private String name;
    private int edad;
    private double dinero;
    private int id;
    public static  ArrayList<Espectador> espectadores =  new ArrayList<>();
    public Espectador(){

    }
    public Espectador(String name, int edad, double dinero,int id) {
        this.name = name;
        this.edad = edad;
        this.dinero = dinero;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", dinero=" + dinero +
                ", id=" + id +
                '}';
    }
}
