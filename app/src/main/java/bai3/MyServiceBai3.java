package bai3;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class MyServiceBai3 extends Service {
    public MyServiceBai3() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Bundle bundle = intent.getBundleExtra("editText");
        String a = bundle.getString("text");
        if (a.isEmpty()){
            Toast.makeText(this, "Chuoi dang trong", Toast.LENGTH_SHORT).show();
        }else {
            int counter[] = new int[256];
            int len = a.length();
            for (int i = 0; i < len; i++)
                counter[a.charAt(i)]++;
            char array[] = new char[a.length()];
            for (int i = 0; i < len; i++) {
                array[i] = a.charAt(i);
                int flag = 0;
                for (int j = 0; j <= i; j++) {
                    if (a.charAt(i) == array[j])
                        flag++;
                }
                if (flag == 1){
                    Toast.makeText(this, "Số lần xuất hiện của " +"\n\t" +
                            "'" + a.charAt(i) + "'" + "\n" +
                            "trong chuỗi: " + counter[a.charAt(i)], Toast.LENGTH_SHORT).show();
                }
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}