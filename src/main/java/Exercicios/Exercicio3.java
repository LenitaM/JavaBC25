package Exercicios;

import java.util.Scanner;

/*
* 3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes
que V1 e V2 possuem valores idênticos nas mesmas posições.
* */

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetoresTotal;

        System.out.println("Digite o valor total das posições dos vetores:");
        vetoresTotal = entrada.nextInt();
        System.out.println();

        int [] v1 = new int[vetoresTotal];
        int [] v2 = new int[vetoresTotal];

        for(int i = 0; i < vetoresTotal; i++) {
            System.out.println("Digite um valor para a posição " + ( i + 1 ) + " do vetor 1:");
            v1[i] = entrada.nextInt();
        }
        for(int i = 0; i < vetoresTotal; i++) {
            System.out.println("Digite um valor para a posição " + ( i + 1 ) + " do vetor 2:");
            v2 [i] = entrada.nextInt();
        }
        System.out.println();
        for(int i = 0; i < vetoresTotal; i++){
            if(v1[i] == v2[i]) {
                System.out.println("Valores das posições " + ( i + 1 ) + " " +
                        "dos vetores são iguais.");
            }
        }
    }
}
