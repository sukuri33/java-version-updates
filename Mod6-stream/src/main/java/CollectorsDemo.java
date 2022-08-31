import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier) : is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());

        //toSet() : returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap);

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a Integer-valued func
        int sumCal = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sumCal);

        //counting() : returns a Collector that counts the number of the elements
        long itemCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet())
                .stream().count();
        System.out.println(itemCount);

        //averagingInt(ToIntFunction): returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAverage);

        //joining(): is used to join various elements of a character or string array into a single object
        List<String> courseNames = Arrays.asList("Java","JavaScript","TypeScript","VBScript");
        System.out.println(     courseNames.stream()
//                .collect(Collectors.joining()));
                        .map(initials ->initials.charAt(0)+"")
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.joining(", ")));

        //partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate.
      Map<Boolean,List<Dish>> isVeggieDish =  DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(isVeggieDish);

        //groupingBy(); is used for grouping objects by some property and storing results in a Map instance
        Map<DishType,List<Dish>> groupBydishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(groupBydishType);
    }
}