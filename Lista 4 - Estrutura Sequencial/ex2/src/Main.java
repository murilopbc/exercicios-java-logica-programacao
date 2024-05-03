import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double PI = Math.PI, raio;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();

        double area = PI * (raio * raio);

        System.out.printf("A= %.4f", area);





    }
}