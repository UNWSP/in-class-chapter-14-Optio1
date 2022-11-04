package normal;

import javax.swing.*;

public class JcheckBoxes {
	public static void main(String[] args) {
	JFrame frame =new JFrame();
	JCheckBox checkbox1 = new JCheckBox("Weekend Premium");
	JLabel label1 = new JLabel("Initial Text");
	label1.setText("Resort Price Calculator\n Base Price For A Room Is $200\n Check the options you want.");
	frame.add(label1);
	frame.add(checkbox1);
	frame.setSize(400,500);
	frame.show();
	}
}
