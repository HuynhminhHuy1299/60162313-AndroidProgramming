package hmh.edu.vd2_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

    }
    public void NhapLieu(View v){
        Intent iNhap = new Intent(this, NhapLieuActivity.class);
        startActivityForResult(iNhap, 8000);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode==8000)
            if (resultCode==RESULT_OK)
            {
                String hotenNhanDuoc = data.getStringExtra("HT");
                int namsinhNhanDuoc = data.getIntExtra("NS", 2020);
                TextView tvHT = findViewById(R.id.tvHoTen);
                TextView tvNS = findViewById(R.id.tvNamSinh);
                tvNS.setText(String.valueOf(namsinhNhanDuoc));
                tvHT.setText(hotenNhanDuoc);
            }
        else
                Toast.makeText(this,"Trả về thất bại", Toast.LENGTH_SHORT);
        else
            super.onActivityResult(requestCode, resultCode, data);
    }
    //để xử lý kết quả nhận được (dữ liệu trả về từ màn hình nhập liệu)
}