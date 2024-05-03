import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        List numNegativos = new ArrayList();
        List numPositivos = new ArrayList();

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um número: ");
            num = Integer.parseInt(sc.nextLine());

            if (num > 10){
                System.out.println("Os números não podem ser maiores que 10");
                break;
            }else{
                if (num < 0){
                    numNegativos.add(num);
                }
                else {
                    numPositivos.add(num);
                }
            }
        }

        if (numNegativos.isEmpty()){
            System.out.println(numPositivos);
        }
        else {
            System.out.printf("Números negativos: " + numNegativos);
            System.out.println(numPositivos);
        }
    }
}
