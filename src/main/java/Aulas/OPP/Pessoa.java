package Aulas.OPP;

/*AULA DIA 17 DE OUT 2022 - CLASSES EM PROGRAMAÇÃO ORIENTADA A OBJETOS EM JAVA
*
* CLASSE -> um gato -> Objeto -> atributos e propriedades de um gato
*
* **/
public class Pessoa {
    // Propriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa() { // construtor da classe
        // this => representa o objeto
        this.nome = "José";
        this.sobrenome = "Carlos";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
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

    void mostrarImc() {
//        double imc = this.peso / (this.altura * this.altura);
        double imc = this.calculaImc();
        System.out.println("O meu IMC é " + imc);
    }

    double calculaImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }
}