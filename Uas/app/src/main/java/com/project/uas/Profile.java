package com.project.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }


    @Override
    public   void onBackPressed(){
        Intent back = new Intent(Profile.this,MainActivity.class);
        startActivity(back);
        finish();
    }
}
