package Voto;

import Alumno.Alumno;

import java.util.ArrayList;
import java.util.HashSet;

public class Voto {
    private Alumno alumno;
    private HashSet<String> alumnosVotos = new HashSet<>();

    public Alumno  getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno  alumno) {
        this.alumno = alumno;
    }
    public void mostrarData(){
        for (String i : alumnosVotos
             ) {
            System.out.println(i);
        }
    }
    public HashSet<String>  getAlumnosVotos() {
        return alumnosVotos;
    }

    public void setAlumnosVotos(HashSet<String> alumnosVotos) {
        this.alumnosVotos = alumnosVotos;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "alumno=" + alumno +
                '}';
    }
}
