package RevolverAguaServices;

import RevolverAgua.RevolverAgua;

import java.util.Random;

public class RevolverAguaServices {
    RevolverAgua revolverAgua = new RevolverAgua();
    Random random = new Random();
    public void llenarRevolver(){
        revolverAgua.setPosicionAgua(random.nextInt(6) +1);
        revolverAgua.setPosicionActual(random.nextInt(6)+1);
    }
    public boolean mojar(){

        if(revolverAgua.getPosicionActual() == revolverAgua.getPosicionAgua()){
            System.out.println("Actual " + revolverAgua.getPosicionActual());
            System.out.println("Agua: " + revolverAgua.getPosicionAgua());
            return false;
        }else {
            System.out.println("Actual " + revolverAgua.getPosicionActual());
            System.out.println("Agua: " + revolverAgua.getPosicionAgua());
            return true;
        }

    }
    public void siguienteChorro(){
        revolverAgua.setPosicionActual(random.nextInt(6) +1);
        System.out.println("Nueva posicion " +revolverAgua.getPosicionActual());
    }
}
