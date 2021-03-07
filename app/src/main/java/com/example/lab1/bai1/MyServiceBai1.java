package com.example.lab1.bai1;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class MyServiceBai1 extends Service {
    public MyServiceBai1() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Start Service", Toast.LENGTH_SHORT).show();

        Bundle bundle = intent.getBundleExtra("StudentInfo");

        int stuId = bundle.getInt("StudentId");
        String name = bundle.getString("Name");
        String lop = bundle.getString("Class");

        String a = "Thong tin sinh vien: " + "\n" +
                "Ma so sinh vien: " + stuId + "\n" +
                "Ten sinh vien: " + name + "\n" +
                "Ten lop: " + lop + "\n" +
                "--------------------------";
        Toast.makeText(this, a, Toast.LENGTH_LONG).show();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Stop Service", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {


        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}