package completeFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture7 {
    public static void main(String[] args) 
    // throws InterruptedException, ExecutionException 
    {
        String name =null;
        // CompletableFuture<String> handle = CompletableFuture.supplyAsync(() -> {
        //     if(name==null){
        //         throw new RuntimeException("Compilation Error");
        //     }
        //     return "Hello," + name;
        // });
        CompletableFuture<String> handle = CompletableFuture.supplyAsync(() -> {
            if(name==null){
                throw new RuntimeException("Compilation Error");
            }
            return "Hello," + name;
        }).handle((s,t)->s != null?s:"Hello,Stranger");
        try {
            System.out.println(handle.get());
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
           System.out.println(e.getMessage());
        }
    }
}
