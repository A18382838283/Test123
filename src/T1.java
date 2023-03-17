
public class T1 extends Thread{
    long threadId;
    String threadName;

    public static void run(String message)
    {
        for(int i = 0; i < 80; i++)
            System.out.println("Thread ID:" + message);
    }

}
