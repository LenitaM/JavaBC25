package Aulas;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        //COMO LER DADOS DOS USÚARIOS
        //Só precisa declara uma vez
        Scanner entrada = new Scanner(System.in); //precisa da import pq algumas variáveis não estão incorporados no programa
        //vai iniciar o processo de armazenamento a resposta do usúario
        System.out.println("Qual o seu nome?"); //vai armazenzar a resposta
        String nome = entrada.nextLine(); //armazena a próxima linha que o usúario digitar, a resposta do usúario, em formato String
        System.out.println(nome); //mostra a resposta na tela para o usúario
        //FORMA DE ENTRADA DE DADOS EM FORMATO NUMBER

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        System.out.println("Sua idade é " + idade);


        System.out.println("Qual a sua peso?"); //vai pedir para o usúario a resposta
        double peso = entrada.nextDouble();
        System.out.println(peso); //vai mostrar a resposta armazenada do usúario para o usúario


        System.out.println("Qual a sua altura (m)?");
        double altura = entrada.nextDouble(); //se for int é nextInt e assim por diante dependendo do tipo da variável
        System.out.println(altura); //na saída ele vai aceitar só a vírgula por causa da localidade (no BR é lido 1,65 mas a resposta do console vai ser 1.65

        //CALCULANDO O IMC. FORMULA IMC = PESO / ALTURA ^ 2 // ^ = exponenciação
        double imc = peso / (altura + altura); // OU peso / Math.pow(altura, 2)
        System.out.println("Sei IMC é " + imc);
        System.out.printf("Seu IMC é %.2f\n?", imc); //para por só duas casas decimais
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);
        // %s = string / %d = int  / %2f = double  / %f = float  / e% ou E% = número real, em notação científica (mínusculo ou maíusculo) / b% = boolean
        //%o Número inteiro octal sem sinal / %o	Número inteiro octal sem sinal / %x, %X	Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
        //por na ordem que quer que aparece com as variaveis e as vírgulas // \n = para quebrar linha, usar dentro das aspas

        /*AULA 11 DE OUT DE 2022: IF - ELSE IF - ELSE / Switch-Case*/
        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }
        //Swhitch-case
        System.out.println("Selecione uma dieta 1 a 3");
        System.out.println("1 - Água");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");

        int dieta = entrada.nextInt();
        //Switch é uma estrutura de escolha entre valores pré-definidos
        switch (dieta) {
            //case são as condições selecionadas pelos ususários
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                //pode ter mais codigo em casa case
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break; //fim das seleções
            default: // semelhante a else - caso não selecione nenhuma ds opções caí em default, pode fazer embaixo if ou while tb
                System.out.println("Você não selecionou nenhuma das opções");
        }
        System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        // i = variavel de controle / segundo é a condições da corrida
        for (int i = 0; i < totalAlimentos; i ++) {
            // i vai só existir dentro do for
            System.out.println(i);
        }
        /**do while = executa primeiro, antes de verificar a validade - while = verifica primeiro antes de executar
         *
         * While:
         * while (not edge) {
         *     run();
         * } = ele vai verificar antes de executar a ação
         *
         * Do While:
         * do {
         *     run();
         * } while (not edge) = o "do" executa a função antes de verificar
         * */
        int i = 0;
        while(i < totalAlimentos) {
            System.out.println(i);
            i++;
        }
    }
}


