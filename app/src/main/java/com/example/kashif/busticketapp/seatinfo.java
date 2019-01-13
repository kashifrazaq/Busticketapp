package com.example.kashif.busticketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seatinfo extends AppCompatActivity {
    Button confirmBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seatinfo);
    initview();
    setListners();

    }

    private void initview() {
        confirmBtn=findViewById(R.id.confirmbtn);
    }

    private void setListners() {
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(seatinfo.this,form.class);
                startActivity(intent);
            }
        });
    }


}
