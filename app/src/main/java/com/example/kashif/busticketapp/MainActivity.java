package com.example.kashif.busticketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button button;
    EditText name_edit,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initview();
        setListner();
    }

    private void setListner() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(name_edit.getText().toString().equals("admin")&& password.getText().toString().equals("12345"))
                {
                    Intent intent=new Intent( MainActivity.this,Recycler.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Faliure", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    private void initview() {

        button= (Button) findViewById(R.id.btn_login);
        name_edit=findViewById(R.id.name_edit);
        password=findViewById(R.id.password);


    }
}
