import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentece = new Scanner(System.in).nextLine();
        String text = "";
        for (int i = sentece.length() - 1; i >= 0; i--) {
            text += sentece.charAt(i);
        }
        System.out.println(text);

    }
}
