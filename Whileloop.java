import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args){
//        int i= 100;
//        while (i>=1){
//            System.out.println(i);
//            i = i-1;

        //Do while

//        int i = 100;
//        do {
//            System.out.println(i);
//            i=i-1;
//        }while (i>=1);

        //Write a program where user give input number and if he input negative number then loop is end

//        Scanner sc = new Scanner(System.in);
//        int number = 0;
//        do {
//            System.out.print("Enter a number: ");
//            number = sc.nextInt();
//            System.out.print("Here is your number: ");
//            System.out.println(number);
//        }while (number>=1);
//        System.out.println("You are out from loop.");

                // While loop
        int i = 0;
        while (true){
            if (i==3){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i = i+1;
            if (i>5){
                break;
            }
        }
    }
}
