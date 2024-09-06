public class word {
    public static void main(String[] args) {
         String s1 = "asjnjniovhteiooo";
         int count = 0;
         for (int i = 0; i < s1.length() ; i++){
             if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' ||s1.charAt(i)  == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u'){
                  count = count +1 ;
             }
         }
          System.out.println(count);
    }
}