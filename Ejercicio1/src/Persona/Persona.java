package Persona;

import Perro.Perro;

public class Persona {
    private String name;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;
    public Persona(){

    }

    public Persona(String name, String apellido, int edad, int documento) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;

    }
    public Perro getPerro(){
        return perro;
    }
    public void setPerro(Perro p){
         this.perro = p;
    }

    //Getter&Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento=" + documento +
                ", perro=" + perro +
                '}';
    }
}
