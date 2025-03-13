package Jubs.Project.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //utilizando Switch, dados os valores de dia 1 a 7, imprima se é dia util ou final de semana
        //considerando 1 como domingo
        byte day = 1;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia de semana");
                break;
            default:
                System.out.println("Erro");
                break;

//MINHA CABEÇA EXPLODIU POR QUE DA PRA FAER ASSIM

        }
    }
}
