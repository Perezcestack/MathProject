package Week7;

import java.util.List;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> list = List.of("hello there","hi","hola como estas","Ohio Cincinnati","Vermont","Drake");

        list = list.stream().filter(s -> s.length() > 6).map(s -> s.toUpperCase()).toList();

        System.out.println(list);

    }
}
