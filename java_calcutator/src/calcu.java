import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu {
    private JPanel cal;
    private JLabel calculatorLabel;
    private JTextField textField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton button3;
    private JTextField textField2;
    private JButton button1;

    public calcu() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n;
                n = Integer.parseInt(button1.getText());
                System.out.println(n);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calcu");
        frame.setContentPane(new calcu().cal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }
}
