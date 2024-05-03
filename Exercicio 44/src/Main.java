
/*
Desenvolva um script que leia a idade de um atleta e apresente a categoria a que ele pertence, sendo,
menores de 18 anos “Juvenil” e os demais “Adulto”.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                while (true){
                    try {
                        System.out.println("Digite sua idade: ");
                        double idade = sc.nextInt();

                        if (idade >= 18) {
                            System.out.println("Você é Adulto");
                        }else{
                            System.out.println("Você é Juvenil");
                        }

                    }catch (InputMismatchException e){
                        System.out.println("Valor Inválido");
                        break;


                    }
                }

            }
        }
