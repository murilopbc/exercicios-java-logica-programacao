import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int qtd_pessoas = 3;

        double altura, somaAltura = 0, mediaAltura;

        List listaAltura = new ArrayList();

        for (int i = 0; i < qtd_pessoas; i++) {
            System.out.println("Digite sua altura: ");
            altura = sc.nextDouble();

            listaAltura.add(altura);

            somaAltura += altura;
        }

        System.out.println(listaAltura);

        mediaAltura = somaAltura / qtd_pessoas;
        System.out.printf("Média de altura das pessoas é de %.2f", mediaAltura);

        }
    }
