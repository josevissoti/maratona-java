package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] array1 = new int[3][];

        int[][] array2 = {
                {1, 2, 3},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4}
        };

        array1[0] = new int[3];
        array1[1] = new int[4];
        array1[2] = new int[5];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = j;
            }
        }

        for (int[] arr : array1) {
            System.out.println("\n------------");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        for (int[] arr : array2) {
            System.out.println("\n----------------");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
