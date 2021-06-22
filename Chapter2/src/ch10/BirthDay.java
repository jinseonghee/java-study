package ch10;

public class BirthDay {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showData() {
        if(isValid) { //true 일때
            System.out.println(year + "년 " + month + "월" + day + "일 입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
    public boolean getIsValid() { // valid는 내부 로직에서만 돌고, 값이 false 인지 true 인지만 알면 되는 내부에서만 도는 로직이기 때문에, set 해서 외부로 노출되는게
        return isValid;         //아닌 get method로 읽을 수 있게만 사용 가능 (read-only속성)
    }
}