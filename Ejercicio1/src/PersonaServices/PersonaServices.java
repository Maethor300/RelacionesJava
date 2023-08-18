package PersonaServices;

import Perro.Perro;
import Persona.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServices {
     ArrayList<Persona> personas = new ArrayList<>();

    public void llenarDataPersona(){
        Persona persona = new Persona("David","Mendoza",23,123941);
        Persona persona1 = new Persona("Yamile","Cardenas",35,54235);
        Persona persona2 = new Persona("Valeria","Correa",29,45665);
        Persona persona3 = new Persona("Alejandra","Ramos",26,12353441);
        Persona persona4 = new Persona("Leo","Erazo",40,12335241);
        personas.add(persona);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
    }
    public void mostrarDataPersona(){
        for (Persona i : personas
             ) {
            System.out.println(i);
        }
    }
    public void Adoptar(ArrayList<Perro> perros) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quieres adoptar perros:");
        System.out.println("Mira la base de datos");
        for (Perro i : perros
        ) {
            System.out.println(i);
        }


        System.out.println("Escribe el nombre de la persona");
        String name = scanner.next();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getName().equalsIgnoreCase(name)) {

                System.out.println("Digita el nombre del perro:");
                String nameDog = scanner.next();
                for (Perro j: perros) {

                    if(j.getName().equalsIgnoreCase(nameDog) && !j.isAdoptado()) {
                        j.setAdoptado(true);
                        personas.get(i).setPerro(j);
                        break;
                    }
            }

        }

}
    }
}
