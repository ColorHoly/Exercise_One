import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    JTextField linetf;

    public Window(){
        setBounds(20,21,800,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("GUI");
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        addVidgets(panel);
    }

    void addVidgets(JPanel panel){
        JLabel first = new JLabel();
        JLabel firstlbl = new JLabel("Моя первая надпись!");
firstlbl.setBounds(0,200, 800, 40);
Font lblFont = new Font("Times New Roman", 2, 50);
firstlbl.setHorizontalAlignment(SwingConstants.CENTER);
    firstlbl.setFont(lblFont);
panel.add(firstlbl);


    }
}
