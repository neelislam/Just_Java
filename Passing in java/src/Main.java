//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Garage garage =  new Garage();
        Car car = new Car("BMW");
        Car car2 =  new Car("Tesla");
        garage.park(car);
        garage.park(car2);


        }

}