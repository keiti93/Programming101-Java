package week08.Friday;

public class ThreadClassMsg extends Thread {

    @Override
    public void run() {
        System.out.println("Hello, I'm a thread from the Thread class!");
    }


    public static void main(String args[]) {
        ThreadClassMsg t1 = new ThreadClassMsg();
        t1.start();
    }
}