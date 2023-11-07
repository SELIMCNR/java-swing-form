import javax.swing.*;

import java.awt.event.ActionListener;

public class button {
    public static void main(String[] args) {
        //Jbutton
        JFrame frame = new JFrame();

        JButton btn = new JButton();
        btn.setText("Button");
        btn.setBounds(0,0,100,100);
        //Buttona tıklanma olayı çoklu işlemde
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Button Clicked");
                frame.setTitle("buttona tıklandı");
            }
        });
        /*   btn.addActionListener(e -> 
        {
            System.out.println("Tıklandı");
            frame.setTitle("Tıklandı");
        }
        ); */


        frame.add(btn);
        frame.setTitle("Button");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
