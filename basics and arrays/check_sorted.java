import java.util.Scanner;

public class check_sorted {
    public static  void main(String[] args) {
        boolean issorted = true;
         System.out.println("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0 ;i < size; i ++){
            for(int j = i+1 ;j < size; j ++){
                if (arr[i] > arr[j]) {
                    issorted = false;
                }
            }
          
        }
        if (issorted) {
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
        sc.close();
    }
}
