package FunctionalInterface;
// import java.util.function.*;
public class LambdaDemo {
    public static void main(String[] args) {
        Runnable r=()->{System.out.println("Lambda expression");};
        Thread t=new Thread(r);
        t.start();
    }
}
