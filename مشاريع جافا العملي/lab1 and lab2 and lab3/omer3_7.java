import java.util.Scanner;

public class omar Home3_7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the integer number:\nnum1:");
        int num1=in.nextInt();
        System.out.println("enter the number2");
        int num2=in.nextInt();
        System.out.println("enter the number");
        int num3=in.nextInt();
        System.out.println(num1+""+num2+""+num3);
        if(num1>=num2&&num2>=num3||num1<=num2&&num2<=num3)
            System.out.println("in order");
        else
            System.out.println("not in order");

    }
}
