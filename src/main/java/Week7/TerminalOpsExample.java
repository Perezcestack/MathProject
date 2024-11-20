package Week7;

import java.util.List;

public class TerminalOpsExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

       long result = list.stream().filter(s -> s % 2 == 0).count();

        System.out.println(result);
    }
}
