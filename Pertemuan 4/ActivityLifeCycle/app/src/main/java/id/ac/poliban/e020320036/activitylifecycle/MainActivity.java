package id.ac.poliban.e020320036.activitylifecycle;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String L0G = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button btshowsecond = findViewById(R.id.bt_show_second);

        btshowsecond.setOnClickListener(o -> {
            Intent Intent = new Intent(this, SecondActivity.class);
            startActivity(Intent);
        });

        Log.d(L0G, "-- onCreate() --");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(L0G, "onStart() -- ");
    }
}