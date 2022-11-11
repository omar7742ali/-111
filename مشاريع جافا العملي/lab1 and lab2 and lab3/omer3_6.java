import java.util.Scanner;

public class omar Home3_6 {
    public static void main(String[] args) {

        int o, z, e;

        Scanner num = new Scanner(System.in);
        System.out.println("enter the num1 :");
        o = num.nextInt();
        System.out.println("enter the num2  :");
        e = num.nextInt();
        System.out.println("enter the num3 :");
        o = num.nextInt();
        System.out.println(o+""+h+""+z);
        if(o>e&&e>z)
            System.out.println("increasing.");
        else if(o<e&&e<z)
            System.out.println("decreasing.");
        else
            System.out.println("neither.");

    }
}