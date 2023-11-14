import javax.swing.*;
import java.awt.event.*;

public class comboBox {
    
    public static void main(String[] args) {
        // JComboBox sınıfı ile ComboBox oluşturulur.

        JFrame f = new JFrame("JComboBox");

        JLabel l = new JLabel("Programlama dilleri : ");
        l.setBounds(50,50,200,20);

        String arr[] ={"C" ,"C++","C#","Java","Python","Kotlin"};
        JComboBox cb = new JComboBox(arr); //Comboboxa arr dizi elemanları eklendi.
        cb.setBounds(50,100,90,20);

        JButton btn = new JButton("Seç");
        btn.setBounds(50,150,80,20);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                //String dt = "Seçilen programlama dili : "+cb.getSelectedItem(); //Seçilen elemanı alır.
                String dt = "Seçilen programlama dili : "+cb.getItemAt(cb.getSelectedIndex()); //Seçilen elemanın indexini alır. ItemAt ile indexe göre elemanı alır.
                System.out.println(dt);
                l.setText(dt);
            }
        });

        f.add(l);
        f.add(cb);
        f.add(btn);
        f.setSize(500,500);
        f.setLayout(null);
        f.getContentPane().setBackground(java.awt.Color.ORANGE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
