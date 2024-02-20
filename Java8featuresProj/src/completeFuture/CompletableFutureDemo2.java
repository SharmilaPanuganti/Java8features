package completeFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureDemo2 {
    // public static void main(String[] args) throws InterruptedException, ExecutionException {
        // CompletableFuture<String> compFuture = new CompletableFuture<>();
    //     CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello wolrd");
    //     String result = completedFuture.get();
    //     System.out.println(result);
    // }
    public static void main(String[] args) {
        CompletableFuture<String> calculateAsync = calculateAsync();
        try {
            String result=calculateAsync.get();
            System.out.println(result);
            System.out.println(Thread.currentThread().getName());
            System.out.println("-------------------------------------");
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    private static CompletableFuture<String> calculateAsync(){
        CompletableFuture<String> completableFuture=new CompletableFuture<>();
        List<String> list=new ArrayList<>();
        list.add("KK");
		list.add("PK");
		list.add("SK");
        
        Executors.newCachedThreadPool().submit(()->{
            try {
                Thread.sleep(100);
                String joinStr = String.join(",", list);
				System.out.println(Thread.currentThread().getName());
				//  completableFuture.complete(joinStr);
                completableFuture.cancel(true);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        });
        return completableFuture;
    }
}
