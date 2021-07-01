package ch01;

class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() { //이미 object를 상속 받았고, object 클래스 안에 있는 toString 메서드를 재정의 해서 사용
        return title + "," + author; //객체에 대한 정보를 나타낼때 toString을 오버라이딩 해서 많이 사용
    }
}

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("데미안" , "헤르만 헤세");
        System.out.println(book.toString()); //인스턴스 메모리에 대한 가상값이 출력

        String str = new String("test");// toString이 이미 재정의가 되어있기 떄문에 글씨를 출력
        System.out.println(str.toString());

    }
}
