package academy.devdojo.maratonajava.javacore.Kenum.domain.enums;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String TIPO;

    TipoCliente(int VALOR, String TIPO) {
        this.VALOR = VALOR;
        this.TIPO = TIPO;
    }

    public static TipoCliente nomeClienteByNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente value : values()) {
            if (value.TIPO.equals(nomeRelatorio)) {
                return value;
            }
        }
        return null;
    }
}
