package Aulas;

/*AULA 10 DE OUT DE 2022: VARIÁVEIS EM JAVA*/

public class Variaveis {
    //tem que ser exatamente dessa forma, com letra maíuscula em String
    public static void main(String[] args) {
        System.out.println("Hello, world!"); //equivale ao console.log
        /*Java é uma linguagem fortemente tipada e estaticamente tipado: os tipos das variaveis precisam ser sempre declaradas*/
        int idade = 20; //int = números inteiros vai até 2bi
        System.out.println(idade); //nome da variavel cinza significa que não é usada
        double salario = 450.99; // double = dupla decisão de números, decimais vai até 15 casa decimais
        float nota = 7.5f; //float= metade da precisão sempre acompanhado por um sufixo f, caso não tenha ele vai ler como double, vai até 7 casa decimais
        long populacaoTerra = 7_900_000_000_000l; //long = usado para números absurdamente longos e deve acompanhar pelo sufixo l
        boolean tarefaConcluida = false; //(true or false)
        int i = 1, j = 0, k = 100;//multiplas variáveis
        String nomeCompleto = "Lenita Maciel";//String no java sempre aspas duplas " " e S maíusculo
        int teste = 10;
        teste = 9; //reatribuição de variáveis, não existe const no java
        final int teste2 = 200; //final só trava a reatribuição, não define variável

        //OPERADORES ARITMÉTICOS
        int a = 10;
        int b = 5;

        //SOMA
        int soma = a + b; // 15
        //SUBTRAÇÃO
        int sub = a - b; // 5
        //MULTIPLICAÇÃO
        int multi = a * b; // 50
        //DIVISÃO
        int divisao = a / b; // 2
        //RESTO DE DIVISÃO
        int resto = a % b; // 0

        System.out.println("O resultado da some é " + soma); //concatenação = O resultado da soma é 15
        //A DIVISÃO ENTRE DOIS INTEIROS RESULTADO EM INTEIRO
        int sete = 7;
        int dois = 2; //se por em int vai perder as casas decimais

        System.out.println(sete / dois); //3 = ele corta a parte decimal

        //A DIVISÃO ENTRE DOIS NÚMEROS QUE O RESULTADO É DECIMAL
        double dois2 = 2.0; //para poder vim um resultado com decimais precia por o decimal para gerar o resultado em decimal
        System.out.println(sete / dois2);

        //MATH
        double x = Math.sqrt(144); //sqrt () = raiz quadrada de um número "12"
        double y = Math.pow (5,2); // pow () = exponenciação 5² "25"
        System.out.println(Math.PI);
        //CASTING = permite a conversão dos números de inteiro (int) para decimal (double) e vice-versa
        //em parentese o tipo que vc quer alterar
        int pi2 = (int) Math.PI;
        System.out.println(pi2); //convertendo para decimal, tirando os números inteiros

        double resultado3 = sete / (double) dois; // 7 / 2.0 = 3.5 O tipo que ele vai converter de acordo com a variável

        //OPERADORES DE DECREMENTO E INCREMENTO
        int valor = 5;
        valor++; //incemento +1
        ++valor; //incrementa primeiro depois põe o valor
        valor--; //decremento -1
        --valor;
        valor+= 10; //valor = valor + 10;

        //OPERDAORES RELACIONAIS
        // > MAIOR QUE
        boolean teste1 = 5 > 1; //true
        //< MENOR QUE
        boolean teste3 = 5 < 1; //false
        //== IGUAL
        boolean teste4 = 5 == 5;//true
        // != DIFERENTE
        boolean test5 = 5 != 1; //true
        //>= MAIOR OU IGUAL
        boolean teste6 = 6 >= 6;//true
        // <= MENOR OU IGUAL
        boolean test7 = 6 <= 9;//true

        //OPERADORES LÓGICOS
        //PORTA AND (&&) = Todas as sentenças precisam ser verdadeiras para ser true
        boolean teste8 = true && false; //false

        //PORTA OR (||) = Apenas uma das sentenças precisa ser verdeira para ser true
        boolean teste9 = true || false; // true

        boolean teste10 = (5 > 10) && (10 < 5); // false pq 5 não é maior que 10
        boolean teste11 = (10 >= 0) || (1 < 5); //false
        boolean teste12 = (5 > 1); //true
        boolean teste13 = !teste12; //false ! = inverte valores lógicos (5 > 1) torna-se (5 < 1)

    }
}

