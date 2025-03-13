package Jubs.Project.maratonajava.JavaCore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,200,true";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",");
        //enquanto tiver um proximo
        while(sc.hasNext()){

            if(sc.hasNextInt()){
                int i = sc.nextInt();
                System.out.println("Int " + i);
            }else if (sc.hasNextBoolean()){
                boolean b = sc.nextBoolean();
                System.out.println("Boolean " + b);
            }else{
                System.out.println(sc.next());
            }
        }


    }
}
