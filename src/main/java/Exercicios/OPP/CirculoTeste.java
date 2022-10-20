package Exercicios.OPP;

public class CirculoTeste {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(1, "Amarelo");

        System.out.println(circulo1.calcularcircunferencia()); //6.28
        System.out.println(circulo1.calcularArea()); //3.14

        circulo1.setRaio(-1); //Valor não pode ser menor que 1. Atríbuto não modificado.
        circulo1.setRaio(2); // O novo valor do raio é 2.0.

        System.out.println(circulo1.calcularArea()); //12.56
        System.out.println(circulo1.calcularcircunferencia()); //12.56

        System.out.println(circulo1.getCor()); //Amarelo
    }
}
