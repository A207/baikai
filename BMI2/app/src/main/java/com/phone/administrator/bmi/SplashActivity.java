package com.phone.administrator.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;


/**
 * Created by Administrator on 2015/7/14.
 */
public class SplashActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGHT = 2000; //延迟三秒
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

        }, SPLASH_DISPLAY_LENGHT);
    }


    }
