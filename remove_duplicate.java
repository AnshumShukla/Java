import java.util.*;
public class remove_duplicate {
    public static void main(String[] args) {
        System.out.println("size of array : ");
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];
       for(int i=0; i<size; i++){
           arr[i] = sc.nextInt();
       }
       int i = 0;
       for(int j = 1; j<size; j++){
        if (arr[j]!= arr[i]) {
            arr[i+1] = arr[j];
            i++;
        } 
       }
       for(int k = 0; k <= i; k++){
        System.out.println(arr[k]);
    }
      
       sc.close();
   }
}



