package Exercicios.OPP.Pou;

/*AULA DIA 21 DE OUT DE 2022: CORREÇÃO*/

/**
 * Crie uma classe Comida:
 * Atributos: nome, peso;
 * Construtores: Cria a comida com base nos parâmetros nome e peso;
 * Métodos:
 * - getNome()
 * - getPeso()
 */
public class Comida {
    private String nome;
    private double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}