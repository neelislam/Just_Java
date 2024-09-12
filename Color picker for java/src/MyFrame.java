import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JButton btn;
    JLabel lbl;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btn = new JButton("Pick a color");
        btn.addActionListener(this);



        lbl = new JLabel();

        lbl.setBackground(Color.white);
        lbl.setOpaque(true);
        lbl.setText("This is some text");
        lbl.setFont(new Font("MV Boli", Font .PLAIN,100));

        this.add(btn);
        this.add(lbl);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            JColorChooser  colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick a color",Color.BLACK);


        //lbl.setBackground(color);
        lbl.setForeground(color);}

    }
}
