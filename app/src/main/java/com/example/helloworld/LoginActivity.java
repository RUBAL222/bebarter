package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Homebutton(View view) {
        startActivity(new Intent(getApplicationContext(), Main2Activity.class));
    }

    public void buttonRegister(View view) {
        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
    }

    public void Home(View view) {
        startActivity(new Intent(getApplicationContext(), Main2Activity.class));

    }
}
