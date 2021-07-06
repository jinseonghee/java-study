package ch07;

public class Point<T,V> { // 한 점에대한 코드

    T x;
    V y;

    Point(T x, V y) {
        this.x = x; //this 뒤에 있는 x는 멤버변수
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
