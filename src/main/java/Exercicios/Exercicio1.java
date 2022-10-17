package Exercicios;

import java.util.Scanner;

/**
 * 1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)
 * 1 – Adição
 * 2 – Subtração
 * 3 – Multiplicação
 * 4 – Divisão
 *
 * */

public class Exercicio1 {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        boolean repetir = true;

        while (repetir == true) {

            System.out.println("Selecione umas das opções a seguir:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");

            int calculadora = entrada.nextInt();

            switch (calculadora) {
                case 1:
                    System.out.println("Você selecionou a opção 1 - adição");
                case 2:
                    System.out.println("Você selecionou a opção 2 - Subtração");
                case 3:
                    System.out.println("Você selecionou a opção 3 - Divisão");
                case 4:
                    System.out.println("Você selecionou a opção 4 - Multiplicação");
                    break;
                default:
                    System.out.println("Você não selecionou nenhumas das opções conrespondentes.");
            }

            if (calculadora == 1) {

                System.out.println("Digite o primeiro valor:");
                double adicao = entrada.nextDouble();
                System.out.println("Digite o segundo valor:");
                double adicao2 = entrada.nextDouble();

                double resAdicao = adicao + adicao2;

                System.out.println("O resultado é " + resAdicao);
            } else if (calculadora == 2) {

                System.out.println("Digite o primeiro valor:");
                double sub = entrada.nextDouble();
                System.out.println("Digite o segundo valor:");
                double sub2 = entrada.nextDouble();

                double resSub = sub - sub2;

                System.out.println("O resultado é " + resSub);
            } else if (calculadora == 3) {

                System.out.println("Digite o primeiro valor:");
                double div = entrada.nextDouble();
                System.out.println("Digite o segundo valor:");
                double div2 = entrada.nextDouble();

                double resDiv = div / div2;

                System.out.println("O resultado é " + resDiv);
            } else if (calculadora == 4) {

                System.out.println("Digite o primeiro valor:");
                double multi = entrada.nextDouble();
                System.out.println("Digite o segundo valor:");
                double multi2 = entrada.nextDouble();

                double resMulti = multi * multi2;

                System.out.println("O resultado é " + resMulti);
            } else {
                System.out.println("Você não selecionou nenhuma das opções. Por favor, refaça a operação.");
            }



            System.out.println("Deseja realizar a operação novamente? Digite  S para Sim ou N para não");
            String refazer = entrada.nextLine();

            if (refazer == "s") {
                repetir = true;


            } else if (refazer == "n") {
                repetir = false;
                System.out.println("Fim da sessão. Obrigada!");
            }


        }
    }
}
