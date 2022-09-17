package chapter_13_thread.synchronization;

public class Main {
    public static void main(String[] args) {
        Runnable safetyThread = new SafetyThread();
        Runnable unSafetyThread = new UnSafetyThread();


        Thread t1 = new Thread(unSafetyThread);
        Thread t2 = new Thread(unSafetyThread);

        Thread t3 = new Thread(safetyThread);
        Thread t4 = new Thread(safetyThread);
        //쓰레드 동기화 X
        t1.start();
        t2.start();

        //쓰레드 동기화 O
        //t3.start();
        //t4.start();


        try{
            // threadOne 종료될때 까지 메인쓰레드 즁지
            t1.join();
            // threadTwo 종료될때 까지 메인쓰레드 즁지
            t2.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
