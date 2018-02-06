package com.rioter.saikou.mysecondapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.rioter.saikou.mysecondapp.R;
import com.rioter.saikou.mysecondapp.util.Language;

public class LanguageActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }

    public void onSelectedLanguage(View v) {

        Intent intent;
        switch (v.getId()) {

            case R.id.btn_en:
                intent = new Intent();
                intent.putExtra("language", Language.ENGLISH.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;

            case R.id.btn_ru:
                intent = new Intent();
                intent.putExtra("language", Language.RUSSIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;

            case R.id.btn_ua:
                intent = new Intent();
                intent.putExtra("language", Language.UKRAINE.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
        }
    }

}
