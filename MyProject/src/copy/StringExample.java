package copy;

public class StringExample {
    public static void main(String[] args) {
        /*String str="Madame";
        String pallindrome="";
        for(int i =str.length()-1;i>=0;i--){
            pallindrome= pallindrome+str.charAt(i) ;
        }
        System.out.println("String    "+pallindrome);
        if(pallindrome.equals(str)){
            System.out.println("It is a pallindrome");
        }
        else{
            System.out.println("It is not a pallindrome");
        }*/
    int n=1234;
        int sum=0;int mod=0;
        while(n>0){
             mod=n%10;//0
            sum= sum+mod;
            n=n/10;

        }
        System.out.println("Sum="+ sum);
    }
}
