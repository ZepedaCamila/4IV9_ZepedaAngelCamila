import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---Menú de figuras geométricas: ---");
            System.out.println("1. Área y perímetro de un cuadrado");
            System.out.println("2. Área y perímetro de un rectángulo");
            System.out.println("3. Área y perímetro de un círculo");
            System.out.println("4. Área y perímetro de un triángulo");
            System.out.println("5. Área y perímetro de un trapecio");
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingresa el lado del cuadrado:");
                    double lado = leerPositivo(sc);
                        double areaCuadrado = lado * lado;
                        double perimetroCuadrado = 4 * lado; 
                System.out.println("Área del cuadrado: " + areaCuadrado);
                System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);
                break;
            case 2:
                System.out.println("Ingresa la base del rectángulo:");
                    double baseRectangulo = leerPositivo(sc);
                System.out.println("Ingresa la altura del rectángulo:");
                    double alturaRectangulo = leerPositivo(sc);
                        double areaRectangulo = baseRectangulo * alturaRectangulo;
                        double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
                System.out.println("Área del rectángulo: " + areaRectangulo);
                System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
                break;
            case 3:
                System.out.println("Ingresa el radio del círculo:");
                    double radio = leerPositivo(sc);
                        double areaCirculo = Math.PI * radio * radio;
                        double perimetroCirculo = 2 * Math.PI * radio;
                System.out.println("Área del círculo: " + areaCirculo);
                System.out.println("Perímetro del círculo: " + perimetroCirculo);
                break;
            case 4:
                System.out.println("Ingresa la base del triángulo:");
                    double baseTriangulo = leerPositivo(sc);
                System.out.println("Ingresa la altura del triángulo:");
                    double alturaTriangulo = leerPositivo(sc);
                        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                        double perimetroTriangulo = 3 * baseTriangulo;
                System.out.println("Área del triángulo: " + areaTriangulo);
                System.out.println("Perímetro del triángulo: " + perimetroTriangulo);
                break;
            case 5:
                System.out.println("Ingresa la base mayor del trapecio:");
                    double baseMayor = leerPositivo(sc);
                System.out.println("Ingresa la base menor del trapecio:");
                    double baseMenor = leerPositivo(sc);
                System.out.println("Ingresa la altura del trapecio:");
                    double alturaTrapecio = leerPositivo(sc);
                        double areaTrapecio = ((baseMayor + baseMenor) / 2) * alturaTrapecio;
                        double perimetroTrapecio = baseMayor + baseMenor + 2 * alturaTrapecio;
                System.out.println("Área del trapecio: " + areaTrapecio);
                System.out.println("Perímetro del trapecio: " + perimetroTrapecio);
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
                break;
        }
     } 
    while (opcion != 0);
    sc.close();
    }
    private static double leerPositivo(Scanner sc) {
        double valor;
        do {
            valor = sc.nextDouble();
            if (valor <= 0) {
                System.out.println("Por favor, ingresa un número positivo:");
            }
        } while (valor <= 0);
        return valor;
    }
}