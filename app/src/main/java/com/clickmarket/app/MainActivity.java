package com.clickmarket.app;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button joinAsGuestButton = findViewById(R.id.btnJoinGuest);
        joinAsGuestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créer un Intent pour passer de la page 1 à la page 2
                Intent intent = new Intent(MainActivity.this, ActivityPage2.class);
                startActivity(intent);
            }
        });
    }
}
