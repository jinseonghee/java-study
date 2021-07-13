package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) { //BinaryOperator를 implemnets하면 apply를 자동으로 재정의 해줘야 하는데, 이 메서드는 매개값 2개를 계쏙 비교해서 연산
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {

    public static void main(String[] args) {

        String greetings[] = {"안녕하세요~~~", "hello", "Good Morning", "반갑습니다^^"};

        //length 말고 getbytes로 비교
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->
                {if (s1.getBytes().length >= s2.getBytes().length) return s1;
                    else return s2;}//람다식
                ));

        String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //위의 객체를 사용할 것이기 때문에 new를 해주고 get()메서드를 사용해서
        System.out.println(str);//값을 가져오고 String으로 반환

    }
}
