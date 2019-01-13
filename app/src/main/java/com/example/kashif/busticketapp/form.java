package com.example.kashif.busticketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class form extends AppCompatActivity {
    Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
            intiview();
            setListner();
    }

    private void setListner() {
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(form.this, "Your seats are Booked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void intiview() {
        submitBtn=findViewById(R.id.submitBtn);
    }
}
