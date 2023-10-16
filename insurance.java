import java.util.Scanner;

public class  insurance {
    public static void main(String[] args) {
        System.out.println("Enter your Maritial status (y for yes and n for no) : " );
        Scanner in  = new Scanner(System.in);
        char ch =  in.next().charAt(0);
        if (ch == 'y'|| ch == 'Y'){
            System.out.println("Driver is Insured");
        }
        else if(ch == 'n'|| ch == 'N') {
            System.out.println(" Enter your gender (m for male and f for female): ");
            char gender = in.next().charAt(0);
            System.out.println("enter your age :");
            int age = in.nextInt();
            if ((gender == 'm' || gender == 'M') && age > 30)
            {
                System.out.println("driver is insured");
            }
            else if((gender == 'f' || gender == 'F') && age >=25){
                System.out.println("Driver is insured");
            }
            else{
                System.out.println("Driver is not insured");
            }

        }
        else {
            System.out.println("Enter right Maritial status");
        }


    }


}
