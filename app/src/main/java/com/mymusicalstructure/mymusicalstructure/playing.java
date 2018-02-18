package com.mymusicalstructure.mymusicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by SaherOs on 2/18/2018.
 */

public class playing extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing);

        Button playing_2_albums = (Button) findViewById(R.id.playing_2_albums);
        Button playing_2_payment = (Button) findViewById(R.id.playing_2_payment);
        Button payment_2_mainpage = (Button) findViewById(R.id.play_2_mainpage);
        playing_2_albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), albums.class);
                startActivity(intent);
            }
        });

        playing_2_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), payment.class);
                startActivity(intent);
            }
        });


        payment_2_mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
