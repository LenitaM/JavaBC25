package Exercicios.OPP;

/*2) Crie uma classe Empregado que possui:
	* Atributos: nome, sobrenome, salario
	* Construtores:
		- Cria empregados com base nos parâmetros nome, sobrenome e salario;
	* Métodos:
		- calcularSalarioAnual() => deve retornar double
		- aumentarSalario(double aumento) => aumenta o valor do salário
		- nomeCompleto() => deve retornar a concatenação do nome e sobrenome*/

public class Empregado {

   private String nome;
    private String sobrenome;
    private double salario;


    Empregado (String nome, String sobrenome, double salario ) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        double valorAnual = this.salario * 13;
        System.out.println("O valor anual do seu salário é " + valorAnual + " reais.");
        return valorAnual;
    }


    public double aumentoSalario() {
        double aumento = this.salario * this.salario;
        System.out.println("Parabéns! Seu salário foi reajustado para " + aumento + " reais.");
        return aumento;
    }

    public String getNomeCompleto(){

        return this.nome + " " + this.sobrenome;
    }

    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("Carlos", "Silva", 2.500);
        System.out.println(empregado1.getNomeCompleto());
        System.out.println(empregado1.calcularSalarioAnual());
        System.out.println(empregado1.aumentoSalario());





        Empregado empregado2 = new Empregado("Luisa", "Beltrão", 4.500);
            System.out.println(empregado2.getNomeCompleto());
            System.out.println(empregado2.calcularSalarioAnual());
            System.out.println(empregado2.aumentoSalario());



    }
}



