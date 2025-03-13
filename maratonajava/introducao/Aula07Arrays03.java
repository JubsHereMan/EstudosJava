package Jubs.Project.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5};//Java consegue me surpreender sobre as maneiras de fazer uma lista viu
        int [] numeros3 = new int[] {1,2,3,4,5};// é a mesma coisa só que mais doentia.

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros2[i]);
        }
        //for each
        for(int num: numeros3){
            System.out.println(num);
        }
      
    }
}
