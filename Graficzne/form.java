package Graficzne;

import javax.swing.*;
import java.awt.*;

public class form {
    public static void main(String[] args) {
        //----------------------UTWORZENIE OKNA --------------------------
        JFrame ramka = new JFrame();
        ramka.setSize(900, 600); // rozmiar okna
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        //-------------------------KOLOR I PANEL ---------------------------
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(600,500));
        //--------------------------PRZYCISKI-----------------------------
        //panel.add(new ImageIcon("/logo.png"));
        JTextArea moje_pole = new JTextArea(null,null,1,30);
        JTextArea moje_pole2 = new JTextArea(null,null,1,30);
        panel.add(new JLabel("Imie: \r\n"));
        moje_pole.setText("");
        panel.add(moje_pole);
        panel.add(new JLabel("Nazwisko: \r\n"));
        moje_pole2.setText("");
        panel.add(moje_pole2);
        panel.add(new JRadioButton("F"));
        panel.add(new JRadioButton("M"));
        panel.add(new JButton("Wyslij"));

        ramka.setVisible(true); //okno jest widoczne
        ramka.add(panel); //i dodaje do niego panel
    }
}