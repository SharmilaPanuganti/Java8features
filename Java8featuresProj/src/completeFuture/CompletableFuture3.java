package completeFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFuture3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture.runAsync(()->{
            // try {
            //     Thread.sleep(2000);
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
            System.out.println("Thread running");
            
        });
        System.out.println("-----------------------------");
         CompletableFuture.runAsync(()->{
           
            System.out.println("Thread 2 running");
            System.out.println("Thread 3 running");
        },Executors.newFixedThreadPool(2));
        System.out.println("--------------------------------");
        // runAsync.get();
        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()-> "Hello world !");
        System.out.println("--------------------------------------------");
        System.out.println(supplyAsync.get());
        CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(()->"Hello world !",Executors.newCachedThreadPool());
        System.out.println(supplyAsync2.get());
    }
}
