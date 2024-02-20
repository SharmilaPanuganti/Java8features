package forkjoinpool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newWorkStealingPool(availableProcessors);
        List<Callable<String>> tasks=Arrays.asList(()->"my task 1",()->"task2",()->"task3");
        executorService.invokeAll(tasks).stream().map(future->{
           try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            
            e.printStackTrace();
        }
            return null;

        }).forEach(System.out::println);
    }
}
