package ramess;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class progresscard {

	private JFrame frmStudentReport;
	private JTable table;
	private JTextField id;
	private JTextField first;
	private JTextField sur;
	private JTextField total;
	private JTextField avg;
	private JTextField rank;
	private JTextField maths;
	private JTextField english;
	private JTextField biology;
	private JTextField computer;
	private JTextField chemistry;
	private JTextField physics;
	private JTextField tamil;
	private JTextField malayalam;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progresscard window = new progresscard();
					window.frmStudentReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progresscard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentReport = new JFrame();
		frmStudentReport.getContentPane().setBackground(Color.BLUE);
		frmStudentReport.setTitle("Student Report");
		frmStudentReport.setBounds(100, 100, 973, 565);
		frmStudentReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentReport.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Student Detail", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 387, 329);
		frmStudentReport.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student_Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 31, 104, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 66, 104, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Surname");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 100, 104, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CourseCode");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 136, 104, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Score");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 227, 104, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Average");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 261, 104, 23);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ranking");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(10, 295, 104, 23);
		panel.add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 196, 104, 2);
		panel.add(separator);
		
		id = new JTextField();
		id.setBounds(113, 35, 98, 20);
		panel.add(id);
		id.setColumns(10);
		
		first = new JTextField();
		first.setBounds(113, 65, 98, 23);
		panel.add(first);
		first.setColumns(10);
		
		sur = new JTextField();
		sur.setBounds(113, 100, 98, 20);
		panel.add(sur);
		sur.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1102001", "1102003", "1102004"}));
		comboBox.setBounds(113, 140, 98, 20);
		panel.add(comboBox);
		
		total = new JTextField();
		total.setBounds(113, 231, 98, 20);
		panel.add(total);
		total.setColumns(10);
		
		avg = new JTextField();
		avg.setBounds(113, 265, 98, 20);
		panel.add(avg);
		avg.setColumns(10);
		
		rank = new JTextField();
		rank.setBounds(113, 299, 98, 20);
		panel.add(rank);
		rank.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Maths");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(221, 31, 67, 23);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("English");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(221, 66, 58, 23);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Biology");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(221, 110, 58, 23);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Computer");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(219, 148, 83, 23);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Chemistry");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(221, 182, 81, 19);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Physics");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(221, 217, 81, 20);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Tamil");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(221, 248, 83, 23);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Malayalam");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(218, 295, 84, 23);
		panel.add(lblNewLabel_14);
		
		maths = new JTextField();
		maths.setBounds(317, 35, 67, 20);
		panel.add(maths);
		maths.setColumns(10);
		
		english = new JTextField();
		english.setBounds(317, 70, 67, 20);
		panel.add(english);
		english.setColumns(10);
		
		biology = new JTextField();
		biology.setBounds(317, 114, 67, 20);
		panel.add(biology);
		biology.setColumns(10);
		
		computer = new JTextField();
		computer.setBounds(317, 152, 67, 20);
		panel.add(computer);
		computer.setColumns(10);
		
		chemistry = new JTextField();
		chemistry.setBounds(312, 182, 72, 20);
		panel.add(chemistry);
		chemistry.setColumns(10);
		
		physics = new JTextField();
		physics.setBounds(312, 220, 72, 20);
		panel.add(physics);
		physics.setColumns(10);
		
		tamil = new JTextField();
		tamil.setBounds(312, 252, 72, 20);
		panel.add(tamil);
		tamil.setColumns(10);
		
		malayalam = new JTextField();
		malayalam.setBounds(312, 299, 72, 20);
		panel.add(malayalam);
		malayalam.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_name", "Maths", "English", "Biology", "Computter", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 372, 937, 105);
		frmStudentReport.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(21, 394, 910, 52);
		frmStudentReport.getContentPane().add(table_1);
		
		JButton add = new JButton("Add Report");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s[]=new double[13];
				s[0]=Double.parseDouble(maths.getText());
				s[1]=Double.parseDouble(english.getText());
				s[2]=Double.parseDouble(biology.getText());
				s[3]=Double.parseDouble(computer.getText());
				s[4]=Double.parseDouble(chemistry.getText());
				s[5]=Double.parseDouble(physics.getText());
				s[6]=Double.parseDouble(tamil.getText());
				s[7]=Double.parseDouble(malayalam.getText());
				s[8]=s[0]+s[1]+s[2]+s[3]+s[4]+s[5]+s[6]+s[7];
				total.setText(Double.toString(s[8]));
				s[9]=s[8]/8;
				avg.setText(Double.toString(s[9]));
				if(s[8]>700)
					rank.setText("1");
				if(s[8]>600)
					rank.setText("2");
				else if(s[8]>500)
					rank.setText("3");
				else if(s[8]>400)
					rank.setText("4");
				else
					rank.setText("fail");
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new String[]{
						id.getText(),
						(String)comboBox.getSelectedItem(),
						maths.getText(),
						english.getText(),
						computer.getText(),
						chemistry.getText(),
						physics.getText(),
						tamil.getText(),
						malayalam.getText(),
						total.getText(),
						avg.getText(),
						rank.getText()
						
				});
				
			}
		});
		add.setBounds(116, 488, 89, 23);
		frmStudentReport.getContentPane().add(add);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1)
				{
				if(table.getRowCount()==0)
				{
				JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
				JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
				model.removeRow(table.getSelectedRow());
				}

			}
		});
		delete.setBounds(237, 488, 89, 23);
		frmStudentReport.getContentPane().add(delete);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(407, 11, 540, 316);
		frmStudentReport.getContentPane().add(textArea);
		JButton show = new JButton("Show Report");
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
						+ "Student Name :\t\t"+first.getText()+" "+sur.getText()+"\n"
						+ "======================================\n"
						+ "Math:\t\t" + maths.getText()
						+ "\nEnglish:\t\t" + english.getText()
						+ "\nBiology:\t\t" + biology.getText()
						+ "\nComputer:\t\t" + computer.getText()
						+ "\nChemistry:\t\t" + chemistry.getText()
						+ "\nPysics:\t\t" + physics.getText()
						+ "\nTamil:\t\t" + tamil.getText()
						+ "\nMalayalam:\t\t" + malayalam.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + total.getText()
						+ "\nAverage:\t\t" + avg.getText()
						+ "\nRanking:\t\t" + rank.getText() + "\n"
						);
			}
		});
		show.setBounds(346, 488, 103, 23);
		frmStudentReport.getContentPane().add(show);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(459, 488, 89, 23);
		frmStudentReport.getContentPane().add(exit);
		
		JButton Reset = new JButton("Reset");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp=null;
				for(java.awt.Component c:panel.getComponents()) {
				if(c.getClass().toString().contains("javax.swing.JTextField")) {
				temp=(JTextField)c;
				temp.setText(null);
			}
				}}});
		Reset.setBounds(572, 488, 89, 23);
		frmStudentReport.getContentPane().add(Reset);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnClear.setFont(btnClear.getFont().deriveFont(btnClear.getFont().getStyle() | Font.BOLD));
		btnClear.setForeground(Color.RED);
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(622, 338, 89, 23);
		frmStudentReport.getContentPane().add(btnClear);
		
		
	}
}
