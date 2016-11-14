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

public class Dim extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    ListView list;

    String[] web = {
            "ডিমের হালুয়া",
            "ডিম চপ",
            "ডিম চিচিঙ্গা ভাজি",
            "ইংলিশ ওমলেট",
            "ইলিশের ডিমের কেক",
            "সবজি-মাছের ডিমের কাটলেট",
            "ডিম আলু চপ",
            "ক্রিম পুডিং",
            "ডিমের কাশ্মীরি কোরমা",
            "ডিম চপ",
            "এগ প্যাটিস",
            "সবজি-মাছের ডিমের কাটলেট",
            "মাছের ডিম দিয়ে করলা ভাজি",
            "মাছের ডিমের পুঁই খিলি",
            "ডিম চিচিঙ্গা ভাজি"
    } ;





    Integer[] imageId = {
            R.drawable.dim_1,
            R.drawable.dim_2,
            R.drawable.dim_3,
            R.drawable.dim_4,
            R.drawable.dim_5,
            R.drawable.dim_6,
            R.drawable.dim_7,
            R.drawable.dim_8,
            R.drawable.dim_9,
            R.drawable.dim_10,
            R.drawable.dim_11,
            R.drawable.dim_12,
            R.drawable.dim_13,
            R.drawable.dim_14,
            R.drawable.dim_15
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dim);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        CustomAdapter adapter = new CustomAdapter(Dim.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                switch (position) {
                    case 0:
                        String name_obj0= "ডিমের হালুয়া";
                        String upodetails_obj0= "ডিম ৬টি, দুধ ১ লিটার, কনডেন্সড মিল্ক আধা কৌটা, চিজনি আধা কাপ বা স্বাদ অনুযায়ী, এলাচ গুঁড়া ৪/৫টি, দারুচিনি ৩ টুকরো, কিশমিশ ১ টেবিল চামচ, গোলাপজল ১ টেবিল চামচ, ঘি ১ কাপ, পেস্তা বাদাম কুচি ১ টেবিল চামচ।";
                        String karjodtails_obj0= "দুধ জ্বাল দিয়ে ঘন করে ঠাণ্ডা করুন। ডিম ফেটিয়ে নিন। এবার সব উপকরণ একসঙ্গে মিশিয়ে নিন। প্যানে ঘি দিয়ে সব উপকরণ ঢেলে নাড়তে থাকুন। হয়ে গেলে নামিয়ে নিন এবং পরিবেশন করুন।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_1);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "ডিম চপ";
                        String upodetails_obj1= "সেদ্ধ ডিম ৪টি, সেদ্ধ আলু ৩ কাপ, কাচা ডিম ২টি, টোস্ট গুঁড়া ১কাপ, পেঁয়াজ কুচি আধা কাপ, আদা কুচি ১ চা চামচ, কাঁচামরিচ কুচি ১ টেবিল চামচ, জিরা গুঁড়া ১ চা-চামচ, গোলমরিচ গুঁড়া ১ চা চামচ, টেস্টিং সল্ট আধা চা চামচ, সাধারণ লবণ পরিমাণ মতো, তেল পরিমাণ মতো।";
                        String karjodtails_obj1= "প্রথমে কড়াইয়ে তেল গরম করে নিন। গরম তেলে পেঁয়াজ কুচি, আদা বাদামি রং করে ভেজে কাঁচামরিচ দিয়ে কিছুক্ষণ চুলায় রেখে নামিয়ে নিন। তেল ঝরিয়ে সেদ্ধ আলুগুলো পেঁয়াজের সঙ্গে মেখে নিন। এরপর আলুর সঙ্গে গোলমরিচ ও জিরা গুঁড়া মাখিয়ে আটটি ভাগ করে নিন। দ্বিতীয় পর্বে ৪টি সেদ্ধ ডিম লম্বা করে দুই ভাগে কেটে আটটি ভাগ করে নিন। অর্ধেক করে কাটা ডিমের পিস আলুর মধ্যে ভরে চপের মতো আকার করুন। এবার অন্য একটি পাত্রে কাচা ডিম দটি ফেটিয়ে চপগুলো ডিমে ডুবিয়ে টোস্টের গুঁড়া মেঘে ডুবো তেলে ছেড়ে দিন। ভাজা হয়ে গেলে তুলে ফেলুন। হয়ে গেলো ডিম চপ। এবার টমেটো সস বা তেঁতুলের চাটনি দিয়ে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_2);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "ডিম চিচিঙ্গা ভাজি";
                        String upodetails_obj2= "ডিম ফেটানো দুটা, চিচিঙ্গা কুচি দুই বাটি, পেঁয়াজ কুচি এক টেবিল চামচ, কাঁচা মরিচ ফাড়া ৪টা, টেস্টিং সল্ট একটুখানি, লবণ স্বাদমত, তেল সামান্য, রসুন কুচি অল্প।";
                        String karjodtails_obj2= "কড়াইতে তেল দিয়ে তাতে চিচিঙ্গা, পেঁয়াজ, রসুন, কাঁচা মরিচ দিন। নেড়েচেড়ে লবণ দিন। চিচিঙ্গা সিদ্ধ হয়ে এলে তাতে দুটো ডিম ও টেস্টিং সল্ট দিয়ে খুব ভালো করে মেশান। কিছুক্ষণ নেড়েচেড়ে নামিয়ে পরিবেশন করুন। এটা সকালে রুটি বা পরোটার সঙ্গে ভালো লাগবে।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_3);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "ইংলিশ ওমলেট";
                        String upodetails_obj3= "ডিম ৫টি, শসা ১টি, সুইটকর্ণ ১/২ কাপ, কুচি টমেটো ছোট একটি, কুচানো সিদ্ধ মুরগির মাংস ১/২ কাপ, লবণ পরিমাণমতো, তেল ৩ টেবিল চামচ, গোল মরিচ গুঁড়া ১/২ চা চামচ।";
                        String karjodtails_obj3= "প্যানে তেল দিয়ে শসা, সুইটকর্ণ, টমেটো কুচি, মুরগি দিয়ে ১ মিনিট ভাজুন। ডিম, লবণ ও গোল মরিচ বিট করুন। প্যানের সবজির উপর ডিম ঢেলে পনির গ্রেট করে ঢাকন দিয়ে রাখুন। অল্প আঁচে ৫ মিনিট রান্না করুন। হয়ে গেলে পিজ্জার শেইপে কেটে পরিবেশন করুন।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_4);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "ইলিশের ডিমের কেক";
                        String upodetails_obj4= "ইলিশ মাছের ডিম বড় ৪ টুকরো, ময়দা ১ কাপ, মুরগির ডিম ২টি, বেকিং পাউডার ১ চা-চামচ, গোলমরিচের গুঁড়া আধা চা-চামচ, দুধ সিকি কাপ, চিনি ২ চা-চামচ, লবণ আধা চা-চামচ (স্বাদ অনুযায়ী), তেল বা মাখন আধা কাপ, পেঁয়াজ কুচি আধা কাপ, কাঁচা মরিচ কুচি ২ টেবিল-চামচ, পুদিনাপাতা কুচি ২ টেবিল-চামচ ও লেবুর রস ১ টেবিল-চামচ।";
                        String karjodtails_obj4= "তেল বা মাখন, চিনি, সিকি চা-চামচ লবণ, গোলমরিচের গুঁড়া ও বেকিং পাউডার একসঙ্গে ফেটে নিন। মাখন ও চিনির সঙ্গে একেকটি করে মোট ২টি মুরগির ডিম ফেটে নিন। অল্প অল্প দুধ দিয়ে ফেটুন ও ময়দা আলতোভাবে মিশিয়ে নিন। বেকিং কেকের পাত্রে সামান্য মাখন মেখে ময়দা ছড়িয়ে চারধারে বিছিয়ে দিন। তৈরি মিশ্রণ এই পাত্রে ঢেলে সমানভাবে ছড়িয়ে দিন। এক চিমটি লবণ মাছের ডিমে মেখে কেকের মিশ্রণের ওপর পাশাপাশি বিছিয়ে দিন। লেবুর রস, পেঁয়াজ, মরিচ ও পুদিনাপাতা এক চিমটি লবণ দিয়ে মেখে নিন। ডিমের পাশে খালি জায়গা পেঁয়াজ ও মরিচের মিশ্রণ দিয়ে ঢেকে দিন। ১৮০ ডিগ্রি সেলসিয়াস তাপে প্রি-হিট ওভেনে ৪০ থেকে ৫০ মিনিট কেক বেক করুন।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_5);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "সবজি-মাছের ডিমের কাটলেট";
                        String upodetails_obj5= "যেকোনো বড় মাছের ডিম দেড় কাপ। লবণ ও হলুদ দিয়ে সিদ্ধ করে পানি ঝরিয়ে নিন। বড় আলু সিদ্ধ একটি। কাঁচা কলা সিদ্ধ দুটি ২৫০ গ্রাম। সয়াসস এক টেবিল চামচ। সিজনিং সস (যেকোনো শপিংমলে পাওয়া যাবে) সিকি চামচ। কর্নফ্লাওয়ার চার টেবিল চামচ। লবণ দুই চা-চামচ। মরিচ গুঁড়া আধা চা-চামচ। গোলমরিচ ফাঁকি আধা চামচ। গরম মসলার ফাঁকি আধা চামচ। পেঁয়াজ মিহি কুচি দুই টেবিল চামচ। পুদিনা পাতা কুচি দুই টেবিল চামচ। ডিমের সাদা অংশ একটি। বিস্কুটের গুঁড়া এক কাপ। লেবুর রস এক টেবিল চামচ। চিনি দুই চা-চামচ। তেল ভাজার জন্য।";
                        String karjodtails_obj5= "আলু ও কাঁচা কলা খোসা ছাড়িয়ে আধা ভাঙা করে নিন। তেল, কাঁচা মরিচ কুচি, পেঁয়াজ ও পুদিনা পাতা কুচি, কর্নফ্লাওয়ার, মুরগির ডিম ও বিস্কুটের গুঁড়া বাদে বাকি সব উপকরণ কাঁচা কলা ও আলুর সঙ্গে মিশিয়ে পাটায় মসৃণ করে বেটে নিন। একটি বাটিতে ডিমের সাদা অংশের সঙ্গে এক চিমটি লবণ মিশিয়ে ফেটে নিন। অন্য একটি সমতল প্লেটে টোস্ট বিস্কুটের গুঁড়া রাখুন। পেঁয়াজ, কাঁচা মরিচ ও পুদিনা পাতা কুচি কচলে নিন। তারপর কাঁচা কলা, আলু ও মাছের ডিমের মিশ্রণ, পেঁয়াজ, কাঁচা মরিচ ও পুদিনা পাতা কুচি এবং কর্নফ্লাওয়ার—সবকিছু একত্রে ভালো করে মিশিয়ে মেখে ৮-১০টি গোলা আলাদাভাবে ভাগ করে নিন। হাতের তালুতে সামান্য করে তেল মেখে নিয়ে একেকটি গোলা দিয়ে চেপে কাটলেটের আকারে তৈরি করে নিন। এটি গোলানো ডিমে চুবিয়ে বিস্কুটের গুঁড়ায় গড়িয়ে একটি ট্রেতে সাজিয়ে ফ্রিজে দুই ঘণ্টা রেখে দিন। ফ্রাই প্যানে তেল গরম করে দুই পিঠ লাল করে ভেজে যেকোনো সস বা চাটনির সঙ্গে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "ডিম আলু চপ";
                        String upodetails_obj6= "আলু ৫০০ গ্রাম, সিদ্ধ ডিম ২টি, ধনেপাতা কুচি ২ টেবিল চামচ, পেঁয়াজ কুচি আধা কাপ, কাঁচামরিচ কুচি ১ টেবিল চামচ, পুদিনাপাতা কুচি ১ চা-চামচ, জিরা গুঁড়া ১ চা-চামচ, মরিচ গুঁড়া আধা চা-চামচ (টেলে নেওয়া মরিচ), ধনে গুঁড়া আধা চা-চামচ, লবণ স্বাদ অনুযায়ী, বিস্কুটের গুঁড়া প্রয়োজনমতো, একটি ডিম ফেটানো এবং তেল ভাজার জন্য।";
                        String karjodtails_obj6= "প্রথমে আলু সিদ্ধ করে খোসা ছাড়িয়ে ভর্তা করে নিন। ডিমও একইভাবে সিদ্ধ করে খোসা ছাড়িয়ে ভর্তা করে নিন। তারপর ভর্তা করা ডিম ও আলুর সঙ্গে একে একে সব মসলা ও পেঁয়াজ কুচি ভালো করে মাখিয়ে হাত দিয়ে গোল গোল বা চ্যাপ্টা করে প্রথমে ফেটানো ডিমে মাখিয়ে তারপর বিস্কুটের গুঁড়ায় গড়িয়ে কিছুক্ষণ ফ্রিজে রেখে দিন। তারপর চপগুলো গরম গরম ডুবন্ত তেলে ভেজে সাজিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_7);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "ক্রিম পুডিং";
                        String upodetails_obj7= "ঘন দুধ ২ কাপ, চিনি ১ কাপ, মুরগির ডিম ৪টি, এলাচ গুঁড়া ২টি, ক্রিম ২ টেবিল চামচ।";
                        String karjodtails_obj7= "১ লিটার দুধ জ্বাল দিয়ে ঘন করে অর্ধেক করে নিতে হবে। ডিমের সঙ্গে চিনি মিশিয়ে দুধ, ডিম, চিনি, এলাচ গুঁড়া ও ক্রিম ভালো করে ব্লেন্ড করে নিতে হবে। এবার একটা পাত্র চুলায় দিয়ে তাতে সামান্য ঘি/তেল/মাখন/চিনি দিয়ে ক্যারামেল করে নিতে হবে। এবার চিনি দিয়ে ক্যারামেল করা পাত্রে ডিমের মিশ্রণটি ঢেলে পাত্রের মুখ ঢাকনা দিয়ে ঢেকে ভাপে সেদ্ধ অথবা প্রেসার কুকারে পানি দিয়ে ১৫-২০ মিনিট ভাপে রাখতে হবে। পুডিং ঠাণ্ডা হতে দিতে হবে। ছুরি দিয়ে ছাঁচের চারপাশে ঘুরিয়ে কেটে নিতে হবে। প্লেট ছাঁচের মুখে চেপে ধরে উল্টে দিতে হবে। ফ্রিজে রেখে ঠাণ্ডা হলে পরিবেশন করুন সুস্বাদু ক্রিম পুডিং।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_8);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "ডিমের কাশ্মীরি কোরমা";
                        String upodetails_obj8= "সিদ্ধ ডিম ৬টি, টক দই আধা কাপ, মিষ্টি দই সিকি কাপ, পেঁয়াজ কুচি ২ কাপ, পেঁয়াজ বাটা ২ টেবিল চামচ, আদা বাটা ১ চা চামচ, বাদাম বাটা ২ টেবিল চামচ, ঘি সিকি কাপ, তেল আধা কাপ, গরম মসলার গুঁড়া ১ চা চামচ, কিসমিস ২ টেবিল চামচ, লবণ পরিমাণমতো, গোলমরিচ গুঁড়া ১ চা চামচ।";
                        String karjodtails_obj8= "তেল, ঘি গরম করে পেঁয়াজ বাদামি রং করে ভেজে সব বাটা মসলা কষিয়ে গুঁড়া মসলা দিয়ে ১ কাপ পানি দিতে হবে। ফুটে উঠলে বাদাম বাটা ও দই দিতে হবে। কিসমিস ও ডিম দিয়ে নামাতে হবে।";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_9);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    case 9:
                        String name_obj9= "ডিম চপ";
                        String upodetails_obj9= "সেদ্ধ ডিম ৫টি, সেদ্ধ আলু ৫টি মাঝারি, গরম মসলা গুঁড়ো এক টেবিল-চামচ, ধনেপাতা কুচি ১ চা-চামচ, পেঁয়াজ মিহি কুচি ২ টেবিল-চামচ, কাঁচা মরিচ কুচি ১ টেবিল-চামচ, ফেটানো ডিম ২টি, টোস্টের গুঁড়ো ১ কাপ, লবণ স্বাদমতো, তেল ভাজার জন্য যতটুকু লাগে।";
                        String karjodtails_obj9= "সেদ্ধ ডিম ও তেল ছাড়া বাকি উপকরণ দিয়ে একটি মণ্ড তৈরি করতে হবে। এবং পাঁচ ভাগে ভাগ করে নিন। তার মাঝখানে সেদ্ধ ডিম দিয়ে ফেটানো ডিমে ডুবিয়ে নিন। এরপর টোস্টের গুঁড়ো মেখে ডুবো তেলে ভেজে তুলুন। সস দিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a9 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_10);
                        ByteArrayOutputStream baos_a9 = new ByteArrayOutputStream();
                        bitmap_a9.compress(Bitmap.CompressFormat.PNG, 100, baos_a9);
                        byte[] b_a9 = baos_a9.toByteArray();

                        Intent Int_a9 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a9.putExtra("titel_name", name_obj9);
                        Int_a9.putExtra("upodetail_name", upodetails_obj9);
                        Int_a9.putExtra("karjodtails_name", karjodtails_obj9);

                        Int_a9.putExtra("picture", b_a9);

                        startActivity(Int_a9);

                        break;

                    case 10:

                        String name_obj10= "এগ প্যাটিস";
                        String upodetails_obj10= "পাফ ডো : বাটার ২০০ গ্রাম, ডিম ২টা, লবণ স্বাদমতো, ময়দা ২ কাপ, সয়াবিন তেল ৩ টেবিল চামচ।\n\nফিলিং : সিদ্ধ ডিম ৩টা, পেঁয়াজ কুচি ১ কাপ, লবণ স্বাদমতো, গরম মসলা পাউডার ১ টেবিল চামচ, কাঁচামরিচ কুচি ১ টেবিল চামচ, সয়াবিন তেল ৪ টেবিল চামচ।";
                        String karjodtails_obj10= "ময়দা, লবণ, সয়াবিন তেল একসঙ্গে ভালো করে মাখিয়ে ডিম দিয়ে খামির তৈরি করে নিতে হবে। এবার কড়াইয়ে সয়াবিন তেল দিয়ে পেঁয়াজ কুচি একটু লাল করে ভেজে গরম মসলার পাউডার, লবণ, কাঁচামরিচ কুচি দিয়ে নামাতে হবে। এরপর পাফ ডো থেকে রুটি বেলে তার ওপর বাটার দিয়ে তিন ভাগ করে কেটে আবার রুটি মতো বেলে চারকোণা করে কাটতে হবে। তারপর পেঁয়াজের ফিলিং তার ওপরে অর্ধেক সিদ্ধ ডিম দিয়ে ভাঁজ দিতে হবে। সবশেষে কনভেকশন ওভেনে ২২০ ডিগ্রি সেন্টিগ্রেড তাপে ২০-২৫ মিনিট বেক করুন।";

                        Bitmap bitmap_a10 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_11);
                        ByteArrayOutputStream baos_a10 = new ByteArrayOutputStream();
                        bitmap_a10.compress(Bitmap.CompressFormat.PNG, 100, baos_a10);
                        byte[] b_a10 = baos_a10.toByteArray();

                        Intent Int_a10 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a10.putExtra("titel_name", name_obj10);
                        Int_a10.putExtra("upodetail_name", upodetails_obj10);
                        Int_a10.putExtra("karjodtails_name", karjodtails_obj10);

                        Int_a10.putExtra("picture", b_a10);

                        startActivity(Int_a10);
                        break;

                    case 11:
                        String name_obj11= "সবজি-মাছের ডিমের কাটলেট";
                        String upodetails_obj11= "যেকোনো বড় মাছের ডিম দেড় কাপ। লবণ ও হলুদ দিয়ে সিদ্ধ করে পানি ঝরিয়ে নিন। বড় আলু সিদ্ধ একটি। কাঁচা কলা সিদ্ধ দুটি ২৫০ গ্রাম। সয়াসস এক টেবিল চামচ। সিজনিং সস (যেকোনো শপিংমলে পাওয়া যাবে) সিকি চামচ। কর্নফ্লাওয়ার চার টেবিল চামচ। লবণ দুই চা-চামচ। মরিচ গুঁড়া আধা চা-চামচ। গোলমরিচ ফাঁকি আধা চামচ। গরম মসলার ফাঁকি আধা চামচ। পেঁয়াজ মিহি কুচি দুই টেবিল চামচ। পুদিনা পাতা কুচি দুই টেবিল চামচ। ডিমের সাদা অংশ একটি। বিস্কুটের গুঁড়া এক কাপ। লেবুর রস এক টেবিল চামচ। চিনি দুই চা-চামচ। তেল ভাজার জন্য।";
                        String karjodtails_obj11= "আলু ও কাঁচা কলা খোসা ছাড়িয়ে আধা ভাঙা করে নিন। তেল, কাঁচা মরিচ কুচি, পেঁয়াজ ও পুদিনা পাতা কুচি, কর্নফ্লাওয়ার, মুরগির ডিম ও বিস্কুটের গুঁড়া বাদে বাকি সব উপকরণ কাঁচা কলা ও আলুর সঙ্গে মিশিয়ে পাটায় মসৃণ করে বেটে নিন। একটি বাটিতে ডিমের সাদা অংশের সঙ্গে এক চিমটি লবণ মিশিয়ে ফেটে নিন। অন্য একটি সমতল প্লেটে টোস্ট বিস্কুটের গুঁড়া রাখুন। পেঁয়াজ, কাঁচা মরিচ ও পুদিনা পাতা কুচি কচলে নিন। তারপর কাঁচা কলা, আলু ও মাছের ডিমের মিশ্রণ, পেঁয়াজ, কাঁচা মরিচ ও পুদিনা পাতা কুচি এবং কর্নফ্লাওয়ার—সবকিছু একত্রে ভালো করে মিশিয়ে মেখে ৮-১০টি গোলা আলাদাভাবে ভাগ করে নিন। হাতের তালুতে সামান্য করে তেল মেখে নিয়ে একেকটি গোলা দিয়ে চেপে কাটলেটের আকারে তৈরি করে নিন। এটি গোলানো ডিমে চুবিয়ে বিস্কুটের গুঁড়ায় গড়িয়ে একটি ট্রেতে সাজিয়ে ফ্রিজে দুই ঘণ্টা রেখে দিন। ফ্রাই প্যানে তেল গরম করে দুই পিঠ লাল করে ভেজে যেকোনো সস বা চাটনির সঙ্গে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a11 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_12);
                        ByteArrayOutputStream baos_a11 = new ByteArrayOutputStream();
                        bitmap_a11.compress(Bitmap.CompressFormat.PNG, 100, baos_a11);
                        byte[] b_a11 = baos_a11.toByteArray();

                        Intent Int_a11 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a11.putExtra("titel_name", name_obj11);
                        Int_a11.putExtra("upodetail_name", upodetails_obj11);
                        Int_a11.putExtra("karjodtails_name", karjodtails_obj11);

                        Int_a11.putExtra("picture", b_a11);

                        startActivity(Int_a11);

                        break;

                    case 12:
                        String name_obj12= "মাছের ডিম দিয়ে করলা ভাজি";
                        String upodetails_obj12= "করলা পাতলা গোল গোল করে কেটে বিচি পরিষ্কার করে নেওয়া দুই কাপ। আলু পাতলা করে কাটা আধা কাপ। যেকোনো বড় মাছের ডিম সিদ্ধ আধা কাপ। পেঁয়াজ গোল পাতলা করে কাটা এক কাপ। হলুদ গুঁড়া আধা চা-চামচ। মরিচ গুঁড়া আধা চা-চামচ। তেল সিকি কাপ। কাঁচা ও পাকা মরিচ ফালি এক চা-চামচ অথবা স্বাদ অনুযায়ী। লবণ স্বাদ অনুযায়ী।";
                        String karjodtails_obj12= "বাটিতে তেল, আধা কাপ পেঁয়াজ কুচি, কাঁচা মরিচ ফালি ও ডিম বাদে সব উপকরণ একত্রে মিশিয়ে আলতোভাবে মেখে নিন। অন্য একটি বাটিতে বাকি আধা কাপ পেঁয়াজ কুচির সঙ্গে মাছের ডিমগুলো মেখে ফালি করা কাঁচা মরিচ দিয়ে আলাদা রাখুন। কড়াইয়ে তেল গরম করে সব উপকরণ দিয়ে মাখা করলা ও আলু দিয়ে নেড়ে আঁচ কমিয়ে ঢেকে দিন। মাঝে ঢাকনা খুলে হালকাভাবে নাড়ুন। করলা ও আলু সিদ্ধ হয়ে এলে পেঁয়াজ ও কাঁচা মরিচ ফালিসহ মিশিয়ে রাখা মাছের ডিমগুলো ওপর থেকে ছিটিয়ে দিন। চুলার আঁচ কমিয়ে নেড়ে ঢেকে দিন। দু-তিনবার ঢাকনা খুলে নাড়ুন। বেশ ভাজা ভাজা হয়ে তেল ছাড়া শুরু করলে ঢেকে চুলা বন্ধ করে দিন। গরম গরম ভাতের সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a12 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_13);
                        ByteArrayOutputStream baos_a12 = new ByteArrayOutputStream();
                        bitmap_a12.compress(Bitmap.CompressFormat.PNG, 100, baos_a12);
                        byte[] b_a12 = baos_a12.toByteArray();

                        Intent Int_a12 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a12.putExtra("titel_name", name_obj12);
                        Int_a12.putExtra("upodetail_name", upodetails_obj12);
                        Int_a12.putExtra("karjodtails_name", karjodtails_obj12);

                        Int_a12.putExtra("picture", b_a12);

                        startActivity(Int_a12);

                        break;

                    case 13:
                        String name_obj13= "মাছের ডিমের পুঁই খিলি";
                        String upodetails_obj13= "মাছের ডিম (যেকোনো) ১ কাপ, হলুদ গুঁড়া আধা চা-চামচ, মরিচ গুঁড়া আধা চা-চামচ, সরিষা বাটা আধা চা-চামচ, লেবুর রস ১ চা-চামচ, লবণ স্বাদমতো, পুঁইপাতা ১০-১২টি, টুথপিক ১০-১২টি, ময়দা ১ কাপ ও তেল ভাজার জন্য।";
                        String karjodtails_obj13= "ডিম (মাছের) পরিষ্কার করে ধুয়ে তাতে হলুদ, মরিচ, সরিষা বাটা, লবণ ও লেবুর রস মাখিয়ে নিন। একেকটি পুঁইপাতা পানের খিলির মতো করে তাতে মাছের ডিম ভরে দিন এবং টুথপিক দিয়ে পাতার মুখ বন্ধ করে ময়দা, পানি ও লবণ দিয়ে একটি মিশ্রণ তৈরি করে তাতে খিলিগুলো ডুবিয়ে ডুবো তেলে বাদামি করে ভেজে তুলুন। পরিবেশনের সময় টুথপিকগুলো খুলে চায়ের সঙ্গেও পরিবেশন করা যায়।";

                        Bitmap bitmap_a13 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_14);
                        ByteArrayOutputStream baos_a13 = new ByteArrayOutputStream();
                        bitmap_a13.compress(Bitmap.CompressFormat.PNG, 100, baos_a13);
                        byte[] b_a13= baos_a13.toByteArray();

                        Intent Int_a13 = new Intent(Dim.this, AllViewActivity.class);
                        Int_a13.putExtra("titel_name", name_obj13);
                        Int_a13.putExtra("upodetail_name", upodetails_obj13);
                        Int_a13.putExtra("karjodtails_name", karjodtails_obj13);

                        Int_a13.putExtra("picture", b_a13);

                        startActivity(Int_a13);

                        break;

                    case 14:

                        String name_obj14= "ডিম চিচিঙ্গা ভাজি";
                        String upodetails_obj14= "ডিম ফেটানো দুটা, চিচিঙ্গা কুচি দুই বাটি, পেঁয়াজ কুচি এক টেবিল চামচ, কাঁচা মরিচ ফাড়া ৪টা, টেস্টিং সল্ট একটুখানি, লবণ স্বাদমত, তেল সামান্য, রসুন কুচি অল্প।";
                        String karjodtails_obj14= "কড়াইতে তেল দিয়ে তাতে চিচিঙ্গা, পেঁয়াজ, রসুন, কাঁচা মরিচ দিন। নেড়েচেড়ে লবণ দিন। চিচিঙ্গা সিদ্ধ হয়ে এলে তাতে দুটো ডিম ও টেস্টিং সল্ট দিয়ে খুব ভালো করে মেশান। কিছুক্ষণ নেড়েচেড়ে নামিয়ে পরিবেশন করুন। এটা সকালে রুটি বা পরোটার সঙ্গে ভালো লাগবে।";

                        Bitmap bitmap_a14 = BitmapFactory.decodeResource(getResources(), R.drawable.dim_15);
                        ByteArrayOutputStream baos_a14 = new ByteArrayOutputStream();
                        bitmap_a14.compress(Bitmap.CompressFormat.PNG, 100, baos_a14);
                        byte[] b_a14 = baos_a14.toByteArray();

                        Intent Int_a14 = new Intent(Dim.this, AllViewActivity.class);
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

       ///////////////////////////////////////////////////////////

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
        getMenuInflater().inflate(R.menu.dim, menu);
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
            Intent intent= new Intent(Dim.this,MachActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_mansho) {
            Intent intent= new Intent(Dim.this,Mang_sho.class);
            startActivity(intent);

        } else if (id == R.id.nav_chal) {
            Intent intent= new Intent(Dim.this,Chal_dal.class);
            startActivity(intent);

        } else if (id == R.id.nav_kabab) {
            Intent intent= new Intent(Dim.this,Kabab.class);
            startActivity(intent);

        } else if (id == R.id.nav_shak) {
            Intent intent= new Intent(Dim.this,Shak_shobji.class);
            startActivity(intent);

        } else if (id == R.id.nav_panio) {
            Intent intent= new Intent(Dim.this,Panio.class);
            startActivity(intent);

        }else if (id == R.id.nav_vorta) {
            Intent intent= new Intent(Dim.this,Vorta.class);
            startActivity(intent);

        }else if (id == R.id.nav_beking) {
            Intent intent= new Intent(Dim.this,BekingActivity.class);
            startActivity(intent);

        }else if (id == R.id.nav_dim) {
            Intent intent= new Intent(Dim.this,Dim.class);
            startActivity(intent);

        }else if (id == R.id.nav_soup) {
            Intent intent= new Intent(Dim.this,Supe.class);
            startActivity(intent);

        }else if (id == R.id.nav_tok) {
            Intent intent= new Intent(Dim.this,Tok_jal_misti.class);
            startActivity(intent);

        }else if (id == R.id.nav_bideshi) {
            Intent intent= new Intent(Dim.this,Bide_shi.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
