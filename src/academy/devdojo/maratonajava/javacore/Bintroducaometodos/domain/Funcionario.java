package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    /*
        Modificadores de Acesso definem a visibilidade de Classes, Métodos, Atributos e Construtores.
        Controlam quem e onde esses elementos poder ser acessados e utilizados dentro do código.
            -public - Acesso permitido por qualquer Classe.
            -private - Acesso restrito apenas à própria Classe.
            -protected - Acesso permitido apenas à própria Classe, a subclasses e a Classes dentro do mesmo pacote.
            -default - Caso nenhum modificador de acesso seja indicado, o acesso será de tipo deafult.
                     - Permite acesso apenas a Classes do mesmo pacote.
        Modificador de Acesso 'private' utilizado como padrão ao se criar um atributo em uma Classe.

     */
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeDados(Funcionario funcionario) {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : this.salarios) {
                System.out.println("R$" + salario);
            }
        }

        mediaSalarios(funcionario);
    }

    /*
        Mwtodos também aceitam Classes e Objetos como tipos de Retorno e Parâmetro.
        Abaixo se encontra um mwtodo que calcula a média de todos os salários de um objeto instanciado de `Funcionario`.
        Tipo de retorno vazio `(void)`.
     */
    public void mediaSalarios(Funcionario funcionario) {
        if (salarios != null) {
            for (double salario : this.salarios) {
                this.media += salario;
            }

            //this - Utilizado para acessar o valor do atributo alocado em um objeto quando acessado dentro a própria Classe que o instanciou.
            this.media /= this.salarios.length;
            System.out.println("A média dos salários é: " + this.media);
        }
    }

    //Metodo padrão para acessar um atributo em específico de uma Classe:
    public String getNome() {
        return nome;
    }

    //Mwtodo padrão para alocar um atributo em específico de uma Classe:
    //this.nome é utilizado para acessar o valor atual do objeto sendo modificado, diferenciado do parâmetro `nome`.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
