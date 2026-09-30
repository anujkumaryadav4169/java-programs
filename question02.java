import java.util.Scanner;

public class question02 {

   public static void palindrome(int n){
    int temp = n;
     int rev = 0;
        while (n>0) {
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10;   
        }
        if(temp == rev ){
            System.out.println("palindrome");

        }else{
            System.out.println("Not-palindrome");
        }

   }

   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        palindrome(n);
    }


}
