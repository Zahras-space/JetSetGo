package edu.uwgb.debuggingclass_2.ui.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import edu.uwgb.debuggingclass_2.R;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the splash screen theme
        setTheme(R.style.SplashTheme);

        // Delay for 3 seconds before navigating to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, JetSetGo.class);
                startActivity(intent);
                finish(); // Close splash activity
            }
        }, 3000); // 3000ms = 3 seconds
    }
}
