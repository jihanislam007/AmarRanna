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

public class Kabab extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;

    String[] web = {
            "মাছের শামি কাবাব",
            "রুই মাছের কাবাব",
            "প্রন পাপর কাবাব",
            "ইলিশ কাবাব",
            "বিফ শিক কাবাব",
            "আফগানি বিফ কাবাব",
            "ডোনাট কাবাব",
            "কাবাব গোশত",
            "বিফ বটি কাবাব",
            "সুতা কাবাব",
            "শিক কাবাব",
            "মাটন বটি কাবাব",
            "ঘাটোয়া কাবাব",
            "খাসির কাবাব",
            "মাংসের কিমা কাঠি কাবাব"
    } ;





    Integer[] imageId = {
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.kabab_5,
            R.drawable.kabab_6,
            R.drawable.kabab_7,
            R.drawable.kabab_8,
            R.drawable.image,
            R.drawable.kabab_10,
            R.drawable.kabab_11,
            R.drawable.kabab_12,
            R.drawable.kabab_13,
            R.drawable.kabab_14,
            R.drawable.kabab_15,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabab);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        CustomAdapter adapter = new CustomAdapter(Kabab.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub


                switch (position) {
                    case 0:
                        String name_obj0= "মাছের শামি কাবাব";
                        String upodetails_obj0= "বড় মাছ ১টি, ছোলার ডাল ১৫০ গ্রাম, পেঁয়াজ কুচি ১ কাপ (চপকাট), পেঁয়াজ বাটা ২ টে. চামচ, আদা বাটা ১ চা চামচ, রসুন বাটা ১ চা চামচ, গোলমরিচ গুঁড়া ১ চা চামচ, ধনে গুঁড়া ১ চা চামচ, কাঁচা মরিচ (চপকাট) ১ চা চামচ, হলুদ গুঁড়া হাফ চা চামচ, গরম মসলা গুঁড়া ১ চা চামচ, লেবুর রস ১ টে. চামচ, ধনেপাতা কুচি ১ চা চামচ, ডিম ২টি, চিনি সামান্য, লবণ পরিমাণমতো, পাউরুটির গুঁড়া পরিমাণমতো, তেল পরিমাণমতো।";
                        String karjodtails_obj0= "প্রথমে বড় মাছ কেটে টুকরা করে ধুয়ে পরিষ্কার করে নিন। ছোলার ডাল আধা ঘণ্টা ভিজিয়ে রাখুন। আদা, রসুন, পেঁয়াজ, হলুদ, মরিচ, ধনে গুঁড়া ও গরম মসলা দিয়ে মাছ সিদ্ধ করুন। মাছ সিদ্ধ হলে নামিয়ে ঠাণ্ডা করে মাছের কাঁটা বেছে নিন। এবার ডাল ও মাছ একসঙ্গে বেটে নিন। ডিমের কুসুম একসঙ্গে মেখে নিন। কাঁচা মরিচ কুচি, পেঁয়াজ ও ধনেপাতা কুচি, লেবুর রস, লবণ একসঙ্গে মেখে নিন। মাছের খামির হাতের তালুতে অল্প করে নিয়ে গোল করে মাঝখানে বুড়ো আঙুলের গর্ত করে পেঁয়াজমাখা পুর ভরে মুখ বন্ধ করে চ্যাপ্টা আকারে কাবাব গড়ূন। এবার ডিমের সাদা অংশে ডুবিয়ে পাউরুটির গুঁড়ায় মেখে গরম তেলে মচমচে করে ভেজে তুলুন। গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "রুই মাছের কাবাব";
                        String upodetails_obj1= "রুই মাছ ১টি, রসুন বাটা ১ টে. চামচ, আদা বাটা ১ টে. চামচ, পেঁয়াজ বাটা ২ টে. চামচ, জিরা বাটা ১ চা চামচ, সরষে বাটা ১ চা চামচ, ডিম ১টি, লবণ পরিমাণমতো, কাঁচা মরিচ বাটা ১ চা চামচ, তেল সিকি কাপ, গরম মসলা গুঁড়া ১ চা চামচ, গোলমরিচ গুঁড়া ১ চা চামচ।";
                        String karjodtails_obj1= "প্রথমে মাছ টুকরা করে কেটে ধুয়ে পরিষ্কার করে নিন। এবার সিদ্ধ করে কাঁটা ছাড়িয়ে নিন। এবার সব মসলা, লবণ, মাছ ও ডিম একসঙ্গে মেখে নিন। গোল চ্যাপ্টা করে কাবাব বানিয়ে তেলে ভেজে নিন। হয়ে গেলে নামিয়ে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "প্রন পাপর কাবাব";
                        String upodetails_obj2= "চিংড়ি মাছ হাফ কেজি, পেঁয়াজ বাটা সিকি কাপ, পুদিনা পাতা বাটা ১ টে. চামচ, আদা বাটা ১ টে. চামচ, রসুন বাটা ১ টে. চামচ, কাঁচা মরিচ বাটা ১ টে. চামচ, গরম মসলা গুঁড়া ১ টে. চামচ, গোলমরিচ গুঁড়া ১ চা চামচ, টকদই ২ টে. চামচ, ডিম ১টি, পাপর ৫-৬টি, পাউরুটির গুঁড়া পরিমাণমতো, তেল ১ কাপ, লবণ পরিমাণমতো।";
                        String karjodtails_obj2= "চিংড়ি মাছ পরিষ্কার করে ধুয়ে মিহি কিমা করে নিন। এবার পেঁয়াজ, আদা, রসুন পুদিনা পাতা, সব মসলা, ডিমের কুসুম, লবণ, দই, গরম মসলা সব একসঙ্গে মেখে রেখে দিন। পাপর পানিতে ভিজিয়ে নিন। পানি ছেঁকে কিছুক্ষণ রেখে দিন যেন পানি ঝরে যায়। এবার পাপরে মেরিনেড করা প্রন দিয়ে একটা একটা করে মুড়িয়ে নিন। ডিমের সাদা অংশে ডুবিয়ে পাউরুটির গুঁড়ায় গড়ায়ে ডুবো তেলে ভেজে নিন। হয়ে গেলে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "ইলিশ কাবাব";
                        String upodetails_obj3= "ইলিশ মাছ ১টি, আলু ১টি, পেঁয়াজ কুচি হাফ কাপ, কাঁচা মরিচ কুচি ১ চা চামচ, টমেটোর সস ২ টে. চামচ, গোলমরিচ গুঁড়া হাফ চা চামচ, লেবুর রস ১ টে. চামচ, লবণ পরিমাণমতো, পাউরুটির গুঁড়া পরিমাণমতো, তেল সিকি কাপ, পেঁয়াজ বেরেস্তা পরিমাণমতো।";
                        String karjodtails_obj3= "প্রথমে ইলিশ মাছের আঁশ ফেলে পেট চিরে ময়লা বের করে নিন। এবার পরিষ্কার করে ধুয়ে নিন। ডুবো পানিতে গোটা মাছ সিদ্ধ করুন। মাথা ও লেজ রেখে দু’পিঠের মাছ মাঝের কাঁটা থেকে স্লাইস করে তুলে কাঁটা বেছে নিন। মাছ ঝুরি করে নিন। আলু সিদ্ধ করে চটকে নিন। লেবুর খোসা গ্রোট করে নিন। পেঁয়াজ ও কাঁচা মরিচ কুচি ভেজে তুলে চটকানো আলু দিয়ে ভেজে নিন। আলু তুলে রেখে কড়াইয়ে এক টে. চামচ তেল দিয়ে মাছের ঝুরি টমেটোর সস, গোলমরিচ ও লবণ দিয়ে ভেজে নিন। ভাজা হলে পেঁয়াজ বেরেস্তা ও কাঁচা মরিচ, লেমন রাইন্ড লেবুর রস দিয়ে নেড়ে আলু দিন। সামান্য ভাজা হলে নামিয়ে পাউরুটি ভেজে মাছে মিশিয়ে নিন। এবার একটি ডিশে মাথা লম্বাভাবে বিছিয়ে রান্না করা মাছ ইলিশ মাছের আকারে বিছিয়ে দিন। ওপরে আরও পাউরুটি গুঁড়া সমানভাবে বিছিয়ে দিন। ওভেনে ১৯০ ডিগ্রি সে.গ্রে. তাপে ২০-২৫ মিনিট বেক করুন।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "বিফ শিক কাবাব";
                        String upodetails_obj4= "হাড্ডি ছাড়া গরুর মাংস কিউব করে নিতে হবে ১ কেজি, নারিকেল পাউডার ২ টেবিল চামচ, ধনে গুঁড়া ১ টেবিল চামচ, জিরা গুঁড়া ২ টেবিল চামচ, গরম মসলা গুঁড়া ১ টেবিল চামচ, মরিচ গুঁড়া ২ টেবিল চামচ, শুকনা মেথিপাতা ১ টেবিল চামচ, গরুর চর্বি ২০০ গ্রাম, পুদিনা পাতা ৫০ গ্রাম, ধনেপাতা ৫০ গ্রাম, কাঁচামরিচ ৫টি, আদা-রসুন আস্ত ২০ গ্রাম।";
                        String karjodtails_obj4= "সব উপকরণ একসঙ্গে মেখে কিমা করে নিতে হবে। তারপর শিকে ভরে কয়লার চুলায় সেঁকতে হবে। বারবার উল্টিয়ে নিতে হবে।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_5);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "আফগানি বিফ কাবাব";
                        String upodetails_obj5= "গরুর মাংস ১ কেজি, পেঁয়াজ মিডিয়াম সাইজের ১টি, আধা টেবিল চামচ আদা বাটা, আধা টেবিল চামচ রসুন বাটা, ব্ল্যাক পিপার, হোয়াইট পিপার, লবণ পরিমাণ মতো, অলিভ অয়েল এক কাপের তিনের এক অংশ, ডানো ক্রিম, রাঁধুনী গরম মসলা, আদা পাউডার, রসুন পাউডার ও লেবু।";
                        String karjodtails_obj5= "পেঁয়াজ, লেবুর রস, আদা, রসুন, ডানো ক্রিম, অলিভ অয়েল এগুলো একসঙ্গে মিশিয়ে ব্লেন্ড করে নিতে হবে। এরপর মাংসের সঙ্গে বাকি মসলা মেশাতে হবে। ১ ঘণ্টা ফ্রিজে রাখতে হবে। ফ্রিজ থেকে বের করে শিকে ভরে কয়লার আগুনে চারপাশ পরিমাণ মতো পুড়িয়ে নিন।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "ডোনাট কাবাব";
                        String upodetails_obj6= "গরুর মাংসের কিমা আধা কেজি, ডিম ২টি, আদা বাটা আধা চা চামচ, রসুন বাটা আধা চা চামচ, গরম মসলা গুঁড়া ১ চা চামচ, জিরা গুঁড়া আধা চা চামচ, টক দই ১ টেবিল চামচ, লবণ পরিমাণ মতো, কাঁচামরিচ কুচি ১ টেবিল চামচ, পেঁয়াজ কুচি ১ টেবিল চামচ, কাবাব মসলা ১ চা চামচ, মরিচ গুঁড়া আধা চা চামচ, টমাটো সস ১ টেবিল চামচ, তেল ভাজার জন্য, বেরেস্তা ১ টেবিল চামচ।";
                        String karjodtails_obj6= "প্রথমে পেঁয়াজ কুচি ও কাঁচামরিচ কুচি সামান্য তেলে ভেজে নিতে হবে। এবার কিমার সঙ্গে ডিম ও তেল ছাড়া সব উপকরণ একসঙ্গে ভালো করে মেখে নিতে হবে। আধা ঘণ্টা মেরিনেট করতে হবে। এবার মাখানো কিমা ডোনাটের আকারে গড়ে নিতে হবে। এরপর সেটাকে ছেঁকা তেলে ভেজে নিতে হবে। ঠাণ্ডা হলে ডিশে চুবিয়ে ডুবো তেলে ভেজে বাদামি করে তুলে পরিবেশন করতে হবে।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_7);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "কাবাব গোশত";
                        String upodetails_obj7= "হাড়সহ গরুর মাংস এক কেজি, টক দই এক কাপ, পেঁয়াজ বাটা এক টেবিল চামচ, রসুন এক চা চামচ, আদা বাটা এক চা চামচ, জিরা বাটা এক চা চামচ, পোস্ত বাটা আধা চা চামচ, কাঠবাদাম বাটা এক চা চামচ, গোলমরিচ গুঁড়া এক চা চামচ, মরিচ গুঁড়া স্বাদ অনুযায়ী, এলাচ, দারুচিনি, লবঙ্গ, তেজপাতা তিনটি করে, জায়ফল বাটা এক চা চামচ, জয়ত্রী বাটা আদা চা চামচ, পেঁয়াজ বেরেস্তা আধা চা চামচ, ঘি এক কাপের চার ভাগের এক ভাগ, লবণ স্বাদমতো, চিনি আধা কাপ, কেওড়া পানি এক টেবিল চামচ।";
                        String karjodtails_obj7= "১. গরুর মাংস ধুয়ে পানি ঝরিয়ে নিন।\n২. জায়ফল, জয়ত্রী ছাড়া সব উপকরণ দিয়ে মাংস ম্যারিনেট করে রাখুন এক ঘণ্টা।\n৩. কড়াইয়ে ঘি গরম করে গোটা গরম মসলা দিয়ে ফোড়ন দিন। এরপর ম্যারিনেট করা মাংস দিয়ে দিন।\n৪. মাংস নেড়ে লবণ ও চিনি দিন।মাংস কষানো হলে দুই কাপ পানি দিয়ে ঢেকে দিন।\n৫. সিদ্ধ হয়ে এলে ঘি ও বেরেস্তা, জায়ফল, জয়ত্রী দিয়ে নেড়ে অল্প আঁচে ঢেকে রাখুন ৩০ মিনিট।\n৬. নামিয়ে পরিবেশন করুন কাবাব গোশত।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_8);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "বিফ বটি কাবাব";
                        String upodetails_obj8= "১ কেজি বিফ, গরম মসলা ১ চামচ, জিরা গুঁড়া ১ চামচ, ধনিয়া গুঁড়া ১ চামচ, লাল মরিচ গুঁড়া ২ চামচ, লবণ পরিমাণমতো, ডানো ক্রিম ২ চামচ, শুকনা মরিচ ভেজে গুঁড়া ১ চামচ, ড্রাই অনিয়ন পাউডার ১ চামচ, মাস্টার্ড পেস্ট আধা চামচ, মাস্টার্ড অয়েল আধা কাপ, দই আধা কাপ, আদা-রসুন পেস্ট ২ চামচ, পেঁপে আধা কাপ।";
                        String karjodtails_obj8= "বিফ পরিষ্কার করে কিউব করে কাটতে হবে। এরপর ধুয়ে পানি ছাড়িয়ে রাখতে হবে। সব মসলা এক সঙ্গে মিক্সড করে ১ ঘণ্টা ফ্রিজে রাখতে হবে। তারপর শিকে ভরে গ্রিলে দিতে হবে। ঘুরিয়ে ঘুরিয়ে এটা তৈরি করতে হবে। বাদামি কালার হয়ে গেলে নামিয়ে ফেলতে হবে। এটা করতে ৮ মিনিট সময় লাগতে পারে।";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    case 9:
                        String name_obj9= "সুতা কাবাব";
                        String upodetails_obj9= "বিফ বনলেস ১ কেজি, গরুর চর্বি ১০০ গ্রাম, লবণ পরিমাণমতো, পেঁপে (পাকা) দুই টেবিল চামচ, গরম মসলা ১ চামচ, জিরা গুঁড়া ১ চামচ, ধনিয়া ১ চামচ, আদা-রসুন পেস্ট ২ চামচ, লাল মরিচ গুঁড়া ২ চামচ, পেঁয়াজ মিডিয়াম সাইজ দুটি। ধনিয়া পাতা, পুঁদিনা পাতা ও কাঁচা মরিচ ৪-৫টি। শুকনা মরিচ ব্লেন্ড পরিমাণমতো।";
                        String karjodtails_obj9= "প্রথমে ১ কেজি পুরোটা ধুয়ে নিন (আস্ত থাকা অবস্থায়)। তারপর ছোট ছোট পিস করে নিন। এর সঙ্গে চর্বিও ছোট ছোট পিস করে মিশিয়ে নিন। এরপর সব মসলা দিয়ে ম্যারিনেট করতে হবে। তারপর এটাকে ব্লেন্ডারে দুই রাউন্ড দিয়ে কিমা করে নিন। তারপর ১ ঘণ্টার জন্য রেখে দিন। শিকের মধ্য দিয়ে সুতা পেঁচিয়ে দিন। অতপর গ্রিলে দিতে হবে। বাদামি কালার হওয়া পর্যন্ত রাখতে হবে। এরপর গরম গরম পরিবেশন করুন। দেশি ঘ্রাণ চাইলে বাটার লাগিয়ে দিতে পারেন। নান বা পরোটার সঙ্গে খেতে পারেন।";

                        Bitmap bitmap_a9 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_10);
                        ByteArrayOutputStream baos_a9 = new ByteArrayOutputStream();
                        bitmap_a9.compress(Bitmap.CompressFormat.PNG, 100, baos_a9);
                        byte[] b_a9 = baos_a9.toByteArray();

                        Intent Int_a9 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a9.putExtra("titel_name", name_obj9);
                        Int_a9.putExtra("upodetail_name", upodetails_obj9);
                        Int_a9.putExtra("karjodtails_name", karjodtails_obj9);

                        Int_a9.putExtra("picture", b_a9);

                        startActivity(Int_a9);

                        break;

                    case 10:

                        String name_obj10= "শিক কাবাব";
                        String upodetails_obj10= "গরুর হাড়ছাড়া মাংস ৫০০ গ্রাম পাতলা ফিতার মতো করে কেটে নিতে হবে। আদা বাটা ১ টেবিল চামচ, রসুন বাটা ২ চা চামচ, পেঁপে বাটা আধা কাপ, পেঁয়াজ বাটা ২ টেবিল চামচ, পেস্তদানা বাটা ২ চা চামচ, বাদাম বাটা ২ চা চামচ। লবণ স্বাদ অনুযায়ী, সরিষার তেল পরিমাণমতো, লাল গুঁড়া মরিচ ১ টেবিল চামচ, গরম মসলা বাটা ২ টেবিল চামচ এবং টক দই ২০০ গ্রাম।";
                        String karjodtails_obj10= "প্রথমে গরুর মাংস ভালো করে ধুয়ে পানি ছেঁকে নিয়ে পাতলা করে কেটে তাতে সব বাটা ও গুঁড়া মসলা, লবণ, টক দই এবং সরিষার তেল মাখিয়ে প্রায় ১ দিন ফ্রিজে রেখে দিন। তারপর মাংসগুলো শিকে গেঁথে কয়লার চুলোয় নিজের পছন্দ অনুযায়ী সেঁকে নিয়ে সার্ভিং ডিশে সাজিয়ে পরিবেশন করুন গরম গরম শিককাবাব।";

                        Bitmap bitmap_a10 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_11);
                        ByteArrayOutputStream baos_a10 = new ByteArrayOutputStream();
                        bitmap_a10.compress(Bitmap.CompressFormat.PNG, 100, baos_a10);
                        byte[] b_a10 = baos_a10.toByteArray();

                        Intent Int_a10 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a10.putExtra("titel_name", name_obj10);
                        Int_a10.putExtra("upodetail_name", upodetails_obj10);
                        Int_a10.putExtra("karjodtails_name", karjodtails_obj10);

                        Int_a10.putExtra("picture", b_a10);

                        startActivity(Int_a10);
                        break;

                    case 11:
                        String name_obj11= "মাটন বটি কাবাব";
                        String upodetails_obj11= "১ কেজি মাটন (কিউব পিস করে এবং চর্বি ছাড়া), গরম মসলা ১ চামচ, ধনিয়া পাতা ১ চামচ, জিরা ১ চামচ, লাল মরিচ ২ চামচ, হলুদ আধা চামচ, লবণ পরিমাণমতো, সরিষার তেল ২ চামচ, সয়াবিন তেল আধা কাপ ও কাস্তুরি মেথি পাউডার। আদা-রসুন পেস্ট ২ চামচ, পেঁপে আধা কাপ।";
                        String karjodtails_obj11= "এবার সব উপকরণ মিশিয়ে এর মধ্যে আধা কাপ ইয়োগর দিয়ে দিন। এবার ১ ঘণ্টা ফ্রিজে রেখে দিন। শিকের মধ্যে পিসগুলোকে ঢোকাতে হবে। তারপর গ্রিলে দিয়ে দিন। বাদামি কালার হওয়ার পর নামাতে হবে। মাঝে মধ্যে ঘুরিয়ে তেল দিতে হবে। এটা হতে ৮ মিনিট সময় লাগতে পারে।";

                        Bitmap bitmap_a11 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_12);
                        ByteArrayOutputStream baos_a11 = new ByteArrayOutputStream();
                        bitmap_a11.compress(Bitmap.CompressFormat.PNG, 100, baos_a11);
                        byte[] b_a11 = baos_a11.toByteArray();

                        Intent Int_a11 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a11.putExtra("titel_name", name_obj11);
                        Int_a11.putExtra("upodetail_name", upodetails_obj11);
                        Int_a11.putExtra("karjodtails_name", karjodtails_obj11);

                        Int_a11.putExtra("picture", b_a11);

                        startActivity(Int_a11);

                        break;

                    case 12:
                        String name_obj12= "ঘাটোয়া কাবাব";
                        String upodetails_obj12= "খাসির মাংসের কিমা-৫০০ গ্রাম, বেসন-১০০ গ্রাম, পেঁপে বাটা ২ টেবিল চামচ, পেঁয়াজ-৩টি, রসুন-৬ কোয়া, আদা-২ চা চামচ, লবঙ্গ-৪টি (বাটা), শা জিরা-আধা চা চামচ, টকদই-১০০ গ্রাম, শুকনো মরিচ বাটা-২ চা চামচ, কিশমিশ বাটা-১ টেবিল চামচ, বাদাম বাটা-১ টেবিল চামচ, জায়পলগুঁড়ো-আধা চা চামচ, ছোট এলাচ গুঁড়ো-আধা চা চামচ, বড় এলাচ গুঁড়ো-আধা চা চামচ, চিনি-১ চা চামচ, লবণ-আন্দাজমতো, ডিম-৪টি, ঘি-১০০ গ্রাম, টমাটো সস-১ কাপ।";
                        String karjodtails_obj12= "কিমার সাথে আন্দাজমতো লবণ ও পেঁপে বাটা মিশিয়ে আধঘণ্টা রেখে দিন। ১টি পেঁয়াজ বেটে নিন। দই ভাল করে ফেটিয়ে তাতে রসুন বাটা, আদা বাটা ও পেঁয়াজ মিহি কুচি করে রাখুন। কড়াইয়ে ২ টেবিল চামচ ঘি দিয়ে প্রথমে কুচানো পেঁয়াজ সবই দিন। একটু নরম হলে এর মধ্যে চিনি ও মিশমিশ বাটা ও বাকি মসলা দিয়ে ভাজুন। একটু লালচে রঙ হলে মাখানো কিমা দিন। আঁচ কমিয়ে দিন। পানি শুকিয়ে গেলে নামিয়ে নিন। ঠাণ্ডা হলে কাবাবের আকারে গড়ে রাখুন।\nএকটা পাত্রে ডিম ও লবণ ফেটিয়ে রাখুন। বেসন পানিতে করে গুলে এর মধ্যে সামান্য লবণ ও ১ চা চামচ তেল দিয়ে ভাল করে ফেটিয়ে রাখুন। ফেটানো ডিম ও বেসন এক সঙ্গে মিশিয়ে রাখুন। একটা কড়াইয়ে ঘি গরম করে কাবাবগুলো বেসন ও ডিমের গোলায় ডুবিয়ে ভেজে তুলুন। বাকি ডিম ও বেসনের গোলা ছাঁকা তেলে ভেজে ঠাণ্ডা করে কুচি কুচি করে বেটে নিন।পরিবেশনের পাত্রে প্রথমে টমেটো সস ছড়িয়ে তার ওপর কাবাব রেখে ভাজা ডিম ও বেসন ভাজা ঝুরি ছড়িয়ে দিন।";

                        Bitmap bitmap_a12 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_13);
                        ByteArrayOutputStream baos_a12 = new ByteArrayOutputStream();
                        bitmap_a12.compress(Bitmap.CompressFormat.PNG, 100, baos_a12);
                        byte[] b_a12 = baos_a12.toByteArray();

                        Intent Int_a12 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a12.putExtra("titel_name", name_obj12);
                        Int_a12.putExtra("upodetail_name", upodetails_obj12);
                        Int_a12.putExtra("karjodtails_name", karjodtails_obj12);

                        Int_a12.putExtra("picture", b_a12);

                        startActivity(Int_a12);

                        break;

                    case 13:
                        String name_obj13= "খাসির কাবাব";
                        String upodetails_obj13= "খাসির মাংস ১ কেজি, মরিচ গুঁড়া দেড় চা-চামচ, আদা বাটা ২ চা-চামচ, তেল আধা কাপ, রসুন বাটা ১ চা-চামচ, পেঁয়াজ কুচি দেড় কাপ, লবণ প্রয়োজনমতো। জয়ফল, জয়ত্রী, এলাচ, দারুচিনি ১টা করে, তেজপাতা ২টি, কাঁচা মরিচ ১টা, চিনি ১ টেবিল চামচ।";
                        String karjodtails_obj13= "খাসির বুকের মাংস এক আকারে কেটে নিতে হবে। মাংসে আদা, রসুন, লবণ, মরিচ গুঁড়া, তেজপাতা ও সব গরম মসলা দিয়ে সিদ্ধ করতে হবে পরিমাণমতো পানি দিয়ে। মাঝারি সিদ্ধ হলে তেলে পেঁয়াজ বেরেস্তা করে তা দিয়ে দিতে হবে মাংসে। সিদ্ধ হয়ে যখন মাংস ভাজা ভাজা হবে, তখন চিনি ও কাঁচা মরিচ দিয়ে একটু দমে রেখে পরিবেশন।";

                        Bitmap bitmap_a13 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_14);
                        ByteArrayOutputStream baos_a13 = new ByteArrayOutputStream();
                        bitmap_a13.compress(Bitmap.CompressFormat.PNG, 100, baos_a13);
                        byte[] b_a13= baos_a13.toByteArray();

                        Intent Int_a13 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a13.putExtra("titel_name", name_obj13);
                        Int_a13.putExtra("upodetail_name", upodetails_obj13);
                        Int_a13.putExtra("karjodtails_name", karjodtails_obj13);

                        Int_a13.putExtra("picture", b_a13);

                        startActivity(Int_a13);

                        break;

                    case 14:

                        String name_obj14= "মাংসের কিমা কাঠি কাবাব";
                        String upodetails_obj14= "গরুর/ খাসির মাংসের কিমা- ১/২ কেজি, পিঁয়াজ কুচি- ১/২ কাপ, কাঁচামরিচ কুচি-২ চা চামচ, টমেটো কেচাপ ২ ২ টেবিল চামচ, আদা বাটা ১ চা চামচ, গরম মসলা বাটা ১ চামচ, লেবুর রস-১ চা চামচ, কাবাব মসলা ১ টেবিল চামচ, দুধ ৪ টেবিল চামচ, পাউরুটি ১ পিস, তেল ১ কাপ, গোলমরিচ গুঁড়া ১/২ চা চামচ, বসেল লিফ ১ চা চামচ, সয়াসস ১ টেবিল চামচ, লবণ স্বাদমতো।";
                        String karjodtails_obj14= "দুধে পাউরুটি ভিজিয়ে নরম হলে কিমার সঙ্গে ভালো করে মেখে নিন। এতে বাকি সব মসলা দিয়ে ভালোভাবে মেখে ১ ঘণ্টা রেখে দিন। মুঠি মুঠি করে কাবাব তৈরি করে কাঠিতে গেঁথে নিন। এবার চুলায় কড়াই দিয়ে এতে তেল দিন। তেল ভালো মতো গরম হলে কাবাব লাল করে ভেজে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a14 = BitmapFactory.decodeResource(getResources(), R.drawable.kabab_15);
                        ByteArrayOutputStream baos_a14 = new ByteArrayOutputStream();
                        bitmap_a14.compress(Bitmap.CompressFormat.PNG, 100, baos_a14);
                        byte[] b_a14 = baos_a14.toByteArray();

                        Intent Int_a14 = new Intent(Kabab.this, AllViewActivity.class);
                        Int_a14.putExtra("titel_name", name_obj14);
                        Int_a14.putExtra("upodetail_name", upodetails_obj14);
                        Int_a14.putExtra("karjodtails_name", karjodtails_obj14);

                        Int_a14.putExtra("picture", b_a14);

                        startActivity(Int_a14);
                        break;

                    default:
                        break;
                }

            }


        });
        ///////////////////////////////////////////////////////////////////

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
        getMenuInflater().inflate(R.menu.kabab, menu);
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
            Intent intent= new Intent(Kabab.this,MachActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_mansho) {
            Intent intent= new Intent(Kabab.this,Mang_sho.class);
            startActivity(intent);

        } else if (id == R.id.nav_chal) {
            Intent intent= new Intent(Kabab.this,Chal_dal.class);
            startActivity(intent);

        } else if (id == R.id.nav_kabab) {
            Intent intent= new Intent(Kabab.this,Kabab.class);
            startActivity(intent);

        } else if (id == R.id.nav_shak) {
            Intent intent= new Intent(Kabab.this,Shak_shobji.class);
            startActivity(intent);

        } else if (id == R.id.nav_panio) {
            Intent intent= new Intent(Kabab.this,Panio.class);
            startActivity(intent);

        }else if (id == R.id.nav_vorta) {
            Intent intent= new Intent(Kabab.this,Vorta.class);
            startActivity(intent);

        }else if (id == R.id.nav_beking) {
            Intent intent= new Intent(Kabab.this,BekingActivity.class);
            startActivity(intent);

        }else if (id == R.id.nav_dim) {
            Intent intent= new Intent(Kabab.this,Dim.class);
            startActivity(intent);

        }else if (id == R.id.nav_soup) {
            Intent intent= new Intent(Kabab.this,Supe.class);
            startActivity(intent);

        }else if (id == R.id.nav_tok) {
            Intent intent= new Intent(Kabab.this,Tok_jal_misti.class);
            startActivity(intent);

        }else if (id == R.id.nav_bideshi) {
            Intent intent= new Intent(Kabab.this,Bide_shi.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
