import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzabtn = new JRadioButton("Pizza");
    JRadioButton hamburgerbtn = new JRadioButton("Hamburger");
    JRadioButton hotdogbtn = new JRadioButton("HotDog");

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());



        ButtonGroup group = new ButtonGroup(); //to select any of them
        group.add(pizzabtn);
        group.add(hamburgerbtn);
        group.add(hotdogbtn);

        pizzabtn.addActionListener(this);
        hamburgerbtn.addActionListener(this);
        hotdogbtn.addActionListener(this);

        this.add(pizzabtn);
        this.add(hamburgerbtn);
        this.add(hotdogbtn);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==pizzabtn){
    System.out.println("You will get pizza!");
} else if (e.getSource()==hamburgerbtn){
    System.out.println("You will get hamburger!");
} else if(e.getSource()==hotdogbtn) {
    System.out.println("You will get Hot dog!");
} else {
    System.out.println("Please select something!");
}
    }
}
