package com.example.day04_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSelect(View view) {
        final CheckBox java = (CheckBox) findViewById(R.id.Java);
        final CheckBox python = (CheckBox) findViewById(R.id.python);
        final CheckBox dotnet = (CheckBox) findViewById(R.id.dotnet);

        Button select = (Button) findViewById(R.id.button);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                sb.append("Selected Topics:");
                if(java.isChecked()){
                    sb.append("\n java");
                }
                if(python.isChecked()){
                    sb.append("\n Python");

                }
                if(dotnet.isChecked()){
                    sb.append("\n .Net");
                }

                Toast.makeText(getApplicationContext(),sb.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
