package Jubs.Project.maratonajava.JavaCore.Uregex.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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




//                Comece com 0
//                        um agrupamento
//                                      seja seguido por espaço com branco ou o fim da linha
        String regex= "0[xX]([0-9a-fA-F])+\\s|$";
        String texto ="12 0x 0X 0xFFABC 0X10G 0X1";



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
