import java.util.*;
public class largest_no_in_array {
    public static void main(String[] args) {
        // int max;
        System.out.println("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for( int i =1; i<size;i++){
             if (arr[i] > max) {
              max = arr[i]; 
             }
             }
             System.out.println ("the largest number in array is : "+ max);
        sc.close();
    }
   
}
