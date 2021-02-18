package sortingJava8;

public class Address {
    private int StreetNo;

    public int getStreetNo() {
        return StreetNo;
    }

    public void setStreetNo(int streetNo) {
        StreetNo = streetNo;
    }

    public Address(int streetNo) {
        StreetNo = streetNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "StreetNo=" + StreetNo +
                '}';
    }
}
