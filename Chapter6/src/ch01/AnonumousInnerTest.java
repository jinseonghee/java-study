package ch01;

class Outer2 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) { // 이 메서드는 Runnable Interface를 반환, 메서드 이름은 getRunnable
                                  //메개변수 : 메서드가 호출될 때 stack 메모리에 생성
        int num = 100; //지역변수 : 지역변수도 메서드가 호출될 때 stack 메모리에 생성(메서드 or 생성자 내부영역에 선언)

        return new Runnable() {  //익명내부클래스 : 클래스 이름을 쓰는 경우가 반환값을 쓸때 밖에 없으므로, 앞에 클래스 이름을 지우고 바로 반환값을 쓰고 끝나는 영역에 ';'을 붙임

            int localNum = 10; //멤버변수 : 클래스 영역 안에서 선언

            @Override
            public void run() {

                //num = 200; 지역변수인데 값을 넣어주면 에러남, 밑에 처럼 가져다 쓸땐 에러 안남; 이 메서드가 호출되는 시점과 클래스의 생성주기가 맞지 않는다.
                //i = 100; 메서드가 호출되고 끝이나면, 지역변수,매개변수는 stack 메모리에 잡히는데, 메서드 호출이 끝이나면 없어진다.
                // 그런데 run() 메서드는 Runnable을 구현 받았기 때문에 다시 호출될 수 있는 여지가 있는데, 이 지역변수가 다시 호출될 때 없을 수도 있어서 그 경우 값을 assign 할 수 없음
                //그래서 값을 바꿔줄 수 없어서 이 지역변수들은 stack 메모리에 잡혀선 안됨. 이렇게 사용하는 경우엔 위에 매개변수와 멤버변수를 final로 처리해야 함.
                //이미 컴파일러가 눈에 안보이지만 final 처리를 해버려서 상수화 되어 값을 바꿀 수 없음.

                System.out.println("i =" + i); //메서드가 호출이 되면 매개변수와 지역변수는 stack 메모리에 생성이 됬으니까 사용 가능
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum); //클래스의 멤버변수기 때문에 사용 가능

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)"); //외부 클래스가 생성되고 메서드가 호출되기 때문에 외부에 선언된 변수는 상관 없음.
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        };
    }

    Runnable runnable = new Runnable() { //익명 내부클래스 : runnable 변수를 만들고 바로 Runnable 인터페이에 대한 runnable 변수를 바로 implementation

        @Override
        public void run() { //runnable 변수를 사용해서 이 메서드를 호출
            System.out.println("Runnable class");
        }
    };
}

public class AnonumousInnerTest {

    public static void main(String[] args) {

        Outer2 out= new Outer2();
        Runnable runner = out.getRunnable(100); //인스턴스를 생성하고 메서드를 부르고 반환값을 MyRunnable에 주면 이 메서드의 할일은 끝이나서, 이 지역변수들은
                                                  //없어지는데, 밑에처럼 run메서드를 뷸러서 지역변수를 다시 사용할 경우가 있으므로, 이 지역변수들을 stack 메모리에 잡아놓으면 안됨.
                                                  //해서 컴파일러가 자동으로 상수화 시켜서 값을 바꿔줄수 없음.
        runner.run();

        out.runnable.run(); //익명 내부 클래스를 통해 호출 가능
    }
}
