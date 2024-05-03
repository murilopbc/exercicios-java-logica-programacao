import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Digite a quantidade desejada do produto: ");
        int qtd = sc.nextInt();

        if (qtd > 12){
            preco = (preco * 0.9) * qtd;
        }
        else {
            preco = preco * qtd;
        }

        System.out.printf("O Valor total da compra é R$ %.2f", preco);

    }
}