import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nomeMaisAlta = "";
        double alturaMaisAlta = 0;
        String nomeMaisPesada = "";
        double pesoMaisPesada = 0;

        int contador = 1;

        while (contador <= 2) {
            System.out.println("Digite o nome da pessoa " + contador + ":");
            String nome = input.nextLine();

            System.out.println("Digite a altura da pessoa " + contador + " (em metros):");
            double altura = input.nextDouble();

            System.out.println("Digite o peso da pessoa " + contador + " (em quilogramas):");
            double peso = input.nextDouble();

            input.nextLine(); // Limpar o buffer

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlta = nome;
            }

            if (peso > pesoMaisPesada) {
                pesoMaisPesada = peso;
                nomeMaisPesada = nome;
            }

            contador++;
        }

        System.out.println("A pessoa mais alta é: " + nomeMaisAlta + " com " + alturaMaisAlta + " metros de altura.");
        System.out.println("A pessoa mais pesada é: " + nomeMaisPesada + " com " + pesoMaisPesada + " quilogramas.");
    }
}