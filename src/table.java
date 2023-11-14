import javax.swing.*;

public class table {
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Table örneği");

        String [][] veri = {
            {"1","Mat","85"},
            {"2","Fen","50"},
            {"e","Tur","100"}
        };

        String [] baslik = {"ID","Ders","Not"};
        JTable jt = new JTable(veri,baslik);
        jt.setBounds(30,40,200,300);

        JScrollPane sp = new JScrollPane(jt); // tabloyu kaydırma çubuğu

        f.add(sp);
    
        f.setSize(500,500);
      
        f.setVisible(true);
    }
}
