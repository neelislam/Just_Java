public class Multi extends Thread{
    public void run(){
        System.out.println("I am Thread in Multi class...");

        System.out.println(Thread.currentThread().getName());    }
}
