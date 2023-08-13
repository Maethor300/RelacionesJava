package Perro;

import Persona.Persona;

public class Perro {
    private String name;
    private String raza;
    private int edad;
    private double tamaño;
    public Perro(){

    }
    public Perro(String name, String raza, int edad, double tamaño) {
        this.name = name;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
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

    @Override
    public String toString() {
        return "Perro{" +
                "name='" + name + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamaño=" + tamaño +
                '}';
    }
}
