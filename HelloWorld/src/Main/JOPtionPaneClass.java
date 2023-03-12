package Main;

import javax.swing.JOptionPane;

public class JOPtionPaneClass {

	public static void main(String[] args) {		
		String name = JOptionPane.showInputDialog("Enter with your name");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter with your age"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter with your heigh"));
		
		JOptionPane.showMessageDialog(null, "Hello "+name+", you have "+age+" years old and have "+height+"cm tall");
	}
}
