package DNI;

public class DNI {
      private char caracter;
      private int numero;

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" +
                "caracter=" + caracter +
                ", numero=" + numero +
                '}';
    }
}
