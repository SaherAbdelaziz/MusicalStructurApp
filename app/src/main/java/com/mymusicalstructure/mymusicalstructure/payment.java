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

public class payment  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        Button payment_2_playing = (Button) findViewById(R.id.payment_2_playing);
        Button payment_2_albums = (Button) findViewById(R.id.payment_2_albums);
        Button payment_2_mainpage = (Button) findViewById(R.id.payment_2_mainpage);
        payment_2_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), playing.class);
                startActivity(intent);
            }
        });

        payment_2_albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), albums.class);
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
