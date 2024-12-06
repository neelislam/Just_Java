//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Multi t1=new Multi();
        t1.start();

        // implement runnable interface
       Multi3 m1 = new Multi3();
       Thread t2 = new Thread(m1);
        t2.start();



    //Sleep Method in Java
        System.out.println("I");
        Thread.sleep(900);
        System.out.println("Love");
        Thread.sleep(1100);
        System.out.println("Your Skirt!");

        // Ypu cant call a thread twice
        //t1.start();
        //t1.start(); //this will show error

        //run
        t1.run(); // works like start?
        // join
        JointMethod j1 = new JointMethod();
        System.out.println("Name of j1:"+j1.getName());

        j1.start();

        j1.setName("Ami Dhuika gesi Join er moddhe!");
        System.out.println("Name of j1 after changing name:"+j1.getName());


    }
}