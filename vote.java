

import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        System.out.println("enter your age: ");
        Scanner in = new Scanner(System.in) ;
        int age = in.nextInt();
        if (age >18 || age == 18 ) {
            System.out.println("You are " + age + " ,therefore you are eligible to vote");
        }
        else
        {
            System.out.println("Sorry , you are not eligible to vote");
        }
in.close();

    }
}
