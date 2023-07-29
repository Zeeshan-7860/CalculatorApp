package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listviewwithadapter.*;


public class Activity2 extends AppCompatActivity {
    String Data = "";
    ListView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        GridView gv;
        gv= (GridView) findViewById(R.id.Grid);

        for (int i=0;i<MainActivity.alist.size();i++)
        {
            MyAdapter adapter = new MyAdapter(this,R.layout.list_item,MainActivity.alist);
            gv.setAdapter(adapter);
        }

//        tv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(Activity2.this, "list item clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//        tv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                Toast.makeText(Activity2.this, "Long CLick", Toast.LENGTH_SHORT).show();
//
//                return true;
//            }
//        });

    }
}