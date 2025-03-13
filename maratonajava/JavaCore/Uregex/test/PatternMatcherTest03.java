package Jubs.Project.maratonajava.JavaCore.Uregex.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {


        //range
        // representado por []


        // quero que pegue de 'a' ate 'z' [a-z]
        // quero que pegue de 'a' ate 'z' [a-zA-Z] e de 'A' ate 'Z'

//        String regex ="[a-zA-Z]";
//        String texto ="abaaba";
        String regex= "0[xX][0-9a-fA-F]";
        String texto2 ="12 0x 0X 0xFFABC 0X109 0X1";



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
