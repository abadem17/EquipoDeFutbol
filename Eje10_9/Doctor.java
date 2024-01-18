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
    public void curarLesion(){
        System.out.println("Cura lesion");
    }
    public void PartidoDeFutbol(){
        System.out.println("Da asistencia en partido");
    }
    public void entrenamiento(){
        System.out.println("Da asistencia en entrenamiento");
    }
}
