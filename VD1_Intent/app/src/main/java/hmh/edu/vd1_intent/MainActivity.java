package hmh.edu.vd1_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Gắn lắng nghe sự kiện click cho nút btnChuyen
        Button btnChuyen = findViewById(R.id.btnChuyen);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuyenManHinhKhac();
            }
        });
    }

    // Hàm đáp ứng sự kiện nhấn nút "sang màn hình khác"
    public void chuyenManHinhKhac() {
        // Tạo một đối tượng intent
        // Tham số thứ 2 của hàm tạo này
        Intent iManHinhKhac = new Intent(this, SubActivityOne.class);
        // Thực hiện chuyển
        startActivity(iManHinhKhac);
    }
}
