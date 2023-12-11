/*package Graficzne;

import javax.swing.*;
import java.awt.*;

public class okno {
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
        JButton batonik = new JButton();
        batonik.setText("faza");
        panel.add(batonik);
        panel.add(new JButton("przycisk 2"));
        panel.add(new JButton("przycisk 3"));
        JTextArea moje_pole = new JTextArea(null,null,0,0);
        moje_pole.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        ramka.setVisible(true);//okno jest widoczne
        ramka.add(panel); // jest na nim panel
        panel.add(moje_pole); // a na panelu pole tekstowe 
    }
}*/