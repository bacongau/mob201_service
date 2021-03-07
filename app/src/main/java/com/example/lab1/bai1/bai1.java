package com.example.lab1.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab1.R;

public class bai1 extends AppCompatActivity {
    Button button_start,button_stop;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_start = findViewById(R.id.button_bai1_start);
        button_stop = findViewById(R.id.button_bai1_stop);

        intent = new Intent(bai1.this,MyServiceBai1.class);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();

                bundle.putInt("StudentId", 12707);
                bundle.putString("Name", "Lung Thi Linh");
                bundle.putString("Class", "PT16151");

                intent.putExtra("StudentInfo", bundle);

                startService(intent);
            }
        });

        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });
    }
}