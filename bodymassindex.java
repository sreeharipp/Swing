package ramess;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;

public class bodymassindex {

	private JFrame frame;
	private JTextField height;
	private JTextField wgt;
	private JTextField index;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bodymassindex window = new bodymassindex();
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
	public bodymassindex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.setBounds(100, 100, 480, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(0, 0, 464, 81);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BODY MASS INDEX");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBackground(new Color(144, 238, 144));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 22, 293, 37);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(10, 92, 444, 266);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(222, 5, 0, 0);
		panel_1.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Height(m):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(32, 47, 146, 27);
		panel_1.add(lblNewLabel_1);
		
		JLabel weight = new JLabel("Weight(kg):");
		weight.setFont(new Font("Tahoma", Font.BOLD, 18));
		weight.setBounds(32, 123, 146, 27);
		panel_1.add(weight);
		
		height = new JTextField();
		height.setBounds(213, 47, 171, 26);
		panel_1.add(height);
		height.setColumns(10);
		
		wgt = new JTextField();
		wgt.setBounds(213, 123, 171, 26);
		panel_1.add(wgt);
		wgt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BMI");
		lblNewLabel_2.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(63, 188, 82, 27);
		panel_1.add(lblNewLabel_2);
		
		index = new JTextField();
		index.setBounds(170, 191, 100, 26);
		panel_1.add(index);
		index.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setForeground(new Color(255, 140, 0));
		msg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		msg.setBounds(280, 188, 141, 23);
		panel_1.add(msg);
		
		JButton c1 = new JButton("Calculate");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(height.getText());
				float b=Float.parseFloat(wgt.getText());
				float bmi=(b/(a*a));
				index.setText(Float.toString(bmi));
				if(bmi<18.5)
					msg.setText("Underweight");
				else if((bmi>=18.5)&&(bmi<=24.9))
						msg.setText("Normalweight");
				else if(bmi>24.9&&bmi<=29.9)
				    msg.setText("Overweight");
				else
					msg.setText("Obese");
					
					
			}
		});
		c1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c1.setBounds(104, 239, 118, 27);
		panel_1.add(c1);
		
		JButton c2 = new JButton("Clear");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				height.setText(" ");
				wgt.setText(" ");
				index.setText(" ");
				msg.setText(" ");
			}
		});
		c2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c2.setBounds(264, 239, 82, 27);
		panel_1.add(c2);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		exit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		exit.setBounds(372, 239, 62, 27);
		panel_1.add(exit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(152, 251, 152));
		panel_2.setBounds(10, 369, 444, 113);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBorder(UIManager.getBorder("ProgressBar.border"));
		table.setBackground(new Color(152, 251, 152));
		table.setForeground(new Color(165, 42, 42));
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normalweight", "Overweight", "Obese"},
				{"<18.5", "18.5 to 24.9  ", "25 to  29.9", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(33, 70, 387, 32);
		panel_2.add(table);
	}
}
