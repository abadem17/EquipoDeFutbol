package Eje10_9;

import java.util.ArrayList;

public class Main {

    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Persona futbolista = new Futbolista("Gonzalo",
            "Higuain",23,9,"Delantero");
    static Persona entrenador = new Entrenador();
    public static void main(String[] args) {

        System.out.println("Menu" +
                "\n1. Viaje de equipo" +
                "\n2. Entrenamiento" +
                "\n3. Partido de futbol" +
                "\n4. Planificar entrenamiento" +
                "\n4. Entrevista" +
                "\n5. Curar lesion");
    }
}
