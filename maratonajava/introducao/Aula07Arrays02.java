package Jubs.Project.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //byte, short, int, long, float e double
        //char
        //boolean falsae
        //String null
        String [] nomes = new String[3];
        nomes[0] = "Kurosaki";
        nomes[1] = "Tsuna";
        nomes[2] = "Seiya";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);

        }



    }
}
