package Aulas;

import java.time.LocalDate;

public class Datas {
    public static void main(String[] args) {
        //Trabalhando datas com java (dia - mês - ano)
        //LocalDate armazena qualquer dia (d/m/a) conta assim (a/m/d)
        LocalDate hoje = LocalDate.now(); //pega a data atual
        System.out.println(hoje);

        //Exemplo prático de como usar: ver se a data está no produto, promoção, etc.
        LocalDate natal = LocalDate.of(2022, 12, 25); // year/month, day
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); //verificar se a data é DEPOIS de uma data especifica. False = antes / True = depois
        System.out.println(hoje.isBefore(natal)); //Verificar se a data é ANTES de uma data específica. False = depois / True - antes

        int ano = hoje.getYear(); //pegar o ano da data
        int mes = hoje.getMonthValue(); //pegar o mês da data
        int dia = hoje.getDayOfMonth(); //pegar o dia do mês da data



        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

        System.out.println("Faltam " + diasParaNatal + " dias para o natal! hohoho :)"); //73
        System.out.println(hoje.getDayOfYear() - natal.getDayOfYear()); //-73

    }
}

