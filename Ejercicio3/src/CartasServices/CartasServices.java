package CartasServices;

import Cartas.Cartas;
import Palo.Palo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartasServices {
    ArrayList<Cartas> cartasDataBase = new ArrayList<>();
    ArrayList<String> CartasMonton = new ArrayList<>();
    public void llenar(){
        int conteo = 1;
        for (int i = 1; i < 49; i++) {
            Cartas cartas = new Cartas();

            if(conteo!=8 && conteo!=9&&i<=12){
                cartas.setNumero(conteo);
                cartas.setPaloClass(Palo.ESPADAS.name());

            } else if (conteo != 8 && conteo != 9 && i <= 24) {
                cartas.setNumero(conteo);
                cartas.setPaloClass(Palo.BASTOS.name());
            } else if (conteo != 8 && conteo != 9 && i <= 36) {
                cartas.setNumero(conteo);
                cartas.setPaloClass(Palo.OROS.name());
            } else if (conteo != 8 && conteo != 9) {
                cartas.setNumero(conteo);
                cartas.setPaloClass(Palo.COPAS.name());
            }

            if(conteo == 12){
                conteo = 1;
            }else {
                conteo++;
            }

                cartasDataBase.add(cartas);

        }
    }
    public void barajar(){
        Collections.shuffle(cartasDataBase);
    }
    public void darCartas(){
        Scanner scanner = new Scanner(System.in);
        int conteo = 0;
        do {
            System.out.println("Escogiste una carta");
            System.out.println(cartasDataBase.get(conteo).getNumero()+" "+cartasDataBase.get(conteo).getPaloClass());
            CartasMonton.add(cartasDataBase.get(conteo).getNumero()+" "+cartasDataBase.get(conteo).getPaloClass());
            cartasDataBase.remove(conteo);
            System.out.println("Quieres otra carta 1 para si 0 para no");
            int numero = scanner.nextInt();
            if(numero == 0){
                siguienteCarta();
                break;
            }

        }while(true);
    }
    public void siguienteCarta(){
        for (int i = 0; i < cartasDataBase.size(); i++) {
            if(i==0&&cartasDataBase.get(i).getNumero()!=0){
                System.out.println("Seguiente Carta: " + cartasDataBase.get(i).getNumero() +" "+cartasDataBase.get(i).getPaloClass());
            }
        }
    }
    public void cartasMoton(){
        for (String i : CartasMonton
             ) {
            System.out.println(i);
        }
    }
    public void recorrerDataBase(){
        for (Cartas i : cartasDataBase
        ) {
                System.out.println(i);

        }
    }
}
