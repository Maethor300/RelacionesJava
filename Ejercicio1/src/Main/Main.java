package Main;


import Perro.Perro;
import Persona.Persona;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Pulgas", "Coocker spaniel", 3, 34);
        Perro perro2 = new Perro("rayas", "Pastor aleman", 5, 60);
        Persona persona1 = new Persona("David","Mendoza",24,1018,perro1);
        Persona persona2 = new Persona("Martha","Erazo",59,1050,perro2);
        persona1.setPerro(perro1);
        persona2.setPerro(perro2);
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}