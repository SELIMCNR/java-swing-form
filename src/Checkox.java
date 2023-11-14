import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ItemListener;

public class Checkox {
    public static void main(String[] args) {
        //Jcheckbox

        JFrame frame = new JFrame("JCheckbox");
      

        JLabel lb = new JLabel();
        lb.setBounds(100, 50, 300, 50);
        JCheckBox ch1 = new JCheckBox("Evet");
        JCheckBox ch2 = new JCheckBox("Hayır");
       
        ch1.setBounds(100, 100, 250, 50);
        ch2.setBounds(100, 150, 250, 50);
        /* 
        JButton btn = new JButton("Kontrol");
        btn.setBounds(150, 200, 100, 30);
        btn.addActionListener(e -> {
            if(ch1.isSelected()){
                System.out.println("Evet seçildi");
            }
            if(ch2.isSelected()){
                System.out.println("Hayır seçildi");
            } 
        });   // frame.add(btn);
        */
        /* 
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                if(ch1.isSelected()){
                    lb.setText("Evet seçildi");
                }
                else{
                    lb.setText("Evet seçilmedi");
                }
            }
        });*/

        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                lb.setText("Kontrol edildi"+(e.getStateChange()==1?"Evet seçildi":"Evet seçilmedi"));
              
            }
        });
       
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                lb.setText("Kontrol edildi"+(e.getStateChange()==1?"Hayır seçildi":"Hayır seçilmedi"));
                
            }
        });


        frame.add(lb);
        frame.add(ch1);
        frame.add(ch2);
    
      
        frame.setBackground(Color.BLUE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
