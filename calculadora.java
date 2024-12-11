import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora ");
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Porcentaje");
        System.out.println("6. Cuadrado de un número");

        int operacion = sc.nextInt();

        double resultado = 0;

        if (operacion == 6) {
            // Solo un número necesario para el cuadrado
            System.out.println("Introduce un número:");
            double num = sc.nextDouble();
            resultado = calcularCuadrado(num);
            System.out.println("Resultado: " + resultado);
        } else {
            // Operaciones que requieren dos números
            System.out.println("Introduce el primer número:");
            double num1 = sc.nextDouble();

            System.out.println("Introduce el segundo número:");
            double num2 = sc.nextDouble();

            switch (operacion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    resultado = (num1 * num2) / 100;
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    public static double calcularCuadrado(double num) {
        return num * num;
    }
}
