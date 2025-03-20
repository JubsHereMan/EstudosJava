package Jubs.Project.maratonajava.JavaCore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {


        //a diferença entre o fileWrite e o bufferedWriter é que a performance é melhor

        File file = new File("File.txt");
            try (FileWriter fw = new FileWriter(file,true);
            BufferedWriter br = new BufferedWriter(fw)) {
                br.write("O Julio é incrivel, meu Deus do céu que cara bom.");
                br.newLine();
                br.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

