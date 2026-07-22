import java.util.Scanner;

public class prime {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your number");
    int n = sc.nextInt();
    if(n == 2){
        System.out.println("Prime");
    }else{
        boolean isprime = true;
        for(int i = 2; i<=Math.sqrt(n); i++){           // i<=n-1
            if(n%i == 0){
                isprime = false;
            }
        }
        if(isprime == true ){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
    
    }
    
}

    
