import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolaridade, cargo;

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = sc.nextLine();
        System.out.println("Digite sua pretensão salarial: ");
        Double salario = sc.nextDouble();

        while (true){
            try {
                System.out.println("Digite seu grau de instrução:\n1-Ensino Médio\n2-Ensino Técnico\n3-Ensino Superior");
                escolaridade = Integer.parseInt(sc.nextLine());

                if (escolaridade <= 0 || escolaridade > 3){
                    System.err.println("\nDigite 1, 2 ou 3");
                    continue;
                }
                break;

            }catch (NumberFormatException e){
                sc.nextLine();
                System.err.println("\nValor Inválido");

            }
        }
        while (true){
            try {
                System.out.println("Digite o cargo pretendido:\n1-Coordenador\n2-Gestor\n3-Diretor");
                cargo = Integer.parseInt(sc.nextLine());

                if (cargo <= 0 || cargo > 3){
                    System.err.println("\nDigite 1, 2 ou 3");
                    continue;
                }
                break;

            }catch (NumberFormatException e){
                System.err.println("\nValor Inválido");
            }
        }
        while (true){


            try {
                System.out.println("Possui CNH do tipo B?\n1-Sim\n2-Não");
                int cnh = Integer.parseInt(sc.nextLine());

                if  (cnh != 1 && cnh != 2){
                    System.err.println("\nDigite 1 ou 2");
                    continue;
                }

                System.out.printf("\nNome: %s\nSobrenome: %s\nData de Nascimento: %s\nPretensal Salarial: %.2f\nGrau de Instrução: %d\nCargo pretendido: %d\nCNH: %d", nome, sobrenome, dataNascimento,salario,escolaridade, cargo,cnh);
                break;

            }catch (NumberFormatException e){
                System.err.println("Valor Inválido");
            }
        }

        while (true){
            try {
                System.out.println("\nPosso confirmar seus dados?\n1-Sim\n2-Não");
                int confirmarDados = Integer.parseInt(sc.nextLine());

                if (confirmarDados <= 0 || confirmarDados > 2){
                    System.err.println("Digite 1, 2 ou 3");
                    continue;
                }
                if (confirmarDados == 1){
                    System.out.println("Dados confirmados com sucesso!");
                    break;
                }

            }catch (NumberFormatException e){
                System.err.println("Valor Inválido");
            }
        }


        }
    }
