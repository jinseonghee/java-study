package ch18;

public class Company {

    private static Company instance = new Company(); //유일한 instance 생성

    private Company() { //싱글톤패턴은 외부에서 생성자를 만들 수 없게 해야 하기 때문에 private으로 만듬. 이렇게 만들지 않으면 default 로 자동 생성자가
                        // 만들어 질때 public 으로 선언되기 때문에
    }

    public static Company getInstance() { //위에 선언한 instance를 외부에서 접근 가능하게 만들기 위해 method 생성. 외부에서 class를 통해 바로 접근 가능하게
        if (instance == null) {           //하기 위해 static 선언
            instance = new Company();     //즉, 유일한 instance를 private으로 선언 후 생성자도 private으로 만든 후, 유일하게 접근 가능한 method 하나만을
        }                                 //만들고 그 method를 통해서만 불러오는 방식 = 싱글톤 패턴
        return instance;
    }
}
