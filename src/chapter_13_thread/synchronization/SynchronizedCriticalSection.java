package chapter_13_thread.synchronization;

public class SynchronizedCriticalSection {
    int total = 0;

    synchronized void increase(){
        total++;
    }
}
