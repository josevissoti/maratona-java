package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.estudante.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Duster";
        carro1.modelo = "Renault";
        carro1.ano = 2022;

        carro2.nome = "Kicks";
        carro2.modelo = "Nissan";
        carro2.ano = 2023;

        System.out.println("\nNome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println("\nNome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }

}
