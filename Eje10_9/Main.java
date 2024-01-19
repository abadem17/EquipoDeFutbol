package Eje10_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Persona futbolista = new Futbolista("Gonzalo",
            "Higuain",23,9,"Delantero");
    static Persona futbolista1 = new Futbolista("Chicharito",
            "Hernandez",23,9,"Delantero");
    static Persona entrenador = new Entrenador("Entrenador",
            "Gonzales",23,9);
    static Persona medico = new Doctor("Dr.",
            "Lopez",23,"Doctorado",6);
    public static void main(String[] args) {
        persona.add(futbolista);
        persona.add(futbolista1);
        persona.add(entrenador);
        persona.add(medico);
        menu();

    }
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int dato;

        do {


            System.out.println("Menu" +
                    "\n1. Viaje de equipo" +
                    "\n2. Entrenamiento" +
                    "\n3. Partido de futbol" +
                    "\n4. Planificar entrenamiento" +
                    "\n4. Entrevista" +
                    "\n5. Curar lesion" +
                    "\n6. Salir");
            System.out.println("Digite una opcion: ");
            dato = entrada.nextInt();

            switch(dato){
                case 1:
                    System.out.println();
                    viajarEquipo();
                    break;
                case 2:
                    System.out.println();
                    entrenamientoEquipo();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    planificarEntrenamiento();
                    break;
                case 5 :
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    break;
                default:
                    System.out.println("Error, digite de nuevo.");
                    break;
            }
        }while(dato!=6);
    }
    public static void viajarEquipo(){

        for (Persona equipo : persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.viajar();
        }
        System.out.println();
    }
    public static void entrenamientoEquipo(){
        for (Persona equipo : persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.entrenamiento();
        }
        System.out.println();
    }
    public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
        ((Entrenador)entrenador).PartidoDeFutbol();
        System.out.println();
    }
}
