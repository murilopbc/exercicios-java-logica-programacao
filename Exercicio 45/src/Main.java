import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;
        String nome;

        while (true){
            try {

                System.out.print("Digite seu nome: ");
                nome = sc.nextLine();

                System.out.print("Digite quantos dias você ficará na pousada: ");
                int qtd_dias = Integer.parseInt(sc.nextLine());

                if (qtd_dias > 10){
                    valor = 200 + (10 * qtd_dias);
                } else if (qtd_dias == 10){
                    valor = 200 + (15 * qtd_dias);
                }else {
                    valor = 200 + (20 * qtd_dias);
                }

                System.out.printf("%s, O valor total da hospedagem é %.2f\n", nome, valor);
            }catch (InputMismatchException e){
                System.out.println("Valor Inválido");
                break;
            }

        }

    }
}