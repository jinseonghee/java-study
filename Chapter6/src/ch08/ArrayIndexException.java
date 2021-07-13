package ch08;

public class ArrayIndexException {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) { //e는 변수 같은 개념으로 Exception이 나면 e에 넣어준다는 개념
            System.out.println(e.getMessage());
            System.out.println(e.toString()); //Exception에 toString메서드는 exception : 메시지 출력
        }
        System.out.println("here!!! "); //try, catch 문을 써서 에러문이지만 비정상 종료는 안되고 그 밑에 출력문이 출력 됨.
    }
}
