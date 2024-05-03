import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int qtdMulheres = 0,  qtdHomens = 0;
        double mediaH, somaH = 0, maior = 0, menor = 3;

        for (int i = 0; i < 3; i++) {

            System.out.println(" Digite 1-Masculino e 2-Feminino: ");
            int sexo = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            if (sexo == 2){
                qtdMulheres++;

            } else if (sexo == 1) {
                qtdHomens++;
                somaH = somaH + altura;
            }
            else {
                System.out.println("Valor Inválido");

            }
            if (altura > maior){
                maior = altura;
            }
            if (altura < menor) {
                menor = altura;

            }
        }
        mediaH = somaH / qtdHomens;

        System.out.println("\nMédia da altura dos homens: " + mediaH);
        System.out.println("Número total de mulheres: " + qtdMulheres);
        System.out.println("Maior altura do grupo: " + maior);
        System.out.println("Menor altura do grupo: " + menor);

    }

}
