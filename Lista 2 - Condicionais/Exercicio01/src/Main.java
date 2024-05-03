import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tentativas = 1;

        while (tentativas <= 5) {
            try {
                System.out.println("Digite sua idade: ");
                int idade = Integer.parseInt(sc.nextLine());

                if (idade > 110){
                    continue;
                }

                else if (idade >= 30){
                    System.out.println("Adulto");

                }
                else if (idade >= 18){
                    System.out.println("Adulto Jovem");

                }
                else if (idade >= 15){
                    System.out.println("Adolescente");

                }
                else {
                    System.out.println("Criança");
                }

            }catch (NumberFormatException e){
                System.err.println("Valor Inválido");
                continue;
            }
            tentativas++;

        }

    }
}