import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double a, b, c;

        System.out.println("Digite um número A: ");
        a = sc.nextDouble();
        System.out.println("Digite um número B: ");
        b = sc.nextDouble();
        System.out.println("Digite um número C: ");
        c = sc.nextDouble();

        double areaTriangulo = a * c / 2;

        double PI = Math.PI;

        double areaCirculo = PI * (c * c);

        double areaTrapezio = ((a + b) * c) / 2 ;

        double areaQuadrado = b * b;

        double areaRetangulo = a * b;

        System.out.printf("TRIÂNGULO: %.3f\n CIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

    }
}