package forkjoinpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAdder;

public class ForkJoinPool1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        LongAdder adder = new LongAdder();
        Mytask mytask=new Mytask(12, adder);
        List<Callable<Integer>> tasks=new ArrayList<>();
        tasks.add(mytask);
        ForkJoinPool commonPool=ForkJoinPool.commonPool();
        List<Future<Integer>> invokeAll = commonPool.invokeAll(tasks);
        for (Future<Integer> future : invokeAll) {
            future.get();
        }
        System.out.println(adder.intValue());
        int commonPoolParallelism=ForkJoinPool.getCommonPoolParallelism();
        System.out.println(commonPoolParallelism);
    }
}
