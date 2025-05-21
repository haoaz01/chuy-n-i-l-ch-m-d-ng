package com.example.chuyendoiduonglich;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        EditText edt_duonglich = findViewById(R.id.edtDuong);
        Button btn_chuyen = findViewById(R.id.btnChuyen);
        TextView txt_amlich = findViewById(R.id.txt_amlich);
        btn_chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String can = "" , chi = "";
                int namduong = Integer.parseInt(edt_duonglich.getText().toString());
                switch (namduong%10)
                {
                    case 0 : can = "Canh"; break;
                    case 1 : can = "Tân"; break;
                    case 2 : can = "Nhâm"; break;
                    case 3 : can = "Qúy"; break;
                    case 4 : can = "Gíap"; break;
                    case 5 : can = "Ất"; break;
                    case 6 : can = "Bính"; break;
                    case 7 : can = "Đinh"; break;
                    case 8 : can = "Mậu"; break;
                    case 9 : can = "Kỷ"; break;
                }
                switch (namduong%12)
                {
                    case 0 : chi = "Thân"; break;
                    case 1 : chi = "Dậu"; break;
                    case 2 : chi = "Tuất"; break;
                    case 3 : chi = "Hợi"; break;
                    case 4 : chi = "Tý"; break;
                    case 5 : chi = "Sửu"; break;
                    case 6 : chi = "Dần"; break;
                    case 7 : chi = "Mẹo"; break;
                    case 8 : chi = "Thìn"; break;
                    case 9 : chi = "Tỵ"; break;
                    case 10 : chi = "Ngọ"; break;
                    case 11 : chi = "Mùi"; break;
                }
                txt_amlich.setText(can + " " + chi);

            }
        });


    }
}