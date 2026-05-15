package persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;
import modelo.Profesor;

public class SerializacionUtil {
    private static final String ARCHIVO_ESTUDIANTES = "estudiantes.dat";
    private static final String ARCHIVO_PROFESORES = "profesores.dat";

    public static void guardarEstudiantes(List<Estudiante> estudiantes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_ESTUDIANTES))) {
            oos.writeObject(estudiantes);
        } catch (IOException e) {
            System.out.println("Error al guardar estudiantes: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Estudiante> cargarEstudiantes() {
        File archivo = new File(ARCHIVO_ESTUDIANTES);
        if (!archivo.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_ESTUDIANTES))) {
            return (List<Estudiante>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }


    public static void guardarProfesores(List<Profesor> profesores) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_PROFESORES))) {
            oos.writeObject(profesores);
        } catch (IOException e) {
            System.out.println("Error al guardar profesores: " + e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    public static List<Profesor> cargarProfesores() {
        File archivo = new File(ARCHIVO_PROFESORES);
        if (!archivo.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_PROFESORES))) {
            return (List<Profesor>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}