//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Car myCar = new Car();
    Car mycar2 = new Car(); //blueprint



    System.out.println(myCar.model);
    System.out.println(myCar.make);
    System.out.println(myCar.price);


    System.out.println(mycar2.price);

    myCar.drive();
    myCar.brake();
    }
}