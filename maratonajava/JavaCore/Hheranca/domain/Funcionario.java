package Jubs.Project.maratonajava.JavaCore.Hheranca.domain;


//herança----------------------|   |
//                             V   V
public class Funcionario extends Pessoa {

    private double salario;
    static {
        System.out.println("funcionario static");
    }

    {
        System.out.println("bloco de inicialização Funcionario");
    }

    {
        System.out.println("bloco de inicialização 2 Funcionario ");
    }




    //estou pegando da superclasse/classe pai, o construtor onde fala que o nome é obrigatorio
    public Funcionario(String nome) {

        super(nome);
        System.out.println("dentro do construtor de funcionario");
    }

//Super
public void imprime(){
    System.out.println("FUNCIONARIO");
    super.imprime();//estou dizendo: Executa o imprime daquela outra classe

    System.out.println(this.salario);//mas no final adiciona isso daqui :)
}


public void relatorioPagamento(){
    System.out.println("Eu " + this.nome + "Recebi um salario de  R$ " + this.salario);
}



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
