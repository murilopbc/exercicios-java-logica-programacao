import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();

        double K = C + 273.15;
        double F = (C * 1.8) + 32;
        double Re = C * 0.8;
        double Ra = C * 1.8 + 32 + 459.67;

        System.out.printf("\nTemperatura em Fahreinheint é de %.2f", F);
        System.out.printf("\nTemperatura em Kelvin é de %.2f ", K);
        System.out.printf("\nTemperatura em Réaumur é de %.2f ", Re );
        System.out.printf("\nTemperatura em Rankine é de %.2f ", Ra);

    }

}