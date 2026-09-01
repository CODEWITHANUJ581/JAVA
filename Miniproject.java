import java.util.Scanner;

public class Miniproject {
    public static void main(String[] args){
//        int mynumber = (int)(Math.random()*100);
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if(mynumber == number){
//            System.out.println("Well done");
//        }
//        if (mynumber > number){
//            System.out.println("Number is smaller");
//        }
//        if (mynumber<number){
//            System.out.println("Number is bigger");
//        }


        // with help of vedio

        int randomnum = (int)(Math.random()*10);
        Scanner sc = new Scanner(System.in);
        int mynumber = 0;
        do {
            System.out.print("Enter your number(1-100): ");
            mynumber = sc.nextInt();
            if (mynumber==randomnum){
                System.out.println("YEHH...YOU ARE CORRECT");
                break;
            } else if (mynumber>randomnum) {
                System.out.println("Your number is bigger");
            }
            else
                System.out.println("Your number is small");
        }while (mynumber>=0);
        System.out.println("Random number is: "+randomnum);
        System.out.print("You are exit....");
    }
}
