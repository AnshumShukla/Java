import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        
         System.out.println("Enter your name");
         Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
         StringBuilder sb = new StringBuilder(name);
         sb.append(" hello");
         System.out.println(sb);
         sc.close();

    }
}

