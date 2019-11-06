package com.ahnsafety.ex63servicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    MyThread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickStart(View view) {
//        mp= MediaPlayer.create(this,R.raw.dragon_flight);
//        mp.setLooping(false);
//        mp.setVolume(0.7f,0.7f);
//        mp.start();

//        if(thread==null){
//            thread= new MyThread();
//            thread.start();
//        }
// 백그라운드 작업 시작
        Intent intent= new Intent(this,MyService.class);
        startService(intent);

  }

    public void clickStop(View view) {
//        if(mp!=null){
//            mp.stop();
//            mp.release();//메모리에서 없애기
//            mp=null;

//        if(thread!=null){
//            thread.isRun=false;
//        }
//    //백그라운드 작업 종료
        Intent intent= new Intent(this,MyService.class);
        stopService(intent);
    }

    //백그라운드 작업을 하는 스레드
//    class MyThread extends Thread{
//        boolean isRun= true;
//
//        @Override
//        public void run() {
//            while(isRun){
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(MainActivity.this, "aaa", Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
}