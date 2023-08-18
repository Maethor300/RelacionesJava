package EspectadorServices;

import Espectador.Espectador;
import Peliculas.Peliculas;
import PeliculasServices.PeliculaServices;

import java.util.ArrayList;
import java.util.Scanner;

public class EspectadorServices {

    Peliculas peliculas = new Peliculas();
    PeliculaServices ps = new PeliculaServices();

    public void mostarInfoPersona(ArrayList<Espectador> espectadores){

            for (Espectador i : espectadores
                 ) {
                System.out.println(i);

            }
    }
}
