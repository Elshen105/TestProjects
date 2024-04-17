import java.util.Scanner;

public class OddSum {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nece olculu tek array duzeltmek isteyirsiniz : ");

        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum;
        int count = 0;
        for (int i = 0; i < size; ) {
            System.out.print("reqem daxil edin : ");
            array[i] = scanner.nextInt();
            int temp = array[i];
            sum = 0;
            while (temp > 0) {
                int lastNumber = temp % 10;
                sum += lastNumber;
                temp /= 10;
            }
            if (sum % 2 != 0) {
                System.out.println("Arraya elave olunan element : " + array[i] + "\tSum = " + sum);
                count ++;
                i ++;
            } else {
                System.out.println("Daxile etdiyiniz reqemlerin cemi cuttur yeniden daxil edin");
            }
        }


        int[] oddSums = new int[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            int temp2 = array[i];
            sum = 0;
            while (temp2 > 0) {
                int lastNumber = temp2 % 10;
                sum += lastNumber;
                temp2 /= 10;
            }
            if (sum % 2 != 0) {
                oddSums[index] = array[i];
                index++;
            }
        }


        for (int i = 0; i < oddSums.length; i++) {
            System.out.println("array[" + i + "]" + " = "  + oddSums[i] + " ");
        }














    }

}
