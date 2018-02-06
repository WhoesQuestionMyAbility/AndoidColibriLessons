package com.rioter.saikou.androidcolibrilessons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Saikou on 02.02.18.
 */

public class LastActivity extends Activity {

    TextView enteredLogin;
    TextView enteredPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        enteredLogin = (TextView) findViewById(R.id.entered_login);
        enteredPassword = (TextView) findViewById(R.id.entered_password);

        enteredLogin.setText(getIntent().getStringExtra("login"));
        enteredPassword.setText(getIntent().getStringExtra("pass"));

    }

    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
