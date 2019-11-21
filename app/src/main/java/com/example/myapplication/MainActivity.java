package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<String> arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arr.add("Android");
        arr.add("Java");
        arr.add("Swift");
        arr.add("Linux");
        arr.add("MacOs");

        rv = findViewById(R.id.rv);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(arr);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(recyclerAdapter);
    }
}
