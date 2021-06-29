package ch14;


import ch14.CompleteCalc;

public class CalculatorTest {

    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();//CompleteCalc는 구현이 다 된 클래스이기 때문에 인스턴스화 해서 사용 가능
                                       //CompleteCalc는 Calc 인터페이스를 구현한 클래스이기 때문에 Calc를 타입으로 사용 가능 => 타입상속

        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.description(); //인터페이스에서 default로 구현한 메서드는 다른 클래스들 사이에서 공통으로 사용 가능

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr)); //total메서드는 static으로 선언된 메서드이기 때문에 인터페이스 이름으로 바로 호출해서 쓸 수 있다.
    }
}
