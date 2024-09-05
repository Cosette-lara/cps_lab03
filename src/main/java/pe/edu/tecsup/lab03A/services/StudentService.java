import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora simple");
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = scanner.nextInt();

        System.out.println("Ingresa el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingresa el segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean esOperacionValida = true;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero");
                    esOperacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida");
                esOperacionValida = false;
                break;
        }

        if (esOperacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}
