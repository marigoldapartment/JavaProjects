public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(splitAndMultiple(12001));
    }

    public static String splitAndMultiple(int meraNumber){
        String s = meraNumber+"";
        String p ="";
        int j=0;
        for(int i =1; i<=s.length();i++){
            j = meraNumber%10;
            meraNumber = meraNumber/10;
            p = p+j;

        }

        return p;
    }
}