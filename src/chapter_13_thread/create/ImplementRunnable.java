package chapter_13_thread.create;

public class ImplementRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
