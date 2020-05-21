import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class FenetreStart extends JFrame {
  private JPanel container = new JPanel();
  private JTextField champ1 = new JTextField();
  private JTextField champ2 = new JTextField();
  private JTextField champ3 = new JTextField();	
  private JTextField champ4 = new JTextField();	
  private JLabel label1 = new JLabel("Nom");
  private JLabel label2 = new JLabel("Prenom");
  private JLabel label3 = new JLabel("Date de naissance");
  private JLabel label4 = new JLabel("Mot de passe");
  private JButton b = new JButton ("OK");

  public FenetreStart(utilisateur user){
    this.setTitle("Première connexion");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    b.addActionListener(new BoutonListener());
    JPanel top = new JPanel();
    champ1.setPreferredSize(new Dimension(250, 30));
    top.add(label1);
    top.add(champ1);
    champ2.setPreferredSize(new Dimension(250, 30));
    top.add(label2);
    top.add(champ2);
    champ3.setPreferredSize(new Dimension(250, 30));
    top.add(label3);
    top.add(champ3);
    champ4.setPreferredSize(new Dimension(250, 30));
    top.add(label4);
    top.add(champ4);
    top.add(b);
    this.setContentPane(top);
    this.setVisible(true);            
  }
  class BoutonListener implements ActionListener
  {
	    public void actionPerformed(ActionEvent e) 
	    {
	    	String date = champ3.getText();
	    	DateFormat format = new SimpleDateFormat("dd mm yyyy");
	    	Date date1 = null;
			try {
				date1 = format.parse(date);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	      utilisateur user = new utilisateur(champ1.getText(), champ2.getText(), date1, champ4.getText());
	    }
	  }
}
