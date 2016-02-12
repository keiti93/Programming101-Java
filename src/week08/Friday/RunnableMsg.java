package week08.Friday;

public class RunnableMsg implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello, I'm a thread from the Runnable interface!");
    }

    
    public static void main(String args[]) {
        Thread t2 = new Thread(new RunnableMsg());
        t2.start();
    }
}
