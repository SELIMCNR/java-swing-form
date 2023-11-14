import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class app{

    public static void main(String[] args) {
       //Frame sayfa form 
        JFrame frame = new JFrame();
   
        frame.setTitle("Frame");
        frame.setSize(500,500);
   
        //Panel form içindeki groupBox
        JPanel panel = new JPanel();

        //Button eklendi
        JButton btn = new JButton();
      

        btn.setText("Button");
        panel.add(btn); // panel içine ekleme buttonu
       
       // frame.getContentPane().add(btn); //frame içine ekleme

        frame.add(panel); //Frame ekle paneli
       

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}