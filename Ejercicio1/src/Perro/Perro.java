package Perro;

import Persona.Persona;

public class Perro {
    private String name;
    private String raza;
    private int edad;
    private double tamaño;
    private boolean adoptado = true;
    public Perro(){

    }
    public Perro(String name, String raza, int edad, double tamaño,boolean adoptado) {
        this.name = name;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.adoptado = adoptado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "name='" + name + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamaño=" + tamaño +
                ", adoptado=" + adoptado +
                '}';
    }
}
