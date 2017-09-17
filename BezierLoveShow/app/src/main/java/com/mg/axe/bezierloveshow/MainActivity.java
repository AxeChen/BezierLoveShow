package com.mg.axe.bezierloveshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private BezierLoveLayout loveLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loveLayout = (BezierLoveLayout) findViewById(R.id.bezierLayout);
    }

    public void start(View view) {
        loveLayout.addLoveImg();
    }
}
