import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\rabiu\\OneDrive\\Desktop\\My_pic (1).jpg");

        // Resize the image
        Image scaledImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon resizedImage = new ImageIcon(scaledImage);




        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label =  new JLabel();
        label.setText("Bro We need to code!!"); //set text of label
        label.setIcon(resizedImage);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(100);
        label.setBackground(Color.BLACK);
        label.setOpaque(true); //to display background color
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER); //set position of icon

        //label.setBounds(0,0,250,250);
        //frame.setLayout(null); //to hide all
        label.setBorder(border);










        JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(200,200);

         frame.setVisible(true);
         frame.add(label);
        frame.pack();
    }
}