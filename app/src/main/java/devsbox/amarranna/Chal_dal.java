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


public class Chal_dal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView list;

    String[] web = {
            "লেবু ভাত",
            "কাজু-মটরশুঁটির ভাত",
            "বিন্নি ভাত",
            "মালাই ভাত",
            "মটরশুঁটির ভুনা খিচুড়ি",
            "বাসমতি চালের সবজি খিচুড়ি",
            "মুগডালের শুকনো খিচুড়ি",
            "চিংড়ি খিচুড়ি",
            "ইলিশ খিচুড়ি",
            "মাংস খিচুড়ি",
            "নিরামিষ খিচুড়ি",
            "চমিশালি ডালের খিচুড়ি",
            "মুগ কলাই ডালের খিচুড়ি",
            "ভুনা খিচুড়ি",
            "তেহারি",
            "পুরনো ঢাকার তেহারী",
            "মটরশুঁটির পোলাও",
            "মোরগ পোলাও",
            "ফখরুদ্দিনের খাসির কাচ্চি বিরিয়ানি",
            "হাজীর বিরিয়ানি "
    } ;





    Integer[] imageId = {
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.chal_6,
            R.drawable.chal_7,
            R.drawable.image,
            R.drawable.image,
            R.drawable.chal_10,
            R.drawable.image,
            R.drawable.chal_12,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chal_dal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        CustomAdapter adapter = new CustomAdapter(Chal_dal.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch (position) {
                    case 0:
                        String name_obj0= "লেবু ভাত";
                        String upodetails_obj0= "পোলাও চাল ২ কাপ, পানি ২ কাপ, চিনি ৩ টেবিল চামচ, লবণ স্বাদমতো, ঘি ২ টেবিল চামচ, লেবু পাতা ৬-৭টি, লেবুর খোসা কুড়ানো সামান্য, কাঁচামরিচ ২-৩টি।";
                        String karjodtails_obj0= "চাল ভালো করে ধুয়ে পানি ঝরিয়ে নিন। চুলায় পাত্র দিয়ে ঘি দিন। ঘি গরম হলে চাল দিয়ে নেড়ে দিন যাতে দলা পাকিয়ে না যায়। এবার তাতে পানি, লবণ, চিনি, ২টি লেবুপাতা দিয়ে এরপর পাত্রে ঢাকানা দিয়ে রান্না করুন। পানি শুকিয়ে এলে ঢাকনা খুলে লেবুপাতা ও কুড়ানো লেবুর খোসা একটা পাতার উপরে রেখে সেটা ভাতের উপর রেখে ঢাকনা বন্ধ করে কিছুক্ষণ দমে রাখুন। কিছুক্ষণ পর নামিয়ে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "কাজু-মটরশুঁটির ভাত";
                        String upodetails_obj1= "বাসমতী চাল ৫০০ গ্রাম, মটরশুঁটি ১ কাপ, কাজুবাদাম ১২টি, লবণ স্বাদমতো।";
                        String karjodtails_obj1= "১. চাল ধুয়ে ১৫ মিনিট ভিজিয়ে রাখুন।\n২. মটরশুঁটি অল্প লবণ দিয়ে একটু ভাপিয়ে নিন।\n৩. সসপ্যানে পানি ফুটে উঠলে চাল দিন।\n৪. ঝরঝরে ভাত হলে মটরশুঁটি ও কাজুবাদাম ভাতের সঙ্গে মিশিয়ে অল্প আঁচে কিছুক্ষণ ঢেকে রাখুন।\n৫. সাজিয়ে ভর্তা বা ভুনা মাংসের সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "বিন্নি ভাত";
                        String upodetails_obj2= "বিন্নি ধানের চাল ৫০০ গ্রাম, নারকেল কুরানো এক কাপ, লবণ, পানি পরিমাণমতো। গুড় আধা কাপ।";
                        String karjodtails_obj2= "চাল ধুয়ে নিয়ে চাল থেকে এক ইঞ্চি উঁচু পর্যন্ত পানি ও সামান্য লবণ দিয়ে মৃদু আঁচে রান্না করুন। চাল সিদ্ধ হয়ে এলে এবার নেড়ে আরও পাঁচ মিনিট রান্না করুন। এবার পাত্রে ঢেলে কুরানো নারকেল ও গুড় দিয়ে পরিবেশন করুন (চিনি দিয়েও পরিবেশন করা যায়)।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "মালাই ভাত";
                        String upodetails_obj3= "মিনিকেট চাল ৫০০ গ্রাম, কলাই ডাল ১ কাপ, দুধ আড়াই কাপ, টমেটো ১টি, লবণ স্বাদমতো, মিহি আদা কুচি আধা চা চামচ।";
                        String karjodtails_obj3= "১. আধাসিদ্ধ করে ভাত রান্না করে নিন। ২. ডাল ধুয়ে ১ ঘণ্টা ভিজিয়ে রেখে আধাসিদ্ধ করে দুধ মিশিয়ে পুরো সিদ্ধ করুন। ৩. আদা কুচি, টমেটো কুচি, লবণ দিয়ে ভাতের সঙ্গে মিশিয়ে একটু দমে রেখে নামিয়ে মুরগির মাংসের সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "মটরশুঁটির ভুনা খিচুড়ি";
                        String upodetails_obj4= "পোলাওয়ের চাল ৪ কাপ, মটরশুঁটি ১ কাপ, ভাজা মুগডাল ২ কাপ, পেঁয়াজ কুচি আধা কাপ, আদা বাটা ১ টেবিল চামচ, রসুন বাটা আধা টেবিল চামচ, হলুদ গুঁড়া ১ চা চামচ, জিরার গুঁড়া ১ চা চামচ, কাঁচা মরিচ ১০টি, এলাচ ৫টি, দারুচিনি ২ ইঞ্চি ৪ টুকরা, তেজপাতা ৪টি, লবঙ্গ ৫টি, আস্ত কালো গোলমরিচ ৫টি, লবণ ১ চা চামচ, ঘি আধা কাপ, তেল ১ কাপের ৪ ভাগের ১ ভাগ, গরম পানি ১২ কাপ।";
                        String karjodtails_obj4= "১. মুগডাল ভেজে ধুয়ে ভিজিয়ে রাখুন দুই ঘণ্টা। চাল ধুয়ে ৩০ মিনিট ভিজিয়ে নিন। এবার ডাল ও চাল থেকে পানি ঝরিয়ে নিন।২. সসপ্যানে ঘি ও তেল একত্রে ঢেলে গরম করে এর মধ্যে পেঁয়াজ কুচি ও তেজপাতা দিয়ে ভাজুন।৩. বাদামি রং হলে এর মধ্যে আদা, রসুন বাটা, গুঁড়া মসলা ও গরম মসলা দিন। এরপর ২ টেবিল চামচ পানি দিয়ে কষিয়ে নিন।৪. এবার কষানো মসলায় ডাল, চাল ও মটরশুঁটি দিয়ে ৭ থেকে ৮ মিনিট ভেজে অবশিষ্ট গরম পানি ও লবণ দিয়ে নেড়ে ঢেকে দিন।৫. চাল পানি সমান সমান হয়ে গেলে কাঁচা মরিচ দিয়ে আবার নেড়ে ঢেকে দিন।৬. হাঁড়ির নিচে একটি তাওয়া দিয়ে তার ওপর হাঁড়ি বসিয়ে মৃদু আঁচে ২০ মিনিট রেখে দিন।৭. নামিয়ে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "বাসমতি চালের সবজি খিচুড়ি";
                        String upodetails_obj5= "বাসমতি চাল ২ কাপ, সবজি (গাজর, বরবটি, মটরশুঁটি, ফুলকপি) ছোট টুকরো সব মিলিয়ে ২ কাপ, আলু আধা কাপ, ভাজা মুগডাল ১ কাপ, আদা বাটা দেড় চা চামচ, রসুন বাটা ১ চা চামচ, হলুদ গুঁড়া দেড় চা চামচ, টক দই ১ কাপের ৪ ভাগের ১ ভাগ, জিরার গুঁড়া ১ চা চামচ, লবণ ১ চা চামচ, চিনি ১ চা চামচ, গরম মসলা গুঁড়া ১ চা চামচ, পেঁয়াজ কুচি আধা কাপ, এলাচ ২টি, দারুচিনি ২টি, তেজপাতা ২টি, গরম পানি ৬ কাপ, ঘি ২ টেবিল চামচ, তেল আধা কাপ।";
                        String karjodtails_obj5= "১. মুগডাল ২ ঘণ্টা ও চাল আধা ঘণ্টা ভিজিয়ে রেখে পানি ঝরিয়ে নিন। মটরশুঁটি ছাড়া সব সবজি চুলার আঁচে ভাপিয়ে নিন।\n২. কড়াইয়ে অর্ধেক তেল দিয়ে গরম হলে গরম মসলা ও পেঁয়াজ দিয়ে ভেজে টক দই, চিনি ও আধা চা চামচ লবণ দিন। একটু পর মসলা কষিয়ে সবজি দিন। সবজি আধা সিদ্ধ হলে আলাদা পাত্রে তুলে রাখুন।\n৩. এবার ওই কড়াইয়ে চাল দিয়ে ভাজুন। ভাজা হয়ে গেলে গরম পানি ও আধা চা চামচ লবণ দিয়ে ঢেকে দিন। ৪. চাল পানি সমান সমান হলে রান্না করা সবজি দিয়ে নেড়ে ঢেকে আঁচ কমিয়ে ১০ মিনিট রান্না করুন। ৫. ১০ মিনিট পর কাঁচা মরিচ ও ঘি দিয়ে আরো ১৫ মিনিট দমে রেখে নামিয়ে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.chal_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "মুগডালের শুকনো খিচুড়ি";
                        String upodetails_obj6= "১ কাপ বাসমতী চাল, আধা কাপ ভাজা মুগডাল, পরিমাণমতো পাঁচফোড়ন, আদা কুচি পরিমাণমতো, সয়াবিন তেল, লবণ ও হলুদের গুঁড়া, শুকনো মরিচ, কাঁচা মরিচ ও তেজপাতা।";
                        String karjodtails_obj6= "চাল ও ডাল আলাদা করে ধুয়ে নিন। পাত্রে সয়াবিন তেল ঢেলে গরম করে তেজপাতা ও শুকনো মরিচ নেড়েচেড়ে পাঁচফোড়ন দিয়ে দিন। হালকা ভাজা হয়ে গেলে আদা কুচি ছেড়ে দিন। বাদামি রং হলে তেলের মধ্যে চাল ও ডাল দিয়ে দিন। এরপর পরিমাণমতো লবণ ও এক চা-চামচ হলুদের গুঁড়া দিয়ে চালটা ভেজে নিন। এবার তিন কাপ পানি দিয়ে ঢেকে দিন। মাঝারি আঁচে মিনিট দশেক জ্বাল দিলে পানি কমে আসবে। তখনই বুঝতে হবে চাল সেদ্ধ হয়ে নরম হয়ে এসেছে। চুলা থেকে নামানোর আগে কয়েকটি কাঁচা মরিচ লম্বালম্বি করে কেটে খিচুড়ির ওপর ছড়িয়ে দিতে হবে। খিচুড়ি পরিবেশনের সময় মাছ ভাজি, বেগুন ভাজি বা লুচি দেওয়া যেতে পারে।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.chal_7);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "চিংড়ি খিচুড়ি";
                        String upodetails_obj7= "চিংড়ি মাছ আধা কেজি, পোলাওর চাল দুই কাপ, মসুর ডাল আদা কাপ, মুগ ডাল এক কাপ, তেল পরিমাণ মতো, ডিম একটি, আদা বাটা ২ টেবিল চামচ, হলুদ গুঁড়া ২ টেবিল চামচ, মরিচ গুঁড়া ২ টেবিল চামচ, লবণ পরিমাণ মতো, পানি পরিমাণ মতো।";
                        String karjodtails_obj7= "পছন্দ মতো সাইজের চিংড়ি মাছ কেটে ধুয়ে নিতে হবে। চিংড়িগুলো আদা বাটা, হলুদ, মরিচ গুঁড়া, লবণ ও ডিমের সাদা অংশ দিয়ে মাখিয়ে মেরিনেট করে নিন। চুলায় তেল দিয়ে তাতে মেরিনেট করা চিংড়িগুলো ভাজুন। আরেকটি পাত্রে তেল দিয়ে ডাল চাল মিশিয়ে ভেজে তাতে পরিমাণ মতো পানি দিন। এরপর লবণ ও বেরেস্তা ছেড়ে দিয়ে ঢাকনা দিয়ে দিন। চাল জল আধা সিদ্ধ হয়ে এলে তাতে ভাজা চিংড়িগুলো ছেড়ে দমে ঢেকে রাখুন। দু-তিনটি মরিচ ফালি ছেড়ে দিন। চুলা বন্ধ করে আরও পাঁচ মিনিট ঢাকনা দিয়ে রাখুন। ঢাকনা খুলে পরিবেশন করুন।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "ইলিশ খিচুড়ি";
                        String upodetails_obj8= "ইলিশ মাছ ৭-৮ টুকরা, পেঁয়াজ কুচি আধা কাপ, কাঁচামরিচ ১০-১২টি, হলুদ গুঁড়া আধা চা-চামচ, লবণ স্বাদমতো, তেল আধা কাপ, পোলাওয়ের চাল ৩ কাপ, বুটের ডাল ১ কাপ, আদা বাটা আধা চা-চামচ, রসুন বাটা আধা চা-চামচ, এলাচ, দারুচিনি ৪টি ও ঘি আধা কাপ।";
                        String karjodtails_obj8= "চাল ও ডাল ধুয়ে পানি ঝরিয়ে রাখতে হবে। মাছ ধুয়ে হলুদ ও লবণ মাখিয়ে ১০ মিনিট রেখে দিতে হবে। এবার রাইস কুকারে ৮ কাপ পানি দিয়ে ফুটাতে হবে। চাল, ডাল ও মাছের সঙ্গে সব উপকরণ একসঙ্গে মেখে রাইস কুকারে দিতে হবে। যখন হয়ে আসবে, তখন নামিয়ে সাজিয়ে পরিবেশন করতে হবে।";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    case 9:
                        String name_obj9= "মাংস খিচুড়ি";
                        String upodetails_obj9= "পোলাও’র চাল ৬ কাপ, মসুরের ডাল আধা কাপ, মুগ ডাল আধা কাপ, মাংস ১ কেজি, পেঁয়াজ কুঁচি ১ কাপ, আদা বাটা ২ টেবিল চামচ, রসুন বাটা ২ টেবিল চামচ, জিরা গুড়া ১ চা চামচ, শুকনা মরিচ গুড়া ১ বা দেড় চা চামচ (ঝাল কতখানি খেতে চান সেইভাবে দেবেন), হলুদ গুড়া ২ চা চামচ, জয়ত্রী বাটা আধা চা চামচ, জয়ফল বাটা এক চিমটি, গরম মশলা (এলাচি কয়েকটা, দারুচিনি কয়েক পিস), লবণ স্বাদমতো, ভিনেগার ১ চা চামচ অথবা লেবুর রস ২ চা চামচ (গোশত নরম করার জন্য), কয়েকটা আস্ত কাঁচামরিচ, তেল দেড় কাপ, পানি (প্রণালীতে বলা হবে)";
                        String karjodtails_obj9= "পাতিলে তেল গরম করে পেঁয়াজ কুচি ও কয়েকটা কাঁচামরিচ ভেজে নিন। এবার এক এক করে উপকরণের সকল মসলা দিয়ে দিন। শুরুতে আদা বাটা, রসুন বাটা দিন। এবার গুড়া মশলা গুলো দিয়ে দিন। এরপর বাকি মসলা দিয়ে কিছুক্ষণ নেড়ে এককাপ পানি দিয়ে ঢেকে দিন। তেল উপরে উঠে আসা পর্যন্ত অপেক্ষা করুন। এখন মাংস দিয়ে দিন। দুইকাপ পানি দিন। ভিনেগার বা লেবুর রস দিয়ে দিন। ঢাকনা দিয়ে রান্না করুন। মাঝে মাঝে ঢাকনা তুলে উলটে দিন। এবার ফ্রাইপ্যানে অল্প তেল দিয়ে চাল, ডাল কিছুক্ষণ ভেজে নিন। মাংসের সঙ্গে চাল আর ডাল ভালোমতো মেশান। এবার পানি দিন। পানির পরিমাণ হবে চালের উপরে এক ইঞ্চির মত। পানি শুকিয়ে এলে ঢাকনা তুলে কাঠের চামচ দিয়ে যত্ন করে খিচুড়ি উল্টে-পাল্টে চুলার আঁচ কমিয়ে দিন। ১০ মিনিট পর নামান। সালাদ/ আচার দিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a9 = BitmapFactory.decodeResource(getResources(), R.drawable.chal_10);
                        ByteArrayOutputStream baos_a9 = new ByteArrayOutputStream();
                        bitmap_a9.compress(Bitmap.CompressFormat.PNG, 100, baos_a9);
                        byte[] b_a9 = baos_a9.toByteArray();

                        Intent Int_a9 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a9.putExtra("titel_name", name_obj9);
                        Int_a9.putExtra("upodetail_name", upodetails_obj9);
                        Int_a9.putExtra("karjodtails_name", karjodtails_obj9);

                        Int_a9.putExtra("picture", b_a9);

                        startActivity(Int_a9);

                        break;

                    case 10:

                        String name_obj10= "নিরামিষ খিচুড়ি";
                        String upodetails_obj10= "ছোলার ডাল ২ মুঠ, মুগডাল ও পোলাওর চাল আধা পোয়া করে, কিশমিশ, নারকেলের চিকন টুকরা আধা কাপ, আদাবাটা, জিরা-হলুদ-মরিচগুঁড়া ১ চা-চামচ করে, তেল, লবণ, ঘি, কাঁচা মরিচ, তেজপাতা, চিনি, গোটা জিরা, এলাচি ও দারচিনি।";
                        String karjodtails_obj10= "ছোলার ডাল হালকা সেদ্ধ করে নিন। মুগডাল ভেজে নিন। চাল-ডাল আলাদা ধুয়ে পানি ঝরিয়ে রাখতে হবে। তেল ও ঘি একসঙ্গে গরম করে নিন। তাতে এলাচি, দারচিনি, গোটা জিরা দিয়ে ডাল কষান। একটু কষিয়ে সব মসলা দিন। কিছুক্ষণ কষিয়ে চাল দিয়ে ভাজুন। ভাজা ভাজা করে তাতে গরম পানি দিয়ে লবণ, চিনি ও কাঁচা মরিচ ফালি করে দিন। খিচুড়ি হয়ে এলে ঘি ছড়িয়ে দিয়ে দমে রাখুন।";

                        Bitmap bitmap_a10 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a10 = new ByteArrayOutputStream();
                        bitmap_a10.compress(Bitmap.CompressFormat.PNG, 100, baos_a10);
                        byte[] b_a10 = baos_a10.toByteArray();

                        Intent Int_a10 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a10.putExtra("titel_name", name_obj10);
                        Int_a10.putExtra("upodetail_name", upodetails_obj10);
                        Int_a10.putExtra("karjodtails_name", karjodtails_obj10);

                        Int_a10.putExtra("picture", b_a10);

                        startActivity(Int_a10);
                        break;

                    case 11:
                        String name_obj11= "পাঁচ মিশালি ডালের খিচুড়ি";
                        String upodetails_obj11= "সিদ্ধ চাল এক কেজি, মসুর ডাল ১০০ গ্রাম, বুট ১০০ গ্রাম, মাষকলাই ১০০ গ্রাম, মটর ১০০ গ্রাম, মুগ ১০০ গ্রাম। পেঁয়াজ কিউব করে কাটা ১ কাপ, আস্ত কাঁচামরিচ ১০-১৫টি, তেজপাতা ২টি, লবণ স্বাদ অনুযায়ী, হলুদ গুঁড়া ২ চা চামচ, মরিচ গুঁড়া ২ চা চামচ, ধনিয়া গুঁড়া ১ চা চামচ, গরম মসলা গুঁড়া ১ চা চামচ, আদাবাটা আধা টেবিল চামচ, রসুন বাটা ২ চা চামচ, সরিষার তেল আধা কাপ ও পানি পরিমাণমতো।";
                        String karjodtails_obj11= "প্রথমে বুট, মটর ও মাষকলাইর ডাল পরিমাণমতো পানি দিয়ে সিদ্ধ করে পানি ঝরিয়ে রাখুন। চালের সঙ্গে মসুর ও মুগডাল ভালো করে ধুয়ে পানি ঝরিয়ে রাখুন। পাতিলে তেল গরম করে তাতে পেঁয়াজ ভেজে একে একে সব বাটা ও গুঁড়া মসলা, স্বাদ অনুযায়ী লবণ ও সামান্য পানি দিয়ে কষিয়ে নিন। তারপর তাতে চাল, ডাল এবং গরম মসলা দিয়ে কিছুক্ষণ ভেজে নিন। পরে তেজপাতা, কাঁচামরিচ ও পরিমাণমতো পানি দিয়ে ঢেকে আধ ঘণ্টা চুলায় রেখে রান্না করুন। খিচুড়ি মাখামাখা হয়ে এলে নামিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a11 = BitmapFactory.decodeResource(getResources(), R.drawable.chal_12);
                        ByteArrayOutputStream baos_a11 = new ByteArrayOutputStream();
                        bitmap_a11.compress(Bitmap.CompressFormat.PNG, 100, baos_a11);
                        byte[] b_a11 = baos_a11.toByteArray();

                        Intent Int_a11 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a11.putExtra("titel_name", name_obj11);
                        Int_a11.putExtra("upodetail_name", upodetails_obj11);
                        Int_a11.putExtra("karjodtails_name", karjodtails_obj11);

                        Int_a11.putExtra("picture", b_a11);

                        startActivity(Int_a11);

                        break;

                    case 12:
                        String name_obj12= "মুগ কলাই ডালের খিচুড়ি";
                        String upodetails_obj12= "চাল ১ কাপ, মুগ ডাল ১/২ কাপ, তেল ৪ টেবিল চামস, লবণ পরিমাণমতো, আদা বাটা ১ চা চামচ, রসুন বাটা ১ চা চামচ, জিরা বাটা ১ চা চামচ, হলুদ গুঁড়া ১/২ চা চামচ, পেঁয়াজ কুচি ১/২ কাপ, তেজ পাতা ২টি, গরম মসলা ১/২ চা চামচ, পানি ২ কাপ।";
                        String karjodtails_obj12= "ওপরের সব কিছু একসঙ্গে মেখে মাইক্রো হাইতে ৫ মিনিট চাল ভাজতে হবে, চাল ভাজা হয়ে গেলে পানি দিতে হবে। পানি দিয়ে মাইক্রো হাইতে ১০ মিনিট রান্না করতে হবে।";

                        Bitmap bitmap_a12 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a12 = new ByteArrayOutputStream();
                        bitmap_a12.compress(Bitmap.CompressFormat.PNG, 100, baos_a12);
                        byte[] b_a12 = baos_a12.toByteArray();

                        Intent Int_a12 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a12.putExtra("titel_name", name_obj12);
                        Int_a12.putExtra("upodetail_name", upodetails_obj12);
                        Int_a12.putExtra("karjodtails_name", karjodtails_obj12);

                        Int_a12.putExtra("picture", b_a12);

                        startActivity(Int_a12);

                        break;

                    case 13:
                        String name_obj13= "ভুনা খিচুড়ি";
                        String upodetails_obj13= "পোলাওয়ের চাল ১ কেজি, মুগডাল হালকা ভাজা ২ কাপ, পেঁয়াজ কুচি ১ কাপ, আদা বাটা ১ টেবিল চামচ, রসুন কুচি ১ টেবিল চামচ, শুকনা মরিচ গুঁড়ো ২ চা চামচ, হলুদ গুঁড়ো ২ চা চামচ, দারুচিনি-এলাচ ২/৩ টুকরা করে, তেজপাতা ৩/৪টি, লবণ ও তেল পরিমাণ মতো। (তেলের পরিবর্তে ঘি দিতে পারেন।)";
                        String karjodtails_obj13= "চাল ভালো করে ধুয়ে পানি ঝরিয়ে রাখুন। হাঁড়িতে তেল গরম হলে পেঁয়াজ, রসুন ভাজা হলে হলুদ বাদে সব মসলা দিয়ে দিন। এরপর ভালো করে নেড়ে ডাল ধুয়ে দিয়ে দিন। হলুদ গুঁড়ো, পানি, লবণ দিয়ে নেড়ে ঢেকে দিন। চাল-ডাল সেদ্ধ হলে নামিয়ে নিন। নামানোর ৫ মিনিট আগে ওপরে ঘি দিয়ে ঢেকে রাখুন। এতে সুস্বাদু হবে এবং সুন্দর ঘ্রাণ বেরোবে। সবশেষে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a13 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a13 = new ByteArrayOutputStream();
                        bitmap_a13.compress(Bitmap.CompressFormat.PNG, 100, baos_a13);
                        byte[] b_a13= baos_a13.toByteArray();

                        Intent Int_a13 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a13.putExtra("titel_name", name_obj13);
                        Int_a13.putExtra("upodetail_name", upodetails_obj13);
                        Int_a13.putExtra("karjodtails_name", karjodtails_obj13);

                        Int_a13.putExtra("picture", b_a13);

                        startActivity(Int_a13);

                        break;

                    case 14:

                        String name_obj14= "তেহারি";
                        String upodetails_obj14= "জিরা ১ টেবিল চামচ, ধনে গুঁড়া ১/২ চামচ, গোলমরিচ ৬টি, এলাচ ৭টি, দারুচিনি ২ টুকরো, জাফলং ১/২ চা চামচ, খাসি বা গরুর মাংস ছোট ছোট টুকরো ১ কেজি, তেল বা ঘি ৩ কাপ, পেঁয়াজ স্লাইস ৬টি, আদা বাটা ১ চামচ, রসুন বাটা ১ চামচ, দই ১/২ কাপ, কাঁচামরিচ ১০টি, পোলাও চাল ৫০০ গ্রাম, দুধ ১ কাপ, পানি প্রয়োজনমতো।";
                        String karjodtails_obj14= "জিরা, ধনে গুঁড়া, গোলমরিচ, এলাচ, দারুচিনি, জাফলং গুঁড়া করুন। গরম তেলে মাংসে আদা বাটা, রসুন বাটা, দই, কাঁচামরিচ, লবণ মিশিয়ে হালকা বাদামী করে ভাজুন এবং মাংস সিদ্ধ হলে মসলা দিয়ে নেড়ে নামান। হাঁড়িতে প্রয়োজনমতো পানি ফুটিয়ে চাল, দুধ, লবণ দিয়ে নাড়ূন। পোলাও চাল হয়ে আসার আগে ৬-৭ টুকরো কাঁচামরিচ দিন। অল্প আঁচে রেখে রান্না মাংস ছড়িয়ে দিন এবং মাংসগুলো পোলাও চালের সঙ্গে ভালোভাবে মিশিয়ে নিন। হয়ে এলে নামিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a14 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a14 = new ByteArrayOutputStream();
                        bitmap_a14.compress(Bitmap.CompressFormat.PNG, 100, baos_a14);
                        byte[] b_a14 = baos_a14.toByteArray();

                        Intent Int_a14 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a14.putExtra("titel_name", name_obj14);
                        Int_a14.putExtra("upodetail_name", upodetails_obj14);
                        Int_a14.putExtra("karjodtails_name", karjodtails_obj14);

                        Int_a14.putExtra("picture", b_a14);

                        startActivity(Int_a14);
                        break;

                    case 15:
                        String name_obj15= "পুরনো ঢাকার তেহারী";
                        String upodetails_obj15= "গরুর মাংস ছোট ছোট টুকরো ১ কেজি, গোলমরিচ ৫/৬টি, এলাচ ৭টি, দারুচিনি ২ টুকরো, জায়ফল১/২ টি, জয়ত্রি ১/২ চা চামচ, ভেজিটেবিল+সরিষার তেল ১/২ কাপ, পেঁয়াজ স্লাইস ১কাপ, আদা বাটা ২চামচ, রসুন বাটা ১ চামচ, টক দই ১/২ কাপ, কাঁচামরিচ ১০টি, পোলাও চাল ৫০০ গ্রাম, দুধ ১ কাপ, পানি প্রয়োজনমতো।";
                        String karjodtails_obj15= "-প্রথমে গোশতকে দই, আদা বাটা, রসুন বাটা, লবণ গুলমরিচের গুড়ো, গরম মসলা মিশিয়ে ম্যারিনেট করুন ১ ঘন্টা।\n-ডেকচিতে তেল দিয়ে পেয়াজ হালকা বাদামী করে ভেজে গোশত দিন, কম আঁচে ঢেকে রাখুন,প্রয়োজন হলে অল্প পানি দিন এবং মাংস সিদ্ধ হলে নেড়ে নামান।\n-হাঁড়িতে প্রয়োজনমতো (সাড়ে ৩ কাপ লাগবে ৫০০ গ্রাম চালে) পানি ফুটিয়ে চাল, দুধ, লবণ দিয়ে নাড়ূন। পোলাও এর চাল হয়ে আসার আগে ৬-৭ টুকরো কাঁচামরিচ দিন।\n-অল্প আঁচে রেখে রান্না গোশত ছড়িয়ে দিন এবং গোশতগুলো পোলাও এর চালের সঙ্গে ভালোভাবে মিশিয়ে নিন। হয়ে এলে নামিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a15 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a15 = new ByteArrayOutputStream();
                        bitmap_a15.compress(Bitmap.CompressFormat.PNG, 100, baos_a15);
                        byte[] b_a15 = baos_a15.toByteArray();

                        Intent Int_a15 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a15.putExtra("titel_name", name_obj15);
                        Int_a15.putExtra("upodetail_name", upodetails_obj15);
                        Int_a15.putExtra("karjodtails_name", karjodtails_obj15);

                        Int_a15.putExtra("picture", b_a15);

                        startActivity(Int_a15);

                        break;

                    case 16:
                        String name_obj16= "মটরশুঁটির পোলাও";
                        String upodetails_obj16= "বাসমতি চাল-৫০০ গ্রাম, মটরশুটি-৫০০ গ্রাম, ধনেপাতা-১ আঁটি, কাঁচামরিচ-৪টি, পাতিলেবুর রস-২ টেবিল চামচ, নারকেল বাটা ১ কাপ, কাজুবাদাম বাটা-১০০ গ্রাম, কিসমিস বাটা-১ টেবিল চামচ, দুধ-আধা কাপ, আদা বাটা-১ চা চামচ, পেঁয়াজ-২টি কুচানো, তেজপাতা-৪টি, জায়ফল গুঁড়ো-১ চা চামচ, ছোট এলাচ-৪টি, লবণ ও ঘি-আন্দাজমতো, ঘি-৫০ গ্রাম।";
                        String karjodtails_obj16= "চাল ধুয়ে পানি ঝরিয়ে একটি ছড়ানো পাত্রে শুকিয়ে নিন। মটরশুটি সেদ্ধ করে একটু ভেজে তুলে এর থেকে আধা কাপ আলাদা করে রেখে বাকিটা ধনেপাতা, কাঁচামরিচসহ বেটে নিয়ে এর মধ্যে ২ চা চামচ চিনি লেবুর রস ও একটু লবণ মাখিয়ে রাখুন।\nকাজু বাটা, নারকেল বাটা, কিসমিস বাটা একসঙ্গে মিশিয়ে রাখুন। ডেকচিতে ২ টেবিল চামচ ঘি গরম করে পানি ঝরানো চাল ঢেলে আঁচ কমিয়ে হালকা ভেজে এর মধ্যে কুচানো পেঁয়াজ দিয়ে চাল ও পেঁয়াজ হালকা করে ভেজে এর মধ্যে আদা বাটা দিয়ে নেড়ে পানি দিন। পানির মাপ এমন হবে যাতে চাল সিদ্ধ ও ঝরঝরে হয়। পানি শুকিয়ে গেলে আঁচ থেকে নামিয়ে ভাত একটা একটা ছড়ানো পাত্রে ছড়িয়ে দিন।\nঅন্য একটি পাত্রে বাকি ঘি গরম করে তেজপাতা, ছোট এলাচ দিয়ে ভাতের মধ্যে ঢেলে দিয়ে নেড়ে চেড়ে নামিয়ে নিন। পরিবেশন পাত্রে প্রথমে কিছুটা পোলাও ছড়িয়ে তার ওপর মটর শুটির মিশ্রণ, কাজুর মিশ্রণ দিন। সবশেষে সব পোলাও দিয়ে ঢেকে উপরে আলাদা করে রাখা সিদ্ধ মটরশুটি কিছু কাজু ও কিসমিস ছড়িয়ে দিন।";

                        Bitmap bitmap_a16 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a16= new ByteArrayOutputStream();
                        bitmap_a16.compress(Bitmap.CompressFormat.PNG, 100, baos_a16);
                        byte[] b_a16 = baos_a16.toByteArray();

                        Intent Int_a16 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a16.putExtra("titel_name", name_obj16);
                        Int_a16.putExtra("upodetail_name", upodetails_obj16);
                        Int_a16.putExtra("karjodtails_name", karjodtails_obj16);

                        Int_a16.putExtra("picture", b_a16);

                        startActivity(Int_a16);

                        break;

                    case 17:

                        String name_obj17= "মোরগ পোলাও";
                        String upodetails_obj17= "হাড়সহ মোরগের মাংস (বড় টুকরা করা) ২ কেজি, গরম ও তরল দুধ ২ কাপ, আদাবাটা ১ টেবিল-চামচ, রসুনবাটা ১ চা-চামচ, কাঁচা মরিচবাটা ১ টেবিল-চামচ, কাঁচা মরিচ (আস্ত) ৫-৬টি, পেঁয়াজ কুচি ১ কাপ, গরম মসলার গুঁড়া ১ চা-চামচ, লবণ স্বাদমতো, তেল ১ কাপ, টক দই ৪ টেবিল-চামচ।\n\nমসলা ও মোরগের স্টক: পানি দেড় লিটার, মোরগের হাড় ৪-৫ টুকরা, শাহি জিরা আধা চা-চামচ, এলাচ (থেঁতো করা) ৪টি, লবঙ্গ ১০-১২টি, গোল মরিচ ১২-১৪টি, তেজপাতা ২টি, দারচিনি ৪ টুকরা। সব উপকরণ জ্বাল দিয়ে পানি দেড় লিটার থেকে ১ লিটার করে ছেঁকে নিতে হবে।\n\nপোলাও: পোলাওয়ের চাল ৫০০ গ্রাম, পেঁয়াজ বেরেস্তা ১ কাপ, গুঁড়ো দুধ ১ কাপ, কিশমিশ ও বাদামের কুচি ১ টেবিল-চামচ, আলুবোখারা ৭-৮টি, ঘি ১ কাপ, লবণ স্বাদমতো, মাওয়া (গুঁড়া করা) আধা কাপ।";
                        String karjodtails_obj17= "মাংস ধুয়ে দই ও বাটা মসলা মাখিয়ে ১ ঘণ্টা মেরিনেট করে রাখতে হবে। সসপ্যানে তেল দিয়ে পেঁয়াজের কুচি একটু ভেজে মাখানো মাংস দিয়ে ভালো করে কষিয়ে সেদ্ধ করতে হবে এবং অন্য একটি পাত্রে তুলে রাখতে হবে। চাল ধুয়ে পানি ঝরাতে হবে। মাংস রান্না করার সসপ্যানে মুরগির স্টক দিয়ে তাতে গুঁড়ো দুধ, গরম মসলা ও চাল দিয়ে নাড়তে হবে, যেন সব দিকের চাল সমান তাপ পায়। চাল ফুটে উঠলে কিশমিশ, বাদাম কুচি, আলুবোখারা, লবণ, পেঁয়াজ বেরেস্তা দিয়ে ঢেকে দমে রাখতে হবে। ১০ মিনিট পর ঢাকনা খুলে রান্না করা মাংস সাজিয়ে নিচ থেকে কিছু পোলাও ও মাওয়া দিয়ে ঢেকে আরও ১৫ মিনিট দমে রাখতে হবে। সবশেষে সার্ভিং ডিশে সাজিয়ে পরিবেশন করা যায় মজাদার মোরগ পোলাও।";

                        Bitmap bitmap_a17 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a17 = new ByteArrayOutputStream();
                        bitmap_a17.compress(Bitmap.CompressFormat.PNG, 100, baos_a17);
                        byte[] b_a17 = baos_a17.toByteArray();

                        Intent Int_a17 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a17.putExtra("titel_name", name_obj17);
                        Int_a17.putExtra("upodetail_name", upodetails_obj17);
                        Int_a17.putExtra("karjodtails_name", karjodtails_obj17);

                        Int_a17.putExtra("picture", b_a17);

                        startActivity(Int_a17);
                        break;

                    case 18:
                        String name_obj18= "ফখরুদ্দিনের খাসির কাচ্চি বিরিয়ানি";
                        String upodetails_obj18= "খাসির মাংস ৬ কেজি (প্রতি কেজিতে ৮ থেকে ১০ টুকরা হবে), লবণ ২৫০ গ্রাম বা কিছুটা বেশি, আদা বাটা ১ কাপ, রসুন বাটা ১ কাপ, দই ২ কাপ, জর্দার রঙ বা জাফরান ২ গ্রাম, দারুচিনি ও এলাচি গুঁড়া দুই চা–চামচ করে, লবঙ্গ কয়েকটা, জয়ত্রী ২ চিমটি, শাহী জিরা আধা চা–চামচ, আস্ত দারুচিনি ও লবঙ্গ কয়েকটা, কাবাব চিনি ১ চা–চামচ, সাদা গোলমরিচের গুঁড়া ২ চা–চামচ, পেস্তা বাদাম ৫০ গ্রাম, তেজপাতা ৫ থেকে ১০টা, গোল আলু ১০টা (প্রতিটা ৪ টুকরা), পেঁয়াজ বেরেস্তা পরিমাণমতো, কালিজিরা চাল ৩ কেজি।";
                        String karjodtails_obj18= "মাংস ধুয়ে নিন। এবার দইয়ের মধ্যে দারুচিনি ও এলাচি গুঁড়া, জর্দার রং মিশিয়ে দইটা মাংসে মেশান। এরপর জয়ত্রী, সাদা গোলমরিচ, আদা-রসুন বাটাসহ বাকি সব মসলা মাংসে মেশান। চালটা আলাদা সেদ্ধ করে নিন। পেঁয়াজ বেরেস্তা করে নিন। আলুর টুকরাগুলো ভেজে নিন। এবার মসলা মাখানো মাংস রান্নার হাঁড়িতে ঢেলে সাজিয়ে নিন। তার ওপর ভাজা আলু ও পেঁয়াজ বেরেস্তা ছড়িয়ে দিন। এবার মাংসের ওপরে সেদ্ধ চাল সমান করে বিছিয়ে নিন। হাঁড়ির নিচে আগুন ও কয়লার দম দিন। হাঁড়ির মুখে ঢাকনা দিয়ে চারপাশ আটা দিয়ে বন্ধ করে দিন। তিন থেকে চার ঘণ্টার মধ্যে তৈরি হয়ে যাবে খাসির কাচ্চি বিরিয়ানি।\n\nহাজী মোহাম্মদ রফিকের টিপস\n\nমাংস রান্না করার আগে লবণ–পানিতে ভিজিয়ে রাখুন কয়েক ঘণ্টা। মাংস লবণে থাকার কারণে নরম হয়ে যাবে এবং সহজে সেদ্ধ হবে। ধুয়ে রান্না করুন।";

                        Bitmap bitmap_a18 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a18 = new ByteArrayOutputStream();
                        bitmap_a18.compress(Bitmap.CompressFormat.PNG, 100, baos_a18);
                        byte[] b_a18 = baos_a18.toByteArray();

                        Intent Int_a18 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a18.putExtra("titel_name", name_obj18);
                        Int_a18.putExtra("upodetail_name", upodetails_obj18);
                        Int_a18.putExtra("karjodtails_name", karjodtails_obj18);

                        Int_a18.putExtra("picture", b_a18);

                        startActivity(Int_a18);

                        break;

                    case 19:
                        String name_obj19= "হাজীর বিরিয়ানি";
                        String upodetails_obj19= "খাসির মাংস ৮ কেজি, পোলাওর চাল ৫ কেজি, পেঁয়াজ কুঁচি ২ কেজি, আদা ৪০০ গ্রাম, রসুন ২৫০ গ্রাম, কাঁচা মরিচ ৫০০ গ্রাম, তরল দুধ ১ কেজি, টক দই ১ কেজি, এলাচি ও দারুচিনি ৩০ গ্রাম করে, কাঠবাদাম ৫০০ গ্রাম, কিশমিশ ২৫০ গ্রাম, লবণ ২৫০ গ্রাম, তেল ৩ কেজি, তেজপাতা কয়েকটা।";
                        String karjodtails_obj19= "রান্নার জন্য বড় পাত্র নির্বাচন করুন। মাংস ছোট ছোট টুকরা করে ধুয়ে নিন। চাল ভিজিয়ে রাখুন। রান্নার পাত্রে তেল ঢেলে গরম করে নিন। এবার মোট পেঁয়াজ কুচির তিন ভাগের এক ভাগ তেলে দিয়ে নাড়ুন। কিছুক্ষণ পর আদা ও রসুন বাটা দিয়ে নাড়ুন। মসলা নাড়তে নাড়তে অনেকটা বুন্দিয়ার মতো দানা হয়ে এলে বাকি পেঁয়াজ দিয়ে আবার নাড়ুন। এবার মাংস ঢেলে দিন। সেই সঙ্গে টক দই, দুধ, এলাচি, দারুচিনি, মরিচ, কাঠবাদাম, তেজপাতা, লবণ দিয়ে দিয়ে দিন। এই সময়ে মাংসটা ভালো করে নাড়তে হবে। মাংস সেদ্ধ হয়ে এলে একটা সুন্দর ঘ্রাণ ছড়াবে। এবার মাংসের পাত্রে পর্যাপ্ত পানি দিতে হবে। প্রতি গ্লাস চালের জন্য চার গ্লাস পানি হিসেব করে নিলেই চলবে। পানিটা ফুটে এলে ভিজিয়ে রাখার পর নরম হয়ে আসা চাল দিয়ে দিন। এবার কিছুক্ষণ নেড়ে নিয়ে চুলার আঁচ কমিয়ে দমে দিয়ে রাখুন। ১৫ মিনিট পর পাত্রের ঢাকনা খুলে পুরো চালটা উল্টেপাল্টে দিন। তারপর আবার দমে দিয়ে রাখুন। আধঘণ্টা পর চাল ফুটে গেলে নামিয়ে পরিবেশন করতে পারেন।";

                        Bitmap bitmap_a19 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a19 = new ByteArrayOutputStream();
                        bitmap_a19.compress(Bitmap.CompressFormat.PNG, 100, baos_a19);
                        byte[] b_a19 = baos_a19.toByteArray();

                        Intent Int_a19 = new Intent(Chal_dal.this, AllViewActivity.class);
                        Int_a19.putExtra("titel_name", name_obj19);
                        Int_a19.putExtra("upodetail_name", upodetails_obj19);
                        Int_a19.putExtra("karjodtails_name", karjodtails_obj19);

                        Int_a19.putExtra("picture", b_a19);

                        startActivity(Int_a19);

                        break;

                    default:
                        break;
                }

            }


        });

        ////////////////////////////////////////////////////////////////////

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
        getMenuInflater().inflate(R.menu.chal_dal, menu);
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
            Intent intent= new Intent(Chal_dal.this,MachActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_mansho) {
            Intent intent= new Intent(Chal_dal.this,Mang_sho.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_chal) {
            Intent intent= new Intent(Chal_dal.this,Chal_dal.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_kabab) {
            Intent intent= new Intent(Chal_dal.this,Kabab.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_shak) {
            Intent intent= new Intent(Chal_dal.this,Shak_shobji.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_panio) {
            Intent intent= new Intent(Chal_dal.this,Panio.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_vorta) {
            Intent intent= new Intent(Chal_dal.this,Vorta.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_beking) {
            Intent intent= new Intent(Chal_dal.this,BekingActivity.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_dim) {
            Intent intent= new Intent(Chal_dal.this,Dim.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_soup) {
            Intent intent= new Intent(Chal_dal.this,Supe.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_tok) {
            Intent intent= new Intent(Chal_dal.this,Tok_jal_misti.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_bideshi) {
            Intent intent= new Intent(Chal_dal.this,Bide_shi.class);
            startActivity(intent);
            finish();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
