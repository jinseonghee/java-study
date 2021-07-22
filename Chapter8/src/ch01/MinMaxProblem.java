package ch01;

public class MinMaxProblem {

    public static void main(String[] args) {

        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0]; //numbers에 어떤 값이 있는지 모른다고 가정을 하면, 이 안에서 찾는 것이기 떄문에 값을 임의로 지정하는 것보다 0번째로 하는게 낫다
        int max = numbers[0];
        int minPos = 0;
        int maxPos = 0;

        for (int i = 1; i < numbers.length; i++) {//index 지정(0번쨰 껀 min, max로 값을 지정을 해줘 1번째 부터 돌려야 함)

            if (min > numbers[i]) {
                min = numbers[i];
                minPos = i+1; //보통 index0번째를 1번째라고 말하기 때문에
            }

            if (max < numbers[i]) {
                max = numbers[i];
                maxPos = i+1;
            }
        }
        System.out.println("가장 큰 값은 " + max + " 이고, 위치는 " + maxPos + "번째 입니다." );
        System.out.println("가장 작은 값은 " + min + " 이고, 위치는 " + minPos + "번째 입니다." );
    }
}
