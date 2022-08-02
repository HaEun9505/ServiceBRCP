package com.example.servicebrcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //동적으로 등록
        BroadcastReceiver br = new MyReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.example.servicebrcp.JOK");
        registerReceiver(br, filter);

        Button button1 = (Button) findViewById(R.id.btnBr);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.example.servicebrcp.JOK");    //직접 만든 Action명을 intent에 넣어줌
                sendBroadcast(intent);  //방송 송신(Broadcast를 보냄)
            }
        });
    }
    public void mOnClick(View v){
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
}