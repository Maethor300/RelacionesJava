package Main;

import Juego.Juego;
import JuegoServices.JuegoServices;
import Jugador.Jugador;
import JugadorServices.JugadorServices;
import RevolverAgua.RevolverAgua;
import RevolverAguaServices.RevolverAguaServices;

public class Main {
    public static void main(String[] args) {
        RevolverAgua revolverAgua = new RevolverAgua();
        RevolverAguaServices ras = new RevolverAguaServices();
        Juego juego = new Juego();
        JuegoServices juegoServices = new JuegoServices();
        JugadorServices js = new JugadorServices();
        juego.mandaInfoRonda();

    }
}