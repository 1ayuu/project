package hellow;

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
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPage {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JLabel Label_minimize;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
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
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(44, 11, 1224, 777);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label_minimize = new JLabel(" -");
		Label_minimize.setAutoscrolls(true);
		Label_minimize.setBorder(new LineBorder(new Color(0, 0, 0)));
		Label_minimize.setBackground(Color.WHITE);
		Label_minimize.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Label_minimize.setBounds(1149, 12, 28, 23);
		panel.add(Label_minimize);
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBorder(new CompoundBorder(null, new LineBorder(new Color(185, 209, 234), 8, true)));
		panel_1.setBounds(697, 216, 420, 494);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setBounds(170, 37, 155, 58);
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 47));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 97, 162, 124);
		ImageIcon img=new ImageIcon(this.getClass().getResource("/userprofile121.png"));
		
		lblNewLabel.setIcon(img);
		panel_1.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setText("username");
		txtUsername.setBounds(126, 156, 229, 40);
		txtUsername.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		txtUsername.setBackground(SystemColor.control);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/password1.png"));
		
		lblNewLabel_1.setIcon(img1);
		lblNewLabel_1.setBounds(10, 221, 123, 47);
		panel_1.add(lblNewLabel_1);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("     ******");
		pwdPassword.setBorder(new LineBorder(SystemColor.control, 3, true));
		pwdPassword.setToolTipText("    password");
		pwdPassword.setBackground(SystemColor.control);
		pwdPassword.setBounds(126, 232, 229, 32);
		panel_1.add(pwdPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBorder(new LineBorder(new Color(240, 240, 240)));
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setBounds(73, 313, 89, 40);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create Account");
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(206, 313, 149, 35);
		panel_1.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 279, 356, 2);
		panel_1.add(separator);
		
		
		JLabel Lable_close = new JLabel(" x");
		Lable_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		Lable_close.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Lable_close.setLabelFor(frame);
		Lable_close.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Lable_close.setBounds(1187, 13, 28, 23);
		panel.add(Lable_close);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBounds(0, 70, 432, 696);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("MEDICAL ARCHIVE");
		lblNewLabel_3.setBounds(467, 12, 384, 57);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(0, 0, 102));
		lblNewLabel_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 42));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(454, 67, 432, 2);
		panel.add(separator_1);
		
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
