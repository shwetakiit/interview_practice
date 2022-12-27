package kumari.shweta.thread.ThreadPOOL;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
import static java.util.concurrent.TimeUnit.MILLISECONDS;
 
public class CachedThreadPoolExecutorExample {
 
    private static class Counter implements Runnable {
 
        private static int nth = 0;
 
        private final int id = ++nth;
        private final int number;
       String threadName;
        public Counter(int number,String threadName) {
            this.number = number;
            this.threadName=threadName;
        }
 
        @Override
        public void run() {
            System.out.println("Starting counter: " + id+" And thread Name is "+threadName);
            for (int i = 0; i < number; ++i) {
                try {
                    MILLISECONDS.sleep(300);
                } catch (InterruptedException e) {
                    // ignore
                }
                System.out.printf("counter %d, value: %d%n", id, i);
            }
            System.out.println("Finishing counter: " + id);
        }
    }
 
    public static void main(String arg[]) {
        System.out.println("Starting Cached Thread Pool");
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 100; ++i) {
        	
        	String threadName = "Hi"+i;
        	Counter counter = new Counter(3,threadName);
            executor.execute(counter);
        }
        executor.shutdown();
    }
}