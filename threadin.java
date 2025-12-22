class CollegeThread extends Thread{
    public void run(){
        try {
            while(true){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread error");
        }
    }
}

class CSEThread extends Thread{
    public void run(){
        try {
            while(true){
                System.out.println("CSE");
                Thread.sleep(2000);

            }
        } catch (InterruptedException e) {
            System.out.println("Thread error");
        }
    }
}

public class threadin{
    public static void main(String args[]){
        CollegeThread cl = new CollegeThread();
        CSEThread cs = new CSEThread();
        cl.start();
        cs.start();
    }
}