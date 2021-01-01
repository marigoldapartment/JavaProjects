public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(splitAndMultiple(2991));
    }

    public static String splitAndMultiple(int meraNumber){
        String s = meraNumber+"";
        String p ="";
        int j=1;
        for(int i =1; i<=s.length();i++){
            j = meraNumber%10;
            meraNumber = meraNumber/10;
            p = p+j;

        }

        return p;
    }
}