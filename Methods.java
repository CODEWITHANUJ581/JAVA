public class Methods {
    public static void print (){
        System.out.println("Anuj");
    }
    public static void printname(String name){
        System.out.println(name);
    }
    public static void printsum(int a, int b){
        int sum = a+b;
        System.out.println("Sum is"+sum);
    }
    public static void main(String[] args){
        print();
        print();
        printname("Purnima");
        printsum(4,5);
    }
}
