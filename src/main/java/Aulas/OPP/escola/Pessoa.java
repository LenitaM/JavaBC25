package Aulas.OPP.escola;

/*AULA 20 DE OUT DE 2022: POLIMORFISMO*/

public class Pessoa { //classe
    private String nome; //atributo
    private String email;
    private String cpf;

    public Pessoa(String nome, String email, String cpf) { //atributo
        this.nome = nome; //Parametro. Pode ter qualquer nome "this.nome = feijão".
        // Quando o nome do parametro é o mesmo nome da classe tem que usar "this"
        this.email = email;
        this.cpf = cpf; //quando for chamada Pessoa vai ter os valores (parametros) que serão adc.
    }

    public void seApresentar() {
        System.out.println("Olá, me chamo " + this.nome); //this.nome = não é regra pode ser só "nome",
    }

    //bisu: mouse direito + generate seleciona o que vc quer inserir:


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
