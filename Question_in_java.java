import java.util.Scanner;

//Given an integer N print its frist 10 multiples each multipe n*i should be printed on a new line
// in the form of N*i = Result
public class Question_in_java {
    public static void main(String[] args){
//        System.out.print("Enter the Table value you want to print: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        for (int i=1; i<=10; i++){
//            int table = number*i;
//            System.out.print(number+"*"+i+"=");
//            System.out.println(table);
//        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.print("Weird");
        }
        else
            System.out.print("Not Weird");
    }
}
