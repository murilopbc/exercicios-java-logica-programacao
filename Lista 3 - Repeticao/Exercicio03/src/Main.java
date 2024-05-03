import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opt, opiniao, escolha;
        int contador = 0, otimo = 0, bom = 0, ruim = 0, somaNotas = 0;
        double media, porcentagemBom, porcentagemOtimo, porcentagemRuim;

        while (true) {
            try {
                System.out.println("Deseja dar opinião sobre o filme Gente Grande?\n1-Sim\n2-Não");
                opt = Integer.parseInt(sc.nextLine());

                if (opt <= 0 || opt > 2) {
                    System.err.println("Digite 1 ou 2!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Valor Inválido");

            }
        }

        if (opt == 1) {
            while (true) {
                while (true) {
                    try {
                        System.out.println("\n1-Ruim\n2-Bom\n3-Ótimo");
                        opiniao = Integer.parseInt(sc.nextLine());

                        if (opiniao < 1 || opiniao > 3) {
                            System.err.println("Digite 1, 2 ou 3!");
                            continue;
                        }

                        contador++;

                        somaNotas += opiniao;

                        media = (double) somaNotas / contador;

                        if (opiniao == 3) {
                            otimo++;
                        }
                        if (opiniao == 2) {
                            bom++;
                        }
                        if (opiniao == 1) {
                            ruim++;
                        }

                        porcentagemOtimo = ((double) otimo / contador) * 100;
                        porcentagemBom = ((double) bom / contador) * 100;
                        porcentagemRuim = ((double) ruim / contador) * 100;

                        break;

                    } catch (NumberFormatException e) {
                        System.err.println("Valor Inválido");
                    }
                }

                while (true) {
                    try {
                        System.out.println("\nDeseja jogar novamente?\n1-Sim\n2-Não");
                        escolha = Integer.parseInt(sc.nextLine());

                        if (escolha <= 0 || escolha > 2) {
                            System.err.println("\nDigite 1 ou 2!");
                            continue;
                        }
                        break;

                    } catch (InputMismatchException e) {
                        System.err.println("\nValor Inválido!");
                        sc.next();
                    }
                }

                if (escolha == 2) {
                    System.out.printf("\n%d pessoas consideram o filme ótimo, isso representa %.2f", otimo, porcentagemOtimo);
                    System.out.printf("\n%d pessoas consideram o filme bom, isso representa %.2f", bom, porcentagemBom);
                    System.out.printf("\n%d pessoas consideram o filme ruim, isso representa %.2f", ruim, porcentagemRuim);
                    System.out.println("\nQuantidade de pessoas que responderam o filme: " + contador);
                    System.out.println("\nMédia de notas do filme: " + media);
                    return;
                }

                System.out.printf("\n%d pessoas consideram o filme ótimo, isso representa %.2f", otimo, porcentagemOtimo);
                System.out.printf("\n%d pessoas consideram o filme bom, isso representa %.2f", bom, porcentagemBom);
                System.out.printf("\n%d pessoas consideram o filme ruim, isso representa %.2f", ruim, porcentagemRuim);
                System.out.println("\nQuantidade de pessoas que responderam o filme: " + contador);
                System.out.printf("\nMédia de notas do filme: %.2f", media);
            }
        }
        System.out.println("FIM DO PROGRAMA!");
    }
}