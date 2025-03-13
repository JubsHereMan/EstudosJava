package Jubs.Project.maratonajava.JavaCore.Oexception.error.test;

public class StackOverFlowTest01 {


    //as Excecoes são um objeto que vem da classe Throwable
    //LITERALMENTE A MÃE DE TUDO QUE É RUIM
    //e temos dois tipos de Throwable
    //Exception e Error

    //aqui nos demos o erro de stackOverFlow
    //nos colocamos um loop infinito que estorou a memoria 
    public static void main(String[] args) {
        recursividade();
    }
        public static void recursividade(){
            recursividade();            
        }


        //ERROS são algo que acontecem na JVM que não tem mais jeito
        //o codigo precisa ser concertado
    }





