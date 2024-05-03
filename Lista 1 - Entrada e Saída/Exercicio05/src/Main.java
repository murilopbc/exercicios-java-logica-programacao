import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora, minuto, segundo;

        System.out.println("Digite a hora: ");
        hora = Integer.parseInt(sc.nextLine());

        System.out.println("Digite os minutos: ");
        minuto = Integer.parseInt(sc.nextLine());

        System.out.println("Digite os segundos: ");
        segundo = Integer.parseInt(sc.nextLine());

        String horario = String.format("%d:%d:%d",hora,minuto,segundo);

        System.out.println(horario);


    }
}