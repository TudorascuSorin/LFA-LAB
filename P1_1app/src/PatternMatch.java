import java.awt.EventQueue;
import java.lang.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JTextField;
import java.util.regex.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PatternMatch {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	String pattern;
	String input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatternMatch window = new PatternMatch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatternMatch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Pattern");
		lblNewLabel.setBounds(42, 27, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Input");
		lblNewLabel_1.setBounds(42, 80, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField(100);
		textField.setBounds(176, 24, 199, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(100);
		textField_1.setBounds(176, 77, 199, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Verify");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pattern=textField.getText();
				input=textField_1.getText();
				try {
				Pattern p=Pattern.compile(pattern);
				
				boolean found = p.matcher(input).lookingAt();
				if(found)
					JOptionPane.showMessageDialog(null, "Pattern Match");
				else
					JOptionPane.showMessageDialog(null, "Pattern NOT Match");
				
				} catch(PatternSyntaxException pse){
					JOptionPane.showMessageDialog(null,"There is a problem" +
                            " with the regular expression!"+pse);
				}
				
					
			}
		});
		btnNewButton.setBounds(176, 192, 85, 21);
		frame.getContentPane().add(btnNewButton);
			
	}
}
