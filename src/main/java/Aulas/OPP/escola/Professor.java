package Aulas.OPP.escola;

public class Professor extends Pessoa {

    private String formacao;

    public Professor(String nome, String email, String cpf, String formacao) { //generate bisu
        super(nome, email, cpf);
        this.formacao = formacao;
    }

    //Ele herda de pessoa, mas tem outras propriedades, então é adc, mas o principal continua que é da superclasse
    @Override //indica que há sobrescrita
    //se não sobreescrever todos eles vão ter o mesmo comportamento da superclasse
    public void seApresentar() {
        super.seApresentar(); //vai ser o nome dele, por isso precisa chamar //
        System.out.println("Oi! Eu sou o professor, minha formação é " + this.formacao);
    }
    //os métodos especificos de cada subclasse só vai aparecer para sua subclasse correspondente.
    // Exemplo = a média só vai aparecer para Aluno, não vai aparecer nem para Professor, nem para Pessoa.

    public String getFormacao() {
        return this.formacao;
    }
}
