package hmhedu.cau2_appbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtheight, edtweight;
    RadioButton rdbnam, rdbnu;
    TextView txtChiSo, txtDanhGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtheight = findViewById(R.id.edtheight);
        edtweight = findViewById(R.id.edtweight);
        rdbnam = findViewById(R.id.rdbnam);
        rdbnu = findViewById(R.id.rdbnu);
        txtChiSo = findViewById(R.id.txtChiSo);
        txtDanhGia = findViewById(R.id.txtDanhGia);

        Button btntinh = findViewById(R.id.btntinh);
        Button btnreset = findViewById(R.id.btnreset);

        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhBMI();
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    public void Tinh(View v) {
        tinhBMI();
    }

    public void tinhBMI() {
        try {
            double height = Double.parseDouble(edtheight.getText().toString());
            double weight = Double.parseDouble(edtweight.getText().toString());

            double bmi = weight / (height * height / 10000);

            String danhGia = "";

            if (bmi < 18.5) {
                danhGia = "Bạn bị gầy";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                danhGia = "Bình thường";
            } else if (bmi >= 24.9 && bmi < 29.9) {
                danhGia = "Bạn hơi béo";
            } else {
                danhGia = "Bạn bị béo phì";
            }

            txtChiSo.setText(String.format("%.2f", bmi));
            txtDanhGia.setText(danhGia);
        } catch (Exception e) {
            Toast.makeText(this, "Nhập thông tin không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset() {
        edtheight.setText("");
        edtweight.setText("");
        txtChiSo.setText("");
        txtDanhGia.setText("");
        rdbnam.setChecked(false);
        rdbnu.setChecked(false);
    }
}
