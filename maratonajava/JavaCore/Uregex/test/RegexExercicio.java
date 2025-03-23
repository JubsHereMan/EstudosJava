package Jubs.Project.maratonajava.JavaCore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercicio {
    public static void main(String[] args) {
        //Metacaracteres

        // -> \d= todos os digitos
        // -> \D = tudo o que não for digito(todas as letras)
        // -> \s = todos os espaços em branco \t \n \f \r
        // -> \S = todos os caracteres excluindo os brancos
        // -> \w = tudo que for de a-z, A-Z, todos os digitos, e underscore = '_'
        // .> \W = tudo o que não for incluso no \w (caracteres especiais)

        //range
        // representado por []

        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () => agrupamento
        // |  => OU
        // $  fim da linha
        // . vai achar expressoes como 1.3


        String word = "Hello World";
        String[] wordsSepareted = word.split(" ");

        for (String s : wordsSepareted) {
            System.out.println(s);
            System.out.println(wordsSepareted[1]+" " + wordsSepareted[0]);

        }








    }
}
