package devsbox.amarranna;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AllViewActivity extends Activity {

    TextView title, upo, upoDtails, kajo, karjodtails;
    Button like, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_view);

        title = (TextView) findViewById(R.id.textViewtopicname);
        upo = (TextView) findViewById(R.id.textViewupokoron);
        upoDtails = (TextView) findViewById(R.id.textViewupodetail);
        kajo = (TextView) findViewById(R.id.textViewkarjopronali);
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
