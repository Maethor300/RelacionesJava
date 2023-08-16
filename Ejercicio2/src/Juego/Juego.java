package Juego;

import JuegoServices.JuegoServices;
import Jugador.Jugador;
import RevolverAgua.RevolverAgua;

import java.util.ArrayList;

public class Juego {
    private RevolverAgua revolverAgua;

    ArrayList<Jugador>jugadores = new ArrayList<>();
    JuegoServices js = new JuegoServices();
    public Juego(){

    }

    public void mandaInfoRonda(){
        js.ronda(jugadores);
    }

}
