import java.io.File;
public class Main {
    public static void main(String[] args) {
    File file =  new File("C:\\Users\\rabiu\\OneDrive\\Desktop\\Secret.txt");
    if(file.exists()){
    System.out.println("That file exists!");
    System.out.println(file.getPath());
        System.out.println(file.isFile());
        //file.delete();
    } else {
        System.out.println("That file doesn't exists");
    }
    }
}