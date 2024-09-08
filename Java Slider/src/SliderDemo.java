import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderDemo implements ChangeListener {
        JFrame frame;
        JPanel panel;
        JLabel label;
        JSlider slider;

    SliderDemo(){

        frame = new JFrame ("Slider demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);




        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10); //gap

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10);

        slider.addChangeListener(this);
        slider.setPaintLabels(true); //label for major gaps

        slider.setFont(new Font("MV Boli", Font.PLAIN,15));
        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("°C = "+ slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN,15));


    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = "+ slider.getValue());
    }
}
