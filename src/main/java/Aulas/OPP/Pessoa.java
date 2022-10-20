package Aulas.OPP;

import java.util.ArrayList;

/*AULA DIA 17 DE OUT 2022 - CLASSES EM PROGRAMAÇÃO ORIENTADA A OBJETOS EM JAVA
* Os principais conceitos do paradigma orientado a objetos
* são Classes e Objetos, Associação,Encapsulamento, Herança e Polimorfismo.
*
* Para definir os dados são utilizados os atributos, e para definir o comportamento são utilizados métodos.
* Depois que uma classe é definida podem ser criados diferentes objetos que utilizam a classe.
*
* Exemplo: definição da CLASSE Empresa,
* que tem os ATRÍBUTOS nome, endereço, CNPJ, data de fundação, faturamento,
* e também o MÉTODO imprimir, que apenas mostra os dados da empresa.
*
* CLASSE -> um gato -> Objeto -> atributos e propriedades de um gato
*
* CLASSES E OBJETOS
*
* Através da abstração = escolher dentre várias alternativas a mais importante, são os geradores de atríbutos
* (características de uma classe) e métodos (ações de uma classe).
*
*
*
* **/
public class Pessoa { //Abstração = Uma forma de simplificar
    // Propriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    /*HIERARQUIA  (gera ->)

    * classe (maior da hierarquia) (gera) -> atríbutos (geram) -> contrutor (geram) ->  objetos (a partir deles aplicam-se)-> métodos
    *
    * classe = principal, declara o ser que vamos contruir (ex: gato)
    * Atríbutos = são as características que criamos para o ser (ex gato = nome, cor, raça, vaciando, etc)
    * Construtor = vai definir valores a classe (ex: gato: nome = nome / cor = cor)
    * Objetos = são os valores gerados pelo construtor (ex: gato: nome = Dengo / cor = cinza)
    * Métodos = Os objetos aplicam os métodos que são ações de um ser (ex: gato: miar, dormir etc)
    *
    *
    * */

    /*18 DE OUT DE 2022: ENCAPSULAMENTO*/

    ArrayList <Pessoa> conhecidos = new ArrayList<>(); //para proucra de conhecidos e novas pessoas


    Pessoa() {
        // this => representa o objeto
        this.nome = "José";
        this.sobrenome = "Carlos";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;
    }
    /*CONSTRUTOR *
     *
     * Forma como montamos o objeto, para adc mais características tem que adc na classe tb.
     * Coloca o valor válido dentro das classes que gera OBJETOS e
     * dentro dos OBJETOS APLICA MÉTODOS
     * */
    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) { // construtor da classe = como vai construir uma classe,
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.dizOla();
    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;
    }

    // Ações de uma Pessoa (métodos)
    // <tipo_retorno> nomeDoMetodo(PARAMETROS) {}
    void dizOla() { // método que não retorna nada
        System.out.println("Olá, tudo bem? Meu nome é " + this.nome);
    }
    //Aqui não retorna o valor (mostra no terminal),
    // VOID (vazio)
    void mostrarImc() {
//        double imc = this.peso / (this.altura * this.altura);
        double imc = this.calculaImc();
        System.out.println("O meu IMC é " + imc);
    }

    //return para retornar o valor pq ele tem valor para fazer return
    //apenas faz o cálculo
    double calculaImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }

    /** AULA 18 DE OUT DE 2022
     *
     * Adicionar pessoas novas
     *
     * Faz parte de características das pessoas conhecer outras pessoas, procurar conhecidos
     * */
    void addPessoaNova(Pessoa pessoa) { //objeto "conhecer"
        this.conhecidos.add(pessoa); //this puxa a classe / .add() array para adicionar elementos
        System.out.println(this.nome + " conheceu " + pessoa.nome + "!");
    }
    //void = vazio, não precisa de return
    void cumprimentar (Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        //nega o boolean: inverto os valores !this = false / this = true
        if(!this.conhecePessoa(pessoa)) {
            //false = você conhece? não conhece - vai gerar o this.addPessoaNova().
            this.addPessoaNova(pessoa);
            pessoa.conhecePessoa(this); //this = objeto que chama cumprimentar ()
        }
    }

    //procurar amigos conhecidos "Você conhece essa pessoa?"
    boolean conhecePessoa(Pessoa pessoa) {
        //se true: a pessoa (this) conhece a outra pessoa
        // se false: não conhece
        return this.conhecidos.contains(pessoa);
        //.contains = Array para verificar se a existe o elemento no Array
    }


}