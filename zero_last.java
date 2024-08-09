import java.util.Scanner;

public class zero_last {
    public static void main(String[] args) {
        System.out.println("size of array : ");
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int a[] = new int[size];
       for(int i=0; i<size; i++){
        a[i] = sc.nextInt();
    }
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < size; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) {
     System.out.println("no zero");
        }
        

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < size; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
       for(int i =0; i< size; i++){
        System.out.println(a[i]);
       }
        sc.close();
    }
}
