package Week7;

import java.util.List;
import java.util.function.Consumer;

public class miniExerciseLambda  {
    public static void main(String[] args) {


        NumericOperator p2  = (a ,b) -> a + b;

        System.out.println(p2.operate(2,3));

        NumericOperator p3 = (a,b) -> Math.max(a,b);

        StringFormatter s1 = str -> str.toUpperCase();

        System.out.println(s1.format("hello"));

        UnaryOperator u1 = (a) -> (int) Math.pow(a,2);
        System.out.println(u1.apply(3));

        triFunctions t1 = (a,b,c) -> (a + b + c) / 3;

        System.out.println(t1.apply(4,5,6));

        Printer p1 = str2 -> System.out.println(str2);

        p1.print("JoeMama");

        Predicate<String> p4 = r -> r.isEmpty();

        boolean result = p4.test("");
        System.out.println(result);

        processStrings(List.of("hi","bacon","eggs","Omlette","excellent"),str -> str.startsWith("e"));


    }
    public static void processStrings(List<String> stringList, Predicate<String> s){
        for(String s2 : stringList){
           s.test(s2);
            System.out.println(s.test(s2));
        }
    }
}
