package ch04;

public class MyArrayStackTest {

    public static void main(String[] args) {

        MyArrayStack stack = new MyArrayStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); //size를 3개로 지정해 주었기 떄문에, 들어가는 순간 stack 이 꽉찼다고 출력

        stack.printAll();

        System.out.println(stack.pop()); // 꺼내온 값
        System.out.println(stack.pop());
        System.out.println(stack.peek()); // 남은 값

    }
}
