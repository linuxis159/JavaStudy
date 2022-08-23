package chapter_13_thread.synchronization;

public class Main {
    public static void main(String[] args) {
        Runnable r = new ThreadOne();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        try{
            // threadOne 종료될때 까지 메인쓰레드 즁지
            t1.join();
            // threadTwo 종료될때 까지 메인쓰레드 즁지
            t2.join();
        }catch (InterruptedException e) {}
        System.out.println(CriticalSection.total);
    }
}
