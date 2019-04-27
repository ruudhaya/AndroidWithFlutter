package test.com.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import io.flutter.embedding.android.FlutterView;
import io.flutter.facade.Flutter;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Nice", Toast.LENGTH_SHORT).show();
            View flutterView = Flutter.createView(MainActivity.this, getLifecycle(), "route1");
            FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(600, 800);
            layout.leftMargin = 100;
            layout.topMargin = 200;
            addContentView(flutterView, layout);
        });
    }
}
