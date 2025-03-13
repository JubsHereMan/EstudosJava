package Jubs.Project.maratonajava.JavaCore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {


        //Metacaracteres

        // -> \d= todos os digitos
        // -> \D = tudo o que não for digito(todas as letras)
        // -> \s = todos os espaços em branco \t \n \f \r
        // -> \S = todos os caracteres excluindo os brancos
        // -> \w = tudo que for de a-z, A-Z, todos os digitos, e underscore = '_'
        // .> \W = tudo o que não dor incluso no \w (caracteres especiais)


        String regex ="\\W";
//        String texto ="abaaba";
        String texto2 ="@#hh_212 12gvh21";



        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posicoes encontradas");



        while(matcher.find()){
            System.out.println(matcher.start()+ " " + matcher.group()+ " \n");

        }
    }
}
