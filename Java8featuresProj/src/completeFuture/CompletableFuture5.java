package completeFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture5 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> thenCompose = CompletableFuture.supplyAsync(() -> "Hello,")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "Everyone"));
        System.out.println(thenCompose.get());
        System.out.println("--------------------------------------");
        CompletableFuture<String> thenCombine = CompletableFuture.supplyAsync(() -> "Hello,")
                .thenCombine(CompletableFuture.supplyAsync(() -> "Everyone"), (s1, s2) -> s1 + s2);
        System.out.println(thenCombine.get());
        CompletableFuture.supplyAsync(() -> "Everyone")
                .thenAcceptBoth(CompletableFuture.supplyAsync(() -> " Here!"), (s1, s2) -> System.out.println(s1 + s2));
        
    }
}
