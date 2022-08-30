package demo1;

class Runner extends Thread{

    @Override
    public void run() {
        for(int i=0; i< 10; i++) {
            System.out.println("Hello "+i);
          
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            
        }
        super.run();
    }
    
}
public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Runner runner1 = new Runner();
        runner1.start();
        
        Runner runner2 = new Runner();
        runner2.start();
    }

}
