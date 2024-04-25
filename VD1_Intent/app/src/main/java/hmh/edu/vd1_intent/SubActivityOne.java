package hmh.edu.vd1_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub_one);

        // Gắn lắng nghe sự kiện click cho nút btnQuayLai
        Button btnQuayLai = findViewById(R.id.btnQuayLai);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quayVe();
            }
        });
    }

    // Hàm đáp ứng sự kiện nhấn nút "quay về trang chủ"
    public void quayVe() {
        // Tạo một đối tượng intent
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        // Thực hiện chuyển
        startActivity(iManHinhCHINH);
    }
}
