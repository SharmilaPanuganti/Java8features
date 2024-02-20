package completeFuture;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFuture6 {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "India");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "is");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "beautiful country");
        System.out.println(future1.isDone() + " " + future2.isDone() + " " + future3.isDone());
        CompletableFuture.allOf(future1, future2, future3);
        System.out.println(future1.isDone() + " " + future2.isDone() + " " + future3.isDone());
        String collect = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
