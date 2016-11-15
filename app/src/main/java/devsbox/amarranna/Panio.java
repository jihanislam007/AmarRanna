package devsbox.amarranna;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import java.io.ByteArrayOutputStream;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Panio extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView list;

    String[] web = {
            "লাচ্ছি",
            "দই শরবত",
            "ঠাণ্ডাই শরবতের রেসিপি",
            "আইসক্রিম কোলা",
            "আমের শরবত",
            "আপেলের শরবত",
            "স্ট্রবেরির শরবত ",
            "মিক্সড ফ্রুট শরবত"
    } ;


    Integer[] imageId = {
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.panio_6,
            R.drawable.image,
            R.drawable.image,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        CustomAdapter adapter = new CustomAdapter(Panio.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                //    Toast.makeText(Panio.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        String name_obj0= "লাচ্ছি";
                        String upodetails_obj0= "- ৫০০ গ্রাম মিষ্টি দই\n- ১ কাপ গুঁড়ো দুধ\n- চিনি মিষ্টি অনুযায়ী\n- আধা কাপ পছন্দের ফ্লেভার (বাদাম, আম, কলা, আপেল, স্ট্রবেরি, চকলেট ইত্যাদি)\n- বরফ টুকরো পরিমাণ মতো\n- পানি পরিমাণ মতো";
                        String karjodtails_obj0= "- প্রথমে একটি বাটিতে গুঁড়ো দুধ, চিনি ও পানি একসাথে দিয়ে ভালো করে চিনি ও দুধ গলিয়ে মিশিয়ে রাখুন ১০ মিনিট।\n- এরপর ব্লেন্ডারে মিষ্টি দই ও পছন্দের ফ্লেভার অর্থাৎ আম, কলা, বাদাম, স্ট্রবেরি, গলানো চকলেট ইত্যাদি দিয়ে ভালো করে ব্লেন্ড করে নিন।\n- এরপর দুধ, চিনি ও পানির মিশ্রন ব্লেন্ডারে দিন ও ভালো করে ব্লেন্ড করে নিন।\n- তারপর বরফের টুকরো দিয়ে আরও একটু ব্লেন্ড করে নিন যাতে বরফ কুচি হয়ে মিশে যায় লাচ্ছির সাথে।\n- এখন গ্লাসে ঢেলে উপরে বাদাম কুচি ও খানিকটা গুঁড়ো দুধ ছিটিয়ে পরিবেশন করুন ঠাণ্ডা ঠাণ্ডা সুস্বাদু ‘লাচ্ছি’।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(Panio.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "দই শরবত";
                        String upodetails_obj1= "দই আধা কেজি (পাতলা কাপড়ে ঝুলিয়ে পানি ঝরানো), কলা অথবা পেঁপে ১ কাপ, বরফকুচি আধা কাপ, দুধ আধা কাপ, রুহআফজা ২ টেবিল চামচ, চিনি ১ টেবিল চা-চামচ।";
                        String karjodtails_obj1= "সব উপকরণ একসঙ্গে ব্ল্লেন্ডার মেশিনে মিলিয়ে নিন।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Panio.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "ঠাণ্ডাই শরবতের রেসিপি";
                        String upodetails_obj2= "পানি ১.৫ লিটার,চিনি ১.৫ কাপ,দুধ ১ কাপ,কাঠ বাদাম ১ টেবিল চামচ,তরমুজ অথবা পেঁপের বিচি ১ ,টেবিল চামচ,পোস্তদানা ১/২ টেবিল চামচ,শাহী জিরা ১/২ টেবিল চামচ,এলাচি গুড়া ১/২ চা চামচ ,সাদা গোলমরিচ ১ চা চামচ,গোলাপ জল ১/২ চা চামচ (জরুরী নয়),গোলাপ পাপড়ি ১/৪ কাপ";
                        String karjodtails_obj2= "সব উপকরণ এক সাথে মিশিয়ে ব্লেন্ডারে ভালো করে মিক্স করেন নিন। বাদাম, জিরা বা গোল মরিচ আলাদা করে বেটে নেবার প্রয়োজন নেই। ব্লেন্ডারেই সব মিশ্রিত হয়ে যাবে এক সাথে। এরপর একটা পাতলা সুতি কাপড়ে ছেঁকে গ্লাসে বরফ কুচি দিয়ে পরিবেশন করুন মজার স্বাদের ঠাণ্ডা ঠাণ্ডাই শরবত। একদম ভিন্ন রকম একটি স্বাদ অভিজ্ঞতার মুখোমুখি হবেন তা নিশ্চিত রূপেই বলা যায়!";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Panio.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "আইসক্রিম কোলা";
                        String upodetails_obj3= "ভ্যানিলা আইসক্রিম-৬ স্কুপ,কোকাকোলা-৬০০ মিলি";
                        String karjodtails_obj3= "আইসক্রিম ফ্রিজ থেকে বের করে ৫ মিনিট রেখে দিন। এবারে তিনটে কাঁচের গ্লাসে প্রথমে ১ স্কুপ করে আইক্রিম দিন। তারপর কোলা ঢালুন। চামচ দিয়ে নেড়ে স্মুদ, ফ্লাফি মিশ্রণ তৈরি করুন। ওপরে আরও ১ স্কুপ করে আইসক্রিম দিয়ে স্ট্র দিয়ে পরিবেশন করুন আইসক্রিম কোলা।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Panio.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "আমের শরবত";
                        String upodetails_obj4= "ল্যাংড়া আম : ৬ টি,টক দই : ৫০০ গ্রাম,ডানো ক্রিম : ২০০গ্রাম,কনডেন্স মিল্ক : ১ টিন,\nসাজানোর জন্য: পেস্তা বাদাম : প্রয়োজনমত";
                        String karjodtails_obj4= "প্রথমে ব্লেন্ডারে আমের টুকরোগুলোর সাথে একে একে টক দই , ডানো ক্রিম , এবং কনডেন্স মিল্ক দিয়ে হাইস্পিডে ব্লেন্ডার করে নিন । এবার পরিবেশন পাত্রে কিছু আমের টুকরো রেখে এর ওপর ব্লেন্ড করা মিশ্রণটি ঢেলে নিন । সবশেষে ওপরে পেস্তাবাদাম দিয়ে সাজিয়ে পরিবেশন করুন দারুন স্বাদের আমের শরবত ।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(Panio.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "আপেলের শরবত";
                        String upodetails_obj5= "২টি আপেল, চিনি, বরফ কুচি, পুদিনা পাতা।";
                        String karjodtails_obj5= "আপেল ভালো মতো পরিষ্কার করে কেটে রস বের করতে বেল্গন্ডারের মধ্যে নিন (তাতে যেন কোনো খোসা বা বিচি না থাকে)। তারপর ছেঁকে নিন যাতে শরবত পরিষ্কার দেখা যায়। মিনারেল পানি, পরিমাণ মতো চিনি মিশিয়ে ২০ মিনিট ফ্রিজে রেখে দিন। ২০ মিনিট পর ফ্রিজ থেকে বের করে বরফ কুচি আর পুদিনা পাতা দিয়ে পরিবেশন করুন। ";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.panio_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Panio.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "স্ট্রবেরির শরবত";
                        String upodetails_obj6= "স্ট্রবেরি এক কাপ, চিনি পরিমাণমত, আইসক্রিম এক-দুই কাপ, ঠাণ্ডা দুধ দুই কাপ, বরফ কুচি তিন-চার টুকরা, চেরি দুই-তিনটি।";
                        String karjodtails_obj6= "প্রথমে স্ট্রবেরিগুলোকে টুকরা করে নিয়ে চিনি মিশিয়ে ব্লেন্ডারে ব্লেন্ড করে নিন। এবার একটি গ্লাসে ঢেলে দুধ মিশিয়ে উপরে আইসক্রিম, চেরি ও বরফ কুচি দিয়ে পরিবেশন করুন। ";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Panio.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "মিক্সড ফ্রুট শরবত";
                        String upodetails_obj7= "বাঙ্গি, তরমুজ, আঙ্গুর, কমলা, আপেল সব ফলের টুকরো টুকরো করে তিন কাপ, চিনি এক কাপ, বিটলবণ আধা চা-চামচ, বরফ কুচি ১ কাপ।";
                        String karjodtails_obj7= "সব রকম ফলের টুকরো সঙ্গে চিনি, বিটলবণ দিয়ে ব্লেন্ড করুন পানি দিয়ে। ব্লেন্ড করার পর ছেঁকে বরফ কুচি দিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Panio.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;



                    default:
                        break;
                }

            }


        });

       //////////////////////////////////////////////////////////////////////////

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
        getMenuInflater().inflate(R.menu.panio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_mach) {
            // Handle the camera action
            Intent intent= new Intent(Panio.this,MachActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_mansho) {
            Intent intent= new Intent(Panio.this,Mang_sho.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_chal) {
            Intent intent= new Intent(Panio.this,Chal_dal.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_kabab) {
            Intent intent= new Intent(Panio.this,Kabab.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_shak) {
            Intent intent= new Intent(Panio.this,Shak_shobji.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_panio) {
            Intent intent= new Intent(Panio.this,Panio.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_vorta) {
            Intent intent= new Intent(Panio.this,Vorta.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_beking) {
            Intent intent= new Intent(Panio.this,BekingActivity.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_dim) {
            Intent intent= new Intent(Panio.this,Dim.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_soup) {
            Intent intent= new Intent(Panio.this,Supe.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_tok) {
            Intent intent= new Intent(Panio.this,Tok_jal_misti.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_bideshi) {
            Intent intent= new Intent(Panio.this,Bide_shi.class);
            startActivity(intent);
            finish();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
