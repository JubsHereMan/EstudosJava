package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio;

public class Pessoa {
//modificadores de acesso PRIVADO: ele faz com que esses atributos só possam ser acessados pelo objeto
//modificadores de acesso PUBLICO: faz com que esses atributos sejam acessados de qualquer lugar
    private String nome;
    private int idade;

public void imprimir() {
    System.out.println(this.nome);
    System.out.println(this.idade);
}

// Getters & Setters
public void setNome(String nome) {
    this.nome = nome;
}

public void setIdade(int idade) {
    if(idade < 0){
        System.out.println("idade invalida");
        return;
    }
    this.idade = idade;
}

public String getNome() {
    return this.nome;
}

public int getIdade() {
    return this.idade;
}


}
