package ch21;

public class JoinTest extends Thread {

    int start;
    int end;
    int total; //멤버변수라 자동 초기화, 지역변수는 초기화 시켜줘야 함.

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {

        int i;
        for(i = start; i <= end; i++) {
            total += i;
        }
    }

    public static void main(String[] args) {

        JoinTest jt1 = new JoinTest(1,50);
        JoinTest jt2 = new JoinTest(51,100);

        jt1.start();
        jt2.start();

        try {
            jt1.join(); //main Thread가 not Runnable로 빠지는데, 얘네가 영원히 못깨어 나고 있으면(=hang) main을 꺠워야 하기 떄문에 Exception 처리(wait,sleep 모두 다 같은 예외처리)
            jt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int lastTotal = jt1.total + jt2.total; //계산하기 전에 Thread가 일이 끝나버려서 Total 값이 제대로 나오지 않아 Join을 걸어줌


        System.out.println("jt1.total = " +jt1.total);
        System.out.println("jt2.total = " +jt2.total);
        System.out.println("lastTotal = " + lastTotal);
    }
}
