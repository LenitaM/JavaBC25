package Aulas;

import java.util.Arrays;
import java.util.Scanner;

/*AULA 10 DE OUT DE 2022: STRINGS*/
public class Strings {
    public static void main(String[] args) {
        //Strings são cadeias de caracteres
        //José -> j = 0, o = 1, s = 2, é = 3
        String nome = "Pedro";

        if (nome == "Pedro") { //conferindo se o endereço do 1º objeto são iguais (onde estão armazenados) e vão ser iguais pq estão
            System.out.println("São iguais!");
        }

        System.out.println("Digite seu sobrenome:");
        Scanner entrada = new Scanner(System.in); //procurar documentos dentro do console
        String sobrenome = entrada.nextLine();

        if(sobrenome == "Pereira") {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes!");
        } //Vai dá diferentes pq está em outro lugar de armazenamento, ele não compara o conteúdo. No js == compara o conteúdo

        /*
         * .equals = compara o conteúdo  = true - são iguais or false - não são iguais;
         * sobreno.equalsIgnoreCase("pereira"); = ignora maíusculo e mínusculo
         * */
        if(sobrenome.equals("Pereira")) {
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        } //são iguais!

        //OUTROS MÉTODOS
        String java = "Java"; //0 = j, 1 =a, 2 = v, 3 = a
        String ja = java.substring(0,2); //vai cortar de 0 e vai até 2 (não incluso, no caso vai de 0 a 1 (<2)) / resultado = ja
        String va = java.substring(2); //vai cortar do 2 até o final / resultado = va
        String ava = java.substring(1,4); // resultado = ava ( vai pegar 1,2,3 = a,v,a)

        System.out.println(ja); // ja
        System.out.println(va); // va
        System.out.println(ava); //ava

        String m1 = "Hello, ";
        String m2 = "world!";
        String m3 = m1.concat(m2); // vai concatenar m1 + m2
        System.out.println(java.length()); //medir quantas caracteres ela possui
        System.out.print(java.isEmpty()); //verifica se a String ta vázia, se tiver -> "" / false = não está vazia
        System.out.print(java.toUpperCase()); //JAVA em CAIXA ALTA
        System.out.println(java.toLowerCase()); //java em caixa baixa

        //EXEMPLO
        System.out.println("Digite um nome:");
        String seuNome = entrada.nextLine();

        if(seuNome.toUpperCase().equals("JOSÉ")) {
            System.out.println("SEU NOME É JOSÉ");
        }
        //.split = fragmenta textos para pegar só o que interessa
        String data = "13/10/2022";
        String[]valores = data.split("/"); //vai ficar um array com 3 valores ["13","10","2022"]
        System.out.println(valores[0]);

        String email = "josé.almir@gmail.com";
        String [] valoresEmail = email.split("@"); //["jose.almir" [0], "gmail.com" [3]
        System.out.println(valoresEmail[0]);

        String nome2 = "José Souza";
        String[] nomeSeparado = nome2.split("");
        System.out.println(nomeSeparado[0]); //com string vazia vai pegar só o primeiro caractere

        String teste = "Amanhã é sexta-feira";
        String[] teste2 = teste.split(""); //String vazia "" = vai separar todos os caracteres como Array []
        System.out.println(Arrays.toString(teste2)); //vai separar todos os caracteres como array

    }
}

