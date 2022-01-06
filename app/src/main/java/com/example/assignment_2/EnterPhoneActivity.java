package com.example.assignment_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;




public class EnterPhoneActivity extends AppCompatActivity {

    Button send;
    EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone);

        send=findViewById(R.id.btnsend);
        phone=findViewById(R.id.phone);

        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value = phone.getText().toString();
                Intent i = new Intent(EnterPhoneActivity.this,MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("value",value);
                i.putExtras(bundle);
                startActivity(i);
            }
        });


    }
}
