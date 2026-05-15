package modelo;

public class Profesor extends Persona {
    private String numeroEmpleado;

    public Profesor() {}

    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String correo, String numeroEmpleado) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, correo);
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNumeroEmpleado() { return numeroEmpleado; }
    public void setNumeroEmpleado(String numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Empleado: " + numeroEmpleado;
    }
}