package javamapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll() {
        return Stream.of(new Customer(101,"Dravid","dravid@gmail.com", Arrays.asList("122","234")),
                new Customer(102,"Rahul","rahul@gmail.com", Arrays.asList("221","342")),
                new Customer(103,"Sachin","sachin@gmail.com", Arrays.asList("212","423"))
        ).collect(Collectors.toList());
    }
}
