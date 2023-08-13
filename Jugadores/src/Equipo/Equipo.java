package Equipo;

import Jugador.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    List<Jugador> dataBase = new ArrayList<>();
    public Equipo(){

    }
    public Equipo(List<Jugador > dataBase) {
        this.dataBase = dataBase;
    }

    public List<Jugador > getDataBase() {
        return dataBase;
    }

    public void setDataBase(List<Jugador > dataBase) {
        this.dataBase = dataBase;
    }
}
