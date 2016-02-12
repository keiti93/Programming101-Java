package week08.Friday;

public class Threads extends Thread {

    Memory m;
    
    public Threads(Memory m){
        this.m = m;
    }
    
    @Override
    public void run() {         
        for (int k = 0; k < 1000000; k++) {
           m.increment();            
        }
    }
    
   

    public static void main(String[] args) throws InterruptedException {
        Memory m = new Memory(0);
        
        Threads t1 = new Threads(m);
        t1.start();
        
        Threads t2 = new Threads(m);
        t2.start();
        
        Threads t3 = new Threads(m);
        t3.start();
                
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println( m.get());
        
    }

}
