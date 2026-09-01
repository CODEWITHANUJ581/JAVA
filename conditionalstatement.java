import java.util.Scanner;

public class conditionalstatement {
    public static void main(String[] args){
//        boolean sun = false;
//        if(sun==true)
//            System.out.println("Day");
//        else
//            System.out.println("Night");

        //-------self write code-------//

//        System.out.println("Answer in yes or no");
//        System.out.print("sun is raise");
//        Scanner sc = new Scanner(System.in);
//        String ans1 = sc.nextLine();
//        sc = new Scanner(System.in);
//        String day = sc.nextLine();
//                if(day.equalsIgnoreCase(ans1))
//                    System.out.println("Day");
//                else
//                    System.out.println("Night");

                //isme iesa krna hai ki user agr yes input de question ka jo hai(sun is raise)
        //to day print krna hai wrna night print krna hai

        //------Check eligble for vote or not-------//

        System.out.print("Enter your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18)
            System.out.println("Not eligible");
        else
            System.out.println("Eligible");

    }
}
