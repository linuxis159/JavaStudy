package chapter_13_thread.synchronization;

public class UnSafetyThread implements Runnable{
    CriticalSection criticalSection = new CriticalSection();
    public void run() {
        for (int i = 1; i <= 100000; i++){

           //System.out.println("Current UnsafetyThread : "+ Thread.currentThread().getName() +", total : "+criticalSection.total + ", i : "+ i);
            criticalSection.increase();
        }
        System.out.println(criticalSection.total);

    }
}
