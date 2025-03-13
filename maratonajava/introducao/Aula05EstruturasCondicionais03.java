package Jubs.Project.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salario foi maior que 5000
        double salario = 6000d;

        String mensagemDoar =  "Doar 500 lulas pro jubs";
        String mensagemNaoDoar =  "Não tenho como doar 500 lulas pro jubs";
        //operador ternario
        //                 (condicao) ? verdadeiro: falso <-------- SINTAXE
        String resultado = salario > 5000 ? mensagemDoar: mensagemNaoDoar  ;
        System.out.println(resultado);

    }
}
