package com.rioter.saikou.mysecondapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.rioter.saikou.mysecondapp.R;

public class PresentedActivity extends Activity {

    private EditText editName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presented);

        editName = (EditText) findViewById(R.id.editName);
    }

    public void onPresented(View v){

        Intent intent = new Intent();
        intent.putExtra("name", editName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
