import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class converter {

	private JFrame frame;
	private JTextField degree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter window = new converter();
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
	public converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 820, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperture(K)");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(92, 130, 169, 26);
		frame.getContentPane().add(lblNewLabel);
		JLabel value = new JLabel("");
		value.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		value.setBounds(218, 275, 245, 37);
		frame.getContentPane().add(value);
		
		degree = new JTextField();
		degree.setBounds(351, 130, 216, 26);
		frame.getContentPane().add(degree);
		degree.setColumns(10);
		
		JButton convert = new JButton("To degree");
		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=degree.getText();
				float f=Float.parseFloat(s);
				float k=(float)(f-273);
				String st=Float.toString(k);
				value.setText(st+"C");
				
				}
		});
		convert.setBounds(135, 371, 142, 48);
		frame.getContentPane().add(convert);
		
		JButton cf = new JButton("To farenhet");
		cf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String fg=degree.getText();
			Float l=Float.parseFloat(fg);
			Float m=(float)((l*1.8)-459.67);
			String gh=Float.toString(m);
			value.setText(gh+"F");
			}
			
		});
		cf.setBounds(432, 371, 135, 45);
		frame.getContentPane().add(cf);
		
		
	}

}
