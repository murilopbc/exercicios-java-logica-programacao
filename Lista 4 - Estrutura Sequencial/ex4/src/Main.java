import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horasTrabalhadas, salarioHora, salario;
        int idFuncionario;

        System.out.println("Digite o ID do funcionário: ");
        idFuncionario = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor que recebe por hora: ");
        salarioHora = sc.nextDouble();

        salario = horasTrabalhadas * salarioHora;

        System.out.printf("ID = %d\nSALARY = U$ %.2f", idFuncionario, salario);
    }
}