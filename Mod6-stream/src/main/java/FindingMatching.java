import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        //All Match
        System.out.println("********All Match****************");
        boolean isHealthy = DishData.getAll().stream()
                    .allMatch(dish -> dish.getCalories() < 1000);
            System.out.println(isHealthy);

        //Any match
        System.out.println("********Any Match****************");
        boolean isHaram = DishData.getAll().stream()
                .anyMatch(dish -> dish.getName().equalsIgnoreCase("pork"));

        if (isHaram) {
            System.out.println("This menu includes Haram dish");
        } else {
            System.out.println("no Haram dish");
        }

        //None Match
        System.out.println("********None Match****************");
        System.out.println(DishData.getAll().stream()
                .noneMatch(dish -> dish.getCalories()>=1000));

        //Find Any
        System.out.println("********Find Any****************");
        System.out.println(DishData.getAll()
                .stream()
                .filter(Dish::isVegetarian)
                .findAny());

        //Find 1st
        System.out.println("********Find 1st****************");
        System.out.println(DishData.getAll()
                .stream()
                .filter(Dish::isVegetarian)
                .findFirst());

        //Parallel Streams (Async) - MultiThreading
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findAny());

        List<String> nameList1 = Arrays.asList("Johny","Duke","Jack","Jill","Dany","Julia","Marry","Darren");
        List<String> nameList2 = Arrays.asList("Johny","Duke","Jack","Jill","Dany","Julia","Marry","Darren");

        Optional<String> findFirstName =  nameList1.parallelStream().filter(n -> n.startsWith("D")).findFirst();
        Optional<String> findAnyName = nameList2.parallelStream().filter(n -> n.startsWith("J")).findAny();

        System.out.println(findFirstName);
        System.out.println(findAnyName);

        //Min & Max
        System.out.println("********Min & Max****************");
        System.out.println(DishData.getAll()
                .stream()
                .min(Comparator.comparing(dish -> dish.getCalories())).get());
        System.out.println(DishData.getAll()
                .stream()
                .max(Comparator.comparing(Dish::getCalories)).get());

        //Reduce
        System.out.println("********Reduce****************");
        //The stream interface supports a reduce method. This operation allows us to produce one single
        //result from a sequence of elements
        //It takes 2 args
        //An initial value .reduce(0, NOTE: if you omit the initial value part, it will be defaulted as 0
        //A BinaryOperator<T> to combine the two elements and produce a new single result/value?
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,4,7,8,9,10);
        System.out.println(list.stream().reduce(0,(a,b)-> a+b));

        int sum = 0; //think of this as the initial value part
        // in the reduce method 1st arg(AKA initial Value)
        for (Integer integer : list) {
            sum+= integer;
        }
        System.out.println(sum);

        //Task for dish calories
        System.out.println("Mini task to apply reduce() to Dish:");
        System.out.println(DishData.getAll().stream()
                .map(dish -> dish.getCalories())
                .reduce(0,(a,b)->a+b));

        System.out.println("*********Count***************");
        System.out.println(DishData.getAll().stream()
                .map(dish -> dish.getCalories())
                .reduce(0,(a,b)->a+b));

    }
}
