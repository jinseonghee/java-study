package ch07;

public class GenericMethod {

    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {//써야 하는 매개변수(T,V), 반환형(double), 메서드 이름(받는 애(두 점))

        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double top = ((Number) p1.getY()).doubleValue();
        double bottom = ((Number) p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {

        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0); // 두 점 선언
        Point<Integer, Double> p2 = new Point<>(10, 10.0);// <>안써도 된다.

        double size = GenericMethod.<Integer, Double>makeRectangle(p1,p2);
        System.out.println(size);
    }
}
