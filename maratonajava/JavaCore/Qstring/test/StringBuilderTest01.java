package Jubs.Project.maratonajava.JavaCore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome ="Julio César";
        nome.concat(" Nunes Oliveira");

        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Julio Cesar ");
        sb.append("Nunes Olivera").append(" vulgo JUBS");
        System.out.println(sb);
    }
}
