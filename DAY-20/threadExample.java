class SampleThread extends Thread {
    @Override
    public void run(){
        System.out.println("Thread running using Thread class");
    }
}
class SampleThread2 implements Runnable {
    @Override
    public void run() { //Running State
        try {
            System.out.println("Thread running using Runnable interface");
            Thread.sleep(4000); //Blocked/Waiting State
            System.out.println("After 4 seconds");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
public class threadExample {
    public static void main(String[] args) {
        SampleThread t1 = new SampleThread();
        t1.start(); 
        SampleThread2 s=new SampleThread2();
        Thread t2=new Thread(s);
        t2.start();
    }
}