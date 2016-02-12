package week08.Friday;

import java.util.Scanner;

public class SumThread extends Thread {

    int a;
    int b;

    public SumThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        SumThread st = new SumThread(a, b);

        st.start();

    }

}
