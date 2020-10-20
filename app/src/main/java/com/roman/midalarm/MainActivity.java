package com.roman.midalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TimePicker alarmTime;
    Button add;
    TextView text;
    AlarmManager alarmManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmTime = findViewById(R.id.timePicker);
        add = (Button)findViewById(R.id.add);
        text = (TextView)findViewById(R.id.text);
        alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTimeText("Будильник Вкулючен");
            }
        });
    }

    private void setTimeText(String s) {
            text.setText(s);
    }
}