import java.util.Scanner;

public class left_shift {
    public static void main(String[] args) {
        System.out.println("size of array : ");
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];
       for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }
       
       int abc= arr[0];
       for(int i = 0; i < size-1; i++){
        arr[i] = arr[i+1];
       }
       arr[size-1] = abc;
       for(int i =0; i < size ; i++){
        System.out.println(arr[i]);
       }
       sc.close();
    }
    
}
