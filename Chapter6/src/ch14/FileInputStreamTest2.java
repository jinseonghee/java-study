package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

    public static void main(String[] args) {

        int i;

        try(FileInputStream fis = new FileInputStream("input.txt")) { //try()안 리소스를 넣으면 close()를 사용하지 않아도 자동으로 close됨.
            //FileInputStream byte 단위로 읽기 떄문에 문자는 핸들링이 되지 않아서 FileReader를 사용하거나, inputStreamReader를 감싸서 사용.

            while ((i = fis.read()) != -1) {//read() 메서드는 다 읽으면 -1을 return 하기 떄문에 -1은 end of file을 뜻함.
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
