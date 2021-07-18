package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    public static void main(String[] args) {

        int i;

        try(FileInputStream fis = new FileInputStream("input2.txt")) {

            byte[] bs = new byte[10];

            while ((i = fis.read(bs, 1, 9)) != -1) { //buffer의 offset을 0부터가 아니라 1부터 읽고 바이트를 9개만 읽음.
            //while ((i = fis.read(bs)) != -1) { //i는 읽은 자료의 수를 가리킴(byte를 가리킴)

                for(int j = 0; j < i; j++ ) { //읽은 개수만큼만 출력
             //for(int ch : bs) { 이렇게 사용하면, 배열 10개가 출력되고 남은 자리에 버퍼에 남아있는 값이 다 출력이 됨.
                 System.out.print((char) bs[j]);
             }
                System.out.println(" : " + i + "바이트 읽음");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
