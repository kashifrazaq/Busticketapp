package com.example.kashif.busticketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class Recycler extends AppCompatActivity {

    public  Button bookbus;
    private RecyclerView recyclerView;



    private int[] images ={

            R.drawable.bus1, R.drawable.bus4,
            R.drawable.bus3, R.drawable.bus4,
            R.drawable.bus4, R.drawable.bus5,
            R.drawable.bus1, R.drawable.bus5,
            R.drawable.bus3, R.drawable.bus4,
            R.drawable.bus4, R.drawable.bus5,
    };

    private  RecyclerAdapter  adapter;

    private  RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager =new GridLayoutManager(this,2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images);
        recyclerView.setAdapter(adapter);
        initview();
                setlistner();
    }

    private void setlistner() {
        bookbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Recycler.this,seatinfo.class);
                startActivity(intent);
            }
        });
    }

    private void initview() {
    bookbus=findViewById(R.id.bookbus);
    }


}
