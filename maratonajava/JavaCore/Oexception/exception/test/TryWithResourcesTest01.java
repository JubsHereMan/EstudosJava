package Jubs.Project.maratonajava.JavaCore.Oexception.exception.test;

import Jubs.Project.maratonajava.JavaCore.Oexception.exception.domain.Leitor1;
import Jubs.Project.maratonajava.JavaCore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {

    public static void main(String[] args) {

        lerArquivo();

    }

    public static void lerArquivo() { //try with resources
        try(Leitor1 leitor1= new Leitor1();
        Leitor2 leitor2= new Leitor2()) {

        }catch (IOException e){
            System.out.println("Dentro do IOException");
        }

    }

    public static void lerArquivo2(){//vulgo o codigo feio
        Reader reader = null;
        try {
            reader= new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
