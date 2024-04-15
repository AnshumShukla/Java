import java.util.Scanner;
public class maxOfArray {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements");
        for(int i = 0;i<n; i++){
            a[i] = sc.nextInt();   
        }
        int max = a[0];
        for(int i = 1; i <n;  i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("maximum element is " + max);
        sc.close();
    }
}