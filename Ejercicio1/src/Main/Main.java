package Main;


import Perro.Perro;
import PerroServices.PerroServices;
import Persona.Persona;
import PersonaServices.PersonaServices;

public class Main {
    public static void main(String[] args) {
        PerroServices ps = new PerroServices();
        PersonaServices personaServices = new PersonaServices();
        System.out.println("------DataPerro------");
        ps.llenarData();
        System.out.println("------DataPersona------");
        personaServices.llenarDataPersona();
        personaServices.Adoptar(PerroServices.perros);
        personaServices.mostrarDataPersona();
        ps.MostrarData();
    }
}