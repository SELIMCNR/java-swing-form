import java.awt.event.ActionListener;

import javax.swing.*;

public class textField {

    public static void main(String[] args) {
     
       //JTextField forum elemanı textbox metin alanı oluşturmak için kullanılır.
       JFrame frame = new JFrame("JTextField örnek");
       JLabel l1,l2,l3;
       JTextField t1,t2,t3;
       JButton btn;
       
       //label ekleme ve konumlandırma
       l1 = new JLabel("İlk Sayı : ");
       l1.setBounds(50, 10, 100, 30);

       //textfield ekleme ve konumlandırma
       t1 = new JTextField();
       t1.setBounds(50,40,200,30);


        //label ekleme ve konumlandırma
       l2 = new JLabel("İkinci Sayı : ");
       l2.setBounds(50, 70, 100, 30);

       //textfield ekleme ve konumlandırma
       t2 = new JTextField();
       t2.setBounds(50,100,200,30);

        //label ekleme ve konumlandırma
       l3 = new JLabel("Toplam : ");
       l3.setBounds(50, 130, 100, 30);

       //textfield ekleme ve konumlandırma
       t3 = new JTextField();
       t3.setBounds(50,160,200,30);
       t3.setEditable(false);
       
       //Button ekleme ve konumlandırma
       btn = new JButton("Toplam");
       btn.setBounds(50, 220, 200, 30);

       //Button olayı
       btn.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(java.awt.event.ActionEvent e) {
                int sayi1 = Integer.parseInt(t1.getText());
                int sayi2 = Integer.parseInt(t2.getText());
                int toplam = sayi1 + sayi2;
                t3.setText(String.valueOf(toplam));
              }
       });



       frame.add(l1);
       frame.add(t1);
       frame.add(l2);
       frame.add(t2);
       frame.add(l3);
       frame.add(t3);
       frame.add(btn);

       frame.setSize(400, 400);
       frame.setLayout(null);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}