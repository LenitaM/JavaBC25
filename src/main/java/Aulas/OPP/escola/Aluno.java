package Aulas.OPP.escola;

/*AULA DIA 20 DE OUT DE 2022*/

//Criando subclasse: essa forma
public class Aluno extends Pessoa { //ADC EXTENDS

    private double media;

    //Chama Super deve vim em primeiro
    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); //estou chamando um construtor de Pessoa
        this.media = media;
        }

        @Override //quero da um método particular para o sub
    public void seApresentar() { //na sobreescrita muda APENAS o comportamento, a ESTRUTURA do método deve ser respeitado

        super.seApresentar(); //ele faz refêrencia a superclasse = Pessoa / por isso ela é muito importante. // "Olá, me chamo " + this.nome

            System.out.println("Eu sou um aluno com média = " + this.media); // "Eu sou um aluno com média = " + this.media
        }

        public double getMedi() {
        return this.media;
        }
}
