package com.icms.editproduct;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    ImageView cactus,succelent, dahlia, terrarium;
    TextView cactusTitle, succelentTitle, dahliaTitle, terrariumTitle;
    TextView cactusPrice, succelentPrice, dahliaPrice, terrariumPrice;
    TextView cactusExpire, succelentExpire, dahliaExpire, terrariumExpire;
    Button cactusEdit, succelentEdit, dahliaEdit, terrariumEdit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Image
        cactus = findViewById(R.id.cactusImageView);
        succelent = findViewById(R.id.succelentImage);
        dahlia = findViewById(R.id.dahliaImageView);
        terrarium = findViewById(R.id.terrariumImageView);

        //Title
        cactusTitle = findViewById(R.id.cactusTitle);
        succelentTitle = findViewById(R.id.suceelentTitle);
        dahliaTitle = findViewById(R.id.dahliaTitle);
        terrariumTitle = findViewById(R.id.terrariumTitle);

        //Price
        cactusPrice = findViewById(R.id.cactusPrice);
        succelentPrice = findViewById(R.id.suceelentPrice);
        dahliaPrice  = findViewById(R.id.dahliaPrice);
        terrariumPrice = findViewById(R.id.terrariumPrice);

        //ExpireDate
        cactusExpire = findViewById(R.id.cactusExpiredDate);
        succelentExpire = findViewById(R.id.suceelentExpire);
        dahliaExpire = findViewById(R.id.dahliaExpire);
        terrariumExpire = findViewById(R.id.terrariumExpireDate);


        //EditButton

        cactusEdit  = findViewById(R.id.cactusEdit);
        succelentEdit = findViewById(R.id.suceelentEdit);
        dahliaEdit  = findViewById(R.id.dahliaEdit);
        terrariumEdit = findViewById(R.id.terrariumEdit);




        //settingImage

        cactus.setImageResource(R.drawable.cactus);
        succelent.setImageResource(R.drawable.succelent);
        dahlia.setImageResource(R.drawable.dahlia);
        terrarium.setImageResource(R.drawable.terrarium);



        //setting onClickListener

        cactusEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            }
        });


        succelentEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        dahliaEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        terrariumEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





    }






}




