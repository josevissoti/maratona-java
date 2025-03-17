package academy.devdojo.maratonajava.exercises.exercise07;


public class OptimizedForView {
    public static void main(String[] args) {
        int[] array = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int arrayNumer : array) {
            System.out.print(arrayNumer + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j + i < array.length) {
                    if (array[i] > array[j + i]) {
                        int number = array[j + i];
                        array[j + i] = array[i];
                        array[i] = number;
                    }
                }
            }
        }

        for (int arrayNumer : array) {
            System.out.print(arrayNumer + " ");
        }
    }
}
