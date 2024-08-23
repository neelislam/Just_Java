import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Cash.txt");
            FileWriter writer2 = new FileWriter("Cash2.txt");
            writer2.write("Noakhali Bibhag chai \n Sneha amr jan\n Snehai amr pram");
            writer.close();
            writer2.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}