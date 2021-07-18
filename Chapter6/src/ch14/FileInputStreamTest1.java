package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");//어떤 File을 읽어드릴때 사용, constructor()안엔 파일 class를 직접 넣거나 String으로 이름을 직접 넣음
            System.out.println((char)fis.read());// read 메서드는 파일에서 더 읽을 게 없을 때 -1이 return 되기 때문에 반환값이 int이다.
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());

        } catch (IOException e) { //IOException은 FileNotFoundException의 상위 Exception이기 떄문에 IOException만 써줘도 호환 된다.
            e.printStackTrace();
            /* finally를 넣어서 이 부분은 필요 없음(Exception에서 close 안해도 finally에서 close를 해주어서)
            try {
                fis.close(); //null이면 close()가 안되기 때문에 Exception을 또 걸음.
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (Exception e2) {//fis가 null일 경우의 Exception을 하나 더 걸음
                System.out.println(e2);
            }*/
        } finally {
            try {
                fis.close();
            } catch (IOException e2) { //close 할때 error가 날 수 있어서 Exception 걸음.
                e2.printStackTrace();
            } catch (Exception e2){
                System.out.println(e2);
            }
        }
        System.out.println("end");
    }
}
