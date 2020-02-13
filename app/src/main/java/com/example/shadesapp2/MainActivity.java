package com.example.shadesapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements UnitButtonFragment.OnListFragmentInteractionListener {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_background));
    }

    @Override
    public void onListFragmentInteraction(Unit item) {
        imageView.setImageDrawable(getResources().getDrawable(item.getImageID()));
    }
}
