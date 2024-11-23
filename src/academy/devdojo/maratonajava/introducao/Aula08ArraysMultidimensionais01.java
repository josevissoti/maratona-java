package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] days = new int[3][4];

        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;
        days[0][3] = 30;

        days[1][0] = 31;
        days[1][1] = 30;
        days[1][2] = 31;
        days[1][3] = 30;

        days[2][0] = 30;
        days[2][1] = 31;
        days[2][2] = 30;
        days[2][3] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("-------------------------------");

        for(int[] arr : days){
            for (int num : arr){
                System.out.println(num);
            }
        }

    }
}
