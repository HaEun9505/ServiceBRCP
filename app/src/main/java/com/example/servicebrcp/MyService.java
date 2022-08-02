package com.example.servicebrcp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {

    }

    @Override   //(==OnCreate) MyService 실행하면 실행되는 함수(service가 생성되고 다음으로 실행되는 함수)
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("TTTTTTTTTT");
        return START_STICKY;    //시스템이 서비스를 중단하면 서비스를 다시 생성한다.
    }

    @Override
    public IBinder onBind(Intent intent) {  //BindService 실행하면 실행되는 함수
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}