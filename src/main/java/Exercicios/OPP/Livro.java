package Exercicios.OPP;

/*4) Crie uma classe Livro que possui:
	* Atributos: nome, autor, preco;
	* Construtores:
		- Cria livros com base nos parâmetros nome, autor(objeto da classe Autor), preco;*/

public class Livro {

    String titulo;
    String autor;
    double preco;

    Livro (String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;

    }
}
