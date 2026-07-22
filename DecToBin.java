import java.util.Scanner;

public class DecToBin {

    public static void decToBin(int n){
        int myNum = n;
        int binnum = 0;
        int  pow = 0;

        while (n > 0) {
            int rem = n % 2 ;
            binnum = binnum + (rem * (int)Math.pow(10, pow)); 
            pow++; 
            
            n = n/2;
        }
        System.out.println("Binary of " + myNum + " = " + binnum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        decToBin(3);



    }

}
