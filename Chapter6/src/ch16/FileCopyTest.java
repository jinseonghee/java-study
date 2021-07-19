package ch16;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {

    public static void main(String[] args) throws IOException {

        long millisecond = 0;

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {

        /*
        try(FileInputStream fis = new FileInputStream("a.zip"); //FileInputStream으로 읽어서 FileOutputStream에 쓸 것.
            FileOutputStream fos = new FileOutputStream("copy.zip")) {
       */
            millisecond = System.currentTimeMillis(); //복사 하기 전 시간

            int i;
            while((i = bis.read()) != -1) { //5메가 짜리 a.zip 파일을 한 바이트씩 읽어서 한 바이트씩 씀.
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond; //현재시간 - 복사하기 전 시간

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + " 소요되었습니다. ");

        //예를 들어 Socket을 사용할 경우
        Socket socket = new Socket();

        //socket.getInputStream()//이렇게 쓰면 바이트 단위로 읽기 떄문에 영어로만 읽기가 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //InputStreamReader로 감싸서 바이트 단위를 문자로 바꾸어
        //읽을 수 있게 만들고, 그걸 BufferReader로 감싸서 좀 더 빠르게 읽기 가능(즉, 기반 스트림(실제 읽고 쓰는 스트림)은 맨 마지막 괄호안에 들어가게 됨. 보조 스트림으로 계속 감싸기 땨문)

        br.read(); //읽어 드림
        br.readLine(); //BufferedReader는 readLine() 함수 제공(new Line까지 읽음(한 줄씩 읽음))
    }
}
