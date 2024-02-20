package javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer=t->System.out.println(t);
        consumer.accept(20);
        List<Integer> list=Arrays.asList(1,2,3,4);
        list.stream().forEach(consumer);
    }
}
