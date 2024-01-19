package Eje10_9;

public class Futbolista extends Persona {
    private int dorsal;
    private String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void entrevista(){
        System.out.println("Da entrevista");
    }
    @Override
    public void entrenamiento(){
        System.out.println("Entrenando");
    }
    public void PartidoDeFutbol(){
        System.out.println("juega el partido");
    }

}
