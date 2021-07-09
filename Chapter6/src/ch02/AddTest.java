package ch02;

public class AddTest {

    public static void main(String[] args) {

        //Add addL = (x, y) -> {return x+y;}; //Add Interface에 addL 변수를 만들어서 매개변수 x,y를 받고 {실행문;}을 실행해라 라는 뜻.
        Add addL = (x, y) ->  x+y; // return 문이 들어가면 {} 생략 안되는데 없으면 실행문만 사용 가능

        System.out.println(addL.add(2,3));
    }
}
