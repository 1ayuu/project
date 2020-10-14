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

public class home {

	JFrame frame;
	private JTextField txtPassword;
	private JLabel Label_minimize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
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
	public home() {
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
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setBounds(723, 294, 194, 53);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(670, 374, 310, 53);
		textArea.setBackground(SystemColor.controlHighlight);
		panel.add(textArea);
		
		JLabel lblAdmin = new JLabel("Admin1");
		lblAdmin.setBounds(853, 294, 194, 53);
		lblAdmin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblAdmin);
        ImageIcon img=new ImageIcon(this.getClass().getResource("/search.png"));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.WHITE);
		 ImageIcon img1=new ImageIcon(this.getClass().getResource("/search.png"));
			
		 btnNewButton_1.setIcon(img1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(473, 346, 173, 94);
		panel.add(btnNewButton_1);
        
		
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
