package ramess;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application {

	private JFrame frame;
	private JTextField user;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 687, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(59, 48, 149, 21);
		frame.getContentPane().add(lblNewLabel);
		
		user = new JTextField();
		user.setBounds(242, 40, 261, 32);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(59, 171, 149, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		pass = new JPasswordField();
		pass.setBounds(242, 163, 261, 32);
		frame.getContentPane().add(pass);
		JLabel msg = new JLabel("");
		msg.setBounds(123, 357, 302, 27);
		frame.getContentPane().add(msg);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String str=user.getText();
			String str1=pass.getText();
			if(str.equals("Sreehari")&&str1.equals("hari"))
				msg.setText("LOG IN SUCCESSFUL");
			else
				msg.setText("LOG IN UNSUCCESSFUL");
			}
		});
		btnNewButton.setBounds(242, 285, 128, 32);
		frame.getContentPane().add(btnNewButton);
		
		
	
		
	}
}
