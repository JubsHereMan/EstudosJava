package Jubs.Project.maratonajava.JavaCore.Oexception.exception.test;

import Jubs.Project.maratonajava.JavaCore.Oexception.exception.domain.Funcionario;
import Jubs.Project.maratonajava.JavaCore.Oexception.exception.domain.LoginInvalidoException;
import Jubs.Project.maratonajava.JavaCore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args)  {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
