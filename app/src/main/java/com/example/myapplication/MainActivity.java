package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    Button button;

    Random r;

    Integer [] images = {
            R.drawable.imagen1,
            R.drawable.imagen2,
            R.drawable.imagen3,
            R.drawable.imagen4,
            R.drawable.imagen5,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        button = (Button) findViewById(R.id.button);

        r = new Random();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Con esta linea de codigo muestra las imagenes random
                 imageView.setImageResource(images[r.nextInt(images.length)]);
            }
        });

    }
}
