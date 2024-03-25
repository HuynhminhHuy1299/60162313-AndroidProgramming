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
        editTextAge = (EditText) findViewById(R.id.edtage);
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
                    txtChiSo.set
            }
        }

    }