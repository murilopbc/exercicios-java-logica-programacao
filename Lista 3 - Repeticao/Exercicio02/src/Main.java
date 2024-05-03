
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int contador = 1, contIdade = 0, contAltura = 0, contPeso = 0;
        double altura, peso, idade;

        while (contador <= 10){
            try {
                System.out.println("Digite sua idade: ");
                idade = sc.nextDouble();
                System.out.println("Digite sua altura: ");
                altura = sc.nextDouble();
                System.out.println("Digite seu peso: ");
                peso = sc.nextDouble();

                if (idade > 50){
                    contIdade++;

                }
                if (altura > 1.60){
                  contAltura++;
                }
                if (peso < 80){
                    contPeso++;

                }

            }catch (NumberFormatException e){
                System.err.println("Valor Inválido!");

            }
            contador++;
        }
        System.out.println("Quantas pessoas tem idade acima de 50 anos: "+ contIdade );
        System.out.println("Quantas pessoas tem altura acima de 1.60m: "+ contAltura);
        System.out.println("Quantas pessoas tem peso abaixo de 80kg: "+ contPeso);


    }
}