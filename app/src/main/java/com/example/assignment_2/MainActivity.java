package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button getPhone;
    TextView phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPhone=findViewById(R.id.btnphone);
        phone=findViewById(R.id.tvphone);

        getPhone.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,EnterPhoneActivity.class);
                startActivity(intent);

            }
        });
        Bundle bundle = getIntent().getExtras();
        String value = bundle.getString("value");
        phone.setText(value);
    }
}