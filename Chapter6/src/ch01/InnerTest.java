package ch01;

class OutClass {

    private int num = 10; //외부 클래스의 인스턴스 변수
    private static int sNum = 20; //static 변수는 인스턴스 변수보다 먼저 생성
    private InClass inClass;

    public OutClass() { // 인스턴스 Inner 클래스 (Outer Class(외부 클래스)가 먼저 생성되고 난 후 생성)
        inClass = new InClass();
    }

        private class InClass { //inner class 가 private으로 선언되지 않으면, 외부에서도 Inner class 생성 가능

        int iNum = 100;

        //static int sInNum = 500; //static 변수는 out class와 상관 없이 생성이 되기 떄문에 인스턴스 inner class는 정젹변수 사용X , 사용하려면 정적 내부 클래스에서 사용 가능

        void inTest() {
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    public void usingClass() {//outer class의 메서드
        inClass.inTest(); // inner class에 대한 메서드를 여기서 불러와서 사용 가능
    }

    static class InStaticClass { //정적 클래스

        int iNum = 100;
        static int sInNum = 200;

        void inTest() { //정적 클래스의 일반 메서드, static 메서드에서 외부 클래스의 인스턴스 변수를 사용할 수 없다.(생성이 안될 수도 있으니까)
            //System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)"); //num이 외부 클래스에 선언된 인스턴스 변수 이기 때문에, 인스턴스 생성과 상관없이 static 안에 이 메서드가 먼저 호출될 수 있으므로 에러
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)"); //본인 인스턴스 변수 사용은 가능
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }

        static void sTest() { //static 클래스의 static 메서드는 static 클래스가 생성되지 않아도 호출 가능(즉, 정적 클래스의 정적 메서드는 외부나 내부나 스태틱 변수만 사용 가능)
           //System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)"); 그렇기 때문에 내부 클래스의 인스턴스 변수를 사용하면 생성 전일 수도 있어서 사용 불가능
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
    }
}

public class InnerTest { //outer 클래스와 InnerTest는 전혀 다른 클래스(외부 클래스)

    public static void main(String[] args) {

        /*
        OutClass outClass = new OutClass(); // 이렇게 생성하면 내부적으로 inner클래스 생성
        outClass.usingClass();

        //Inner class 에 private이 선언되지 않았을 경우 -> Outerclass를 이용해 생성
        OutClass.InClass inner = outClass.new InClass(); //바로 new 해서 사용 못하고 outclass의 new를 해줘야 함.이론적으로 가능하지만 잘 사용X
        inner.inTest();
         */
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //외부 클래스에서 바로 정적 클래스 생성 가능
        sInClass.inTest(); //일반 메서드

        System.out.println();

        OutClass.InStaticClass.sTest(); //클래스 생성과 무관하게 정적 메서드 바로 호출 가능, 스태틱 변수들만 사용 가능

    }
}
