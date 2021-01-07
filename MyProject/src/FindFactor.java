public class FindFactor {
    public static void main(String[] args) {
        int number=2;
        int factorial=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factorial++;
            }
        }
        System.out.println(factorial);
    }

}
