package hmhedu.cau2_appbmi;

import android.os.Bundle;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
}