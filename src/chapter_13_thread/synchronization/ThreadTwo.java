package chapter_13_thread.synchronization;

public class ThreadTwo extends Thread{
    public void run() {
        for (int i = 1; i <= 1000; i++){
            CriticalSection.total +=i;
        }
    }
}