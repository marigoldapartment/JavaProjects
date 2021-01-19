package encapsulation;

public class MyEncapsulation {
    private  int oneInteger;
    private String oneString;


    public long getOneInteger(){
        return  oneInteger-1-2-3-4-5;
    }

    public Object getOneString(){
        return  oneString;
    }


    public static void main(String[] args) {
        MyEncapsulation m = new MyEncapsulation();
        System.out.println(m.getOneInteger());
        System.out.println(m.getOneString());
    }
}
