package Aulas.OPP.escola;

/*AULA DIA 20 DE OUT DE 2022*/

import java.util.ArrayList;

//A Main é só um arquivo para testar super e sub classes
public class Main {
    public static void main(String[] args) {

        //Objeto:
        //subclasse + variavel =  new + objeto(atributos)
        Aluno aluno = new Aluno("Leticia Tenório", "leticiatenoria@gmail.com", "000.000.000-00", 7.5);
        aluno.seApresentar(); //Olá meu nome pe Leticia Tenório. Eu sou um aluno com média 7.5
        //Aluno é uma Pessoa(super) Aluno(subclasse)

        Professor profHistoria = new Professor("Viviane Catolé", "vivicatole@gmail.com", "000.000.000.00", "História");
        profHistoria.seApresentar(); //Olá meu nome pe Leticia Tenório. Eu sou o professor, minha formação é História.
        //Professor é uma Pessoa(super) Professor(subclasse)

        Pessoa outra = new Pessoa("Carol Freire", "ccfreire@gmail.com", "000.000.000.00");
        outra.seApresentar(); //Olá me cham Carol Freire
        //Aqui só vai aparecer pessoa, pq é variável só do tipo pessoa



        System.out.println("______INICIO DO POLIMORFISMO__________");
        // Aluno é uma Pessoa - todos eles correspondem ao super = Pessoa
        // Como é uma relção de herança, ele vai chamar o método corresponde a cada superclasse.
        //mesmo que não especifique. NÃO TEM COMO CRIAR UM PROFESSOR DO TIPO ALUNO.
        // subclasse só conversa com superclasse
        Pessoa p2 = new Aluno("Carlos José", "carlos.jose@gmail.com", "0000000", 7.5); //Pessoa que referencia um Aluno
        //um Aluno não pode referencia um Professor e vice e versa pq são subclasses e só respondem a superclasse Pessoa,
        // as subclasses são independentes de outras subclasses, só respondendo para a SUPERclasse.

        // Professor é uma Pessoa
        //vai puxar o metodo correspondente ao dele
        Pessoa profTi = new Professor("João Pedro", "joao@gmail.com", "034343", "TI"); //Pessoa que referencia um Professor

        Pessoa p1 = new Pessoa("Maria Antonia", "mari@gmail.com", "4324234");
        p1.seApresentar(); //Olá, me chamo Maria Antonia
        //só vai mostrar o método do super

        System.out.println(" ============ ");

        //preserva a subescrita mesmo que aluno seja uma subclasse da Pessoa, mas ele sempre vai chamar o método original tb
        p2.seApresentar(); //Olá, me chamo Carlos José. Eu sou um aluno com média = 7.5

        profTi.seApresentar(); //Olá, me chamo João Pedro. Oi! Eu sou o professor, minha formação é TI

        /* POLIMORFISMO
        *
        * É a capacidade de OOP de ter várias formas de diversificar as classes (super e sub), isso é muito importante
        * pq ela dá uma flexibilidade e independencia entre as classes.
        *
        * São varias formas dos métodos
        *
        * (conceitos: Arquitetura limpa e solid)
        *
        * */

        System.out.println(" === POLIMORFISMO: PESSOAS ===");
        //fazer um array list e guardar Pessoa
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(aluno); //Olá, me chamo Leticia Tenório. Eu sou um aluno com média = 7.5

        pessoas.add(profHistoria); //Olá, me chamo Viviane Catolé. Oi! Eu sou o professor, minha formação é História

        pessoas.add(aluno); ////Olá, me chamo Leticia Tenório. Eu sou um aluno com média = 7.5

        pessoas.add(p1);//Olá, me chamo Maria Antonia.

        pessoas.add(p2);//Olá, me chamo Carlos José. Eu sou um aluno com média = 7.5

        pessoas.add(profTi);//Olá, me chamo João Pedro. Oi! Eu sou o professor, minha formação é TI


        for (Pessoa pessoa : pessoas) { //se por Professor nesse Array, alunos não pode entrar na lista
            // o método seApresentar se comporta diferente dependendo da classe original
            //isso dá mais flexibilidade, o objeto poder mudar o comportamento
            //ele vai executar o método de acordo com objeto que estiver dentro da variavel
            pessoa.seApresentar();

        }


    }
}
