package Jubs.Project.maratonajava.JavaCore.Kenumeracao.domain;

public enum TipoPagamento{
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;

            }
        },
        CREDITO
                {
                    @Override
                    public double calcularDesconto(double valor) {
                        return valor * 0.05;
                    }
                };
//quando eu quero criar um metodo que o comportamento vai ser decido pelas classes de enumeração
    //utilizo o abstract
    //METODOS ABSTRACTS não podem ter corpos
    public abstract double calcularDesconto(double valor);

    }