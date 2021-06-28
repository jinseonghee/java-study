package ch11;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();//CompleteCalc는 구현이 다 된 클래스이기 때문에 인스턴스화 해서 사용 가능
                                       //CompleteCalc는 Calc 인터페이스를 구현한 클래스이기 때문에 Calc를 타입으로 사용 가능 => 타입상속

        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
    }
}
