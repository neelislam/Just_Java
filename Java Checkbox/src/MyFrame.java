import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton btn1 = new JButton();
    JCheckBox ckbx = new JCheckBox();
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        //JButton btn1 = new JButton();
        btn1.setText("Submit");
        btn1.addActionListener(this);


        ckbx.setText("Im not a robot");
        ckbx.setFocusable(false);
        ckbx.setFont(new Font("Consolas",Font.PLAIN,35));



        this.add(btn1);
        this.add(ckbx);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            System.out.println(ckbx.isSelected());
        }
    }
}
