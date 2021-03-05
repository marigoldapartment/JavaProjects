package copy;

public class Emplpyee {
    private int id;
    private String name;
    private String surname;
    private int phoneNo;

    public Emplpyee() {
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Emplpyee(int id, String name, String surname, int phoneNo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNo = phoneNo;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
