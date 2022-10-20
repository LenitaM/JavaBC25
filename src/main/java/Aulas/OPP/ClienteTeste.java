package Aulas.OPP;

import java.time.LocalDate;

/* AULA DIA 18 DE OUT DE 2022
*
* ENCAPSULAMENTO
*
* geralmente é tudo private
* */

public class ClienteTeste {
    public static void main(String[] args) {

        //4º OBJETO
        Cliente cliente1 = new Cliente (111111111, "Felipe", "Silva", LocalDate.of(1993, 5, 25), 1.85, 95.3);

        /* ENCAPSULAMENTO
         *
         * Escolhe quais atríbutos/métodos serão visíveis (acessíveis) fora da classe.
         * Escolhe os atríbutos que podem ser alterados pq não conseguem acessar.
         * public (padrão) -> vísivel para todos, acessível em outros documentos (ClienteTeste.java).
         * private -> os métodos/atríbutos são vísiveis apenas na classe nos arquivos (Cliente.java) onde foi feito as chaves.
         *Cria regras para a classe
         * Só no (this) pode acessar o atríbuto da classe, mas não muda os atríbutos.
         *
         * */


        //acesso fora da classe = para fazer essas mudanças só se tiver public

        //Agora pode mudar pq é public nome
        System.out.println(cliente1.nome); //Felipe
        //Vai da erro pq data de nascimento da private LocalDate
        System.out.println(cliente1.dataNascimento); //1993 - 5 - 25 (year/month/day)

        // Mudar os valores dos atributos = nesse caso pode mudar fora do arquivo pq é public
       cliente1.nome = "Pedro";
       System.out.println(cliente1.nome); //Antes = Felipe - Agora = Pedro

        //Não da para acessar pq é private
        //System.out.println(cliente.id);

       //GETTER

        //No outro arquivo só vai permitir a leitura
        System.out.println(cliente1.getSobrenome()); //Silva

        System.out.println(cliente1.getId()); //11111111

        System.out.println(cliente1.getNomeCompleto()); //Pedro Silva

        /*SETTER
         *
         *
         * Sintaxe:
         * */
        //Pode alterar, mas eu posso validar ou não essa mudança
        //Não perde o contéudo original, pq precisa passar pela validação
        cliente1.setAltura(50.00); //"Altura inválida. Atributo não modificado.

        cliente1.setPeso(70.0); //era 95.3 e agora é 70.0kg


    }
}
