package com.encuentrame.encuentrame.Vista;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.encuentrame.encuentrame.R;
import com.encuentrame.encuentrame.Vista.LoginView.VistaLogin;
import com.encuentrame.encuentrame.Vista.PrincipalView.HomeActivity;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreenActivity.this, VistaLogin.class);
                startActivity(intent);
                finish();

            }
        },5000);
    }
}
