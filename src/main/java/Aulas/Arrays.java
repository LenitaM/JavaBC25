package Aulas;

import java.util.Scanner;

public class Arrays {
    public static void main (String [] args) {

        int [] numeros = {1,2,3,4,5}; //possui tamanho fixo
        System.out.println(numeros.length); //tamanho do array / length mede o tamanho do array
        numeros [3] = 1000;
        System.out.println(numeros[3]);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }
        //tipo do array + nome variável = new int [quantidade de elementos];
        int [] numeros2 = new int[50]; // o a 49 elementos
        numeros2 [0] = 500;
        numeros2 [1] = -200; //pode por elementos em qualquer posição do array "na posição 1 o valor é -200
        //...
        numeros2 [49] = 1; //desde que esteja declarado o limite do array pode colocar qualquer valor

        double [] notas = new double [5]; //o tipo dos arrays precisam sem declarados
        String [] nomes = {"José Almir", "Renato Pereira", "Victor Icoma"}; //inserindo elementos
        String [] sobrenomes = new String [10]; //array vazio para inserir elementos

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int quantidade = entrada.nextInt();
        boolean [] valores = new boolean[quantidade];

        //Exemplo

        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt(); //digitou 5

        double [] notasProvas = new double[totalNotas]; //o array vai ter 5 elementos - 0 a 4
        //com base nessa quantidade foi feito um for para ser preenchido os elementos de acordo com as notas

        for(int i = 0; 1 < totalNotas; i++) {
            System.out.println("Digite o valor da nota: ");
            notasProvas[i] = entrada.nextDouble();
        }
        //esse for vai mostrar as notas digitadas
        double soma = 0.0; //valor inical, não impacta na soma
        for(double nota : notasProvas) { //para cada valor dentro de notasProvas, semelhante a "for..of" no JS
            soma += nota;
        }
        double media = soma / notasProvas.length; //soma das notas / tamanho do array ex: notas / três notas adc

        /*CONDIÇÃO TERNÁRIA
         * tipo + nome da variável = condição de corrida + ?(funciona como if)  + mensagem : (funciona como ou) mensagem
         * */
        String mensagem = ( media < 7) ? "Você está reprovado" : "Você está aprovado";
        System.out.println(mensagem);

        /*DEFAULT VALUES
         *
         * Tipos Primitivos (int, double, float, long) = quando não se dá valor em java, o padrão = 0
         * boolean quando não dá valor, o padrão = false
         *
         * Tipos não primitivos (String) o padrão é null = ausência de objeto na variável
         * */
        int numero; // = 0
        double nota; // = 0.0
        long população; // = 0
        boolean teste; // = false
        String nome; // null = ausência de objeto na variável (String não é tipo primitivo, é uma classe criada pelos desenvolvedores java

        /*WRAPPER CLASSES
         *
         * São classes criadas que possuem mais ferramentas, quando vc declara uma classe e não der valor para a variavel
         * elas vão dar null (nulas) que significa "ausência de objetos"
         * */
        Integer numero2 = 1;
        Double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean teste2 = false;

    }
}
