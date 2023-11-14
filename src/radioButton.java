import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class radioButton {
    
    public static void main(String[] args) {
      
        JFrame f = new JFrame("JRadioButton");
        JLabel lb = new JLabel("Seçilen : ");
        lb.setBounds(100, 5, 300, 50);
        lb.setFont(new Font("Arial",Font.BOLD,35));
        JRadioButton r1 = new JRadioButton("Kadın");
        r1.setBounds(100, 50, 100, 30);
        r1.setActionCommand("K");

        JRadioButton r2 = new JRadioButton("Erkek",true);
        r2.setBounds(100,100,100,30);
        r2.setActionCommand("E");

        JRadioButton r3 = new JRadioButton("Diğer");
        r3.setBounds(100,150,100,30);
        r3.setActionCommand("D");

        //Radio butonlarını gruplamak için ButtonGroup sınıfı kullanılır.
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        
        JButton btn = new JButton("Gönder");
        btn.setBounds(100,200,100,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(r1.isSelected())
                {
                    System.out.println("Kadın seçildi");
                     f.getContentPane().setBackground(java.awt.Color.BLUE);
                }
                if(r2.isSelected())
                {
                     f.getContentPane().setBackground(java.awt.Color.LIGHT_GRAY);
                    System.out.println("Erkek seçildi");
                }
                if(r3.isSelected())
                {
                     f.getContentPane().setBackground(java.awt.Color.yellow);
                    System.out.println("Diğer seçildi");
                }

                System.out.println(bg.getSelection().getActionCommand());
                lb.setText("Seçilen: "+bg.getSelection().getActionCommand());
            }
        });

        //JRadioButton seçili olması için setSelected() metodu kullanılır.



        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(btn);
        f.add(lb);
        f.setSize(700,700);
        f.setLayout(null);
        f.getContentPane().setBackground(java.awt.Color.ORANGE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
