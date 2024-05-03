import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, tabuada;

        while (true){
            try {
                System.out.println("Digite um número: ");
                num = Integer.parseInt(sc.nextLine());

                if (num <= 0 || num > 10){
                    System.err.println("Digite um número de 1 a 10");
                    continue;
                }
                break;

            }catch (NumberFormatException e){
                System.err.println("Valor Inválido");
            }
        }
        for (int i = 0; i < 11; i++) {
            tabuada = num * i;
            System.out.println("\n"+num + "*"+ i + "="+ tabuada);
        }

    }
}