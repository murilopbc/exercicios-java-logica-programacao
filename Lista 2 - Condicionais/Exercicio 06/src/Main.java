
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random aleatorio = new Random();

        int valor = aleatorio.nextInt(100);


        int tentativas = 1;

        System.out.println(valor);

        while (true) {
            if (tentativas <= 3 ){
                try {
                    System.out.println("\nAdivinhe qual número foi sorteado:");
                    int opt = Integer.parseInt(sc.nextLine());

                    if (opt < 0 || opt > 100){
                        System.err.println("Digite um número entre 0 a 100!");
                        continue;
                    }
                    if (opt == valor){
                        System.out.println("Você acertou!");
                        break;

                    }
                    System.err.println("\nVocê errou!");



                }catch (NumberFormatException e){
                    System.err.println("\nValor Inválido");
                }
                tentativas++;


            } else {
                System.out.println("\nInfelizmente suas chances acabaram!");
                break;

            }


        }


    }
}