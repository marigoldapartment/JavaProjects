package overloading;

public class My {
    public static void main(String[] args) {
        Sum s = new Sum();
        Sum s1 = new Sum("One");
        Sum s2 = new Sum("One","Two");
    }
}
