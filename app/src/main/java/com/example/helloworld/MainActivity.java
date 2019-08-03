package com.example.helloworld;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    EditText test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World Message from Log Happy Birthday");

        btnClick =findViewById(R.id.button);
        test=findViewById(R.id.et_view);

        btnClick.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                String msj = test.getText().toString();
                intent.putExtra("key",msj);
                startActivity(intent);

            }

        });

    }
}
