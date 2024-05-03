import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade atual no estoque: ");
        int quantidadeAtual = sc.nextInt();
        System.out.println("Digite a quantidade máxima no estoque: ");
        int quantidadeMaxima = sc.nextInt();
        System.out.println("Digite a quantidade minima no estoque: ");
        int quantidadeMinima = sc.nextInt();

        int quantidadeMedia = quantidadeMaxima + quantidadeMinima/2;

        if (quantidadeAtual >= quantidadeMedia){
            System.out.println("Não efetuar a compra");

        }
        else {
            System.out.println("Efetuar compra");
        }




    }
}