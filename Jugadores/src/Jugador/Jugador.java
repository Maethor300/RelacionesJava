package Jugador;

public class Jugador {
    private String name;
    private String apellido;
    private int posicion;
    private int numero;
    public Jugador(){

    }
    public Jugador(String name, String apellido, int posicion, int numero) {
        this.name = name;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion=" + posicion +
                ", numero=" + numero +
                '}'+'\n';
    }
}
