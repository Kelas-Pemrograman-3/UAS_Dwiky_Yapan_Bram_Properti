package com.project.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import server.ConfigUrl;
import session.SessionManager;

public class MainActivity extends AppCompatActivity {

    private SessionManager session;
    private FrameLayout framebeli,framesewa,frameprofile,frameabout;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        session = new SessionManager(this);


        framebeli = (FrameLayout) findViewById(R.id.framebeli);
        framesewa = (FrameLayout) findViewById(R.id.framesewa);
        frameprofile = (FrameLayout) findViewById(R.id.frameProfile);
        frameabout = (FrameLayout) findViewById(R.id.frameaobout);

        framebeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.setLogin(false);
                session.setSkip(false);
                session.setSessid(0);
                Intent i = new Intent(MainActivity.this, daftar_properti.class);
                startActivity(i);
                finish();
            }
        });
        framesewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.setLogin(false);
                session.setSkip(false);
                session.setSessid(0);
                Intent i = new Intent(MainActivity.this, daftar_properti2.class);
                startActivity(i);
                finish();
            }
        });
        frameprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.setLogin(false);
                session.setSkip(false);
                session.setSessid(0);
                Intent i = new Intent(MainActivity.this, Profile.class);
                startActivity(i);
                finish();
            }
        });
        frameabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.setLogin(false);
                session.setSkip(false);
                session.setSessid(0);
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}
