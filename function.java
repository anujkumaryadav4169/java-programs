import java.util.*;
public class function {

    public static void printHelloWorld(){
        System.out.println("Hello world!");
    }

    public static int calSum(int num1, int num2){     //parameters or formal parameters
        Scanner sc = new Scanner(System.in);

        int sum = num1 + num2;
        System.out.println(sum);       
        return sum; 
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calSum(a, b);     //arguments or actual parameters
        // System.out.println(sum);

    }
}
