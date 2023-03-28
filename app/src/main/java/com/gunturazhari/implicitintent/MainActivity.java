package com.gunturazhari.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tampilanTelepon(View view) {
       Intent teleponIntent = new Intent(Intent.ACTION_DIAL)
        starActi(teleponIntent);


    }
}