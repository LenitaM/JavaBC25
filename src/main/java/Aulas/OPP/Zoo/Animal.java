package Aulas.OPP.Zoo;

/*AULA DIA 20 DE OUT DE 2022
*
* interface = define um conjunto de métodos e a classe que herda deve implementar esses metodos.
* Dentro do Java as interfaces só colocam MÉTODOS, diferente do TYPESCRIPT.
*
* */




// Na interface você define um conjunto de métodos (sem corpo)
// E a classe que "herda" deve implementar estes métodos
public interface Animal {
    /*na interface vc só NÃO precisar por um corpo(não usa a chaves) no arquivo class.
Não coloca método dentro das chaves, só a DEFINIÇÃO do método:*/
    void dormir(); // definição do método apenas, sem corpo

    void fazerSom();

    void comer(String comida);
}

//implementando a interfaces (precisa por todos os métodos declarados)
// Gato precisa implementar os métodos
class Gato implements Animal { //obrigado a classe Gato a inserir os métodos da interface
    //Eu posso adc uma subclasse a uma interface
    //Class Gato extends Objetc implements Animal
    @Override
    public void dormir() { //precisa por os métodos e sobrescrever (caracterizar)

        System.out.println("zzzzzz Miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")) {
            System.out.println("Hummm gosto de peixe");
        } else {
            System.out.println("Só como peixe");
        }
    }

    public void ronronar() {
        System.out.println("grmmmmm");
    }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("Có có zzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummm có có " + comida);
    }

    public void botarOvo() {
        System.out.println("ovo colocado");
    }

        //Criando objetos (falta ver)
    public static void main(String[] args) {
        //classe + variavel = new clsse()
        Galinha galinha = new Galinha(); //objeto
        Gato gato = new Gato();
        Gato gato2 = new Gato();

        galinha.fazerSom(); //executando os métodos da interface
        galinha.dormir();
        galinha.comer("Milho");
        galinha.botarOvo();

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");
        gato.ronronar();

        gato2.fazerSom();

        // Interface não consigo criar um objeto
        // Animal novoAnimal = new Animal(); // não consigo criar pois é Interface

        //Mas pode:
        /*não pode criar na interface um objeto, mas consegue criar uma variável da Animal
        e guardar alguém da hierarquia Gato Galinha
         * ou qualuqer outr objeto criado antes.*/
        Animal animalGalinha = galinha; //tipo double x = 1 * 2
        //não está sendo criadando uma 2º galinha apenas rediredionando os valores do objeto já criado
        //Animal + variavel = objeto já criado antes

        //reatribuindo - só vai ter acesso aos atrivutos da classe Animal e não do Gato
        Animal animalGatinho = gato; //vai levar em conta o obj que está armazenando
        //não consegue criar uma instância (um novo objeto), mas consegue fazer uma atribuição

        System.out.println(" ===== POLIMORFISMO ===== ");
        animalGatinho.fazerSom(); //só vai ter som, dormir e comer e não as especificações de gato como ronronar
        animalGalinha.fazerSom();
    }
}
