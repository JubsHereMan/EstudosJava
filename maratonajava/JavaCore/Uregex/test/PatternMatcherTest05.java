package Jubs.Project.maratonajava.JavaCore.Uregex.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {


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

        /*ex: o(c|v)o
             estarei procurando:
             ovo
             oco

        */





        String regex= "([a-zA-Z0-9\\._-])+ @([a-zA-Z])+";
        String texto ="luffy@hotmail.com, 123jotaro@gmail.com, @!zoro@mail.br, teste@email.com, sakura@mail";



        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posicoes encontradas");



        while(matcher.find()){
            System.out.println(matcher.start()+ " " + matcher.group()+ " \n");

        }


    }
}
