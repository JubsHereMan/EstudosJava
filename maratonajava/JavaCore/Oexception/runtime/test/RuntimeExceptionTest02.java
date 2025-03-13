package Jubs.Project.maratonajava.JavaCore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0)); ;
    }

    private static double divisao(int a, int b)  {

        if(a==0 || b==0) {
            throw new ArithmeticException("NUNCA DIVIDIRAS POR ZERO CABAÇO");
        }

//        try{
//            return a/b;
//        }catch (ArithmeticException e) {
//            e.printStackTrace();  // vai APONTAR NA TUA CARA A FALHA QUE TU COMETEU MALANDRO
//        }
//MUITAS MANEIRAS DE TRATAÇÃO Exceções
        return a/b;
    }
}
