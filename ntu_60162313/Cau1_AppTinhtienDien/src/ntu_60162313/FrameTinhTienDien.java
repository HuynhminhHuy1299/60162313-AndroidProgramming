package ntu_60162313;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class FrameTinhTienDien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textfieldSoDienSD;
	private JTextField textfieldTongTienDien;
	public FrameTinhTienDien() {
		setTitle("Ứng dụng tính tiền điện");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelSoDienSD = new JLabel("Nhập Số Điện Sử Dụng");
		labelSoDienSD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelSoDienSD.setBounds(22, 23, 220, 33);
		contentPane.add(labelSoDienSD);
		
		textfieldSoDienSD = new JTextField();
		textfieldSoDienSD.setBounds(227, 25, 86, 33);
		contentPane.add(textfieldSoDienSD);
		textfieldSoDienSD.setColumns(10);
		
		JTextArea txtChuThich = new JTextArea();
		txtChuThich.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtChuThich.setText("Bậc 1 (0 đến 50kWh): 1.484 VND(/kWh)\r\nBậc 2 (51 đến 100kWh): 1.533 VND (/kWh)\r\nBậc 3 (101 đến 200 kWh): 1.786 VND (/kWh)\r\nBậc 4 (201 đến 300 kWh): 2.242 VND (/kWh)\r\nBậc 5 (301 đến 400 kWh): 2.503 VND (/kWh)\r\nBậc 6 (401 kWh trở lên): 2.587 VND (/kWh)");
		txtChuThich.setBounds(28, 101, 524, 144);
		contentPane.add(txtChuThich);
		
		JLabel labelTongTienDien = new JLabel("Tổng Tiền Điện");
		labelTongTienDien.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelTongTienDien.setBounds(22, 265, 125, 33);
		contentPane.add(labelTongTienDien);
		
		textfieldTongTienDien = new JTextField();
		textfieldTongTienDien.setColumns(10);
		textfieldTongTienDien.setBounds(156, 267, 86, 33);
		contentPane.add(textfieldTongTienDien);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(334, 16, 141, 47);
		contentPane.add(btnTinh);
		// Thêm ActionListener cho nút "Tính"
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tinhTongTienDien();
                
            }
        });
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(485, 16, 141, 47);
		contentPane.add(btnReset);
		// Thêm ActionListener cho nút "Reset"
		btnReset.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Gọi hàm resetForm()
		        resetForm();
		    }
		});
		
		
	}
	private double tinhTienDien(int soDien) {
	    // Khai bao bien de luu tong tien dien
	    double tongTien = 0;

	    // Tinh tien dien dua tren cac bac thue bao
	    if (soDien <= 50) {
	        tongTien = soDien * 1.484;
	    } else if (soDien <= 100) {
	        tongTien = (50 * 1.484) + ((soDien - 50) * 1.533);
	    } else if (soDien <= 200) {
	        tongTien = (50 * 1.484) + (50 * 1.533) + ((soDien - 100) * 1.786);
	    } else if (soDien <= 300) {
	        tongTien = (50 * 1.484) + (50 * 1.533) + (100 * 1.786) + ((soDien - 200) * 2.242);
	    } else if (soDien <= 400) {
	        tongTien = (50 * 1.484) + (50 * 1.533) + (100 * 1.786) + (100 * 2.242) + ((soDien - 300) * 2.503);
	    } else {
	        tongTien = (50 * 1.484) + (50 * 1.533) + (100 * 1.786) + (100 * 2.242) + (100 * 2.503) + ((soDien - 400) * 2.587);
	    }
	    
	    return tongTien;
	}
	private void tinhTongTienDien() {
	    // Lay so dien su dung tu textfieldSoDienSD
	    String soDienString = textfieldSoDienSD.getText();

	    // Kiem tra xem chuoi nhap vao co phai la so nguyen khong
	    if (!soDienString.matches("\\d+")) {
	        // Neu khong, hien thi thong bao loi va ket thuc ham
	        JOptionPane.showMessageDialog(this, "So dien su dung khong hop le.", "Loi", JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    // Chuyen doi so dien tu String sang kieu int
	    int soDien = Integer.parseInt(soDienString);
	    
	    // Tien hanh tinh tong tien dien
	    double tongTien = tinhTienDien(soDien);
	    
	    // Hien thi tong tien dien tinh duoc vao textfieldTongTienDien
	    textfieldTongTienDien.setText(String.valueOf(tongTien));
	 // Hien thi tong tien dien tinh duoc vao textfieldTongTienDien
	    textfieldTongTienDien.setText(String.format("%.3f ₫", tongTien));
	    // Format số tiền với đơn vị tiền VND và hiển thị tối đa hai số sau dấu phẩy

	}
	// Hàm resetForm để xóa nội dung trong các textfield
	private void resetForm() {
	    textfieldSoDienSD.setText(""); // Xóa nội dung trong textfield số điện sử dụng
	    textfieldTongTienDien.setText(""); // Xóa nội dung trong textfield tổng tiền điện
	}

	
}
