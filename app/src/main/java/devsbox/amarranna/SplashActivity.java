package devsbox.amarranna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Window window = getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));



        Thread thread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(500);
                    Intent intent = new Intent(SplashActivity.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };thread.start();
    }
}
