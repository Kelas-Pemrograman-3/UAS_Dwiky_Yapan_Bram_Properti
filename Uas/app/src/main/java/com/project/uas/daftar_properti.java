package com.project.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import session.SessionManager;

public class daftar_properti extends AppCompatActivity {
    private SessionManager session;
    private LinearLayout daftar2,daftar1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_properti);

        session = new SessionManager(this);


        daftar1= (LinearLayout) findViewById(R.id.daftar1);
        daftar2= (LinearLayout) findViewById(R.id.daftar2);

        daftar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.setLogin(false);
                session.setSkip(false);
                session.setSessid(0);
                Intent i = new Intent(daftar_properti.this, menu.class);
                startActivity(i);
                finish();
            }
        });
        daftar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.setLogin(false);
                session.setSkip(false);
                session.setSessid(0);
                Intent i = new Intent(daftar_properti.this, menu.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public   void onBackPressed(){
        Intent back = new Intent(daftar_properti.this,MainActivity.class);
        startActivity(back);
        finish();
    }
}
