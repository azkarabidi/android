package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        btnback = findViewById(R.id.back);
        tv = findViewById(R.id.tec);




                Intent intent= getIntent();
                String val = intent.getStringExtra("key");
                tv.setText(val);

//                btnback.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                Intent intent =new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
//                }
//       });
    }
}
