import java.util.Scanner;

public class Questions {

    public static int avgOfThreeNum(int a, int b, int c) {

        int avg = (a + b + c) / 3;

        System.out.println("avgOfThreeNum = " + avg);

        return 0;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd num:");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd num:");
        int num3 = sc.nextInt();

        avgOfThreeNum(num1, num2, num3);

    }


}
