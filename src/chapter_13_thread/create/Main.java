package chapter_13_thread.create;
/*
1.Thread 클래스를 상속하기
2.Runnable 인터페이스 구현하는 인스턴스 생성 후 Thread클래스 생성시 넘겨줌
*/
public class Main {

    public static void main(String[] args){
        // Thread 클래스 상속
        ExtendsThread t1 = new ExtendsThread();
        //Runnable 인터페이스 구현
        Runnable runnable = new ImplementRunnable();
        Thread t2 = new Thread(runnable);
        //t1을 위한 스택공간 생성
        t1.start();
        //t2를 위한 스택공간 생성
        t2.start();

/*
한번 start함수 호출된 쓰레드는 다시 시작 불가능

        에러발생
        t1.start();
        t2.start();
*/
    }
}
