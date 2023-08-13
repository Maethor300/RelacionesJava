package Main;

import DNI.DNI;
import Persona.Persona;


public class Main {
    public static void main(String[] args) {
        DNI dni = new DNI();
        dni.setCaracter('A');
        dni.setNumero(314236678);
        Persona persona = new Persona();
        persona.setDni(dni);
        System.out.println(persona.getDni());
    }
}