import java.util.Scanner;

public class FindArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        int factortial = 1;
        if (max % 2 != 0) System.out.println(max);
        else {
            for (int i = 1; i <= max; i++) {
                factortial *= i;
            }
            System.out.println(max + "! = " + factortial);
        }





    }

}
