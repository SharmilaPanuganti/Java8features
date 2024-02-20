package FunctionalInterface;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r=new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println("My run method");
        }
        
    };
    Thread t=new Thread(r);
    t.start();
    }
}
