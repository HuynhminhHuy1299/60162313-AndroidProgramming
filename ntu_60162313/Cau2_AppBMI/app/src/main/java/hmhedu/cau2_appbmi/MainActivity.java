package hmhedu.cau2_appbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Khai báo các đối tượng gắn với điều khiển
    EditText editTextHeight;
    EditText editTextWeight;
    EditText editTextAge;
    Button nutTinhBMI, nutReset;
    TextView txtChiSo, txtDanhGia;
    RadioButton radioButtonNam, radioButtonNu;
    void TimDieuKhien(){
        editTextHeight = (EditText) findViewById(R.id.edtheight);
        editTextWeight = (EditText) findViewById(R.id.edtheight);
        nutTinhBMI = (Button) findViewById(R.id.btntinh);
        nutReset = (Button) findViewById(R.id.btnreset);
        txtChiSo = (TextView) findViewById(R.id.txtChiSo);
        txtDanhGia = (TextView) findViewById(R.id.txtDanhGia);
        radioButtonNam = (RadioButton) findViewById(R.id.rdbnam);
        radioButtonNu = (RadioButton) findViewById(R.id.rdbnu);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Tinh(View view) {
        TimDieuKhien();
        //Lấy giá trị nhập vào và ép kiểu về float
        double chieuCao = Double.parseDouble(editTextHeight.getText().toString());
        double canNang = Double.parseDouble(editTextWeight.getText().toString());

        DecimalFormat df = new DecimalFormat("0.00"); //định dạng lấy 2 con số
        double BMI = canNang / (chieuCao * chieuCao); //chiều cao * chiều cao
        txtChiSo.setText(String.valueOf(BMI));
        if (BMI < 18)
            txtDanhGia.setText("Bạn hơi gầy");
        else if (18 <= BMI && BMI < 25) {
            txtDanhGia.setText("Bạn bình thường");
        } else if (25 <= BMI && BMI < 30) {
            txtDanhGia.setText("Bạn béo phì cấp độ 1");
        } else if (30 <= BMI && BMI < 35) {
            txtDanhGia.setText("Bạn béo phì cấp độ 2");
        } else if (35 <= BMI) {
            txtDanhGia.setText("Bạn béo phì cấp độ 3");
        }

    }
}