package Eje10_9;

public class Doctor extends Persona{
    private String titulacion;
    private int anosExpericencia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int anosExpericencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anosExpericencia = anosExpericencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExpericencia() {
        return anosExpericencia;
    }

    public void setAnosExpericencia(int anosExpericencia) {
        this.anosExpericencia = anosExpericencia;
    }
}
