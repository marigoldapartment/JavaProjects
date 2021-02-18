package sortingJava8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> studentlist = new ArrayList<>();
        studentlist.add(new Employee("Jon", 22, 1001,new Address(12)));
        studentlist.add(new Employee("Steve", 19, 1003,new Address(10)));
        studentlist.add(new Employee("Kevin", 23, 1005,new Address(8)));
        studentlist.add(new Employee("Ron", 20, 1010,new Address(13)));
        studentlist.add(new Employee("Lucy", 18, 1111,new Address(19)));
        studentlist.forEach((e)-> System.out.println(e));
        studentlist.sort((e2,e1) -> e2.getAddress().getStreetNo() - e1.getAddress().getStreetNo());
        studentlist.forEach((e)-> System.out.println(e));
    }
}
