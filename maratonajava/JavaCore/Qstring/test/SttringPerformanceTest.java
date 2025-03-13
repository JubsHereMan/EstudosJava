package Jubs.Project.maratonajava.JavaCore.Qstring.test;

public class SttringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String " + (fim - inicio) + "ms");



    inicio = System.currentTimeMillis();

    concatStringBuilder(30_000);

     fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuilder "+(fim -inicio)+"ms");

        inicio = System.currentTimeMillis();

        concatStringBuffer(30_000);

        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuffer "+(fim -inicio)+"ms");
}


    private static void concatString(int tamanho){
        String texto = "";

        for(int i = 0; i < tamanho; i++){
            texto += i; // 0, 01, 012, 0123, 01234
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }

}
