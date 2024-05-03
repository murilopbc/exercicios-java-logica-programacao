import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1, pares = 0, impares = 0, positivos = 0, negativos = 0;
        double num = 0;

        while (contador <= 10) {
                try {
                    System.out.println("Digite um número " + contador + ":");
                    num = sc.nextDouble();

                } catch (NumberFormatException e) {
                    System.err.println("\nValor Inválido");
                }
                contador++;
            if (num % 2 == 0 ){
                pares++;

            }
            if (num % 2 != 0 ){
                impares++;

            }
            if (num > 0 ){
                positivos++;

            }
            if (num < 0 ){
                negativos++;

            }
        }

        System.out.println("Pares " + pares);
        System.out.println("Ímpares " + impares);
        System.out.println("Positivos " + positivos);
        System.out.println("Negativos " + negativos);

        System.exit(0);

    }
}