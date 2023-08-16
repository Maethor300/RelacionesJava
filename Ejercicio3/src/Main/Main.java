package Main;

import Cartas.Cartas;
import CartasServices.CartasServices;
import Palo.Palo;

public class Main {
    public static void main(String[] args) {
CartasServices cs = new CartasServices();
        cs.llenar();
        cs.barajar();
        cs.siguienteCarta();
        cs.darCartas();
        cs.cartasMoton();
        cs.recorrerDataBase();
    }
}