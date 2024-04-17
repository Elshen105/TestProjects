import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentece = new Scanner(System.in).nextLine();
        String text = "";
        for (int i = sentece.length() - 1; i >= 0; i--) {
            text += sentece.charAt(i);
        }

        String[] split = text.split(" ");
        String txt = "";
        for (int i = split.length - 1;i >= 0; i--) {
            txt += split[i] + " ";
        }
        text = txt.trim();
        System.out.print(text);
    }
}