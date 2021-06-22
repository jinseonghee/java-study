package ch10;

public class BirthDayTest {

    public static void main(String[] args) {

        BirthDay date = new BirthDay();
        //필드에 private 을 선언해 주었기 때문에, setmethod 에서 불러와서 사용 해야 한다. 필드에 private 을 선언하지 않으면 아래처럼 값이 맘대로 바뀌고
        // 디버깅 할때 어디서 오류가 났는지 찾기 어렵다
        date.setYear(2021);
        date.setMonth(12);
        date.setDay(30);

        //date.month = 100; 필드에 private 이라 선언되어 있어 이렇게 사용하지 못함.

        date.showData();
    }
}
