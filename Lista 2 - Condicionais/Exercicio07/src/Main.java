
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> lista =  Arrays.asList("a","b", "c", "d");

        int opt;
        while (true){
            try {
                System.out.println("1-Responder pergunta 1\n2-Responder pergunta 2");
                opt = Integer.parseInt(sc.nextLine());

                if (opt > 2 || opt < 1){
                    System.err.println("Digite 1 ou 2!");
                    continue;
                }
                break;

            }catch (InputMismatchException e){
                System.err.println("Valor Inválido");
            }
        }
        if (opt == 1){
            String alternativa;
            while (true){
                try {
                    System.out.println("This is _____ than I thought.");
                    System.out.println("a)bad\nb)badder\nc)worst\nd)worse");
                    alternativa = sc.nextLine();

                    if (!lista.contains(alternativa)){
                        System.err.println("Alternativa Inválida!");
                    }
                    else {
                        if (alternativa.equals("d")){
                            System.out.println("Resposta correta!");
                        }
                        else {
                            System.err.println("Resposta Incorreta!");

                        }
                        break;
                    }

                }catch (InputMismatchException e ){
                    System.err.println("Valor Inválido");
                }
            }
        }
        else {

                String alternativa;
                while (true){
                    try {
                        System.out.println("This is _____ than I thought.");
                        System.out.println("a)bad\nb)badder\nc)worst\nd)worse");
                        alternativa = sc.nextLine();

                        if (!lista.contains(alternativa)){
                            System.err.println("Alternativa Inválida!");
                        }
                        else {
                            if (alternativa.equals("d")){
                                System.out.println("Resposta correta!");
                            }
                            else {
                                System.err.println("Resposta Incorreta!");

                            }
                            break;
                        }

                    }catch (InputMismatchException e ){
                        System.err.println("Valor Inválido");
                    }
                }

        }



    }
}