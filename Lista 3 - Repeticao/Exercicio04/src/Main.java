import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, incremento;

        System.out.println("Digite um número: ");
        num = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um incremento: ");
        incremento = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= num; i += incremento) {
            System.out.print(i + ", ");
        }

    }
}
