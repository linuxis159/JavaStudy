package chapter_13_thread.create;

public class ExtendsThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            System.out.println(getName());
        }
    }
}
