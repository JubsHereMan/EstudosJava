package Jubs.Project.maratonajava.JavaCore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {

    File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("something wrong has been created? it truly exists?" + isCreated);
            System.out.println("the path of the creature is on: " + file.getAbsolutePath());
            System.out.println("is a directory?... : " + file.isDirectory());
            System.out.println("then it's a file... : " + file.isFile());
            System.out.println("it's hidden? : " + file.isHidden());
            System.out.println("it's changing? : " + Instant.ofEpochMilli( file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists) {{
                System.out.println("it exists, but not for long...");
                file.delete();
                System.out.println("told'ya, not for long... the file is deleted.");
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
