import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (n>0) {
            int r = n % 10;
             rev = rev * 10 + r;
             n = n/10;
        }
        if (temp == rev) {
            System.out.println("number is palindrome");
            
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
    }

    }
    
