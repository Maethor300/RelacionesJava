package JugadorServices;

import Jugador.Jugador;
import RevolverAgua.RevolverAgua;
import RevolverAguaServices.RevolverAguaServices;

public class JugadorServices {
    RevolverAguaServices ras = new RevolverAguaServices();
    Jugador jugador = new Jugador();
    public boolean disparo(){
        if(ras.mojar()){
            return false;
        }else {

            return true;
        }
    }
}
