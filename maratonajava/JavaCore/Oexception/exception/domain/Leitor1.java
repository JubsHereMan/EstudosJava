package Jubs.Project.maratonajava.JavaCore.Oexception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1  implements Closeable {


    @Override
    public void close() throws IOException {
        System.out.println("Fechando o leitor 1");
    }
}
