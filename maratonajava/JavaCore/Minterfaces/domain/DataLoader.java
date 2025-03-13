package Jubs.Project.maratonajava.JavaCore.Minterfaces.domain;

public interface DataLoader {


    //posso declarar atributos em uma interface?
    //SIM
    //POREM TODOS ELES DEVEM SER CONSTANTES
    public  static final int MAX_DATA_SIZE=10;

    //praticamente uma biblioteca de defs
    void load();

    default void checkPermission(){
        System.out.println("fazendo checagem de permissões");
    };


    //esses metodos estaticos não podem ser sobreescritos
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }


}
