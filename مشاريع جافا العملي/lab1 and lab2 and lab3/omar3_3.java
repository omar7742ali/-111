import java.util.Scanner;

public class omar Home1_3 {
    public static void main(String[] args) {
        int o;

        Scanner num = new Scanner(System.in);
        System.out.println("enter the num o :");
        o = num.nextInt();
        if(o>0)
            System.out.println("positive");
        else if(o<0)
            System.out.println("negative");
        else
            System.out.println("0");
    }

}
