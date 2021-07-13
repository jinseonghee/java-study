package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException { //여기서 exception을 핸들링 하지 않고 이 loadClass 메서들르 쓰는 쪽에서 핸들

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className); //class name에 해당 되는 걸 동작으로 로드
        return c;
    }

    public static void main(String[] args) {

        ThrowException test = new ThrowException();

        try {
            test.loadClass("a.txt", "java.lang.Strings");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) { // 어떤 error가 날지 모르는 경우에 Exception을 처리 할 경우 default 처리로 최상위 Exception을 넣어줘도 됨
                                // Exception이 업캐스팅 되어 들어오기 때문에, 이걸 다른 Exception이 명시된 곳 맨 위에 넣어주게 되면 다른 Exception이 실행이
                                //안되므로 맨 밑에 사용해야 한다.
        }
        System.out.println("end");
    }
}
