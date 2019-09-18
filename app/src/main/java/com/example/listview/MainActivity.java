package com.example.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public String[] array={"Asia", "Europe", "Africa", "America" };
    public ListView lv;
    Button Next;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= (ListView) findViewById(R.id.lv);
        Next= (Button) findViewById(R.id.Next);

        ArrayAdapter<String> adp= new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, array);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, ""+array[position], Toast.LENGTH_SHORT).show();
        pos=position;
    }

    public void click(View view) {
        Intent si= new Intent(this, States2. class);
        si.putExtra("p", pos);
        startActivity(si);
    }
}
