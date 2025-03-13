package Jubs.Project.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    //if (SE)
    public static void main(String[] args) {

      int idade = 15;
      boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("autorizado a coprar bebida alcolica");
            //else (SE NÃO)
        }else {
            System.out.println("não autorizado a coprar bebida");
        }
        System.out.println("fora do programa");
    }
}
