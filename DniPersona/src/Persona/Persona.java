package Persona;

import DNI.DNI;


public class Persona {
    private String name;
    private String apellido;
    private DNI dni;
    public Persona(){

    }
    public Persona(String name, String apellido, DNI dni) {
        this.name = name;
        this.apellido = apellido;
        this.dni = dni;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }
}
