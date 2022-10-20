package Aulas.OPP;

/*19 DE OUT DE 2022: HERANÇA
 *
 *De uma classe principal (superclasse) generica
 * pode ser usada para criar outras classes (subclasse) e cada uma delas geram novas
 * classes e cada uma com atríbutos particulares.
 *
 * Pais ou SuperClass (classe principal) e Filhas ou SubClass (classes geradas apartir do Pai, com atríbutos especificações)
 *Exemplo:
 *
 * PET (SUPERclasse) -> gato e cachorro (SUBclasse)
 *
 * */

/*Criação da SuperClasse
*
* Ela vai possuir características gerais de algum ser
* */

//1º Classe
public class Pet {
    //2º Atríbutos
    private String nome;
    private int idade;
    //permite acesso direto nas subclasses,
    // diferente de private ele não permite usar nem mesmo na subclasse
    //protected permite alterar atríbuto APENAS em subclasses, em outros arquivos ele não permite
    //protected = APENAS os herdeiros (subclasses) podem ter acesso

   /*ANALOGIA DO PROTECTED E PRIVATE:
   * private = celular privado (só voce tem acesso)
   * protected = telefone fixo (voce e sua familia tem acesso)
   *  */
    protected  double peso;
    //nas subclasses o atributo/método é private
    //não é acessível

    //3º Construtor
    public Pet (String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //4º Objeto - outro arquivo

    //5º Métodos

    //Ações em comum de todos os pets

    public void fazerSom() {

        System.out.println("....");
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

    public void dormir() {

        System.out.println("zzz");
    }

    public void brincar() {

        System.out.println("Estou brincando");
    }
    //apenas leitura do peso
    public double getPeso() {

        return this.peso; //sem void pq não é vazio e precisa retornar
    }

    //possibilidade de alterar o valor
    public void setPeso(double novoPeso) {

        this.peso = novoPeso;
    }
}
