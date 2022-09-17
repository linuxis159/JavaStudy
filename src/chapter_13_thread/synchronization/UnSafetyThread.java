package chapter_13_thread.synchronization;

public class UnSafetyThread implements Runnable{
    CriticalSection criticalSection = new CriticalSection();
    public void run() {
        for (int i = 1; i <= 1000000; i++){
            criticalSection.increase();
        }
        System.out.println(criticalSection.total);

    }
}
