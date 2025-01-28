package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.enums.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.enums.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Isagi", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Barou", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        cliente1.setTipoCliente(TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);

        System.out.println(TipoPagamento.DEBITO.desconto(100));
        System.out.println(TipoPagamento.CREDITO.desconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.TIPO);
        TipoCliente tipoCliente2 = TipoCliente.nomeClienteByNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
