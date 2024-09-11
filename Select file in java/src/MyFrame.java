import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton btn;
    MyFrame(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        btn = new JButton("Select File");
        btn.addActionListener(this);


        this.add(btn);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
        JFileChooser fileChooser =  new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));

        System.out.println(fileChooser.showOpenDialog(null)); //select file to open
        //int response = fileChooser.showOpenDialog(null); //select file to open
        int response = fileChooser.showSaveDialog(null); //select file to save

        if(response == JFileChooser.APPROVE_OPTION){
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(file); //to get the file path
        }

        }
    }
}
