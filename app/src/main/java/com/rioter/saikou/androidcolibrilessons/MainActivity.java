package com.rioter.saikou.androidcolibrilessons;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button2;
    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button2 = (Button) findViewById(R.id.button2);
        login = (EditText) findViewById(R.id.edit_login);
        password = (EditText) findViewById(R.id.edit_password);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("Hice Meer!");

            }
        });
    }

    public void sayHello(View view) {
        textView.setText("Hice!");

    }

    public void sendData(View v){

        Intent intent = new Intent(this, LastActivity.class);
        intent.putExtra("login", login.getText().toString());
        intent.putExtra("pass", password.getText().toString());
        startActivity(intent);

    }

    public void onShow(View view){

        //Toast.makeText(getApplicationContext(),"HICE!",Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "HICE!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, -150,100);
        toast.show();
    }

}
