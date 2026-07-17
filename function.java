import java.util.*;

public class function {

    // public static void printHelloWorld() {
    //     System.out.println("Hello world!");
    // }

    public static int calSum(int num1, int num2) { // parameters or formal parameters
        Scanner sc = new Scanner(System.in);

        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is = " + a);
        System.out.println("b is = " + b);
    }

    public static int multiply(int num1, int num2){
        int product = num1 * num2;
        return product;

    }

    // public static int multiply(int num1, int num2){
    //     int product = num1*num2;
    //     System.out.println(product); 
    //     return product;
    // }

    public static void  printHelloWorld(){
        System.out.println("Hello world");
    }

    public static void main(String args[]) {
        int a =3;
        int b = 5;
       int prod = multiply(a, b);
       System.out.println(prod);









        // int a = 12;
        // int b = 18;

        // swap

        // swap(a, b);

        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calSum(a, b); //arguments or actual parameters
        // System.out.println(sum);


        printHelloWorld();

    }
}
