import java.util.Scanner;

public class tuf1{
    public static void main(String[] args) {
    System.out.println("enter the charcter or string");
        Scanner sc =  new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='A'&& ch<='Z')
        {
            System.out.println("1");
        }
             else if(ch>='a'&& ch<='z')
             {
            System.out.println("0");
             }
             else{
                 System.out.println("-1");
             }
             sc.close();
        }    
    }
    
