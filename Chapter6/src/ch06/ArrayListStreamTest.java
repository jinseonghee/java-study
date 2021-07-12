package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<>(); //ArrayList, Linkedlist는 List 하위 클래스, List는 추상클래스
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();//collection에 대한 stream을 생성하게 되면 generic type으로 가지고 있는 데이터가 뭔지 적어줘야 된다.
        stream.forEach(s-> System.out.println(s));//collection들은 다 stream으로 호출 가능하다

        // stream은 재사용 불가능해서 재생성 해서 사용해야 한다.
        // 여기서sorted, map filter는 중간연산, forEach 최종연산
        sList.stream().sorted().forEach(s-> System.out.print(s + "\t"));
        System.out.println();
        sList.stream().map(s->s.length()).forEach(n-> System.out.print(n + "\t"));//객체 자체에 대한 operation을 수행 할 때는 map을 사용한다.
        System.out.println();
        sList.stream().filter(s->s.length() >= 5).forEach(s-> System.out.println(s));
   }
}
