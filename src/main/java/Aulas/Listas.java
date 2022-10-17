package Aulas;

import java.util.ArrayList;

public class Listas {
    /*AULA 13 DE OUT DE 2022: LISTAS EM JAVA*/
    //metodo principal do JAVA
    public static void main(String[] args) {
        /*Array List
         * só aceita classes wrapper = classes que representa os tipos primitivos:
         * */
        ArrayList <Integer> numeros = new ArrayList<>();
        System.out.println(numeros);

        //Add elementos no array
        numeros.add(10); //equivale ao push no JS
        numeros.add(20); // 10, 20
        numeros.add(1000); // 10, 20, 1000

        System.out.println(numeros);
        //saber a posição dos elementos é .get()
        System.out.println(numeros.get(2)); //numeros [2]

        //Forma de alterar elementos no array .set(posição , elemento que deseja inserir na posição)
        numeros.set(0, 500); //numeros [0] = 500
        System.out.println(numeros); // ficou trocou 10 [0] para 500 [0]

        //Remover elementos das posições
        numeros.remove( 0); //precisa ter a posição existenta para remover
        System.out.println(numeros);

        numeros.add ( 1, 200); //adiciona o elemento na posição e move os demais
        System.out.println(numeros);

        numeros.add( 3, 200);
        System.out.println(numeros);

        System.out.println(numeros.size()); //saber o tamanho do array corresponde a array.lenght

        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        } //saber o tamanho do array list


        System.out.println("-----------");
        for(int numero : numeros) { //para cada valor dentro do array ele executa o código
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); //saber se existe o elemento (500) no arry = true = achou, false = n achou
        System.out.println(numeros.indexOf(1000)); //qual a posição do 100 na lista? == posição 2
        System.out.println(numeros.indexOf(500)); // -1 = significa que não achou o elemento
        System.out.println(numeros.indexOf(200)); //indexOf() vai mostrar a posição só do primeiro elemento encontrado
        System.out.println(numeros.lastIndexOf(200)); //mostra o último elemento encontrado (se forem o mesmo elemento)



    }
}
