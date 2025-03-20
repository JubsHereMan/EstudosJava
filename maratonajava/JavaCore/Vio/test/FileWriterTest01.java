package Jubs.Project.maratonajava.JavaCore.Vio.test;

//File
//FileWriter
//FilerReader
//BufferedWriter
//BufferredReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {


    File file = new File("File.txt");
    {
        try (  FileWriter fw = new FileWriter(file)) {
           fw.write("O Julio é incrivel, meu Deus do céu que cara bom.");
           fw.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
}