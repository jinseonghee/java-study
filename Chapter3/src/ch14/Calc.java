package ch14;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다. ");
        //smyMethod();
    }

    static int total(int[] arr) {

        int total = 0;
        for(int num : arr) {
            total += num;
        }
        //myStaticMethod();
        return  total;
    }

    /*
    private void myMethod() {//인터페이스 내에서만 사용할 수 있는 메서드(일반 private method), 구현하는 코드에선 재정의 불가능
        System.out.println("myMethod");
    }

    private static void myStaticMethod() { //인스턴스 생성과 상관 없이 호출될 수 있는 private 메서드(static private method)
        System.out.println("myStaticMethod");
    }
     */
}
