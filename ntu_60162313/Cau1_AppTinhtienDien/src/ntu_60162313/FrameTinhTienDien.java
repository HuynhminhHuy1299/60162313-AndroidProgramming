package ntu_60162313;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
		setBounds(100, 100, 671, 516);
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
		txtChuThich.setText("Bậc 1: Mức sử dụng từ 0 - 50kWh: 1.678đ/kWh.\r\nBậc 2: Mức sử dụng từ 51 - 100kWh: 1.734đ/kWh.\r\nBậc 3: Mức sử dụng từ 101 - 200kWh: 2.014đ/kWh.\r\nBậc 4: Mức sử dụng từ 201 - 300kWh: 2.536đ/kWh.\r\nBậc 5: Mức sử dụng từ 301 - 400kWh: 2.834đ/kWh.\r\nBậc 6: Mức sử dụng từ 401Wh trở lên: 2.927đ/kWh.");
		txtChuThich.setBounds(28, 101, 524, 144);
		contentPane.add(txtChuThich);
		
		JLabel labelTongTienDien = new JLabel("Tổng Tiền Điện");
		labelTongTienDien.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelTongTienDien.setBounds(10, 401, 125, 33);
		contentPane.add(labelTongTienDien);
		
		textfieldTongTienDien = new JTextField();
		textfieldTongTienDien.setColumns(10);
		textfieldTongTienDien.setBounds(145, 403, 86, 33);
		contentPane.add(textfieldTongTienDien);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(334, 16, 141, 47);
		contentPane.add(btnTinh);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(485, 16, 141, 47);
		contentPane.add(btnReset);
	}
}
