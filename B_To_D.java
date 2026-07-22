import java.util.Scanner;

public class B_To_D {

    public static void binToDec(int binnum){
    
        int myNum = binnum;
        int pow = 0;
        int decNum = 0;

        while (binnum>0) {
            int lastDigit = binnum%10;
            decNum = decNum +(lastDigit * (int)Math.pow(2, pow));
            pow++;

            binnum = binnum /10;
            
        }System.out.println("DecNum of " + myNum + " = " + decNum);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    binToDec(101);

    


    
    }
    
}
