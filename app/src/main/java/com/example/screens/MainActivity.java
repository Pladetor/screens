package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button settings = findViewById(R.id.button);
        Button ps4Shop = findViewById(R.id.button2);
        Button xboxShop = findViewById(R.id.button3);
        Button pcShop = findViewById(R.id.button4);
        Button cart = findViewById(R.id.button5);
    }

    public void onSettingsClick(View v)
    {
        Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, Settings.class);
        startActivity(i);
    }

    public void onPSClick(View v)
    {
        Toast.makeText(this, "PS4 Shop", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, PS4Shop.class);
        startActivity(i);
    }

    public void onXboxClick(View v)
    {
        Toast.makeText(this, "Xbox Shop", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, XboxShop.class);
        startActivity(i);
    }

    public void onPcClick(View v)
    {
        Toast.makeText(this, "PC Shop", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, PCShop.class);
        startActivity(i);
    }

    public void onCartClick(View v)
    {
        Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, Cart.class);
        startActivity(i);
    }
}
