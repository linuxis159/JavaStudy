package chapter_11.queue;

public class QueueMain {
    public static void main(String[] args){
        QueueClass<Integer> queue = new QueueClass();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
