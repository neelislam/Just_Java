import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String pin= "Neel69";                //catch the password here
        byte[] bytes = pin.getBytes(StandardCharsets.US_ASCII);
        List<Integer> result = new ArrayList<>();
        for (byte aByte : bytes){
            int ascii = (int) aByte;
            result.add(ascii);
        } //System.out.println(result.toString());
        System.out.println("Hello and welcome!");
        long len = pin.length();
        int size_of_pass=0;
        for (int i = 0; i < len; ++i) {
            //System.out.println(bytes[i]);
            size_of_pass++;
        } System.out.println("Size of Pass: " + size_of_pass);
        //System.out.println(result.toString());
        System.out.print("Password is>>> ");
        for(int i = 0; i<size_of_pass; i++){
            for(int j= 0;j<999;j++)
            if( j == result.get(i)){
                //System.out.println("Matching: " +j);
                int ascii = j;
                char aChar2 = (char) ascii;
                System.out.print(aChar2);
            }
        }
    }
}