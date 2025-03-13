package Jubs.Project.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        //se a idade foi menor do que 15 = infantil
        //se idade >= 15  && idade <18 = juvenil
        // se idade > 18 = adulto

        int idade= 19;

        if(idade >  18){
            System.out.println("Sua categoria é adulto");
        } else if (idade < 18 && idade >=15) {
            System.out.println("Sua categoria é juvenil");
        }else{
            System.out.println("sua categoria é infantil");

        }
    }
}
