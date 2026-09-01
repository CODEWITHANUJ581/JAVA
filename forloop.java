import java.util.Scanner;

public class forloop {
    public static void main(String[] args){

        //Print number 1 to 100:

//        for (int i=1; i<=100; i++){
//            System.out.print(i);

        //Print number 100 to 1:

//        for (int i=100; i>=1; i--){
//            System.out.println(i);
//        }

//        System.out.print("enter a number:");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        for (int i = number; number>=1;){
//            System.out.print("here is your number");
//            System.out.println(number);
//
        System.out.print("enter a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number>=1)
            System.out.println("Here is your numbeer"+number);

        else
            System.out.println("you are oout");
    }
}
