package Week7;

import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> list = List.of("hello there","hi","hola como estas","Ohio Cincinnati","Vermont","Drake");

        list.forEach(s -> System.out.println(s));
    }
}
