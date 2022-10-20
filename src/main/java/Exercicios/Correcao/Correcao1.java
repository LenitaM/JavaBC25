package Exercicios.Correcao; // dentro do pacote "aulas" está o pacote "correcao"
// e dentro de "correcao" esta a classe Correcao1

/*
1) Escreva um programa que exiba as seguintes opções e
realize os que se pede em cada uma delas: (switch-case)
1 – Adição
2 – Subtração
3 – Multiplicação
4 – Divisão
 */

import java.util.Locale;
import java.util.Scanner; // estou trazendo a classe Scanner do pacote java.util

public class Correcao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // caso queira ler double com ponto
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.println("Digite uma opção (1 a 4): ");
        int opcao = entrada.nextInt();

        System.out.println("Digite o primeiro valor:");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = entrada.nextDouble();

        switch(opcao) { // o switch melhorado elimina o break
            case 1 -> {
                double soma = valor1 + valor2;
                System.out.println("O resultado da soma é " + soma);
            }
            case 2 -> {
                double subtracao = valor1 - valor2;
                System.out.println("O resultado da subtração é " + subtracao);
            }
            case 3 -> {
                double multiplicacao = valor1 * valor2;
                System.out.println("O resultado da multiplicação é " + multiplicacao);
            }
            case 4 -> {
                double divisao = valor1 / valor2;
                System.out.println("O resultado da divisão é " + divisao);
            }
            default -> {
                System.out.println("Você digitou uma operação inválida!");
            }
        }
    }
}


