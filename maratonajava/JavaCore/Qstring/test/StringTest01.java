package Jubs.Project.maratonajava.JavaCore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Julio"; // String constant pool
        String nome2 = "Julio";
        nome = nome.concat(" Cesar");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("julio");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
