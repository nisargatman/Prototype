package com.kascayd.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
//import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity {
    //private FusedLocationProviderClient mFusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
    }

    public void StartPress(View view) {
        String mydate = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        String message = "\n\nYou have parked at _____. \nTime : "+ mydate;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }

    public void StopPress(View view){
        String mydate = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        String message = "\nYour parking has ended. \nTime : "+mydate;
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(message);
    }
}