package Jubs.Project.maratonajava.JavaCore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args)throws IOException {

        criarNovoArquivo();
    }

        private static void criarNovoArquivo() throws IOException{
            File file = new File("Arquivo\\teste.txt");
            try{
              boolean isCriado =  file.createNewFile();
                System.out.println("arquivo criado:  " + isCriado);
            }catch (IOException e) {//NUNCA DEIXE O CATCH VAZIO!!!!!!!!!!!!!!!!!!!
            e.printStackTrace();
            }

            //ANTES DE PERGUNTAR PROCURE RESPOSTAS

        }


}
