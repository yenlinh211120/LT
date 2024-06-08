package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class GUI_MuaHang extends JFrame {
	
		public GUI_MuaHang() {
			setTitle("Mua Hàng");
			this.setSize(1200,600);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			
			//Tao thanh menu
			JMenuBar jMenuBar= new JMenuBar();
			//Tao 1 menu
			JMenu jMenu_TrangChu=new JMenu("Trang Chủ");
			//Tao menucon
			JMenuItem jMenuItem_open= new JMenuItem("Open");
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
		}
		
		public static void main(String[] args) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				new GUI_MuaHang();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}


