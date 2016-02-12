package week08.Friday;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        ThreadClassMsg t1 = new ThreadClassMsg();
        Thread t2 = new Thread(new RunnableMsg());

        t1.join();
        t2.join();

        t1.start();
        t2.start();

    }

}
