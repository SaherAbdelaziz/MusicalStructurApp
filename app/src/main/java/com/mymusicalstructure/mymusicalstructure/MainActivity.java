package com.mymusicalstructure.mymusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play_main_page = (Button) findViewById(R.id.play_in_main_page);
        Button album_main_page = (Button) findViewById(R.id.albums_in_main_page);
        Button payment_main_page = (Button) findViewById(R.id.payment_in_main_page);

        play_main_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, playing.class);
                startActivity(intent);
            }
        });
        album_main_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, albums.class);
                startActivity(intent);
            }
        });

        payment_main_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, payment.class);
                startActivity(intent);
            }
        });
    }
}
