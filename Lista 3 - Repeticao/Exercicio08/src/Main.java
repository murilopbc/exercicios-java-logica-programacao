import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maiorIdade = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }


        }
        System.out.println(maiorIdade);

    }
}