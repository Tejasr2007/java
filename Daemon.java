class kill implements Runnable
{
    public void run()
    {
        while (true) {
            System.out.println("Tejasree");
        }
    }
}
public class Daemon 
{   
    public static void main(String[] args) throws InterruptedException
    {
     kill K = new kill();
     Thread T= new Thread(K);
     T.setDaemon(true);
     T.sleep(5000);
     T.start();
     System.out.println(T.isAlive());
     System.out.println(T.isDaemon());

    
    }

}