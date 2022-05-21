import java.io.*;
import java.lang.String.*;

class TestPrint extends Thread {
    String msg = "";
    int n;

    TestPrint(String msg, int n) {
        this.msg = msg;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(msg + " " + i + " times");
        }
    }
}
public class CovidLockdown {
    public static void main(String[] args){
        //int n = Integer.parseInt(args[0]);

        TestPrint t1=new TestPrint("Covid19",10);
        t1.start();
        TestPrint t2=new TestPrint("Lockdown2020",20);
        t2.start();
        TestPrint t3 = new TestPrint("Vaccination2021",30);
        t3.start();
    }
}
