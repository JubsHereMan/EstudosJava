package Jubs.Project.maratonajava.JavaCore.Kenumeracao.test;

import Jubs.Project.maratonajava.JavaCore.Kenumeracao.domain.Cliente;

import Jubs.Project.maratonajava.JavaCore.Kenumeracao.domain.TipoCliente;
import Jubs.Project.maratonajava.JavaCore.Kenumeracao.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Kuririn", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);



        System.out.println(cliente);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100)  );
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100)  );
        TipoCliente tipoCliente = TipoCliente.valueOf("pessoa fisica");
        System.out.println(tipoCliente);



    }
}
