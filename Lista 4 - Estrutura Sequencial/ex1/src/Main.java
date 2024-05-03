import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Digite um número: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite um outro número: ");
        num2 = Integer.parseInt(sc.nextLine());

        soma = num1 + num2;

        System.out.printf("SOMA = %d ", soma);
    }
}