import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int pares = 0, impares = 0, negativos = 0, positivos = 0;
        double numero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            numero = sc.nextDouble();
        }

        if (numero % 2 == 0) {
            pares++;
        }
        if (numero % 2 != 0) {
            impares++;
        }
        if (numero > 0) {
            positivos++;
        }
        if (numero < 0) {
            negativos++;
        }

        System.out.println("O que deseja saber: ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println(pares);
                break;

            case 2:
                System.out.println(impares);
                break;
            case 3:
                System.out.println(positivos);
                break;
            case 4:
                System.out.println(negativos);
                break;
        }

    }
}