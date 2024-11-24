package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Projeto01JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean turn = (Math.random() < 0.5);
        int count;
        String[][] arrayMark = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};

        System.out.print("\nVocê jogará com a letra X. \nO Computador irá jogar com a letra O");

        for (count = 1; count <= 9; count++) {
            System.out.println("\n");
            for (int i = 0; i < arrayMark.length; i++) {
                for (int j = 0; j < arrayMark.length; j++) {
                    System.out.print(arrayMark[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                if (i < 2) {
                    System.out.print("\n----------\n");
                }
            }

            if (arrayMark[0][0].equals(arrayMark[0][1]) && arrayMark[0][0].equals(arrayMark[0][2]) && !arrayMark[0][0].equals("-")) {
                if (arrayMark[0][0].equals("X")) {
                    System.out.println("\nO Jogador Venceu.");
                    break;
                } else {
                    System.out.println("\nO computador vendeu.");
                    break;
                }
            } else if (arrayMark[1][0].equals(arrayMark[1][1]) && arrayMark[1][0].equals(arrayMark[1][2]) && !arrayMark[1][0].equals("-")) {
                if (arrayMark[1][0].equals("X")) {
                    System.out.println("\nO Jogador Venceu.");
                    break;
                } else {
                    System.out.println("\nO computador vendeu.");
                    break;
                }
            } else if (arrayMark[2][0].equals(arrayMark[2][1]) && arrayMark[2][0].equals(arrayMark[2][2]) && !arrayMark[2][0].equals("-")) {
                if (arrayMark[2][0].equals("X")) {
                    System.out.println("\nO Jogador Venceu.");
                    break;
                } else {
                    System.out.println("\nO computador vendeu.");
                    break;
                }
            } else if (arrayMark[0][0].equals(arrayMark[1][0]) && arrayMark[0][0].equals(arrayMark[2][0]) && !arrayMark[0][0].equals("-")) {
                if (arrayMark[0][0].equals("X")) {
                    System.out.println("\nO Jogador Venceu.");
                    break;
                } else {
                    System.out.println("\nO computador vendeu.");
                    break;
                }
            } else if (arrayMark[0][1].equals(arrayMark[1][1]) && arrayMark[0][1].equals(arrayMark[2][1]) && !arrayMark[0][1].equals("-")) {
                if (arrayMark[0][1].equals("X")) {
                    System.out.println("\nO Jogador Venceu.");
                    break;
                } else {
                    System.out.println("\nO computador vendeu.");
                    break;
                }
            } else if (arrayMark[0][2].equals(arrayMark[1][2]) && arrayMark[0][2].equals(arrayMark[2][2]) && !arrayMark[0][2].equals("-")) {
                if (arrayMark[0][2].equals("X")) {
                    System.out.println("\nO Jogador Venceu.");
                    break;
                } else {
                    System.out.println("\nO computador vendeu.");
                    break;
                }
            } else if (arrayMark[0][0].equals(arrayMark[1][1]) && arrayMark[0][0].equals(arrayMark[2][2]) && !arrayMark[0][0].equals("-")) {
                if (arrayMark[0][0].equals("X")) {
                    System.out.println("\nO Jogador Venceu.");
                    break;
                } else {
                    System.out.println("\nO computador vendeu.");
                    break;
                }
            } else if (arrayMark[0][2].equals(arrayMark[1][1]) && arrayMark[0][2].equals(arrayMark[2][0]) && !arrayMark[0][2].equals("-")) {
                if (arrayMark[0][2].equals("X")) {
                    System.out.println("\nO Jogador Venceu.");
                    break;
                } else {
                    System.out.println("\nO computador vendeu.");
                    break;
                }
            }

            boolean check = false;
            if (turn) {
                System.out.println("\n\nÉ o turno do jogador. \nEscolha um número de 1 a 3 que determinará a linha do tabuleiro:");
                do {
                    int row = scanner.nextInt();
                    System.out.println("\nEscolha um número de 1 a 3 que determinará a coluna do tabuleiro:");
                    int column = scanner.nextInt();
                    if (row <= arrayMark.length && row > 0 && column <= arrayMark.length && column > 0 && arrayMark[row - 1][column - 1].equals("-")) {
                        arrayMark[row - 1][column - 1] = "X";
                        check = true;
                    } else {
                        System.out.println("Posição indicada não existe ou já está preenchida. Tente novamente");
                    }
                } while (!check);
                turn = false;
            } else {
                System.out.println("\n\nÉ o turno do Computador");
                do {
                    int randomRow = (int) (Math.random() * 3);
                    int randomColun = (int) (Math.random() * 3);
                    if (randomRow <= arrayMark.length && randomColun <= arrayMark.length && arrayMark[randomRow][randomColun].equals("-")) {
                        arrayMark[randomRow][randomColun] = "O";
                        check = true;
                    }
                } while (!check);
                turn = true;
            }
        }

        if (count == 10) {
            System.out.println("\n");
            for (int i = 0; i < arrayMark.length; i++) {
                for (int j = 0; j < arrayMark.length; j++) {
                    System.out.print(arrayMark[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                if (i < 2) {
                    System.out.print("\n----------\n");
                }
            }
            System.out.println("\n\nEmpate.");
        }

    }
}
