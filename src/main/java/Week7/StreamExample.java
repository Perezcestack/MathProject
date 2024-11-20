package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        list = list.stream().filter(s -> s % 2 == 0).toList();

        for(Integer l : list){
           int result = (int) Math.pow(l,2);
            System.out.println(result);
        }
    }
}
