package com.rioter.saikou.createmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items, menu);

        return true;
    }

    public void onAbout(MenuItem item){
        Toast.makeText(this, "Допустим ты захотел обо мне узнать(2)", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.settings:
                Toast.makeText(this, "Открываем настройки, тип", Toast.LENGTH_SHORT).show();
                return true;

//            case R.id.about:
//                Toast.makeText(this, "Допустим ты захотел обо мне узнать", Toast.LENGTH_SHORT).show();
//                return true;

            case R.id.site:
                Toast.makeText(this, "И даже захотел перейти на мой сайт", Toast.LENGTH_SHORT).show();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
