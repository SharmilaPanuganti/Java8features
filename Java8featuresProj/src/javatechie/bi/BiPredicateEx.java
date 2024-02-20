package javatechie.bi;

import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String[] args) {
        BiPredicate<String,String> biPredicate=(s1,s2)->s1.equals(s2);
        System.out.println("Bipredicate: "+biPredicate.and((s1,s2)->s1.length()==s2.length()).test("Sharmi", "sharmi"));
    }
}
