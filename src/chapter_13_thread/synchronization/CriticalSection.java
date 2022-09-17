package chapter_13_thread.synchronization;

public class CriticalSection {
     int total = 0;
      // 1. total 값을 저장하고 있는 메모리주소에서 total 값 읽어서 레지스터에 적재
      // 2. 레지스터에서 값 읽어서 1 증가
      // 3. 1 증가된 total 값을 total 값을 저장하는 메모리 주소에 저장
      void increase(){
          total++;
     }
}

