package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output.txt")) { //OutputStream은 파일이 없으면 생성해줌

            fos.write(65);//wrtie()메서드는 1byte씩 출력
            fos.write(66);
            fos.write(67);

        } catch (IOException e) { //write() Exception도 IOException
            System.out.println(e);
        }
        System.out.println("end");
    }
}
