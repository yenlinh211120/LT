package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class GUI_TimKiemSach extends JFrame {
	private JTable table;
	private JTextField txtMaNV;
	private JTextField txthoTen;
	private JTextField txtTuoi;
	private JTextField txtTienLuong;
	private JTextField txtTim;
	private JButton btnTim;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnLuu;
	private JButton btnXoaTrang;
	private DefaultTableModel tableModel;
	private JLabel lblPhong;
	private JTextField txtPhong;
	private JComboBox cboPhong;
	private JButton btnSua;
	GUI_TimKiemSach(){
		setTitle("Tìm Kiếm Sách");
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
		
		
		
		JPanel pnlNorth;
		add(pnlNorth = new JPanel(), BorderLayout.NORTH);
		JLabel lblTieuDe;
		pnlNorth.add(lblTieuDe = new JLabel("Tìm Kiếm Sách:"));
		lblTieuDe.setFont(new Font("Arial", Font.BOLD, 20));
		lblTieuDe.setForeground(Color.BLUE);

		Box b = Box.createVerticalBox();

		Box b1, b2, b3, b4, b5;
		JLabel lblMaNV, lblhoTen, lblTuoi, lblTienLuong;

		//b.add(b1 = Box.createHorizontalBox()); b.add(Box.createVerticalStrut(10));
		//b1.add(lblMaNV = new JLabel("Nhập Tên Sách: "));
	//	b1.add(txtMaNV = new JTextField());

		//b.add(b2 = Box.createHorizontalBox()); 
		//b.add(Box.createVerticalStrut(10));
		//b2.add(lblhoTen = new JLabel("Há»� TÃªn: "));
		//b2.add(txthoTen = new JTextField());
		
		//b.add(b3 = Box.createHorizontalBox()); 
		//b.add(Box.createVerticalStrut(10));
		//b3.add(lblTuoi = new JLabel("Tuá»•i: ")); 
		//b3.add(txtTuoi = new JTextField());
		
		//b.add(b4 = Box.createHorizontalBox()); 
		//b.add(Box.createVerticalStrut(10));
	//	b4.add(lblPhong = new JLabel("MÃ£ phÃ²ng: ")); 
		//TÃ¡ÂºÂ¡o vÃƒÂ  Ã„â€˜Ã¡Â»â€¢ dÃ¡Â»Â¯ liÃ¡Â»â€¡u vÃƒÂ o comboBox
		//b4.add(cboPhong = new JComboBox<String>());
		//cboPhong.setEditable(true);		
				
		
		//b4.add(lblTienLuong = new JLabel("Tiá»�n LÆ°Æ¡ng: ")); 
	//	b4.add(txtTienLuong = new JTextField());
		
		//lblhoTen.setPreferredSize(lblMaNV.getPreferredSize());
		//lblPhong.setPreferredSize(lblMaNV.getPreferredSize());
		//lblTuoi.setPreferredSize(lblMaNV.getPreferredSize());

		b.add(b5 = Box.createHorizontalBox()); 
		b.add(Box.createVerticalStrut(10));
		String [] headers = "ID;Tên Sách;Số Lượng;Nhà Xuất Bản;Tác Giả;Thể Loại".split(";");
		tableModel=new DefaultTableModel(headers,0);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(table = new JTable(tableModel));
		table.setRowHeight(25);
		table.setAutoCreateRowSorter(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		
	b5.add(scroll);
		add(b, BorderLayout.CENTER);
		
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		add(split, BorderLayout.SOUTH);
		JPanel pnlLeft, pnlRight;
		split.add(pnlLeft = new JPanel());
		split.add(pnlRight = new JPanel());

		pnlLeft.add(new JLabel("Nhập mã sách cần tìm: "));
		pnlLeft.add(txtTim = new JTextField(10));
		pnlLeft.add(btnTim = new JButton("Tìm theo mã	"));
		pnlLeft.add(new JLabel("Nhập Tên Sách Cần : "));
		pnlLeft.add(txtTim = new JTextField(10));
		pnlLeft.add(btnTim = new JButton("Tìm theo tên	"));

		pnlRight.add(btnThem = new JButton("Thêm vào giỏ hàng"));
		pnlRight.add(btnSua = new JButton("Đến Giỏ Hàng"));
		pnlRight.add(btnXoa = new JButton("Quay Lại Trang Chủ"));
		
		
		
		
		// them thanh menu vào chương trình
		this.setJMenuBar(jMenuBar);
		this.setVisible(true);
	
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new GUI_TimKiemSach();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}

