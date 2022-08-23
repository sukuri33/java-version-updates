import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //Creating Stream from an Array
        String[] coursesArray = {"Java","Spring","Agile"};
        Stream<String> courseStream = Arrays.stream(coursesArray);

        //Creating Stream from a Collection
        List<String> courseList = Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStream2 = courseList.stream();

        //Creating Stream from a list of objects from an customer class
        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("SDET", 101),
                new Course("TEST", 102)
        );
        Stream<Course> myCourseStream = myCourses.stream();



    }
}
