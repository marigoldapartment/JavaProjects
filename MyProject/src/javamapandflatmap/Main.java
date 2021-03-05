package javamapandflatmap;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        List<Customer> c = EkartDataBase.getAll();

        System.out.println("Example of map: " );

        List<String> collect = c.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        collect.forEach(s -> System.out.println(s));

        System.out.println('\n'+"Example of flatmap: " );

        List<String> collect1 = c.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());
        collect1.forEach(s -> System.out.println(s));

        System.out.println('\n'+"Example of Consumer: " );

        forEach(collect, (String s) -> System.out.println(s.length()));

        System.out.println('\n'+ "Example of Predicate: " );
        Predicate<String> predicate = x -> Integer.parseInt(x) > 300;

        (collect1.stream().filter(predicate).collect(Collectors.toList())).forEach(
                s -> System.out.println(s)
        );

        System.out.println('\n'+ "Example of Supplier: " );
        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        System.out.println(s1.get());




    }

    static <T> void forEach(List<T> list,Consumer<T> consumer){
        for(T t : list){
            consumer.accept(t);
        }
    }


}
