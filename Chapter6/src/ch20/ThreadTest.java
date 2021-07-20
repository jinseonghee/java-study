package ch20;

class MyThread implements Runnable {

    @Override
    public void run() {

        int i;
        for(i = 1; i <= 200; i++) {
            System.out.println(i + "\t");
        }
    }
}

/*
class MyThread extends Thread {

    public void run() {//Thread class를 상속 받으면 run() 메서드를 반드시 구현해야 한다.

        int i;
        for(i = 1; i <= 200; i++) {
            System.out.println(i + "\t");
        }
    }
}
*/
public class ThreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "start"); //currentThread() : [호출한 함수, 우선순위, 현재 호출되어 있는 곳] 출력

        MyThread runnable = new MyThread();

        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread() + "end"); // main, th1, th2 총 세 개의 Thread가 돌아감. main Thread가 제일 마지막에 돌아감.

        Runnable run = new Runnable() { //간단히 쓰레드를 돌릴경우 익명객체를 사용해서 돌려도 된다.

            @Override
            public void run() {
                System.out.println("run");
            }
        };
    }
}
