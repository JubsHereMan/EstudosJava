package Jubs.Project.maratonajava.JavaCore.Vio.test;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated =fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);
        File fileArquivoDiretorio = new File( fileDiretorio, "arquivo.txt");

        File fileRenamed = new File(fileDiretorio,"Arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);



    }
}
