package Exercicios.OPP;

/*3) Crie uma classe Autor que possui:
	* Atributos: nome, email;
	* Construtores:
		- Cria autores com base nos parâmetros nome e email;
	* Métodos:
		- alteraNome(String novoNome) => muda o nome atual do autor
		- alteraEmail(String novoEmail) => muda o email atual do autor*/

public class Autor {

    private String nome;
    private String sobrenome;
    private String email;


    Autor (String nome, String sobrenome, String email) {

        this.nome= nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public void setAlteraNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome + this.sobrenome;
    }

    public void setEmail(String novoEmail) {
        this.nome = novoEmail;
    }

    public String getEmail() {
        return this.email;
    }

    public static void main (String[] args) {

        Autor autor1 = new Autor("José", " Saramago", "josesaramago@gmail.com");

        System.out.println(autor1.getNome());
        System.out.println(autor1.getEmail());

        autor1.setEmail("jose.saramago@gmail.com");

        System.out.println(autor1.getEmail());

    }
}
