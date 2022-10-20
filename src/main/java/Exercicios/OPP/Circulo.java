package Exercicios.OPP;

/*1) Crie uma classe Circulo que possui:
	 Atributos: raio, cor.
	Construtores:
		- Cria circulos com base no parâmetro raio do construtor;
		- Cria círculos de raio 1;
	 Métodos:
		- calcularArea() => deve retornar double (PI * RAIO * RAIO)
		- calcularCircunferencia => deve retornar double (2 * PI * RAIO)
		- mudarRaio(double novoRaio) => deve alterar o valor do raio
 * */

public class Circulo {

    private double raio;
    private String cor;


    Circulo (double raio, String cor) {

        this.raio = 1.00;
        this.cor = cor;
    }

    public double calcularArea () {
        double area = 3.14 * (this.raio * this.raio);
        return area;
    }

    public void mostrarArea() {
        double area = this.calcularArea();
        System.out.println("O valor do perimetro é " + area);
    }

    public double calcularcircunferencia() {
        double circunferencia = 2 * 3.14 * this.raio;
        return circunferencia;
    }

    public void mostrarCircunferencia (double calcularcircunferencia) {
        double circunferencia = this.calcularcircunferencia();
        System.out.println("O valor da circunferência é " + circunferencia);

    }

    public void setRaio(double novoRaio) {
        if(novoRaio > 1) {
            this.raio = novoRaio;
            System.out.println("O novo valor do raio é " + novoRaio + ".");
        } else {
            System.out.println("Valor não pode ser menor que 1. Atríbuto não modificado.");
        }
    }

    public String getCor() {
        return this.cor;
    }
}





