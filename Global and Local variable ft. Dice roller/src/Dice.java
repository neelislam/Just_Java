import java.util.Random;
public class Dice {
    Random random; //global variable
    int number = 0; //global variable
    Dice(){
        random= new Random();

        roll();
    }
    void roll(){
        number =  random.nextInt(6)+1;
        System.out.println(number);
    }
}
