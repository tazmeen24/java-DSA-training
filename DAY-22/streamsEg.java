import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class streamsEg {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5);
        List<Integer> multiplyBy2 = nums.stream().map((i) -> i * 2).toList();
        System.out.println(multiplyBy2);
        int total = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println(total);

        List<Integer> even = nums.stream().filter((i) -> i % 2 == 0).toList();
        System.out.println(even);

        List<Employee> employees = List.of(new Employee("Employee1", 1234),
                new Employee("Employee2", 5678));
        List<String> EmployeeNames = employees.stream().map((i) -> i.getName()).toList();
        System.out.println(EmployeeNames);
        List<String> greaterSalary = employees.stream().filter((i) -> i.getSalary() > 30000).toString().toList();

    }
}