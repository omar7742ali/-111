public class omar3 {
    // lab 6



    import java.util.Scanner;
	import java.lang.String;
        public static void main(String[] args) {
            Scanner sin = new Scanner(System.in);
            String X;
            System.out.println("Write a word: ");
            X=sin.next();
            for (int i = 0; i < X.length(); i++) {
                System.out.println(X.charAt(i));
            }
        }



}
