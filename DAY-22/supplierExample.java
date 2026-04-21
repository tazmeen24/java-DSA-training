import java.util.function.Supplier;
import java.lang.Math;

class Person{
    String name="Supplier";
}

public class SupplierEx{
    public static void main(String[] args) {
        Supplier<Integer> a = () -> (int)(Math.random()*100);
        System.out.println(a.get());
        Supplier<Double> b = () -> Math.random()*100;
        System.out.println(b.get());
        Supplier<Person> p=()->new Person();
        System.out.println(p.get().name);
    }
}