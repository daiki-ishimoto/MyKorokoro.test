package com.example.iwamotokosuke.mykorokoro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gyroButton = (Button) findViewById(R.id.gyro_button);
        gyroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SubActivity.class);
                startActivity(intent);
            }
        });

        Button gravityButton = (Button) findViewById(R.id.gravity_button);
        gravityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplication(), SubActivity2.class);
                startActivity(intent2);
            }
        });

        Button acceleButton = (Button) findViewById(R.id.accele_button);
        acceleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplication(), SubActivity3.class);
                startActivity(intent3);
            }
        });
    }
}