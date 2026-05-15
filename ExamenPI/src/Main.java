import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Estudiante;
import modelo.Profesor;
import persistencia.SerializacionUtil;

public class Main {
    private static List<Estudiante> estudiantes = new ArrayList<>();
    private static List<Profesor> profesores = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       
        estudiantes = SerializacionUtil.cargarEstudiantes();
        profesores = SerializacionUtil.cargarProfesores();

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. CRUD Estudiantes");
            System.out.println("2. CRUD Profesores");
            System.out.println("3. Guardar datos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> crudEstudiantes();
                case 2 -> crudProfesores();
                case 3 -> {
                    SerializacionUtil.guardarEstudiantes(estudiantes);
                    SerializacionUtil.guardarProfesores(profesores);
                    System.out.println("Datos guardados correctamente.");
                }
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private static void crudEstudiantes() {
        System.out.println("\n--- CRUD Estudiantes ---");
        System.out.println("1. Agregar");
        System.out.println("2. Listar");
        System.out.println("3. Eliminar");
        System.out.print("Elige una opción: ");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1 -> {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apellido Paterno: ");
                String apPat = sc.nextLine();
                System.out.print("Apellido Materno: ");
                String apMat = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                System.out.print("Correo: ");
                String correo = sc.nextLine();
                System.out.print("Matrícula: ");
                String matricula = sc.nextLine();

                estudiantes.add(new Estudiante(nombre, apPat, apMat, edad, correo, matricula));
                System.out.println("Estudiante agregado.");
            }
            case 2 -> {
                if (estudiantes.isEmpty()) System.out.println("No hay estudiantes.");
                else {
                    for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.println("[" + i + "] " + estudiantes.get(i));
                    }
                }
            }
            case 3 -> {
                System.out.print("Índice a eliminar: ");
                int idx = sc.nextInt();
                if (idx >= 0 && idx < estudiantes.size()) {
                    estudiantes.remove(idx);
                    System.out.println("Estudiante eliminado.");
                } else {
                    System.out.println("Índice inválido.");
                }
            }
        }
    }

    private static void crudProfesores() {
        System.out.println("\n--- CRUD Profesores ---");
        System.out.println("1. Agregar");
        System.out.println("2. Listar");
        System.out.println("3. Eliminar");
        System.out.print("Elige una opción: ");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1 -> {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apellido Paterno: ");
                String apPat = sc.nextLine();
                System.out.print("Apellido Materno: ");
                String apMat = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                System.out.print("Correo: ");
                String correo = sc.nextLine();
                System.out.print("Número de empleado: ");
                String numeroEmpleado = sc.nextLine();

                profesores.add(new Profesor(nombre, apPat, apMat, edad, correo, numeroEmpleado));
                System.out.println("Profesor agregado.");
            }
            case 2 -> {
                if (profesores.isEmpty()) System.out.println("No hay profesores.");
                else {
                    for (int i = 0; i < profesores.size(); i++) {
                        System.out.println("[" + i + "] " + profesores.get(i));
                    }
                }
            }
            case 3 -> {
                System.out.print("Índice a eliminar: ");
                int idx = sc.nextInt();
                if (idx >= 0 && idx < profesores.size()) {
                    profesores.remove(idx);
                    System.out.println("Profesor eliminado.");
                } else {
                    System.out.println("Índice inválido.");
                }
            }
        }
    }
}