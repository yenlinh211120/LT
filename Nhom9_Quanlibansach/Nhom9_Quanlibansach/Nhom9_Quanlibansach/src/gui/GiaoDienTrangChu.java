package gui;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class GiaoDienTrangChu extends JFrame {
	
	

	public GiaoDienTrangChu() {
		setTitle("Trang Chủ");
		this.setSize(1200,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Tao thanh menu
		JMenuBar jMenuBar= new JMenuBar();
		//Tao 1 menu
		JMenu jMenu_TrangChu=new JMenu("Trang Chủ");
		//Tao menucon
		JMenuItem jMenuItem_open= new JMenuItem("Quay Lại Trang Chủ");
		JMenuItem jMenuItem_exit= new JMenuItem("Thoát ứng dụng");
		jMenu_TrangChu.add(jMenuItem_open);
		jMenu_TrangChu.addSeparator();
		jMenu_TrangChu.add(jMenuItem_exit);
		
		JMenu jMenu_TimKiemSach=new JMenu("Tìm Kiếm Sách");
		//JMenuItem jMenuItem_open= new JMenuItem("Open");
		//JMenuItem jMenuItem_exit= new JMenuItem("Exit");
		//jMenu_file.add(jMenuItem_open);
	//	jMenu_file.addSeparator();
		//jMenu_file.add(jMenuItem_exit);
		JMenu jMenu_MuaHang=new JMenu("Mua Hàng");
		
		JMenu jMenu_KhachHang=new JMenu("Giỏ Hàng");
		//-------------------------------------------------------
		jMenuBar.add(jMenu_TrangChu);
		jMenuBar.add(jMenu_TimKiemSach);
		jMenuBar.add(jMenu_MuaHang);
		jMenuBar.add(jMenu_KhachHang);
		
		// them thanh menu vào chương trình
		this.setJMenuBar(jMenuBar);
		this.setVisible(true);
		JPanel panelCenter = new JPanel();
		JLabel lblTieuDe = new JLabel("Quản Lý Xe Máy");
		lblTieuDe.setFont(new Font("Cambria", Font.BOLD, 25));
		lblTieuDe.setForeground(Color.RED);
		panelCenter.add(lblTieuDe);
		try {
			BufferedImage image = ImageIO.read(new File("HinhAnh/hieu-sach-nha-nam-214377.jpg"));
			ImageIcon icon = new ImageIcon(image.getScaledInstance(1300, 440, Image.SCALE_SMOOTH));
			lblTieuDe.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new GiaoDienTrangChu();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
