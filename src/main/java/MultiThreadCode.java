import java.lang.Thread;  public class MultiThreadCode implements Runnable{
    public  void run()
    {
        for(int i=0;i<5;i++) {
            System.out.println("Messi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }  }  }
    public static void main(String[] args) throws InterruptedException {
        // This is for if we extends a thread
//      MultiThreadCode m=new MultiThreadCode();
//      m.start();
        // This is for if we implements a Runnable
        MultiThreadCode m=new MultiThreadCode();
        Thread t=new Thread(m);
        t.start();
//      Thread.sleep(2000);
        for(int i=0;i<5;i++) {
            System.out.println("Ronaldo");
            Thread.sleep(2000);
        }  } }
