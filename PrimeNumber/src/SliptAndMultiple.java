import java.awt.color.ICC_Profile;
import java.awt.im.InputMethodHighlight;

public class SliptAndMultiple {
    public static void main(String[] args) {
        System.out.println(splitAndMultiple(2991));
    }

    public static int splitAndMultiple(int meraNumber){
        int A=0;
        int B=0;
        int G=0;
        D=meraNumber%10;
        A=meraNumber/10;
        E=A%10;
        B=A/10;
        F=B%10;
        C=B/10;
        G=C*F*E*D;

        /*System.out.println("spliting the numbers  "+C+"  "+F+"  "+E+"  "+D );
        System.out.println("your factorial of your number  "+G);*/

        System.out.println("Product of your number" + " is "+ G);
        return G;


    }
}
