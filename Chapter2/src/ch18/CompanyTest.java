package ch18;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance(); //static method를 불러올땐, new가 아닌 클래스 이름으로 참조해서 불러온다.
        Company company2 = Company.getInstance();

        System.out.println(company1); // 유일한 인스턴스 생성 후 하나의 static method 에서 불러오기 때문에 주소값이 같다.
        System.out.println(company2);

        //Calendar calendar = Calendar.getInstance(); 날짜도 유일한 instance 이기때문에 싱글톤 패턴으로 사용
    }
}
