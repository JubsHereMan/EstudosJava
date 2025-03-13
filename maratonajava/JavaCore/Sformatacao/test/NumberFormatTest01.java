package Jubs.Project.maratonajava.JavaCore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault =Locale.getDefault();
        Locale localeBR= new Locale("pt","BR");
        Locale localeJP= Locale.JAPAN;
        Locale localeIT= Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_000.2130;
        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }

    }
}
