import java.awt.event.*;

import javax.swing.*;

public class label {
    
    public static void main(String[] args){
        JFrame frame = new JFrame();

        //Label 
        JLabel label = new JLabel();
       
        
        label.setText("Yazı kısmı");
        label.setBounds(100,50,150,30);

     
      
        JButton btn = new JButton();
        btn.setText("Tıkla");
        btn.setBounds(100,100,100,30);
        btn.addActionListener(new ActionListener() {
                    int c = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
          
            System.out.println("Tıklandı");
            label.setText("Buttona "+c++ +"kez Tıklandı");
        
            }
        });
   

        frame.add(label); //Labeli frame e ekledik
        frame.add(btn); //Buttonu frame e ekledik
        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
