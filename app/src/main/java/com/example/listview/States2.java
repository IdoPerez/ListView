package com.example.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class States2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
 String[] states;
 ListView list;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states2);
        list = (ListView) findViewById(R.id.list);
        back = (Button) findViewById(R.id.back);

       ArrayAdapter<String> px = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, states);
        list.setAdapter(px);
        list.setOnItemClickListener(this);

        Intent gi= getIntent();
        switch (gi.getIntExtra("p",0)){
            case 0:
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
