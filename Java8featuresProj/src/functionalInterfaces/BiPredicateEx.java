package functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String[] args) {
        BiPredicate<Integer,String> biPredicate=(i,o)->i>20&&o.startsWith("M");
        System.out.println(biPredicate.test(20, "Martin"));
        //DefaultMethods
        BiPredicate<Integer,Integer> predicate=(x,y)->x>y;
        BiPredicate<Integer,Integer> predicate2=(x,y)->x-2>y;
        System.out.println(predicate.or(predicate2).test(30, 20));
        System.out.println(predicate.and(predicate2).test(20, 19));
        System.out.println(predicate.negate().test(20, 10));

    }
}
