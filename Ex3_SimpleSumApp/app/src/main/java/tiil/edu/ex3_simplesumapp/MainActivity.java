package tiil.edu.ex3_simplesumapp;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    // Đây la bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view){
        // Tìm, tham chiếu đến điều khiển trên tệp XML, mapping sang java file
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ô điều khiển số A
        String strA = editTextSoA.getText().toString();  //strA = "2"
        //Lấy dữ liệu về ô điều khiển số B
        String strB = editTextSoB.getText().toString();  //strB = "4"

        //Chuyển dữ liệu sang dạng so
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        //Tính tổng theo yêu cầu
        int Tong = so_A + so_B;
        String strTong = String.valueOf(Tong);    //Chuyển sang dạng chuỗi

        //Hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}