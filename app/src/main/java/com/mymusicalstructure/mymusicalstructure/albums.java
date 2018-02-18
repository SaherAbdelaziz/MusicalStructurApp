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

public class albums extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums);

        Button albums_2_playing = (Button) findViewById(R.id.albums_2_playing);
        Button albums_2_payment=(Button)findViewById(R.id.albums_2_payment);
        Button albums_2_mainpage=(Button)findViewById(R.id.albums_2_mainpage);

        albums_2_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), playing.class);
                startActivity(intent);
            }
        });

        albums_2_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),payment.class);
                startActivity(intent);
            }
        });
        albums_2_mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}


