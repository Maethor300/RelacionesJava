package Main;

import Equipo.Equipo;
import Jugador.Jugador;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Jugador jugador1 = new Jugador("David" ,"Mendoza", 4,22 );
         Jugador jugador2 = new Jugador("Carlos" ,"Mendoza", 3,25);
         Equipo equipo = new Equipo();

         equipo.getDataBase().add(jugador1);
        equipo.getDataBase().add(jugador2);
        System.out.println(equipo.getDataBase());
    }
}