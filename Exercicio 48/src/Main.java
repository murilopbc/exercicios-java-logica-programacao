import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List ListaIdades = new ArrayList();
        double maior = 0,  menor = 110;
        int idade = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite sua idade: ");
            idade = Integer.parseInt(sc.nextLine());
            ListaIdades.add(idade);

            if (idade > maior){
                maior = idade;
            }
            if (idade < menor){
                menor = idade;
            }
        }
        System.out.println(ListaIdades);


        System.out.println(menor);
        System.out.println(maior);

    }
}