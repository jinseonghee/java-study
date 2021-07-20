package ch22;

class Bank {

    private int money = 10000;

    public synchronized void saveMoney(int save) { //동기화가 필요한 메서드에 Synchronize 키워드를 써준다.
        //이 키워드가 있으면, Thread가 synchronize가 걸려있는 메서드를 실행하는 동안 이 메서드가 포함된 객체, 인스턴스에 Lock을 건다.그래서 얘에 대한 다른 메서드들이 접근 못하게 함

        synchronized (this) { //synchronize를 block

            int m = getMoney(); //동기화를 보기위해 돈을 가져옴
            try {
                Thread.sleep(3000);//sleep()은 Thread의 static 메서드
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setMoney(m + save);
        }
    }
    public synchronized void minusMoney(int minus) {

        int m = getMoney(); //동기화를 보기위해 돈을 가져옴
        try {
            Thread.sleep(200);//sleep()은 Thread의 static 메서드
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - minus);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread { //Thread의 run() 메서드 안에도 동기화 할 수 있음.

    public void run() {
        //synchronized (SyncMain.myBank) {
        System.out.println("start save");
        ParkWife.SyncMain.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000) : " + ParkWife.SyncMain.myBank.getMoney()); //입력한 결과

    }
}

class ParkWife extends Thread {

    public void run() {
        //synchronized (SyncMain.myBank) {
        System.out.println("start save");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney()); //입력한 결과
    }

public class SyncMain {

        public static Bank myBank = new Bank(); //Bank가 shared resource가 될거기 때문에 static 으로 선언(Java에서는 shrared resource가 객체이다.)

        public static void main(String[] args) {

            Park p = new Park();
            p.start();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ParkWife pw = new ParkWife();
            pw.start();
        }
    }
}