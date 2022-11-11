public class omar4 {
    // lab 6




import java.util.Scanner;


        public static void main(String[] args) {
            Scanner sin = new Scanner(System.in);
            String X;
            System.out.println("Write a word: ");
            X = sin.next();
            for (int i = (X.length() - 1); i >= 0; i--) {
                System.out.print(X.charAt(i));
            }
        }
}
