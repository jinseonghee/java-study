package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Queue {

    public void enQueue(String data); //넣는 operation은 enQueue
    public String deQueue();
    public void printQueue();

}

public class MyLinkedQueue extends MyLinkedList implements Queue {

    MyListNode front;
    MyListNode rear;

    @Override
    public void enQueue(String data) {

        MyListNode newNode;
        if(isEmpty()) {
            newNode = addElement(data); //MyLinkedList의 반환값 newNode을 받아줌.
            front = newNode; //front, rear가 새로 추가된 node의 위치를 가리킴
            rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode; //맨 뒤에 들어갈 경우
        }
        System.out.println(newNode.getData() + " added");

    }

    @Override
    public String deQueue() {

        if(isEmpty()) {//비웠으면 못 지우니까 error
            return null;
        }

        String data = front.getData();
        front = front.next;

        if(front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {

        printAll();
    }
}
