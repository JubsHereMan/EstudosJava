package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double media ;
//    public double salario;

//    LOGICA DO PROFESSOR
    public double[] salarios;  //DA PARA DECLARAR NOS ATRIBUTOS QUE É UM ARRAY PUTA QUE PARIU !!!!!!!!!!!!!!!!!!!!!




//                  MINHA LOGICA
//    public double somaDados(double num1, double num2, double num3) {
//       return num1+=num2+num3;
//    }
//    public double pegaMedia(double num1) {
//        return num1 / 3;
//    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println( salario + " ");
        }
    }

    public void imprimeMediaSalarial(){

        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media Salarial " + media   );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }


    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
