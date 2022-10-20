package Aulas.OPP;

import java.time.LocalDate;

//1º CLASSE: contrução da classe = Cliente

//public class Cliente = acessível fora desse arquivo
//O java obrigada a ter pelo menos uma classe public
public class Cliente {
    //2º ATRÍBUTO: Características da classe Cliente
    private int  id;
    public  String nome; //adc final = Use para garantir que um determinado algoritmo não possa ser modificado.
    private String sobrenome;
    public LocalDate dataNascimento; //tem que ser importado pq não tem no Intellinj
    private double altura;
    //private = encapsulamento = acessível apenas dentro da classe
    private double peso;

    //3º CONSTRUTOR
    Cliente (int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    /*4º OBJETO: um arquivo teste (ClienteTeste) =
     *
     * Cliente (construtor) = new (criando no obj) cliente1 (nome do objeto) = (id, nome, sobrenome, dataNascimento, altura, peso = atríbutos que definem a classe)
     *
     * */

    //5º MÉTODO: gerando ações aos objetos
    //pode ser (public ou private) geralmente é public tb
    void crescer () {
        //O crescimento só eu posso fazer
        this.altura += 0.2; //A alteração só pode ser feita dentro no arquivo principal, onde tem as chaves da classe
    }

    /*ENCAPSULAMENTO
     *
     * Ferramentas
     *
     * GETTER (pegar) -> possibilita a LEITURA dos atributos, NÃO possiblitia a alteração
     *Só da pra usar se os atríbutos for private
     * pq se os atríbutos tiver public vai ser uma redundância, pq os outros vai ter acesso e vai esté vísivel
     *
     * /Customiza a leitura de valores
     *
     * Sintaxe do getter:
     * */
    public String getSobrenome() {

        return this.sobrenome;
    }

    //mesmo com o método public não pode ser alterado, só vai se tornar vísivel para outro arquivo
    public int getId() {

        return this.id;
    }

    //Método para formação de get com junção dois atríbutos
    public String getNomeCompleto() {

        return this.nome + " " + this.sobrenome;
    }

    /*FERRAMENTAS
     *
     * SETTER -> Para alterações dos valores em outros arquivos
     *
     * geralmente é um void -> não precisa retornar nenhum valor
     * Mas não pode alterar diretamente, preservando o original.
     * Você pode VALIDAR o novo valor e ver se "faz sentido".
     *
     * Sintaxe:
     * */
    public void setAltura(double altura) {
        //Forma de fazer a VALIDAÇÃO
        if(altura < 2.51) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Atributo não modificado.");
        }
    }

    public void setPeso(double novoPeso) {
        if(novoPeso > 50.0) { //VALIDAÇÃO
            this.peso = novoPeso;
            System.out.println("Novo peso de " + getNomeCompleto() + " é " + novoPeso + " kg.");
        } else {
            System.out.println("Peso inválido. Atríbuto não moditifaco.");
        }
    }


}
