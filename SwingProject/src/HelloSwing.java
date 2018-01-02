import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class HelloSwing extends JFrame {
	public HelloSwing() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewlabel = new JLabel("Hello Swing");
		lblNewlabel.setFont(new Font("Adobe Garamond Pro", Font.PLAIN, 40));
		getContentPane().add(lblNewlabel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("New button");
		getContentPane().add(btnNewButton_1, BorderLayout.EAST);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubdddddddddddddddddddsdsdsdsdasadadada

	}

}
