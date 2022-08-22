package chapter_13_thread.priority;

public class HighPriorityThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            System.out.println(getName());
        }
    }
}
