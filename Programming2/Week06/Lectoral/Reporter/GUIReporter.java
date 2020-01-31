import javax.swing.JOptionPane;

public class GUIReporter implements Reporter
{
	public void reporter(String msg)
	{
		JOptionPane.showMessageDialog(null,msg,
				        "Reporter", JOptionPane.INFORMATION_MESSAGE);
	}
}	