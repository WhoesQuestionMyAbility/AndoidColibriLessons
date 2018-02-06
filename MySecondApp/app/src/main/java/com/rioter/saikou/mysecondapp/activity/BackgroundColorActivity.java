package com.rioter.saikou.mysecondapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.rioter.saikou.mysecondapp.R;

public class BackgroundColorActivity extends Activity {

    private RadioGroup radioGroup;
    private RadioButton bg_white;
    private RadioButton bg_green;
    private RadioButton bg_yellow;
    private Button btn_choose_bg_color;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
        radioGroup = (RadioGroup) findViewById(R.id.check_color);
        bg_white = (RadioButton) findViewById(R.id.bg_white);
        bg_green = (RadioButton) findViewById(R.id.bg_green);
        bg_yellow = (RadioButton) findViewById(R.id.bg_yellow);

        btn_choose_bg_color = (Button) findViewById(R.id.btn_choose_bg_color);
        btn_choose_bg_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (radioGroup.getCheckedRadioButtonId()){

                    case -1:
                        intent = new Intent();
                        setResult(RESULT_OK, intent);
                        finish();
                        break;
                    case R.id.bg_white:
                        intent = new Intent();
                        intent.putExtra("bg_color", R.color.color_white_bg);
                        setResult(RESULT_OK, intent);
                        finish();
                        break;

                    case R.id.bg_green:
                        intent = new Intent();
                        intent.putExtra("bg_color", R.color.color_green_bg);
                        setResult(RESULT_OK, intent);
                        finish();
                        break;

                    case R.id.bg_yellow:
                        intent = new Intent();
                        intent.putExtra("bg_color", R.color.color_yellow_bg);
                        setResult(RESULT_OK, intent);
                        finish();
                        break;
                }
            }
        });
    }

    public void onCancel(View v ){
        radioGroup.clearCheck();
    }

}
