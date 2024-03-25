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

public class FrameTinhTienDien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public FrameTinhTienDien() {
		setTitle("Ứng dụng tính tiền điện");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập Số Điện Sử Dụng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 23, 220, 33);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(227, 25, 86, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrBcMc = new JTextArea();
		txtrBcMc.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrBcMc.setText("Bậc 1: Mức sử dụng từ 0 - 50kWh: 1.678đ/kWh.\r\nBậc 2: Mức sử dụng từ 51 - 100kWh: 1.734đ/kWh.\r\nBậc 3: Mức sử dụng từ 101 - 200kWh: 2.014đ/kWh.\r\nBậc 4: Mức sử dụng từ 201 - 300kWh: 2.536đ/kWh.\r\nBậc 5: Mức sử dụng từ 301 - 400kWh: 2.834đ/kWh.\r\nBậc 6: Mức sử dụng từ 401Wh trở lên: 2.927đ/kWh.");
		txtrBcMc.setBounds(28, 101, 524, 144);
		contentPane.add(txtrBcMc);
		
		JLabel lblTngTinin = new JLabel("Tổng Tiền Điện");
		lblTngTinin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTngTinin.setBounds(10, 401, 220, 33);
		contentPane.add(lblTngTinin);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(211, 403, 86, 33);
		contentPane.add(textField_1);
	}
}
