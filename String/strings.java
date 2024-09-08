public class strings{    
    public static void main(String[] args) {
        String name = "abcba";
        String rev = "";
        System.out.println(name);
        for (int i = name.length()-1 ; i >=0  ; i -- ){
            rev += name.charAt(i);
        }
        System.out.println(rev);
    }

}