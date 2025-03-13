package Jubs.Project.maratonajava.JavaCore.Uregex.test;

import com.sun.source.tree.PatternTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        //Pattern: Representa o padrão (regex) que queremos encontrar.
        //Matcher: Faz a busca dentro do texto baseado no padrão definido.



        //regex = "aba" → Estamos procurando a sequência "aba" dentro do texto.
        //texto2 = "abababa" → É o texto onde vamos procurar a ocorrência desse padrão.

        String regex ="aba";
//        String texto ="abaaba";
        String texto2 ="abababa";


        /*

        Pattern.compile(regex): Cria um padrão baseado na regex.

        pattern.matcher(texto2): Aplica esse padrão ao texto2 e retorna
        um objeto Matcher para encontrar correspondências.

        */

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posicoes encontradas");


        /*

        matcher.find() → Procura a próxima correspondência no texto.
        matcher.start() → Retorna a posição inicial onde a correspondência foi encontrada.

        */

        while(matcher.find()){
            System.out.println(matcher.start()+ " ");

        }
    }
}
