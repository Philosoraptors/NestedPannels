
import javax.swing.*;
import java.awt.*;

public class NestedPanels {
 public static void main(String[] args) {
  JFrame frame = new JFrame("nested panels");
  frame.setVisible(true);
  
  // create the first panel and a label
  JPanel subPanel_1 = new JPanel();
  JLabel label_1 = new JLabel("Hello");
  subPanel_1.add(label_1);
  subPanel_1.setBackground(Color.blue);

  JPanel subPanel_2 = new JPanel();
  JLabel label_2 = new JLabel("Worls");
 subPanel_2.add(label_2);
  
  JPanel primary = new JPanel();
  primary.add(subPanel_1);
  primary.add(subPanel_2);

  frame.getContentPane().add(primary);
  
  
 }



}
