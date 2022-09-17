package chapter_13_thread.synchronization;

public class SafetyThread implements Runnable{
    SynchronizedCriticalSection synchronizedCriticalSection = new SynchronizedCriticalSection();


    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++){
            System.out.println("Current SafetyThread : "+ Thread.currentThread().getName() + ", i : "+ i);
            synchronizedCriticalSection.increase();
        }
        System.out.println(synchronizedCriticalSection.total);
    }

}
