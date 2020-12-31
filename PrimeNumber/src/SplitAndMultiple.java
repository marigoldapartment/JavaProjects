public class SplitAndMultiple {
    public static void main(String[] args) {
        System.out.println(splitAndMultiple(2991));
    }

    public static int splitAndMultiple(int meraNumber){
        String s = meraNumber+"";
        int j = 0;
        int p = 1;
        for(int i =1; i<=s.length();i++){
            j = meraNumber%10;
            meraNumber = meraNumber/10;
            p = p*j;

        }

        return p;
    }
}
