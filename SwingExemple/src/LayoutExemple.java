import javax.swing.*;
import java.awt.*;

public class LayoutExemple {

  public static void main(String argv[]) {

   JFrame f = new JFrame("EXemple1");
   JPanel p1 = new JPanel(new BorderLayout());
  JPanel p2 = new JPanel(new BorderLayout());
  JPanel p3 = new JPanel(new BorderLayout());
  JLabel l1= new JLabel("L1");
  JButton b1 = new JButton("b1");
  JButton b2 = new JButton("b2");
  JButton b3 = new JButton("b3");
  JButton b4 = new JButton("b4");
  JButton b5 = new JButton("b5");
  JButton b6 = new JButton("b6");
  
  
  p1.add(b1, BorderLayout.EAST);
  p1.add(l1, BorderLayout.WEST);
  p1.add(p2, BorderLayout.CENTER);
  
  p2.add(b2, BorderLayout.NORTH);
  p2.add(b3, BorderLayout.SOUTH);
  p2.add(p3, BorderLayout.CENTER);
  
  p3.add(b4, BorderLayout.EAST);
  p3.add(b5, BorderLayout.WEST);
  p3.add(b6, BorderLayout.CENTER);
  f.getContentPane().add(p1, BorderLayout.CENTER);
  f.show();
  
  
  
  }
}