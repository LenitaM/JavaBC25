package Aulas;

/* AULA 13 DE OUT DE 2022: DATAS EM JAVA

 * Enums são estrutura com constantes definidas
 * Exemplos: dias da semana, meses do ano, turno do dia, estações
 * niveis (junior, pleno, senior), feriados nacionais
 * Não precisa se procupar com outras possibilidades, pq são momentos certos
 * */
public class Enums {
    public static void main(String[] args) {
        enum DiaDaSemana {
            //são constantes:
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }
        DiaDaSemana hoje = DiaDaSemana.QUINTA; //enum.CONSTANTE
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR}
        NivelDev nivel = NivelDev.PLENO; //se não por nadad vai da como null
        NivelDev nivel2 = NivelDev.valueOf("JUNIOR"); //o valor de name precisa ser JUNIOR, PLENO OU SENIOR

        switch (nivel) {
            case JUNIOR:
                System.out.println("Seu nível é JUNIOR");
            case PLENO:
                System.out.println("Seu nível é PLENO");
            case SENIOR:
                System.out.println("Seu nível é SENIOR");
                break;
            //default só ocorre se tiver outras possibilidades e vc quer destacar só algumas possibilidades, quando não se usa enum por exemplo.
        }
        /*Versão ENHANCED: Outra forma mais convencional de fazer switch */
        switch (nivel) {
            case JUNIOR -> {
                System.out.println("Você é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Você é PLENO");
            }
            case SENIOR -> {
                System.out.println("Você é SENIOR");
            }
        }
    }
}

