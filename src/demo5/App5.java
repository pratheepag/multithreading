package demo5;

public class App5 {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public static void main(String[] args)
    {
        App5 worker = new App5();
        worker.run();
    }
    public void run() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread1.start();
        
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }       
        System.out.println("Count is: " + count);
    }
}
