import java.util.Scanner;

public class union {
    public static void main(String[] args) {
         System.out.println("size of array1 : ");
       Scanner sc = new Scanner(System.in);
       int size1 = sc.nextInt();
       System.out.println("size of array2 : ");
       int size2 = sc.nextInt();
       System.out.println("put element of array1");
       int arr1[] = new int[size1];
       for(int i=0; i<size1; i++){
           arr1[i] = sc.nextInt();
       }
       System.out.println("put element of array2");
       int arr2[] = new int[size1];
       for(int i=0; i<size2; i++){
           arr2[i] = sc.nextInt();
       }
       int c = size1+size2;
       int temp[] = new int[c];
       for(int i =0; i<size1;i++){
        for(int j =0;j<size2; j++){
            if (arr1[i]==arr2[j]) {
                temp[c] =arr1[i];   
            }
            else if (arr1[i]!=arr2[j]) {
                temp[c]= arr1[i];
                temp[c]= arr1[j];
            }
        }
       }
       for(int k = 0; k <= c; k++){
        System.out.println(temp[c]);
       }
       sc.close();
    }
    
}
