package Aulas.OPP; //eles reconhecem o arquivo pq estão na mesma package

/*AULA 18 DE OUT DE 2022: HERANÇA
*
* SubClass(Filha) = Cachorro
* */

//forma de conectar superclass e subclass:
public class Cachorro extends Pet { //fica vermelho pq ainda não usei as propriedades de Pet
    private String comidaFavorita;
    private String raca;

    //Está reclamando pq não está usando o construtor padrão (Pet)
    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {

        //representa a classe Pet (deve ser sempre a 1ª linha do construtor filha/subclasse
        super(nome, idade, peso); //sempre vai precisar chamar a classe pai na classe filha
        //chamando o construtor da classe pai/superclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    //Reescrever o método fazerSom();
    @Override //anotação = sobrescreve a ação de fazer som
    public void fazerSom() {
        System.out.println("au au au au au");
    } //essa execução vai alterar apenas a da subclasse onde foi escrito (nessa caso CACHORRO)

    @Override
    //Criando um novo método, recenbendo um parametro = brincar(String novoBrincar),
    // MUDA o método (NÃO sobrescreve)
    public void brincar() { //o cachorro late na hora de brincar
        this.fazerSom(); //chamar o fazerSom do Cachorro, pq foi sobrescrito
        super.brincar(); // está chamando o brincar() de Pet
        this.dormir(); //chama o dormir do Pet, pois não foi sobrescrito
    } //ele vai unir o fazer som e brincar ficará assim = au au au au + estou brincando + zzzz

    //A subclasse pode fazer escolhas
    @Override //customizando a FORMA de comer
    public void comer(String comida) { //só vai comer a se comida = comida Favorita
        //Verificar se é a comida favorita
        if(comida.equals(this.comidaFavorita)) { //só assim para comparar string com string
            super.comer(comida); ///super.comer = "Esou comendo" + comida = comidaFavorita
            this.peso += 0.2; //toda vez que comer ele vai engorar 0,2 gramas.
            //chamar o comer() do Pet
            //Outra forma de fazer:this.setPeso(this.getPeso() + 0.2);
            // não pode husar o this.peso pq é private (mudado para protected)
            //Pode usar o setPeso e getPeso pq ele é public
        } else {
            System.out.println("Quero " + comida + " não!");
        }
    }

    //Adiciona métodos especifícos a subclasse (Cachorro)
    public  void correrAtrasMoto() { //método especifico do cachorro
        this.fazerSom();
        System.out.println("fdp, passa a roda a roda!");
    }


    //4º Objeto
    // Vai mostrar o objeto de super e sub
    public static void main(String[] args) {

        //testar herança:
        Pet luna = new Pet("Luna", 1, 12.00);
        luna.dormir(); //zzz (herança de Pet)
        luna.comer("Banana"); //Estou comendo (herança de Pet) Banana.
        luna.fazerSom(); // ... (herança de Pet) (não muda para au au aua pq é herança direto da classe)

        System.out.println("Separação para outro objeto");

        //metódos de Pet (nome, idade e peso) e tb os métodos de Cachorro (comidaFavorita e raça)
        Cachorro lupi = new Cachorro("Lupi", 12, 25, "Carne", "Perdigeiro");
        {
            lupi.dormir(); //zzz (herança de Pet)

            // muda para au au au au (foi alterado dentro da subclasse)
            lupi.fazerSom(); //.... (herança de Pet)

            //Reformulado a forma de comer, só vaia aceitar a comidaFavorita:
            lupi.comer("Osso"); //Estou comendo (herança de Pet) Osso.

            lupi.setPeso(20); //peso de Lupi mudado (não aparece pq é set)
            lupi.brincar(); //au au au au Estou brincando zzz

            //Reformulado a forma de comer:
            lupi.comer("Osso"); //Quero Osso não!
            lupi.comer("Carne"); //Estou comendo Carne

            //Adc método especifico a subclasse
            lupi.correrAtrasMoto(); //au au au fdp, passa a roda a roda

        }
    }
}
