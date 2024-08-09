import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        System.out.println("size of array : ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("put array elements");
       for(int i=0; i< n; i++){
           arr[i] = sc.nextInt();
       }
       int temp = 0;
       int sum  =( n *(n +1))  /2;
       for( int i = 0; i <n ; i ++){
        temp = temp + arr[i];
       }
       int c = sum - temp ;
       System.out.println(c);
       sc.close();
    }
}
