public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; 
        fibonacci(n);
    }

    public static void fibonacci(int count) {
        int n1 = 0, n2 = 1, n3, i;
        
        if(count <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else if (count == 1) {
            System.out.print(n1 + " ");
        } else {
            System.out.print(n1 + " " + n2); 

            for (i = 2; i < count; ++i) { 
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
}