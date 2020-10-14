package register;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
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
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.JMenuBar;

public class register2{

	JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JLabel Label_minimize;
    private JRadioButton doctor;
    private JRadioButton hospital;
    private JTextField textField_3;
    
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 register2 window = new  register2();
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
	public  register2(){
		initialize();
	
	
	}
	/**
	 * @wbp.parser.entryPoint
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
		panel.setBounds(24, 11, 1244, 777);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label_minimize = new JLabel(" -");
		Label_minimize.setAutoscrolls(true);
		Label_minimize.setBorder(new LineBorder(new Color(0, 0, 0)));
		Label_minimize.setBackground(Color.WHITE);
		Label_minimize.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Label_minimize.setBounds(1168, 12, 28, 23);
		panel.add(Label_minimize);
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBorder(new CompoundBorder(null, new LineBorder(new Color(185, 209, 234), 8, true)));
		panel_1.setBounds(494, 11, 602, 765);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CREATE ACCOUNT");
		lblNewLabel_2.setBounds(167, 90, 316, 58);
		lblNewLabel_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(177, -13, 223, 162);
		ImageIcon img=new ImageIcon(this.getClass().getResource("/man3.png"));
		
		lblNewLabel.setIcon(img);
		panel_1.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(268, 195, 229, 40);
		txtUsername.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		txtUsername.setBackground(SystemColor.control);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/password1.png"));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(79, 484, 416, 2);
		panel_1.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(38, 97, 1, 2);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(101, 159, 394, 2);
		panel_1.add(separator_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(406, 561, 89, 47);
		panel_1.add(btnNewButton);
		
		JLabel lblUsername = new JLabel("Choose username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsername.setBounds(79, 195, 211, 40);
		panel_1.add(lblUsername);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(240, 240, 240), 4, true));
		textField_3.setBackground(SystemColor.menu);
		textField_3.setBounds(268, 287, 229, 40);
		panel_1.add(textField_3);
		
		JLabel lblLastName = new JLabel("Registration_Number");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(79, 298, 251, 40);
		panel_1.add(lblLastName);
		
		JLabel Lable_close = new JLabel(" x");
		Lable_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		Lable_close.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Lable_close.setLabelFor(frame);
		Lable_close.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Lable_close.setBounds(1206, 13, 28, 23);
		panel.add(Lable_close);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBounds(0, 70, 432, 696);
		panel.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MEDICAL ARCHIVE");
		lblNewLabel_3.setBounds(21, 2, 384, 57);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(0, 0, 102));
		lblNewLabel_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 42));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 49, 432, 2);
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
