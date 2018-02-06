package com.rioter.saikou.mysecondapp.activity;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rioter.saikou.mysecondapp.R;
import com.rioter.saikou.mysecondapp.util.RequestCode;

public class MainActivity extends AppCompatActivity {

    private TextView greetings_your_name;
    private TextView your_language;
    private ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetings_your_name = (TextView) findViewById(R.id.greetings_your_name);
        your_language = (TextView) findViewById(R.id.your_language);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
    }

    public void onShow(View v){

        Intent intent;

        switch (v.getId()){

            case R.id.btn_present:
                intent = new Intent(this, PresentedActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTED);
                break;

            case R.id.btn_language:
                intent = new Intent(this, LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_LANGUAGE);
                break;

            case R.id.btn_background:
                intent = new Intent(this, BackgroundColorActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_BACKGROUND);
                break;

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case RequestCode.REQUEST_CODE_PRESENTED:

                    String name = data.getStringExtra("name");
                    greetings_your_name.setText("Рад знакомству, " + name);
                    break;

                case RequestCode.REQUEST_CODE_LANGUAGE:

                    String language = data.getStringExtra("language");
                    your_language.setText("Ваш язык: " + language);
                    break;

                case RequestCode.REQUEST_CODE_BACKGROUND:

                   // String bgcolor = data.getStringExtra("bg_color");
                    greetings_your_name.setTextColor(data.getIntExtra("bg_color", R.color.color_default_bg));

                    mConstraintLayout.setBackgroundColor(data.getIntExtra("bg_color", R.color.color_default_bg));

                    if (R.color.color_yellow_bg == data.getIntExtra("bg_color", R.color.color_default_bg)){
                       Toast.makeText(this, "True", Toast.LENGTH_SHORT).show();
                   } else {
                       Toast.makeText(this,"False", Toast.LENGTH_SHORT).show();
                   }
                    break;

            }
        } else  {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
