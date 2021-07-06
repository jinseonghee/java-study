package ch05;

public class MyListQueueTest {

    public static void main(String[] args) {

        MyLinkedQueue listQueue = new MyLinkedQueue();
        listQueue.enQueue("A");
        listQueue.enQueue("B");
        listQueue.enQueue("C");

        listQueue.printAll();

        System.out.println(listQueue.deQueue()); //stack은 맨 뒤로 들어간게 먼저 출력
        System.out.println(listQueue.deQueue()); //queue는 먼저 들어간게 먼저 출력
    }
}
