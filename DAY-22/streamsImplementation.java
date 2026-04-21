import java.util.List;
class StreamsMethod {
    String name;
    String dept;
    int salary;
    int age;
    StreamsMethod(String name, String dept, int salary, int age) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

public class streamsImplementation {
    public static void main(String[] args) {
        List<StreamsMethod> emp = List.of(
                new StreamsMethod("Emp1", "dev", 60000, 25),
                new StreamsMethod("Emp2", "hr", 40000, 30),
                new StreamsMethod("Emp3", "support", 55000, 28),
                new StreamsMethod("Emp4", "dev", 70000, 35)
        );

        List<StreamsMethod> devEmployees = emp.stream()
                .filter(e -> e.getDept().equals("dev"))
                .toList();
        System.out.println(devEmployees.size());

        List<StreamsMethod> highSalary = emp.stream()
                .filter(e -> e.getSalary() > 50000)
                .toList();
        System.out.println(highSalary.size());

        int totalSalary = emp.stream()
                .mapToInt(e -> e.getSalary())
                .sum();
        System.out.println(totalSalary);

        double avgSalary = emp.stream()
                .mapToInt(e -> e.getSalary())
                .average()
                .orElse(0);
        System.out.println(avgSalary);

        long count = emp.stream().count();
        System.out.println(count);
    }
}