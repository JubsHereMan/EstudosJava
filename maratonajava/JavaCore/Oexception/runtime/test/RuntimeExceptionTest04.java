package Jubs.Project.maratonajava.JavaCore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException ");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException ");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException ");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }


        try{
            talvezLanceException();
        }catch (SQLException e){
            System.out.println("Dentro do SQLException ");
        }catch (FileNotFoundException e){
            System.out.println("Dentro do FileNotFoundException ");
        }
    }

    private static void talvezLanceException()throws SQLException, FileNotFoundException {}
}


//excecões mais genericas tem que vir no final