package Jubs.Project.maratonajava.JavaCore.Pwrappers.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        //Wrappers são objetos que vão enclapsular em tipos primitivos


        //PRIMITIVOS

        byte byteP= 1;
        short shortP= 1;
        int intP= 1;
        long longP= 10L;
        float floatP= 10F;
        double doubleP= 100D;
        char charP= 'J';
        boolean boolP= true;

        //WRAPERS

        //autoboxing
        Byte byteF= 1;
        Short shortF= 1;
        Integer intF= 1;
        Long longF= 10L;
        Float floatF= 10F;
        Double doubleF= 100.0;
        Character charF= 'J';
        Boolean boolF= true;

        //Passar os valores numericos por referencia e não mais por valor
        //quando trabalharmos com extruturas de dados, eles não vão trabalhar com primitivos


//tire o comentario para poder ver
//        List<int>list;
//        List<Integer>list2;

        int i = intF;//unboxing = praticamente um casting
        Integer intF2 = Integer.parseInt("1");
        // metodo fei que doi.
        // Integer intF3 = new Integer("2");

        //agora estamos trabalhando com objetos e não mais com tipos primitivos

        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('a'));



    }
}
