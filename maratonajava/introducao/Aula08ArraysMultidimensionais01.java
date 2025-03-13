package Jubs.Project.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {

    // ArraysMultidimensionais = array de array= matriz
    public static void main(String[] args) {
        //1,2,3,4,5 Meses
        //31,28,31,30 Dias
        // a sintaxe correta de Arrays Multidimensionais

        int [] [] days = new int[3][3];
        /*ah mas por que esses outros colchetes?
        aqui nos iremos estar linkando arrays em arrays
        Array=▢▢▢
        o primeiro item desta lista vai ser
        1 item da lista= ▢
        e ele vai estar sendo ligado a outro array

        1 item da lista= ▢ ---------->  ▢▢▢
        2 item da lista= ▢ ---------->  ▢▢▢
        3 item da lista= ▢ ---------->  ▢▢▢

            Java é estranho.
        */

        //1 array
        days[0][0]=31;
        days[0][1]=28;
        days[0][2]=31;

        //2 array
        days[1][0]=1;
        days[1][1]=2;
        days[1][2]=3;

        //3 array
        days[2][0]=14;
        days[2][1]=15;
        days[2][2]=16;

        //o ponteiro do primeiro array
        for (int i=0; i< days.length; i++) {
            //ponteiro do array do array
            for (int j=0; j< days[i].length; j++) {
                System.out.println(days[i][j]);
            }

        }
        System.out.println("--------------------------------------------");
        //foreach
        //       variavel de referencia
        //           v
        for (int[] arrBase : days) { // arrBase é uma linha (array) do days
            for (int num : arrBase) { // num é um valor de cada elemento da linha
                System.out.println(num);
            }
        }

    }
}
