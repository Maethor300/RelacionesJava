package Jugador;

import java.time.temporal.JulianFields;

public class Jugador {
    private int id;
    private String name;
    private boolean mojado = true;
    public Jugador(){

    }
    public Jugador(String name, boolean mojado) {

        this.name = name +"" +id+1;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mojado=" + mojado +
                '}';
    }
}
