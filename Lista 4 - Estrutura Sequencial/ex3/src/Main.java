import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c,d;

        System.out.println("Digite um número A: ");
        a = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um número B: ");
        b = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um número C: ");
        c = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um número D: ");
        d = Integer.parseInt(sc.nextLine());

        int diferenca = (a*b - c *d);

        System.out.println("DIFERENÇA = " + diferenca);
    }
}