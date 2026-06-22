class Process1 extends Thread
{
    public void run()
    {
        for (int i = 1; i < 5; i++) 
        {
            System.out.println("Laps:"+i);
                
        }
    }
}
class Process2 extends Thread
{
    public void run()
    {
        for (int i = 1; i < 13; i++) 
        {
            System.out.println("HeadCount:"+i);
            
        }

    }
}
public class Multithread_abstract 
{
    public static void main(String[] args) throws InterruptedException
    {
        Process1 P1 = new Process1();
        Process2 P2=new Process2();
        P1.setPriority(Thread.MIN_PRIORITY);
        P2.setPriority(Thread.MAX_PRIORITY);
        P2.start();
        P1.start();
        Thread.sleep(2000);
    }    
}