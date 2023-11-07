import java.awt.event.ActionListener;

import javax.swing.*;
public class textArea {
    public static void main(String[] args) {
        //JTextArea yorum alanı metin alanı oluşturmak için kullanılır.
        JFrame frame = new JFrame("JTextArea örnek");
        JLabel l1,l2;
        JTextArea area;
        JButton btn;

        //label ekleme ve konumlandırma
        l1 = new JLabel("Kelime sayısı : ");
        l1.setBounds(75, 25, 140, 30);

        l2 = new JLabel("Karakter sayısı: ");
        l2.setBounds(190, 25, 140, 30);

        //Yorum alanı ekleme ve konumlandırma
        area = new JTextArea();
        area.setBounds(20,75,250,200);

        //Button ekleme ve konumlandırma
        btn = new JButton("Hesapla");
        btn.setBounds(100,300,120,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
              String text = area.getText();
              String words[] = text.split("\\s");
                l1.setText("Kelime Sayısı : " + words.length);
                l2.setText("Karakter Sayısı : " + text.length());
            }
        });

        frame.add(l1);
        frame.add(l2);
        frame.add(btn);
        frame.add(area);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
