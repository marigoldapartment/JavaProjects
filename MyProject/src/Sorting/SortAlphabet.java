package Sorting;

import java.util.Arrays;

public class SortAlphabet {
    public static void main(String[] args) {
        char[] s = {'z','b','c','d','a'};

        for(int i=0; i<s.length;i++){
            for(int j=i+1; j<s.length;j++){
                if(s[i]>s[j]){
                    char c = s[i];
                    s[i] = s[j];
                    s[j] = c;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
