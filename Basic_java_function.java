import java.util.Scanner;

public class Basic_java_function {
    public static void main(String[]args){
        System.out.print("Enter Frist value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Second number:");
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println("Sum is "+sum);
        System.out.println("Subtract is "+sub);
        System.out.println("Multiply is "+mul);
        System.out.println("Division is "+div);
        System.out.println("Module is "+mod);
        if(a==b){
            System.out.println("Both are same value");
        }
        else
            System.out.println("both have different value");
        if (a > 0 && b>0){
            System.out.println("positive number");
        }
        else
            System.out.println("Negative number");

    }
}
