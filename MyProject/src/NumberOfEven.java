public class NumberOfEven {
    public static void main(String[] args) {
        System.out.println(countTotalNumber(20,40));
    }

    private static int countTotalNumber(int start, int end) {
        int j = 0;
        for(int i = start;i<=end;i++){
            if(i%2==0){
                j=j+1;
            }
        }
        return j;
    }
}
