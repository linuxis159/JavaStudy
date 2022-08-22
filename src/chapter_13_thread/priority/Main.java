package chapter_13_thread.priority;

import java.nio.file.ClosedWatchServiceException;

public class Main {
    public static void main(String[] args) {
        Thread high = new HighPriorityThread();
        Thread low = new LowPriorityThread();

        high.setName("High");
        low.setName("Low");
        high.setPriority(10);
        low.setPriority(1);

        // 실행시 고만고만함 .. 멀티코어라서, OS에 따라서 결과 달라짐
        high.start();
        low.start();
    }


}
