public class EmployeeTest {
    public static void main(String[] args) {

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

    }
}
