public class EvenOrNot {
    public static void main(String[] args) {
        int i = evenOrNot(3);
        if(i == 0){
            System.out.println("Odd Number");
        }else{
            System.out.println("Even Number");
        }
    }

    public static int evenOrNot(int number){
        if(number%2==0){
            return 1;
        }else{
            return 0;
        }


    }






}
