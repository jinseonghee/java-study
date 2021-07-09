package ch02;

@FunctionalInterface
public interface Add { //함수형 인터페이스

    public int add(int x, int y);
    //public int sub(int x, int y); 함수형 인터페이스엔 단 하나의 메서드만 선언
}
