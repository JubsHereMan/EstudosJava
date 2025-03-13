package Jubs.Project.maratonajava.JavaCore.Oexception.exception.test;

import Jubs.Project.maratonajava.JavaCore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }


    private static void logar() throws LoginInvalidoException {
        Scanner input = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("usuario");
        String usernameDigitado = input.nextLine();

        System.out.println("senha");
        String passwordDigitado = input.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)){
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }
        System.out.println("Login OK");
    }

}