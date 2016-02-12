package week08.Friday;

public class Memory {
    public volatile int i;
    
    public Memory(int i){
        this.i = i;
    }
    
    public synchronized void increment(){
        i = i +1;
    }

    public synchronized int get(){
        return i;
    }
}
