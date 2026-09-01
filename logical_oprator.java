import java.util.Scanner;

public class logical_oprator {
    public static void main(String[] args){

        //--------comparision Two number with 'AND' oprator----//

//        System.out.print("Enter frist num: ");
//        Scanner sc = new Scanner(System.in);
//        int FN = sc.nextInt();
//        System.out.print("Enter second num: ");
//        sc = new Scanner(System.in);
//        int SN = sc.nextInt();
//        if(FN < 0 && SN < 0)
//            System.out.println("Negative number");
//        else
//            System.out.println("Positive number");

        //--------comparision Two number with 'OR' oprator----//

//        System.out.print("Enter frist num: ");
//        Scanner sc = new Scanner(System.in);
//        float FN = sc.nextFloat();
//        System.out.print("Enter second num: ");
//        sc = new Scanner(System.in);
//        float SN = sc.nextFloat();
//        if(FN < 0 || SN < 0)
//            System.out.println("Atleast one number is negative");
//        else
//            System.out.println("Positive number");

        //--------Question time------//

//(Q.1)  Write a program in which you take how many rupee user have then print which product user can buy
//Where (i) price of pen is 40rs.   (ii) price of notebook is 80rs.

        System.out.print("Enter your budget: ");
        Scanner sc = new Scanner(System.in);
        int rs = sc.nextInt();
        if(rs>=120)
            System.out.println("You can buy pen or note book");
        else if(rs>40 && rs<120)
            System.out.println("You can buy only one product");
        else
            System.out.println("You can't buy anything.");
    }
}
