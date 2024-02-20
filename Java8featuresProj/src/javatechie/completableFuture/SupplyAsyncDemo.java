package javatechie.completableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class SupplyAsyncDemo {
    public static List<Emloyee> fetchEmployees() {
        List<Emloyee> list = new ArrayList<>();
        list.add(new Emloyee(1, "abc"));
        list.add(new Emloyee(2, "xyz"));
        list.add(new Emloyee(3, "abc"));
        list.add(new Emloyee(4, "uvw"));
        return list;
    }

    public Void getEmloyees() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newCachedThreadPool();
        CompletableFuture<Void> supplyAsync = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return fetchEmployees();
        },executor).thenApplyAsync(emp -> {
            System.out.println("Thread:" + Thread.currentThread().getName());
            return emp.stream()
                    .filter(e -> e.getFirst_name().equals("abc"))
                    .collect(Collectors.toList());
        },executor).thenApplyAsync(emp -> {
            System.out.println("Second:" + Thread.currentThread().getName());
            return emp.stream()
                    .filter(e -> e.getId() == 3)
                    .collect(Collectors.toList());
        },executor).thenAcceptAsync(e->{
            System.out.println("Accept: "+Thread.currentThread().getName());
            System.out.println("Accepting emp");},executor);
        return supplyAsync.get();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
       new SupplyAsyncDemo().getEmloyees();
    }
}
