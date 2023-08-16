package Cartas;

import Palo.Palo;

import java.util.ArrayList;

public class Cartas {
    private int numero;
    private Palo palo;
    private String paloClass;

    public Cartas(){

    }


    public Cartas(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPaloClass() {
        return paloClass;
    }

    public void setPaloClass(String paloClass) {
        this.paloClass = paloClass;
    }

    @Override
    public String toString() {
        return "Cartas{" +
                "numero=" + numero +
                ", paloClass='" + paloClass + '\'' +
                '}';
    }
}
