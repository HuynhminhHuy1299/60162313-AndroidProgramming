package hmhedu.cau2_appbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        nutTinhBMI.setOnClickListener(this);
        nutReset.setOnClickListener(this);
        radioButtonNu.setOnClickListener(this);
        radioButtonNam.setOnClickListener(this);
    }
    void onClick(View v){
        try {
            //Lấy giá trị nhập vào và ép kiểu về float
            double chieuCao = Double.parseDouble(editTextHeight.getText().toString());
            double canNang = Double.parseDouble(editTextWeight.getText().toString());
            DecimalFormat df = new DecimalFormat("0.00"); //định dạng lấy 2 con số
            double BMI = canNang / Math.pow(chieuCao, 2) * 10000; //chiều cao * chiều cao
            switch (v.getId()){ //lấy id các button
                case R.id.btntinh: //nếu id là button tính
                    txtChiSo.setText(df.format(BMI) + "");
                    if(BMI < 18)
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
                    break;
                case R.id.btnreset:
                    editTextHeight.setText("");
                    editTextWeight.setText("");
                    txtDanhGia.setText("");
                    txtChiSo.setText("");
                    break;
            }
        } catch ()

    }