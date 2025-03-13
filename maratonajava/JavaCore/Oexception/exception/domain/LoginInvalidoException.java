package Jubs.Project.maratonajava.JavaCore.Oexception.exception.domain;

public class LoginInvalidoException  extends Exception {


    public LoginInvalidoException() {
        super("login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
