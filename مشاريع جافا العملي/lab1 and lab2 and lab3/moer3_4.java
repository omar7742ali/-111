import java.util.Scanner;

public class omar Home3_4 {
    public static void main(String[] args) {
    double o;

    Scanner num = new Scanner(System.in);
    System.out.println("enter the num o :");
    o = num.nextDouble();
    if(o<0)
        h=h*-1;

    if(o>=1 && o<=9)
        System.out.println("this nmber  "+o+"  contains 1 digit" );
    else if(o>=10 && o<=55)
            System.out.println("this nmber  "+o+"  contains 2 digits" );
    else if(o>=100 && o<=555)
        System.out.println("this nmber   "+o+"  contains 3 digits" );
    else if(o>=1000 && o<=5555)
        System.out.println("this nmber  "+o+"  contains 4 digits" );
    else if(o>=10000 && o<=55555)
        System.out.println("this nmber  "+o+"  contains 5 digits" );
    else if(o>=100000 && o<=555555)
        System.out.println("this nmber"+o+"contains 6 digits" );
    else if(o>=1000000 && o<=5555555)
        System.out.println("this nmber  "+o+"  contains 7 digits" );
    else if(o>=10000000 && o<=55555555)
        System.out.println("this nmber  "+o+"  contains 8 digits" );
    else if(o>=100000000.0 && o<=55555555.0)
        System.out.println("this nmber  "+o+"  contains 9 digits" );
    else if(o>=1000000000.0 && o<=5555555555.0)
        System.out.println("this nmber  "+o+"  contains 10 digits" );
    else if(o>=10000000000.0 && o<=55555555555.0)
        System.out.println("this nmber  "+o+"  contains 11 digits" );
    else
        System.out.println("error" );
    }
}
