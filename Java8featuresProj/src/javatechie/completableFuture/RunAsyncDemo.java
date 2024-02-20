package javatechie.completableFuture;

import java.io.File;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunAsyncDemo {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executor = Executors.newFixedThreadPool(5);
    CompletableFuture<Void> comp=CompletableFuture.runAsync(()->{
        System.out.println("Run async demo");
        for(int i=0;i<10;i++)
        System.out.println(i);
    System.out.println(Thread.currentThread().getName());},executor);
    comp.get();
  }
}
