package javatechie.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WhyNotFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service=Executors.newFixedThreadPool(100);
        System.out.println("Thread: "+Thread.currentThread().getName());
        // delay(1);
        Future<List<Integer>> future = service.submit(()->Arrays.asList(1,2,3,4));
        List<Integer> list = future.get();
        System.out.println(list);
        CompletableFuture<String> completableFuture=new CompletableFuture<>();
        completableFuture.get();
        completableFuture.complete("Return some data");
    }
    private static void delay(int min){
        try {
            TimeUnit.MINUTES.sleep(min);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
