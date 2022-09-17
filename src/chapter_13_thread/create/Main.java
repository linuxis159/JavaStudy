package chapter_13_thread.create;
/*
1.Thread 클래스를 상속하기
2.Runnable 인터페이스 구현하는 인스턴스 생성 후 Thread클래스 생성시 넘겨줌
*/
public class Main {

    public static void main(String[] args){
        // ExtendsThread 클래스는 Extends를 상속하고있다
        ExtendsThread t1 = new ExtendsThread();
        //ImplementRunaalbe 클래스는 Runnable 인터페이스를 구현하고 있다
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
