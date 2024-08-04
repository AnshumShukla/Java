import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        int count = 0 ;
        Scanner sc =  new Scanner(System.in);
        int number  = sc.nextInt();
        int temp = number ;
        int r =0 ;
        // System.out.println(number);
        while (number > 0) {
            r = r * 0;
            r = number % 10;
          if (r >0 ) {
            if ( temp % r == 0){
                count ++;
            }
          }
           
          number = number/10;        
        }
        System.out.println(count);
    }
    
}
