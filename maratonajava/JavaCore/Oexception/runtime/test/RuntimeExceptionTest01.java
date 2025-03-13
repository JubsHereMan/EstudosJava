package Jubs.Project.maratonajava.JavaCore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    //Checked e Unchecked

    /*para a classe Trowable existem as subclasses Error e Exception
    para o Exception temos as filhas Checked e Unchecked
    para as Unchecked ira te mandar para o runtimeException
    quando da esse erro o problema é seu você que deveria ter tratado o codigo
    */
    public static void main(String[] args) {
        Object o = null;
        System.out.println(o.toString());
    }

}
