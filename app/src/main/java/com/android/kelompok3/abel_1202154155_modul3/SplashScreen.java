package com.android.kelompok3.abel_1202154155_modul3;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


public class SplashScreen extends AppCompatActivity {
    private static int splashInterval = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);
                //Menghubungkan activity splashscren ke main activity dengan intent

                Toast.makeText(SplashScreen.this,"AJUNANDO_1202154155_MODUL3",Toast.LENGTH_LONG).show();

                //Untuk jeda selesai Splashscreen
                this.finish();
            }

            private void finish() {


            }
        }, splashInterval);

    };
}
