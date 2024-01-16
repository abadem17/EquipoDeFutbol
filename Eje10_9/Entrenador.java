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
}
