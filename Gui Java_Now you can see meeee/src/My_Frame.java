import javax.swing.*;
import java.awt.*;

public class My_Frame extends JFrame{
    My_Frame(){

        this.setTitle("JFrame title here!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false); //prevent frame from being resized
        this.setSize(200,200); //sets the x and y dimension
        this.setVisible(true);
        ImageIcon image = new ImageIcon("C:\\Users\\rabiu\\OneDrive\\Desktop\\funny cat.jpeg"); //create an image icon
        this.setIconImage(image.getImage());//change icon of frame


        //background color change
        // frame.getContentPane().setBackground(Color.BLUE);
        this.getContentPane().setBackground(new Color(123, 50, 250)); //for rgb

    }
}
