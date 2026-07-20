
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

    public static void main(String a[]) {

        List<String> names = Arrays.asList("Hello", "World", "Linus", "Gabe");

        Optional<String> name = names.stream().filter(i -> i.contains("n")).findFirst();

        System.out.println(name.orElse("notFound"));

        names.forEach(System.out::println);

    }

}
