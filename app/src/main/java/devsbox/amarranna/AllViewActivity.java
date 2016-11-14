package devsbox.amarranna;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AllViewActivity extends Activity {

    TextView title, upo, upoDtails, kajo, karjodtails;
    Button like, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_view);
        Window window = getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));

        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        title = (TextView) findViewById(R.id.textViewtopicname);
        upoDtails = (TextView) findViewById(R.id.textViewupodetail);
        karjodtails = (TextView) findViewById(R.id.textViewkarjodetail);


        title.setText(getIntent().getStringExtra("titel_name"));
        upoDtails.setText(getIntent().getStringExtra("upodetail_name"));
        karjodtails.setText(getIntent().getStringExtra("karjodtails_name"));

        Bundle extras = getIntent().getExtras();
        byte[] b = extras.getByteArray("picture");

        Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length);
        ImageView image = (ImageView) findViewById(R.id.imageView1);

        image.setImageBitmap(bmp);
    }
}
