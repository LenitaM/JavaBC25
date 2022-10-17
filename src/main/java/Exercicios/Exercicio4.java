package Exercicios;

//4-Criar um programa que lê a idade de uma pessoa e diz se ela é maior de idade ou não.

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        if (idade > 18) {
            System.out.println("Você é maior de idade.");
        } else  {
            System.out.println("Você tem menos 18 anos. Você é menor de idade.");
        }
    }
}
