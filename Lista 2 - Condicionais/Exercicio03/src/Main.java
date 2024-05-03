import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite a quantidade de gols do timeA: ");
            int golA = sc.nextInt();
            System.out.println("Digite a quantidade de gols do timeB");
            int golB = sc.nextInt();


            if (golA == golB) {
                System.out.println("empate");

            } else if (golB > golA) {
                System.out.println("time b venceu");
            } else {
                System.out.println("time a venceu");
            }
        } catch (InputMismatchException e) {
            System.err.println("Valor Inválido");

        }

    }
}