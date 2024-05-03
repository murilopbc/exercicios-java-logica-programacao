import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha, contador = 0, saldosNegativos = 0, saldosPositivos = 0;
        double saldo, metade;

        while (true) {
            while (true) {
                try {
                    System.out.println("\nDigite seu saldo: ");
                    saldo = sc.nextDouble();

                    contador++;

                    if (saldo < 0) {

                        saldosNegativos++;
                    }
                    if (saldo > 0) {

                        saldosPositivos++;
                    }

                    metade = (double) contador / 2;

                    break;

                } catch (InputMismatchException e) {
                    System.err.println("Valor Inválido");
                    sc.next();
                }
            }

            while (true) {
                try {
                    System.out.println("\nDeseja continuar informando os saldos?\n1-Sim\n2-Não");
                    escolha = Integer.parseInt(sc.nextLine());

                    if (escolha != 1 && escolha != 2) {
                        System.err.println("\nDigite 1 ou 2!");
                        continue;
                    }
                    break;

                } catch (NumberFormatException e) {
                    System.err.println("\nValor Inválido!");

                }
            }

            if (escolha == 2) {
                System.out.println("Quantidade de pessoas com saldo positivo: " + saldosPositivos);
                System.out.println("Quantidade de pessoas com saldo negativo: " + saldosNegativos);

                if (saldosNegativos > metade) {
                    System.out.println("Risco ao Banco!");
                    return;
                }
                System.out.println("Nenhum Risco ao banco");
                return;
            }

            System.out.println("Quantidade de pessoas com saldo positivo: " + saldosPositivos);
            System.out.println("Quantidade de pessoas com saldo negativo: " + saldosNegativos);

            if (saldosNegativos > metade) {
                System.out.println("Risco ao Banco!");
            } else {
                System.out.println("Nenhum Risco ao banco");
            }
        }

    }

}
