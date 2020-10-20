package com.roman.midalarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SwitchActivity extends AppCompatActivity {
    Button btt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_activity);
        btt = (Button)findViewById(R.id.button);

        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(btt.callOnClick());
            }
        });
    }

    public void clickButton(View view) {
        Intent intent = new Intent(SwitchActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
