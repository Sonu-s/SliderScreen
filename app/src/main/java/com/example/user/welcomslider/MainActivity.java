package com.example.user.welcomslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tryAgain = findViewById(R.id.tryAgain);

        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PrefManager preferenceManager = new PrefManager(getApplicationContext());
                preferenceManager.SetFirstTimeLunch(true);
                startActivity(new Intent(MainActivity.this, SplashActivity.class));
                finish();
            }
        });
    }
}
