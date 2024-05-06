package hmh.edu.vd2_intent;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class NhapLieuActivity {
    public void Nhap_QuayVe(View v){
        EditText edHT = findViewById(R.id.edHoTen);
        EditText edNS = findViewById(R.id.edNamSinh);
        String hoten = edHT.getText().toString();
        int namsinh = Integer.parseInt(edNS.getText().toString());
        Intent iKQNhapLieu = new Intent();
        iKQNhapLieu.putExtra("HT", hoten);
        iKQNhapLieu.putExtra("NS", namsinh);
        setResult(RESULT_OK, iKQNhapLieu);
        finish();
    }

    private void finish() {

    }

    private void setResult(int resultOk) {
    }
}
