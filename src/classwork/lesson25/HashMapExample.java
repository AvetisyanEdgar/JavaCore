package classwork.lesson25;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(111, "Petros");
        names.put(222, "Poxos");
        Collection<String> values = names.values();
        for (String s : values) {
            System.out.println(s);
        }
        System.out.println(values);
        Set<Integer> integers = names.keySet();
        System.out.println(integers);
    }
}
