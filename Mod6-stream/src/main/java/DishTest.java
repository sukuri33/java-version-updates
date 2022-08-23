import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DishTest {
    public static void main(String[] args) {

        System.out.println("********Print all dish's name that has less than 400 calories*******");
        List<Dish> lowCalo400 = DishData.getAll();
        lowCalo400.stream()
                .filter(d -> d.getCalories() < 400)
                .map(i -> "Dish name:"+i.getName()+"\nDish calories:"+i.getCalories())
                .forEach(i -> System.out.println(i));
        System.out.println();
        System.out.println("*******Print the length of the name of each dish***********");
        lowCalo400.stream()
                .map(i -> i.getName().length())
                .forEach(System.out::println);
        System.out.println();
        System.out.println("********Print three high caloric dish name (>300)************");
        lowCalo400.stream()
                .filter(d -> d.getCalories() > 300)
                .forEach(i -> System.out.println(i.getName()));
        System.out.println();
        System.out.println("*******Print all dish name that are below 400 calories in sorted******");
        //Print all dish name that are below 400 calories in sorted
        lowCalo400.stream()
                .filter(d -> d.getCalories() < 400)
                .map(i -> i.getName())
                .sorted((o1, o2) -> o1.compareTo(o2))
                .forEach(System.out::println);
    }
}
