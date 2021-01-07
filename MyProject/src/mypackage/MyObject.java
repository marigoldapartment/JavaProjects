package mypackage;

public class MyObject {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        m1.setFirstName("Subhash");
        m1.setLastName("Pandey");
        System.out.println(m1.toString());

        MyClass m2 = new MyClass();
        m2.setFirstName("Subhash");
        m2.setLastName("Pandey");
        System.out.println(m2.toString());



        System.out.println(m1.equals(m2));

    }


}
