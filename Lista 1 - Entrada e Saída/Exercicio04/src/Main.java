import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = Integer.parseInt(sc.nextLine());

        int sucessor =  num + 1;
        int anterior = num - 1;

        System.out.println(num);
        System.out.println(anterior);
        System.out.println(sucessor);


    }
}