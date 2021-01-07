public class FindTriangle {
    public static void main(String[] args) {
        int i = 6;
        int j = 7;
        int k = 5;

        if((i+j)>k || (j+k)>i || (k+i)>j){
            System.out.println("Is a triangle");
        }else{
            System.out.println("Not a triangle");
        }

    }
}
