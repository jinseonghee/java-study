package ch20;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[10]; //배열에서 new를 사용하면 초기화가 된다.
        int total = 0;

        for(int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num++;
        }

        for(int num : arr) { //enhanced for(for each문) -> 처음부터 끝까지 순회해서 돌때 사용(0~n-1까지)
            total += num;
        }
        System.out.println(total);
    }
}
