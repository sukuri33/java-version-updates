import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        EmployeeData.readAll()
                .map(employee -> employee.getEmpPhoneNumbers())
                .forEach(System.out::println);

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
