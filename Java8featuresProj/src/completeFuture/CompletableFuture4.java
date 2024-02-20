package completeFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> compFuture = CompletableFuture.supplyAsync(()->"Hello world");
    //    compFuture = compFuture.thenApply((s)->s+"!!");
        System.out.println(compFuture.get());
        System.out.println("-----------------------------------");
        compFuture.thenAccept((s)->System.out.println(s+" !!"));
        // System.out.println(compFuture.get());
        CompletableFuture<String> compFuture2 = CompletableFuture.supplyAsync(()->"Hello world");
        compFuture2.thenRun(()->System.out.println("Task is done"));
        
    }
}
