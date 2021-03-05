package Sorting;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "ari";
        String s2 = "ram";

        char[] c1 = sorting(s1); // {'a','m','r'};
        char[] c2 = sorting(s2); // {'a','m','r'};
        boolean answer = true;
        for(int i = 0; i< c1.length; i++){
            if(c1[i] != c2[i]){
                answer = false;
            }
        }

        if(answer == false){
            System.out.println("it is not an anagram");
        }else{
            System.out.println("it is  an anagram");
        }

    }

    public static char[] sorting(String s){
        char[] c = s.toCharArray();
        for(int i =0; i<c.length;i++){
            for(int j = i+1; j<c.length;j++){
                if(c[i]>c[j]){
                    char p = c[i];
                    c[i] = c[j];
                    c[j] = p;
                }
            }
        }
        return c;
    }
}
