package com.example.rudalov.normalno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        myButton = (Button) findViewById(R.id.myButton);


        findViewById(R.id.myButton).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                if(textView.getText()=="Ты всё знаешь!"){
                    textView.setText("Ты уже всё знаешь!");
                }else textView.setText("Ты всё знаешь!");
            }

        });

    }


}
