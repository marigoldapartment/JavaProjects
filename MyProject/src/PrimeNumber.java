public class PrimeNumber {

    public static void main(String[] args) {
        int count =0;
        int meraNumber = 9;

        for(int i = 2; i<=meraNumber;i++){
            if(meraNumber%i==0){
                count++;
            }
        }

        if(count==1){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }

    }

}
