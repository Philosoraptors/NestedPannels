
import javax.swing.*;
import java.awt.*;

public class NestedPanels {
 public static void main(String[] args) {
  JFrame frame = new JFrame("nested panels");
  frame.setVisible(true);
  frame.setSize(new Dimension(1000, 1000)); // added by Claude, sets the size of the window when it opens
  
  // create the first panel and a label
  JPanel subPanel_1 = new JPanel();
  JLabel label_1 = new JLabel("Hello");
  subPanel_1.add(label_1);
  subPanel_1.setBackground(Color.blue);
  subPanel_1.setPreferredSize(new Dimension(50, 50)); //added by Claude, sets panel size
  subPanel_1.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.red)); // added by claude, creates a border
  


  JPanel subPanel_2 = new JPanel();
  JLabel label_2 = new JLabel("World");
  subPanel_2.add(label_2);
  subPanel_2.setPreferredSize(new Dimension(100, 100)); // added by Claude
  subPanel_2.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.blue)); // added by Claude
  
  JPanel primary = new JPanel();
  primary.add(subPanel_1);
  primary.add(subPanel_2);

  frame.getContentPane().add(primary);
  
  
 }



}
