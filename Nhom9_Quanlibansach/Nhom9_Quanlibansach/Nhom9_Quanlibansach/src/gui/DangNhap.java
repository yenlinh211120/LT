package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class DangNhap {

	private JFrame frame;
	private JTextField textUser;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap window = new DangNhap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DangNhap() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(650, 300, 400, 287);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setBounds(65, 75, 140, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Mật khẩu:");
		lblNewLabel_1.setBounds(65, 113, 100, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textUser = new JTextField();
		textUser.setBounds(170, 72, 119, 20);
		frame.getContentPane().add(textUser);
		textUser.setColumns(10);

		JCheckBox Remember = new JCheckBox("Ghi nhớ mật khẩu?");
		Remember.setBounds(65, 143, 220, 23);
		frame.getContentPane().add(Remember);

		JLabel lblMessager = new JLabel("");
		lblMessager.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMessager.setBounds(21, 208, 265, 26);
		frame.getContentPane().add(lblMessager);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(255,0,0).brighter());
		btnLogin.setBorder(null);
		
		btnLogin.addActionListener(new ActionListener() {
			GiaoDienTrangChu GUI_GDChinh = new GiaoDienTrangChu();
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (textUser.getText().equalsIgnoreCase("Quynh") && txtPass.getText().equals("2002")) {
					if (Remember.isSelected()) {
						lblMessager.setText("đăng nhập thành công nhưng đã tích ghi nhớ");
					} else {
						lblMessager.setText("đăng nhập thành công nhưng chưa tích ghi nhớ");
					}
					GUI_GDChinh.setVisible(true);
					
					
				} else {
					lblMessager.setText("Đăng nhập thất bại!");
				}
				textUser.setText("");
				txtPass.setText("");
				lblMessager.setText("");
				Remember.setSelected(false);
			}
			
			
		});
		btnLogin.setBounds(120, 173, 71, 23);
		frame.getContentPane().add(btnLogin);

		JLabel lblLogin = new JLabel("Đăng nhập");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 20));
		lblLogin.setBounds(150, 11, 120, 40);
		frame.getContentPane().add(lblLogin);

		txtPass = new JPasswordField();
		txtPass.setBounds(170, 110, 119, 20);
		frame.getContentPane().add(txtPass);

		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(255 ,240 ,245).brighter());
		btnReset.setBorder(null);
		btnReset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textUser.setText("");
				txtPass.setText("");
				lblMessager.setText("");
				Remember.setSelected(false);
				

			}

			
		});
		btnReset.setBounds(210, 173, 71, 23);
		frame.getContentPane().add(btnReset);

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
