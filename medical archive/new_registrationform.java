package Home;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import hellow.LoginPage;
import register.register;

import register.register1;
import register.register2;
import register.register3;


import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class new_registrationform{

	JFrame frame;
	private JTextField txtPassword;
	private JLabel Label_minimize;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new_registrationform window = new new_registrationform();
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
	public new_registrationform() {
		initialize();
	
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 1323, 838);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		panel.setBorder(new LineBorder(Color.WHITE));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(52, 11, 1224, 777);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label_minimize = new JLabel(" -");
		Label_minimize.setBounds(1149, 12, 28, 23);
		Label_minimize.setAutoscrolls(true);
		Label_minimize.setBorder(new LineBorder(new Color(0, 0, 0)));
		Label_minimize.setBackground(Color.WHITE);
		Label_minimize.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(Label_minimize);
		
		
		
		JLabel Lable_close = new JLabel(" x");
		Lable_close.setBounds(1187, 13, 28, 23);
		Lable_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		Lable_close.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Lable_close.setLabelFor(frame);
		Lable_close.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel.add(Lable_close);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 432, 766);
		panel_2.setBackground(new Color(176, 196, 222));
		panel.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MEDICAL ARCHIVE");
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(0, 0, 102));
		lblNewLabel_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 42));
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
			home.main(null);
			}
		});
		btnNewButton.setBounds(442, 34, 145, 53);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JButton btnNewregistration = new JButton("New_Registration");
		btnNewregistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			new_registrationform.main(null);
			}
		});
		btnNewregistration.setBounds(614, 34, 229, 53);
		btnNewregistration.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewregistration);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LoginPage.main(null);
			}
		});
		btnLogout.setBounds(853, 34, 249, 53);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnLogout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_1.setBorder(new CompoundBorder(null, new LineBorder(new Color(185, 209, 234), 8, true)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(550, 98, 552, 727);
		panel.add(panel_1);
		
		JLabel lblRegistrationForm = new JLabel("Registration Form");
		lblRegistrationForm.setForeground(SystemColor.activeCaption);
		lblRegistrationForm.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRegistrationForm.setBounds(179, 73, 316, 58);
		panel_1.add(lblRegistrationForm);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(161, -20, 223, 162);
ImageIcon img=new ImageIcon(this.getClass().getResource("/man3.png"));
		
    label_1.setIcon(img);
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		textField.setBackground(SystemColor.menu);
		textField.setBounds(266, 153, 229, 40);
		panel_1.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(139, 666, 356, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 97, 1, 2);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(139, 129, 356, 2);
		panel_1.add(separator_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(266, 284, 229, 40);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(266, 400, 229, 40);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		textField_3.setBackground(SystemColor.menu);
		textField_3.setBounds(266, 521, 229, 40);
		panel_1.add(textField_3);
		
		JLabel lblC = new JLabel("Citizenship_Number");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblC.setBounds(102, 468, 166, 40);
		panel_1.add(lblC);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBackground(SystemColor.activeCaption);
		btnSubmit.setBounds(406, 598, 89, 23);
		panel_1.add(btnSubmit);
		
		JLabel label_3 = new JLabel("First Name");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(102, 153, 113, 40);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(102, 284, 113, 40);
		panel_1.add(label_4);
		
		JLabel lblFathername = new JLabel("Father_Name");
		lblFathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFathername.setBounds(102, 340, 113, 40);
		panel_1.add(lblFathername);
		
		JLabel label_6 = new JLabel("phonenumber");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(102, 400, 113, 40);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Address");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_7.setBounds(102, 521, 113, 40);
		panel_1.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		textField_4.setBackground(SystemColor.menu);
		textField_4.setBounds(266, 217, 229, 40);
		panel_1.add(textField_4);
		
		JLabel label_8 = new JLabel("Last Name");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_8.setBounds(102, 217, 113, 40);
		panel_1.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		textField_5.setBackground(SystemColor.menu);
		textField_5.setBounds(266, 349, 229, 40);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		textField_6.setBackground(SystemColor.menu);
		textField_6.setBounds(266, 468, 229, 40);
		panel_1.add(textField_6);
        
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
