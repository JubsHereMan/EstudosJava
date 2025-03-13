package Jubs.Project.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //imprima o dia da semana, considerando 1 como domingo
    public static void main(String[] args) {
        byte day =5;

        // char, int,byte, short, enum, String
        //  v     v   v      v      v      v
        switch (day) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

        char sexo = 'm';

        switch (sexo) {
            case 'm':
                System.out.println("Masculino");
                break;
            case 'f':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("indefinido");
                break;
        }




    }
}
