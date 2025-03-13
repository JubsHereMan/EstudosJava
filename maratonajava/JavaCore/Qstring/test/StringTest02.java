package Jubs.Project.maratonajava.JavaCore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "          Luffy         ";
        String numeros = "012345";

        System.out.println(nome.charAt(0));// pega o caracter especifico
        System.out.println(nome.length());// passa a largura da String
        System.out.println(nome.replace("f","l"));  //replace o target pelo parametro passado
        System.out.println(nome.toLowerCase()); // passa tudo para lowercase
        System.out.println(nome.toUpperCase()); // passa tudo para uppercase

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));  // só mostra da posição x até a y -1  ex: Julio - x=0 e y = 3, saida= Jul
        System.out.println(nome.trim());  //remove os espaços vazios antes e depois da String

    }
}
