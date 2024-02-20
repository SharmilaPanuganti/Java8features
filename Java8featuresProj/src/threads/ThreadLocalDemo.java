package threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalDemo implements Runnable{

   /* private static final AtomicInteger nextId = new AtomicInteger(0);
	private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(()->nextId.getAndIncrement());
	
	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName()+" Value-"+threadId.get());
	} */
    // private static final ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<SimpleDateFormat>(){
	// 	@Override
	// 	protected SimpleDateFormat initialValue() {
	// 		System.out.println("Initializing SimpleDateFormat for-"+Thread.currentThread().getName());
	// 		return new SimpleDateFormat("dd/MM/yyyy"); 
	// 	}
	// };
    private static final ThreadLocal<SimpleDateFormat> dateFormat = ThreadLocal.withInitial(()->{
			System.out.println("Initializing SimpleDateFormat for-"+Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy"); });
	@Override
	public void run() {
		System.out.println("Thread run execution started for -"+Thread.currentThread().getName());
		System.out.println("Date formatter pattern is - "+Thread.currentThread().getName()+" "+dateFormat.get().toPattern());
		System.out.println("Formatted date is -"+dateFormat.get().format(new Date()));
	}
   
}
