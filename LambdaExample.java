import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using lambda expression to filter even numbers
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);


        // Using lambda expression to filter numbers greater than 5
        Predicate<Integer> isGreaterThanFive = n -> n > 5;
        System.out.println("\nNumbers greater than 5:");
        numbers.stream()
               .filter(isGreaterThanFive)
               .forEach(System.out::println);

        // Using lambda expression for a simple addition
        MyFunction add = (a, b) -> a + b;
        System.out.println("\nAddition result: " + add.apply(5, 3));

    }


    // Functional interface with a single abstract method
    @FunctionalInterface
    interface MyFunction {
        int apply(int a, int b);
    }
}