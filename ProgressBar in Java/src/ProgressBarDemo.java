import java.awt.*;
import javax.swing.*;


public class ProgressBarDemo {
    JFrame  frame = new JFrame();
    //JProgressBar bar = new JProgressBar(); //for increase/ fill
    JProgressBar bar = new JProgressBar(0,100); //for decrease /minimum 0, maximum 100
    ProgressBarDemo(){
        bar.setValue(0);   //set
        bar.setBounds(0,0,420,50);     //x,y,width,height
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.PINK);
        bar.setBackground(Color.BLACK);
        bar.setStringPainted(true); //add percentage in bar

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


        //fill
        //fill();

        //empty
        empty();

    }
/*
    public void fill(){
        int counter = 0;
        while(counter<=100){
            bar.setValue(counter);
            try{
            Thread.sleep(50);}
            catch (InterruptedException e){
                e.printStackTrace();
            }// pause program for ** sec after each round
            counter +=1;
        }
        bar.setString("I Love You Sneha <3");
    }
*/
    public void empty(){
        int counter = 100;
        while(counter>0){
            bar.setValue(counter);
            try{
                Thread.sleep(50);}
            catch (InterruptedException e){
                e.printStackTrace();
            }// pause program for ** sec after each round
            counter -=1;
        }
        bar.setString("Me without your kisses! :(  ");
    }


}
