package Jubs.Project.maratonajava.JavaCore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        //finaly sempre vai ser executado independente de tudo

        abreMetodo();
    }

    private static String abreMetodo() {
        try {
            System.out.println("Abrindo o arquivo.");
            System.out.println("Escrevendo dados no arquivo.");
            return "CONEXÃO ABERTA";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando Recurso liberado pelo  Os.");
        }
        return null;
    }

    private static void abreMetodo2() {
        try {
            System.out.println("Abrindo o arquivo.");
            System.out.println("Escrevendo dados no arquivo.");
        }finally {
            System.out.println("Fechando Recurso liberado pelo  Os.");
        }

    }
}
