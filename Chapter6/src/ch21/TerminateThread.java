package ch21;

import java.io.IOException;

public class TerminateThread extends Thread{

    private boolean flag = false;
    int i;

    public TerminateThread(String name){
        super(name);
    }

    public void run(){

        while(!flag){ //무한루프를 돌릴때 true로 둬도 되지만, 멈출 일도 있기 때문에 flag를 두어 조정을 해도 된다.
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println( getName() + " end" );

    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }


    public static void main(String[] args) throws IOException {

        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");
        TerminateThread threadC = new TerminateThread("C");

        threadA.start();
        threadB.start();
        threadC.start();

        int in;
        while(true){
            in = System.in.read();
            if ( in == 'A'){
                threadA.setFlag(true);
            }else if(in == 'B'){
                threadB.setFlag(true);
            }else if( in == 'C'){
                threadC.setFlag(true);
            }else if( in == 'M'){
                threadA.setFlag(true);
                threadB.setFlag(true);
                threadC.setFlag(true);
                break;
            }else{
                System.out.println("type again");
            }
        }

        System.out.println("main end");

    }
}
