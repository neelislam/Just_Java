import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.QUESTION_MESSAGE);
        //while(true) JOptionPane.showMessageDialog(null, "VIRUS DETECTED!", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.ERROR_MESSAGE);

        //System.out.println(JOptionPane.showConfirmDialog(null,"Bro do you even code?", "Sup kid!", JOptionPane.YES_NO_CANCEL_OPTION));



        //int ans =JOptionPane.showConfirmDialog(null,"Bro do you even code?", "Sup kid!", JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog
                ("What is your name? ");
        System.out.println("Hello "+name);
        String[] response = {"No, You are awesome!", "Thank you", "Blush!"};
        JOptionPane.showOptionDialog(null, "You are awseome!", "Select message",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, response,
                0);

    }
}