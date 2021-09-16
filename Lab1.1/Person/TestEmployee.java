public class TestEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee("Master", "Metro", Employee.Position.SELLER);
        System.out.println(employee.think());
    }
}

