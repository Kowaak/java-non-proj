package Graficzne;
import javax.swing.*;
import java.awt.*;
public class kalk {
    public static void main(String[] args) {
        JFrame ramka = new JFrame();
        ramka.setSize(500, 450); // rozmiar okna
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(820,500));
        panel.add(Box.createRigidArea(new Dimension(820,3)));




        ramka.setVisible(true);
        ramka.add(panel);
    }
}