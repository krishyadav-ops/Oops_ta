package Program12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.sort((a, b) -> b.compareTo(a)); // Descending order
        System.out.println(names);
    }
}
