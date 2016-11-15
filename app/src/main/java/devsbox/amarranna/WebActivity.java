package devsbox.amarranna;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class WebActivity extends Activity {

    private WebView mwebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        mwebView = (WebView) findViewById(R.id.webView);

        WebSettings webSettings = mwebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


        Intent intent = getIntent();
        int st = intent.getIntExtra("int_value",0);

        if(st==1){
            mwebView.loadUrl("https://www.facebook.com/arannabanna/?__mref=message_bubble");
        }
        else if(st==2){

            mwebView.loadUrl("https://play.google.com/store/search?q=devsbox&hl=en");
        }else if(st==3){
            mwebView.loadUrl("https://www.devsbox.com/");
        }

        final ProgressDialog dialog = ProgressDialog.show(this, "", "Loading....",
                true);
        dialog.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                dialog.dismiss();
            }
        }, 3000);
    }
}