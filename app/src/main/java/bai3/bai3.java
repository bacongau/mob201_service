package bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lab1.R;

public class bai3 extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        editText = findViewById(R.id.editText_bai3);
        button = findViewById(R.id.button_bai3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();
                Intent intent = new Intent(bai3.this,MyServiceBai3.class);

                Bundle bundle = new Bundle();
                bundle.putString("text", a);

                intent.putExtra("editText", bundle);
                startService(intent);
            }
        });
    }
}