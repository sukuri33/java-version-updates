import java.util.Arrays;
import java.util.List;

public class DishData {

    public static List<Dish> getAll(){

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, DishType.MEAT),
                new Dish("beef", false, 700, DishType.MEAT),
                new Dish("chicken", false, 400, DishType.MEAT),
                new Dish("fries", true, 530, DishType.OTHER),
                new Dish("prawns", false, 300, DishType.FISH),
                new Dish("rice", true, 350, DishType.OTHER),
                new Dish("pizza", true, 550, DishType.OTHER),
                new Dish("salmon", false, 450, DishType.FISH),
                new Dish("fruit", true, 120, DishType.OTHER)
        );

        return menu;
    }

}
