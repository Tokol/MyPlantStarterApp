package com.icms.editproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditPlant extends AppCompatActivity {

    EditText title, price, expireDate;
    Button editBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_plant);

        title = findViewById(R.id.editTextTitle);
        price = findViewById(R.id.editTextPrice);
        expireDate = findViewById(R.id.editTextExpireDate);
        editBtn = findViewById(R.id.editButtonDone);

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }
}