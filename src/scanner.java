import java.util.Scanner;


public class scanner {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number one");
        int a=sc.nextInt();
        System.out.println("Enter Number Two");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of two numbers is:"+c);

    }
}
