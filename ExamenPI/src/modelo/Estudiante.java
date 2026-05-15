package modelo;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante() {}

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String correo, String matricula) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, correo);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + matricula;
    }
}