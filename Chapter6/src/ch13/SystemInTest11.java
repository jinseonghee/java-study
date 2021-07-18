package ch13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest11 {

    public static void main(String[] args) {

        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요. ");

        int i;

        try {
            InputStreamReader irs = new InputStreamReader(System.in); //바이트를 문자로 변환시켜주는 클래스, 모든 바이트단위로 읽는 클래스중 최상위 클래스
            while ((i = irs.read()) != '\n') { //read를 햐서 읽게되면 1 byte를 읽고 read의 반환값인 int를 가져와서 출력
                //System.out.println(i);
                System.out.print((char) i); //Sytem.in은 InputStream으로 1byte씩 밖에 못읽는데, 한글은 2byte씩 묶어야 해서 보조스트림을 사용해야 함.
            }
        } catch (IOException e) { //읽을때 error가 날 경우도 있기 때문에 IOException 을 걸어둠.
            e.printStackTrace();
        }

    }
}
