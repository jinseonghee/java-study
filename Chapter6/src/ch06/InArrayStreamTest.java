package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InArrayStreamTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for(int num : arr) {
            System.out.println(num);
        }
        /*
        //모든 array는 java.util 패키지에 있는 Arrays클래스 사용 가능
        Arrays.stream(arr).forEach(n -> System.out.println(n)); //스트림 생성 후, 스트림의 메서드 forEach() 연산자를 사용하여 하나씩 요소를 꺼냄.(괄호안엔 수행할 연산자 넣어줌(람다식))
        //여기서 n은 arr의 각 요소 1,2,3,4,5를 가리킴
        */

        System.out.println();
        IntStream ir = Arrays.stream(arr); //Arrays.Stream은 IntStream을 반환
        ir.forEach(n -> System.out.println(n));

        //stream을 한번 사용하고 연산이 끝나고, 다시 다른 연산에 stream을 사용할 경우 다시 스트림을 생성 해야 한다.
        int sum = Arrays.stream(arr).sum(); //Stream의 sum() 메서드는 int 반환
        System.out.println(sum);
    }
}
