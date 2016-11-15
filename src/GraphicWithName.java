/* GraphicWithName.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   11/14/2016
*/

import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class GraphicWithName
	{
	public static void main(String[] args)
		{
		JLabel label = new JLabel("My label");
		
		label.setText("<html>This is a<br>multiline label!<br> Try it yourself!</html>");
		JOptionPane.showMessageDialog(null, "Kenton Duprey","Name", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, label, "Title of Box", JOptionPane.ERROR_MESSAGE);
		
		
		}// end main method
	
	}