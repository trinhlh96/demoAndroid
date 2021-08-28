package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void value(View view) {
        TextView txt1 = (TextView) findViewById(R.id.txt1);
        TextView viewResult = (TextView) findViewById(R.id.viewResult);
        viewResult.setText(txt1.getText().toString());
    }

//    public void processSave(View view) {
//        EditText txtName = (EditText) findViewById(R.id.txtName);
//        String name = txtName.getText().toString();
//        Log.i("ProcessSave", "Name is " + name); //log
//        Toast.makeText(this,"Name is " + name, Toast.LENGTH_LONG).show();// Thông báo tạm thời lên màn hình
//        TextView txtNameLabel = (TextView) findViewById(R.id.txtNameLabel);
//        txtNameLabel.setText(name);
//    }
}