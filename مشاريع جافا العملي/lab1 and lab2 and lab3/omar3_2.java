import java.util.Scanner;

public class omar Home1_2 {  public static void main(String[] args) {
    String o;
    int h;
    Scanner in = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    System.out.println("enter the chr o :");
    o = in.next();
    System.out.println("enter the num h :");
    h = num.nextInt();
    if (o.equals("m")||o.equals("e")||o.equals("r")||o.equals("a"))
    {
        if(h==1||h==3||h==5||h==7)
            System.out.println("blak");
        else if(h==2||h==4||h==6||h==8)
            System.out.println("with");
        else
            System.out.println("eror in enter");
    }
    else if (o.equals("d")||o.equals("b")||o.equals("h")||o.equals("f"))
    {
        if(h==1||h==3||h==5||h==7)
            System.out.println("with");
        else if(h==2||h==4||h==6||h==8)
            System.out.println("blac");
        else
            System.out.println("eror in enter");
    }
    else System.out.println("eror in enter");
}
}