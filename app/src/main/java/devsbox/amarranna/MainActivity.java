package devsbox.amarranna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView mach = (TextView) findViewById(R.id.machTextView);
        TextView mansho = (TextView) findViewById(R.id.manshoTextView);
        TextView chal = (TextView) findViewById(R.id.chalTextView);
        TextView shak = (TextView) findViewById(R.id.shakTextView);
        TextView panio = (TextView) findViewById(R.id.panioTextView);
        TextView vorta = (TextView) findViewById(R.id.vortaTextView);
        TextView beking = (TextView) findViewById(R.id.bekingTextView);
        TextView dim= (TextView) findViewById(R.id.dimTextView);
        TextView soup = (TextView) findViewById(R.id.soupTextView);
        TextView tok = (TextView) findViewById(R.id.tokTextView);
        TextView bideshi = (TextView) findViewById(R.id.bideshiTextView);
        TextView kabab = (TextView) findViewById(R.id.kababTextView);

        kabab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Kabab.class);
                startActivity(intent);
            }
        });

        mach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , MachActivity.class);
                startActivity(intent);
            }
        });

        chal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Chal_dal.class);
                startActivity(intent);
            }
        });
        shak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Shak_shobji.class);
                startActivity(intent);
            }
        });
        panio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Panio.class);
                startActivity(intent);
            }
        });

        vorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Vorta.class);
                startActivity(intent);
            }
        });

        mansho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Mang_sho.class);
                startActivity(intent);
            }
        });

        beking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , BekingActivity.class);
                startActivity(intent);
            }
        });

       dim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Dim.class);
                startActivity(intent);
            }
        });
 soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Supe.class);
                startActivity(intent);
            }
        });
 tok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Tok_jal_misti.class);
                startActivity(intent);
            }
        });

        bideshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this , Bide_shi.class);
                startActivity(intent);
            }
        });

////////////////////////////////////////////////////////////////////////////////////////////////
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_fb) {
            // Handle the camera action
            int web= 1;
            Intent intent = new Intent(MainActivity.this , WebActivity.class);
            intent.putExtra("int_value", web);
            startActivity(intent);
        } else if (id == R.id.nav_play_link) {
            int web= 2;
            Intent intent = new Intent(MainActivity.this , WebActivity.class);
            intent.putExtra("int_value", web);
            startActivity(intent);

        } else if (id == R.id.nav_about) {
            int web= 3;
            Intent intent = new Intent(MainActivity.this , WebActivity.class);
            intent.putExtra("int_value", web);
            startActivity(intent);

        } else if (id == R.id.nav_share) {
            String shareBody = "https://play.google.com/store/apps/details?id=devsbox.amarranna";

            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "APP NAME (Open it in Google Play Store to Download the Application)");

            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
        } else if (id == R.id.nav_out) {


            /////////////////working for add///////////////////////////////////////////
            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId("ca-app-pub-1309629775280161/9473255533");
            AdRequest adR = new AdRequest.Builder()

                    // Add a test device to show Test Ads
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .addTestDevice("8658D8B4C243BA29458FD6F9524161C8") //Random Text
                    .build();


            mInterstitialAd.loadAd(adR);
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdLoaded() {
                    displayInterstitial();
                }
            });
            /////////////////finish add////////////////////////////////////////////////*

            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /////////////////////also working for add//////////////////////////

    public void displayInterstitial(){
        if(mInterstitialAd.isLoaded()){

            mInterstitialAd.show();
        }
    }
    /////////////////////also working for add//////////////////////////
}
