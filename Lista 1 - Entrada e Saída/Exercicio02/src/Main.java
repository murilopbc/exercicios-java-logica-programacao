import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite um 1º número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite um 2° número: ");
        num2 = sc.nextDouble();

        double soma = num1  + num2;
        double subtracao = num1 - num2;
        double multiplicao = num1 * num2;
        double divisao = num1 / num2;
        double elevado = Math.pow(num1, num2);

        System.out.println("Soma " + soma);
        System.out.println("Subtração " + subtracao);
        System.out.println("Multiplicação "+ multiplicao);
        System.out.println("Elevado "+ elevado);
        if (num2 == 0) {
            System.out.println("Divisão no pode ser por zero!");
            return;

        }
        System.out.println("Divisão "+ divisao);

    }
}