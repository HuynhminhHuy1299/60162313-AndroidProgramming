package tiil.edu.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng gần với đkhiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien(){
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKQ = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button)  findViewById(R.id.btnCong);
        nutTru = (Button)  findViewById(R.id.btnTru);
        nutNhan = (Button)  findViewById(R.id.btnNhan);
        nutChia = (Button)  findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }



    // Xử lý Cộng
    public void XuLyCong(View v){
        //Code xử lý cộng ở đây
        //B1. Lấy dữ liệu 2 số
        //B1.1 Tìm EditText số 1 và 2

        //B1.2. Nhập dữ liệu
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo1.getText().toString();
        //B1.3. Chuyễn dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2.Tính toán
        float Tong = soA + soB;
        //B3. Hiện kết quả
        //B3.1

        //B3.2. Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //B3.3. Gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }


    // Xử lý Trừ
    public void XuLyTru(View v){
        //Code xử lý trừ ở đây
        //B1. Lấy dữ liệu 2 số
        //B1.1 Tìm EditText số 1 và 2

        //B1.2. Nhập dữ liệu
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo1.getText().toString();
        //B1.3. Chuyễn dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2.Tính toán
        float Hieu = soA - soB;
        //B3. Hiện kết quả
        //B3.1

        //B3.2. Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Hieu);
        //B3.3. Gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }

    // Xử lý Nhân
    public void XuLyNhan(View v){
        //Code xử lý nhân ở đây
        //B1. Lấy dữ liệu 2 số
        //B1.1 Tìm EditText số 1 và 2

        //B1.2. Nhập dữ liệu
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo1.getText().toString();
        //B1.3. Chuyễn dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2.Tính toán
        float Tich = soA * soB;
        //B3. Hiện kết quả
        //B3.1

        //B3.2. Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tich);
        //B3.3. Gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }

    // Xử lý Chia
    public void XuLyChia(View v){
        //Code xử lý chia ở đây
        //B1. Lấy dữ liệu 2 số
        //B1.1 Tìm EditText số 1 và 2

        //B1.2. Nhập dữ liệu
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo1.getText().toString();
        //B1.3. Chuyễn dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2.Tính toán
        float Thuong = soA / soB;
        //B3. Hiện kết quả
        //B3.1

        //B3.2. Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Thuong);
        //B3.3. Gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
}