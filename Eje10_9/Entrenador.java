package Eje10_9;

public class Entrenador extends Persona{
    private int estrategia;
    public Entrenador(String nombre, String apellido, int edad, int estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;

    }

    public int getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }
    public void planificarEntrenamiento(){
        System.out.println("Planifica entrenamiento");
    }
    @Override
    public void entrenamiento(){
        System.out.println("Dirige entrenamiento");
    }
    @Override
    public void PartidoDeFutbol(){
        System.out.println("Dirige el partido");
    }
}
