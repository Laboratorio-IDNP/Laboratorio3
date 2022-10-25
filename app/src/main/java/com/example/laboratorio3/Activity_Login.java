package com.example.laboratorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToActivityMenu(View view) {
        Intent intentActivityMenu = new Intent(this, Activity_Menu.class);
        startActivity(intentActivityMenu);
    }
}