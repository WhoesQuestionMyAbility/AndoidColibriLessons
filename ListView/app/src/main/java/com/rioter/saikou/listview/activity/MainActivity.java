package com.rioter.saikou.listview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.rioter.saikou.listview.R;
import com.rioter.saikou.listview.adapter.PhoneModelAdapter;
import com.rioter.saikou.listview.pojo.PhoneModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);


//        List<String> items = initData();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, items);

        PhoneModelAdapter adapter = new PhoneModelAdapter(this, initData());

        listView.setAdapter(adapter);
    }

    private List<PhoneModel> initData(){
        List<PhoneModel> list = new ArrayList();

        list.add(new PhoneModel(1, "iPhone", 15000));
        list.add(new PhoneModel(2, "HTC", 13000));
        list.add(new PhoneModel(3,"Samsung", 14000));
        list.add(new PhoneModel(4,"ASUS", 12000));

        return list;
    }
}
