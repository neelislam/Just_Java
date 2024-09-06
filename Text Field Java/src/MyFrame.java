import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton btn1;
    JTextField textfield; // Changed TextField to JTextField

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btn1 = new JButton("Submit"); // Use class-level btn1
        textfield = new JTextField(); // Use class-level textfield

        textfield.setPreferredSize(new Dimension(250, 40));
        textfield.setFont(new Font("Consolas", Font.PLAIN, 35));
        textfield.setForeground(Color.GREEN);
        textfield.setBackground(Color.BLACK);
        textfield.setCaretColor(Color.WHITE);
        btn1.addActionListener(this);
        //textfield.setText("User name here...");

        this.add(btn1);
        this.add(textfield);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            System.out.println("Welcome " + textfield.getText());
            btn1.setEnabled(false);
            textfield.setEditable(false);
        }
    }
}
