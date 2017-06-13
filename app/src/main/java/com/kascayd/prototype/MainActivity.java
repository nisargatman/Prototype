package com.kascayd.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartPress(View view) {
        String message = "You have parked at _____";
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}