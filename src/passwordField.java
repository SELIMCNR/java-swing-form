import java.awt.event.*;

import javax.swing.*;

public class passwordField {
    
    public static void main (String[] args){
        //JPasswordField şifre alanı oluşturmak için kullanılır.
        JFrame frame = new JFrame("Paswword field");
        
        JLabel L1 = new JLabel("Şifre : ");
        L1.setBounds(20,20,100,30);

        //Şifre alanı ekleme ve konumlandırma
        JPasswordField pass = new JPasswordField();
        pass.setBounds(20,50,100,30);
  
        //Button ekleme ve konumlandırma
        JButton btn = new JButton("Gönder");
        btn.setBounds(20,80,100,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String password = new String(pass.getPassword());    
            L1.setText(L1.getText() + password);
            }
        });
        frame.add(pass);
        frame.add(L1);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
