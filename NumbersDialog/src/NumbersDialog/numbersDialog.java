/**
 * 
 */
package NumbersDialog;

/**
 * @author SF137412
 *
 */
import javax.swing.JOptionPane;
public class numbersDialog 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int creditDays = 30;
		JOptionPane.showMessageDialog(null, "" + creditDays);
		JOptionPane.showMessageDialog(null, "Every bill is due in " + creditDays + " days");
	}

}
