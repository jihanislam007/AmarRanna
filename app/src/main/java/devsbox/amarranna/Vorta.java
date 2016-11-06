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




public class Vorta extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView list;

    String[] web = {

            "আলু-বরবটি-টমেটো-ডিমের ভর্তা",
            "মটরশুটি ভর্তা ",
            "টমেটো ভর্তা",
            "পটলের খোসা ভর্তা ",
            "টাকি মাছ ভর্তা ",
            "মিষ্টি কুমড়া ভর্তা ",
            "শিমের ভর্তা ",
            "কুমড়ো পাতার ভর্তা ",
            "কাঁঠালের বিচি ভর্তা "


    } ;

    Integer[] imageId = {
            R.drawable.vorta_1,
            R.drawable.vorta_2,
            R.drawable.vorta_3,
            R.drawable.vorta_4,
            R.drawable.vorta_5,
            R.drawable.vorta_6,
            R.drawable.vorta_7,
            R.drawable.vorta_8,
            R.drawable.vorta_9,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vorta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CustomAdapter adapter = new CustomAdapter(Vorta.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                switch (position) {
                    case 0:
                        String name_obj0= "আলু-বরবটি-টমেটো-ডিমের ভর্তা";
                        String upodetails_obj0= "২ কাপ সেদ্ধ বরবটি, ২ টা বড় সেদ্ধ আলু, ৪টা সেদব কাঁচা মরিচ, ১ টা টমেটো কুচি, ১ টা পেঁয়াজ কুচি, ১/২ চা চামচ হলুদ গুড়া, ১ টা ডিম ফেটানো, ২ টুকরা রসুন কুচি, ৩ টা ডুবো তেলে ভাজা শুকনা মরিচ কুচি , দেড় টেবিল চামচ সরিষা তেল , খুবই সামান্য গরম মসলা, লবণ পরিমাণ মতো , ধনে পাতা ইচছা মতো । ";
                        String karjodtails_obj0= "সেদ্ধ বরবটি,কাঁচা মরিচ, ও আলু কে পানি ঝরিয়ে মিহি করে বেটে নিতে হবে। কড়াইতে তেল দিয়ে পেঁয়াজ ও রসুন কুচি ভাজতে হবে।। এবার ডিম ঝুরি করে ভেজে নিন।। এর মধ্যে টমেটো কুচি ও ধনে পাতা ব্যতীত সেদ্ধ বরবটি,কাঁচা মরিচ, ও আলুর বাটা মিশ্রণটি এবং সব মসলা দিন। কিছুক্ষণ পর পর নাড়তে থাকুন যাতে লাগে না যায়। একটু আঠালো হতে শুরু হলে টমেটো কুচি দিয়ে ১ মিনিট নাড়ুন।। অবশেষে ধনেপাতা ছড়িয়ে নামিয়ে পরিবেশন করুন। ";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_1);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "মটরশুটি ভর্তা ";
                        String upodetails_obj1= "মটরশুটি , চিংড়ি মাছ , কাঁচামরিচ , পেঁয়াজ কুচি ,লবণ , ধনে পাতা";
                        String karjodtails_obj1= "সোজা করে বলি - মটরশুটি কে স্টিম করে নিবেন । চিংড়ি মাছ কে এমন ভাবে টালবেন যাতে সিদ্ধ হয় । কাঁচামরিচ ও টেলে নিয়ে ব্লেন্ড বা পাটায় বেটে নিবেন । পরে পেঁয়াজ কুচি,লবণ দিয়ে মাখিয়ে পেঁয়াজ কে চিপে মটরশুটির সাথে সরিষার তেল,লবণ ও ধনে পাতা দিয়ে মাখাবেন । ব্যস... হয়ে গেলো ।  ";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_2);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "টমেটো ভর্তা";
                        String upodetails_obj2= "পাকা টমেটো ২৫০ গ্রাম, পেঁয়াজ কুচি আধা কাপ, ধনেপাতা কুচি ১ টেবিল চা চামচ, কাঁচামরিচ কুচি ১ চা চামচ, লবণ স্বাদ অনুযায়ী, সরিষা তেল পরিমাণমতো, পানি পরিমাণমতো। ";
                        String karjodtails_obj2= "আস্ত টমেটো ভালো করে ধুয়ে সামান্য লবণ ও পরিমাণমতো পানি দিয়ে সিদ্ধ করে নিন। পেঁয়াজ ধনেপাতা ও কাঁচামরিচ, স্বাদ অনুযায়ী লবণ ও পরিমাণমতো সরিষার তেল হাত দিয়ে ভালো করে চটকিয়ে নিন। পরে এতে সিদ্ধ টমেটো দিয়ে আবার চটকিয়ে নিয়ে তৈরি করুন মজাদার টমেটো ভর্তা। ";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_3);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "পটলের খোসা ভর্তা ";
                        String upodetails_obj3= "পটলের বাকল,আলু,ধনেপাতা, ভাজা পেঁয়াজ,রসুন ,কাঁচামরিচ|";
                        String karjodtails_obj3= "এটা খুব ই সোজা । প্রথমে পটলের বাকল ও আলু কে লবণ দিয়ে সিদ্ধ করে নিতে হবে । ফ্রাই প্যানে পেঁয়াজ,রসুন ২কোষ,কাণনচামরিচ(যেমন ঝাল চান) দিয়ে ভেজে নিতে হবে । তারপর ব্লেন্ডার অথবা পাটা তে পটলের বাকল,আলু,ধনেপাতা ও ভাজা পেঁয়াজ,রসুন কাঁচামরিচ দিয়ে বেটে নিতে হবে । হয়ে গেলো পটলের খোসার ভর্তা । ";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_4);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "টাকি মাছ ভর্তা ";
                        String upodetails_obj4= "টাকি মাছ, পেঁয়াজ কুচি,রসুন কুচি ,সরিষার তেল, শুকনা মরিচ ।";
                        String karjodtails_obj4= "খুব সোজা , সবাই পারে । তা ও বলি । প্রথমে টাকি মাছ ধুয়ে নিতে হবে । এরপর লবণ আর হলুদ মাখিয়ে অল্প তেলে ভেজে নিতে হবে যেটা কে আমরা টেলে নেয়া বলি । তারপর মাছের কাঁটা বেচে নিতে হবে । তারপর,পেঁয়াজ কুচি,রসুন কুচি সরিষার তেলে একটু ভেজে নিতে হবে । শুকনা মরিচ ও টেলে নিতে হবে । এখন সব কিছু একসাথে মাখালেই রেডি টাকি মাছের ভর্তা ।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_5);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "মিষ্টি কুমড়া ভর্তা ";
                        String upodetails_obj5= "মিষ্টি কুমড়ার,পেঁয়াজ কুচি,কাঁচামরিচ কুচি,সামান্য ধনেপাতা কুচি,সরিষার তেল ,লবণ ।";
                        String karjodtails_obj5= "খোসা সহ মিষ্টি কুমড়ার টুকরা ভাত রান্না করার সময় এক সাথে ভাতের উপর দিয়ে দিতে পারেন । টেস্ট ভালো হবে এভাবে সিদ্ধ করলে । এবার হাত দিয়ে ম্যাশ করে পেঁয়াজ কুচি,কাঁচামরিচ কুচি,সামান্য ধনেপাতা কুচি,সরিষার তেল আর লবণ দিয়ে মেখে ফেলুন । এই ভর্তায় আমি মাঝে মাঝে কালোজিরা দেই,খুব ভালো লাগে তখন ।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "শিমের ভর্তা ";
                        String upodetails_obj6= "শিম, পেঁয়াজ কুচি,রসুন কুচি ,সরিষার তেল, শুকনা মরিচ ।";
                        String karjodtails_obj6= "শিম ছোট টুকরা করে কেটে লবণ ও অল্প পানি দিয়ে ঢেকে সিদ্ধ করতে হবে । সিদ্ধ হতে বেশি সময় লাগে না । পানি শুকিয়ে ফেলতে হবে । তারপর একটু ঠান্ডা হলে হাত দিয়ে ম্যাশ করতে হবে । তারপর ১টা ফ্রাই প্যানে সরিষার তেলে পোড়া মরিচ টুকরা করে দিতে হবে । মরিচের স্মেল বের হলে পেঁয়াজ কুচি দিতে হবে । পেঁয়াজ টা একটু কাঁচা ভাব দূর হলে তাতে সিদ্ধ শিম দিয়ে নেড়ে চেড়ে নামিয়ে ফেলতে হবে । আমরা শাক যেভাবে বাগাড় দেই তেমন । কেু চাইলে রসুন ও দিতে পারে বাগাড়ের সময় । সরিষার তেলে বেশি মজা হয়,টবে সয়াবিন তেলে ও করা যায় । ধনে পাতা থাকলে সেটা ও দেয়া যায় ।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_7);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "কুমড়ো পাতার ভর্তা ";
                        String upodetails_obj7= "কুমড়ো পাতা, কালোজিরা,লবণ,রসুন কুচি, পেঁয়াজ কুচি , কাঁচামরিচ ।";
                        String karjodtails_obj7= "১০-১২ টা কুমড়ো পাতা ধুয়ে কুচি করে কেটে ব্লেন্ডারে ব্লেন্ড করে নেন । এবার প্যান এ তেল দিয়ে একটু কালোজিরা,লবণ,রসুন কুচি, পেঁয়াজ কুচি আর কাঁচামরিচ দিয়ে ভালো করে ভেজে নিয়ে পাতার পেস্ট টা দিয়ে কিছুক্ষণ জাল ডিয়ে নারা চারা করে পানি শুকিয়ে ফেললেই হয়ে গেলো ভর্তা । ";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_8);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "কাঁঠালের বিচি ভর্তা ";
                        String upodetails_obj8= "কাঁঠালের বিচি, কালোজিরা,লবণ,রসুন কুচি, পেঁয়াজ কুচি , কাঁচামরিচ ।";
                        String karjodtails_obj8= "কাঁঠালের বিচি ১০-১২ টা খোসা ছাড়িয়ে অল্প পানি দিয়ে সিদ্ধ করুন । বেশি পানি দিলে টেস্ট কমে যাবে । পানি শুকিয়ে গেলে নামিয়ে নিন । এবার পেঁয়াজ কুচি,কাঁচামরিচ কুচি,লবণ আর সরিষার তেল দিয়ে মেখে ফেলুন । হয়ে গেলো ভর্তা । চাইলে শুকনো মরিচ ও দেয়া যায় । গরম ভাতের সাথে সব ভর্তা ই টেস্টি । ";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.vorta_9);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(Vorta.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    default:
                        break;
                }

            }


        });
        ////////////////////////////////////////////////////////////////////////

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
        getMenuInflater().inflate(R.menu.vorta, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
