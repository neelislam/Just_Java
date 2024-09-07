import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
JComboBox cmbox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals= {"Dog", "Cat", "Bird"};
        cmbox = new JComboBox(animals);
        cmbox.addActionListener(this);

        //System.out.println(cmbox.getItemCount());
        //cmbox.addItem("horse");
        //cmbox.removeItem("Cat");
        //cmbox.removeItemAt("0"); //remove from index


        this.add(cmbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmbox){
           // System.out.println(cmbox.getSelectedItem());
            System.out.println(cmbox.getSelectedIndex());
        }
    }
}
