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


public class Bide_shi extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;

    String[] web = {

            "গ্রেভি বিফ চিলি",
            "কাশ্মীরি পোলাও",
            "ইটালিয়ান স্ক্র্যাম্বল্ড এগ",
            "অ্যারাবিয়ান রজবেল-জামবেরি",
            "ইটালিয়ান ফ্লোরেন্টাইন পিৎজা",
            "ইটালিয়ান অ্যারাগোস্টা ফ্রা ডায়াভোলো ",
            "ইটালিয়ান স্ক্যামপি আলা গ্রিগলিয়া ",
            "ইন্দোনেশীয় প্রন ফ্রিটার্স",
            "চাইনিজ প্রন টেম্পুরা ",
            "ফ্রাইড রাইস",
            "গ্রিল্ড চিজ এন্ড ভেজিটেবল স্যুপ",
            "তিউনিশিয়ান মাটন স্টু ইন ক্লে পট",
            "থাই টম ইয়াম কুন",
            "গ্রেভি নুডলস",
            "ফিলিপিনো প্রন আদাবো"
    } ;
    Integer[] imageId = {
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.bideshi_4,
            R.drawable.image,
            R.drawable.bideshi_6,
            R.drawable.image,
            R.drawable.bideshi_8,
            R.drawable.bideshi_9,
            R.drawable.bideshi_10,
            R.drawable.bideshi_11,
            R.drawable.image,
            R.drawable.bideshi_13,
            R.drawable.image,
            R.drawable.image,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bide_shi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        CustomAdapter adapter = new CustomAdapter(Bide_shi.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                switch (position) {
                    case 0:
                        String name_obj0= "গ্রেভি বিফ চিলি";
                        String upodetails_obj0= "হাড় ছাড়া মাংস ২ কেজি, কর্নফ্লাওয়ার ১০০ গ্রাম, ডিম ৪টি, পেঁয়াজ ৫০০ গ্রাম, মরিচ ১০টি, আদা ১০ গ্রাম, সয়া সস ৩০ গ্রাম, ওয়েস্টার সস ৫০ গ্রাম, লবণ পরিমাণমতো, গোলমরিচ ২ টেবিল চামচ, কুকিং অয়েল ৫০০ গ্রাম, বাটার ৫০ গ্রাম।";
                        String karjodtails_obj0= "মাংসগুলোকে ছোট ছোট পিস করে কেটে ধুয়ে নিতে হবে। এবার মাংস, ডিম ও কর্নফ্লাওয়ার দিয়ে ম্যারিনেট করতে হবে। মাংসগুলোকে ডিপ ফ্রাই করতে হবে। একটি ননস্টিক প্যানে বাটার দিতে হবে। বাটার গরম হলে এতে আদা বাটাও দিতে হবে এবং ধীরে ধীরে ফ্রাই করতে হবে। তারপর পেঁয়াজ ও মরিচ দিয়ে ভাজতে হবে বাদামি রঙ না হওয়া পর্যন্ত। এতে মাংসের টুকরাগুলো দিতে হবে। অতঃপর সয়া সস ও ওয়েস্টার সস দিয়ে মেশাতে হবে। এরপর স্টক অথবা পানি দিয়ে কয়েক মিনিট রান্না করতে হবে। তারপর গাঢ় করতে কর্নফ্লাওয়ার দিতে হবে। স্বাদ বাড়ানোর জন্য লবণ ও গোলমরিচ দেবেন পরিমাণমতো। ব্যস তৈরি হয়ে গেল আপনার মজাদার স্বাদের খাবার।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "কাশ্মীরি পোলাও";
                        String upodetails_obj1= "পুরোনো বাসমতী চাল দুই কাপ (ধুয়ে কুসুম গরম পানিতে ভিজিয়ে রাখুন), তেল সিকি কাপ, পেঁয়াজকুচি আধা কাপ, এলাচি চারটি, লবঙ্গ দুটি, লবণ এক টেবিল-চামচ অথবা স্বাদ অনুযায়ী, চিনি এক টেবিল-চামচ অথবা স্বাদ অনুযায়ী, কিশমিশ দুই টেবিল-চামচ, শাহি বিরিয়ানি মসলা এক টেবিল-চামচ, পোলাও রান্নার জন্য ফুটানো গরম পানি আড়াই কাপ, আদাবাটা এক চা-চামচ, কেওড়া এক টেবিল-চামচ, জাফরান আধা চা-চামচ, মাওয়া সিকি কাপ, আনারসকুচি এক কাপ, আঙুর চিরে নেওয়া ২৫০ গ্রাম, ঘি সিকি কাপ, তেজপাতা দুটি, দারচিটি চার টুকরা, গুঁড়ো দুধ দুই টেবিল-চামচ, কাজু বাদাম আধা কাপ, গরম পানি আড়াই কাপ, রসুনবাটা আধা চা-চামচ, গোলাপজল এক টেবিল-চামচ (দুই টেবিল-চামচ দুধে ভিজিয়ে ঢেকে রাখুন), ডালিম বা আনার দানা আধা কাপ, আপেলকুচি এক কাপ, চেরিকুচি সিকি কাপ, কমলা দুটি (ছিলে কোষের ভেতরের অংশ বের করে নিন)।\n\nশাহি বিরিয়ানি মসলা: দারচিনি, এলাচি (বড় ও ছোট), লবঙ্গ, জায়ফল, জয়ত্রী, সাদা গোলমরিচ, শাহি জিরা, কাবাব ও চিনি পরিমাণমতো টেলে গুঁড়া করে নিন।";
                        String karjodtails_obj1= "খুব সোজা , সবাই পারে । তা ও বলি । প্রথমে টাকি মাছ ধুয়ে নিতে হবে । এরপর লবণ আর হলুদ মাখিয়ে অল্প তেলে ভেজে নিতে হবে যেটা কে আমরা টেলে নেয়া বলি । তারপর মাছের কাঁটা বেচে নিতে হবে । তারপর,পেঁয়াজ কুচি,রসুন কুচি সরিষার তেলে একটু ভেজে নিতে হবে । শুকনা মরিচ ও টেলে নিতে হবে । এখন সব কিছু একসাথে মাখালেই রেডি টাকি মাছের ভর্তা ।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a1 = new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:
                        String name_obj= "ইটালিয়ান স্ক্র্যাম্বল্ড এগ";
                        String upodetails_obj= "ডিম ৪টি, দুধ ২ টেবিল চামচ, লবণ ১/২ চা চামচ, কুচি পেঁয়াজ ১/২ চা চামচ, কাঁচা মরিচ কুচি ১/২ চা চামচ, তেল ১ টেবিল চামচ, বাটার ১ টেবিল চামচ, পনির গ্রেট ২ টেবিল চামচ, গোল মরিচ গুঁড়া ১/৪ চা চামচ, গাজর গ্রেট সিদ্ধ করা ৩ টেবিল চামচ।";
                        String karjodtails_obj= "ডিম, দুধ, লবণ ও গোলমরিচ এক সাথে বিট করুন বিটার দিয়ে। চুলায় প্যান বসিয়ে দিন মাঝারি আঁচে। এরপর পেঁয়াজ, মরিচ কুচি ও গাজর ৫ মিনিট ভাজুন। জ্বালটা মাঝারি থেকে কমিয়ে ডিম দিয়ে দুই মিনিট ভাজুন। এবার পনির দিয়ে ৩০ সেকেন্ড ভেজে মাখন দিয়ে নেড়ে নামিয়ে নিন। ব্রেড টোস্ট দিয়ে পরিশেন করুন।";

                        Bitmap bitmap_a = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a= new ByteArrayOutputStream();
                        bitmap_a.compress(Bitmap.CompressFormat.PNG, 100, baos_a);
                        byte[] b_a = baos_a.toByteArray();

                        Intent Int_a = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a.putExtra("titel_name", name_obj);
                        Int_a.putExtra("upodetail_name", upodetails_obj);
                        Int_a.putExtra("karjodtails_name", karjodtails_obj);

                        Int_a.putExtra("picture", b_a);

                        startActivity(Int_a);

                        break;

                    case 3:

                        String name_obj2= "রজবেল-জামবেরি";
                        String upodetails_obj2= "শ্রিম্প ১ কেজি, পেঁয়াজ কুচি আধা কাপ, চাল ৪ কাপ, কর্নঅয়েল ১ কাপ, টমেটো পিউরি ২ কাপ, লবণ পরিমাণমতো, গোলমরিচ গুঁড়া ১ চা চামচ, দারচিনি গুঁড়া ১ চা চামচ, চিনি সামান্য, কাঠবাদাম আধাভাঙা ৩ টেবিল চামচ।";
                        String karjodtails_obj2= "চিংড়ির খোসা বাদ দিয়ে শিরা ফেলে দিতে হবে। চিংড়ি অল্প লবণ দিয়ে মাখিয়ে ময়দায় গড়িয়ে নিতে হবে। হাঁড়িতে ৮ কাপ পানি দিয়ে চুলায় দিতে হবে। পানি ফুটে উঠলে ২ টেবিল চামচ কর্নঅয়েল, টমেটো, লবণ, দারচিনি ও গোলমরিচ দিতে হবে। চাল ধুয়ে পানি ঝরিয়ে নিতে হবে। ভাত সেদ্ধ হয়ে এলে বাদাম ও চিনি দিয়ে কিছুক্ষণ দমে রেখে নামাতে হবে। প্যানে বাকি কর্নঅয়েল গরম করে পেঁয়াজ বাদামি রং করে ভেজে চিংড়ি দিয়ে ৫-৬ মিনিট ভুনতে হবে। সার্ভিং ডিশে ভাত রেখে ভাতের ওপর চিংড়ি ভুনা ঢেলে দিতে হবে।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.bideshi_4);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 4:
                        String name_obj3= "ফ্লোরেন্টাইন পিৎজা";
                        String upodetails_obj3= "টমেটো ১ কেজি, পেঁয়াজ কুচি পৌনে এক কাপ, রসুন ছেঁচা ৩ টেবিল-চামচ, জলপাই তেল ৩ টেবিল-চামচ, চিনি ২ টেবিল-চামচ, শুকনা মরিচ গুঁড়া ১ চা-চামচ, লবণ পরিমাণমতো, বেসিল শুকনা গুঁড়া ১ চা-চামচ, অরিগেনো ১ চা-চামচ, সিরকা ৪ টেবিল-চামচ।";
                        String karjodtails_obj3= "টমেটো পাতলা আবরণ ছাড়িয়ে কুচি করে নিতে হবে। তেল গরম করে তাতে রসুন-পেঁয়াজ ভাজতে হবে। নরম হলে মরিচ, লবণ, চিনি দিয়ে কিছুক্ষণ নাড়াচাড়া করে টমেটো দিয়ে আরও কিছুক্ষণ নাড়াচাড়া করে বাকি উপকরণ দিয়ে নামাতে হবে।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;



                    case 5:
                        String name_obj5= "অ্যারাগোস্টা ফ্রা ডায়াভোলো";
                        String upodetails_obj5= "বড় লবস্টার ১ কেজি, জলপাই তেল আধা কাপ, পেঁয়াজ কুচি সিকি কাপ, রসুন কুচি ১ টেবিল চামচ, লবণ স্বাদমতো, সাদা সিরকা ১ টেবিল চামচ, টুকরা করা বড় লাল টমেটো (খোসা, বীজ ও বাড়তি রস ফেলে) ২ কাপ, পার্সলে কুচি ১ টেবিল চামচ, অরিগেনো ১ চা চামচ, শুকনা মরিচ কুচি সিকি চা চামচ।";
                        String karjodtails_obj5= "বড় লবস্টারের মাথার নিচের ময়লা পরিষ্কার করে নিতে হবে। কিছুটা খোসা ফেলে এবং বড় পা ও গায়ের (চিমটা কাঁটা ফেলে) টুকরাগুলো থেকে ভেতরের মজ্জা বের করে আলাদা করে রাখতে হবে। বড় প্যানে জলপাই তেল দিয়ে ধোঁয়া ওঠা পর্যন্ত গরম জ্বাল দিয়ে বড় লবস্টারগুলো ও পায়ের মজ্জাগুলো ২-৩ মিনিট কড়া জ্বালে ভুনতে হবে। কাঠের নাড়ালি দিয়ে মাছ দু-তিনবার উল্টেপাল্টে পরে একটি পাত্রে লবস্টার উঠিয়ে রাখতে হবে। লবস্টার কখনো খুব বেশি জ্বাল দিয়ে শক্ত করা উচিত নয়। এতে খাদ্যমান কমে যায়। একটি সসপ্যানে অল্প অল্প তেল দিয়ে রসুন কুচি ভুনতে হবে। একটু মজে উঠলে সাদা সিরকা দিয়ে কড়া আঁচে ফুটিয়ে ঘন করে নিতে হবে। টমেটো কুচি, পার্সলে, অরিগেনো, লাল মরিচ, লবণ ইত্যাদি দিয়ে মিশ্রণটি ঘন করে নামাতে হবে। লবস্টারগুলো ওই মিশ্রণের মধ্যে ঢেলে ৮-১০ মিনিট মাঝারি আঁচে মাঝেমধ্যে নেড়েচেড়ে জ্বাল দিয়ে নামাতে হবে। পরিবেশন পাত্রে কিছু পার্সলে দিয়ে সাজাতে হবে।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.bideshi_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "স্ক্যামপি আলা গ্রিগলিয়া";
                        String upodetails_obj6= "গলদা চিংড়ি ৫০০ গ্রাম, মাখন ৬ টেবিল চামচ, জলপাই তেল আধা কাপ, লেবুর রস ১ টেবিল চামচ, ছোট পেঁয়াজ কুচি সিকি কাপ, রসুন কুচি ১ টেবিল চামচ, পার্সলে কুচানো ৪ টেবিল চামচ, গোলমরিচ গুঁড়া ১ চা চামচ, লবণ স্বাদমতো।";
                        String karjodtails_obj6= "লেজের অংশ বাদে চিংড়ি মাছের খোসা ফেলে ভালোভাবে পরিষ্কার করে ধুয়ে পানি ঝরিয়ে শুকিয়ে নিতে হবে। প্যানে অল্প আঁচে মাখন গলিয়ে চিংড়ি ছাড়তে হবে। চিংড়ি হালকা রং ধরলে জলপাই তেল, লেবুর রস দিয়ে নাড়তে হবে। রসুন কুচি, লবণ ও কিছু গোলমরিচ গুঁড়া মাছের ওপর দিতে হবে। গলদা চিংড়িগুলো উভয় পাশে উল্টে দিয়ে ভুনতে হবে। একটু পরে চিংড়ি ভুনে মজে উঠলে গরম গরম প্লেটে উঠিয়ে নিতে হবে। চিংড়ি ওঠানোর পর পাত্রে থাকা তরল অংশ ৫-১০ মিনিট কড়া জ্বালে ঘন সসের মতো হয়ে এলে প্লেটে রাখা সাজানো চিংড়িগুলোর ওপরে ওই সস গরম গরম ঢেলে দিতে হবে। মাছের ওপর কিছু পার্সলে কুচি ও লেবুর রস দিয়ে গরম গরম পরিবেশন করতে হবে পাস্তা বা ওই জাতীয় খাদ্যের সঙ্গে।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "প্রন ফ্রিটার্স";
                        String upodetails_obj7= "চিংড়ি মাথা ও খোসা ছাড়িয়ে কুচি করে কাটা দেড় কাপ, ডিম ২টি, বেকিং পাউডার ১ চা চামচ, ময়দা আধা কাপ, কর্নফ্লাওয়ার সিকি কাপ, সাদা গোলমরিচ গুঁড়া ১ চা চামচ, লাইট সয়াসস ১ টেবিল চামচ, লবণ পরিমাণমতো, তেল (ভাজার জন্য) ২ টেবিল চামচ, পেঁয়াজ কুচি সিকি কাপ, কাঁচামরিচ মিহি কুচি ১ টেবিল চামচ।";
                        String karjodtails_obj7= "চিংড়ি কুচি সয়াসস মাখিয়ে ২০ মিনিট রাখতে হবে। ময়দা, কর্নফ্লাওয়ার, বেকিং পাউডার একসঙ্গে মিশিয়ে নিতে হবে। ডিম, পেঁয়াজ, গোলমরিচ, কাঁচামরিচ, লবণ একসঙ্গে মাখিয়ে অল্প অল্প করে মিশ্রিত ময়দার সঙ্গে মিশিয়ে চিংড়ি দিয়ে মেশাতে হবে। কড়াইয়ে তেল গরম করে বড়ার মতো অল্প অল্প করে চিংড়ির মিশ্রণ দিয়ে মচমচে করে ভেজে ওঠাতে হবে। প্রন ফির্টাস গারলিক সস, রেড চিলি সস অথবা টমেটো সসের সঙ্গে গরম গরম পরিবেশন করা যায়।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.bideshi_8);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "প্রন টেম্পুরা";
                        String upodetails_obj8= "চিংড়ি (বড় সাইজ) আধা কেজি, ডিম ২টি, পেঁয়াজ বাটা ১ টেবিল চামচ, এরারুট ১ টেবিল চামচ, ময়দা ৬ টেবিল চামচ, কাঁচামরিচ বাটা ২ চা চামচ, লেবুর রস/ভিনেগার ১ টেবিল চামচ, বেকিং পাউডার সিকি চা চামচ, স্বাদলবণ আধা চা চামচ, সয়াসস ২ টেবিল চামচ, আদা+রসুন বাটা ১ চা চামচ, সাদা সরিষা বাটা (তাওয়ায় টালা) ১ টেবিল চামচ, পানি পরিমাণমতো, তেল প্রয়োজনমতো।";
                        String karjodtails_obj8= "চিংড়ি মাছের লেজ রেখে মাথা ও খোসা ফেলে দিতে হবে। মাছের ওপর দিকে (অর্থাৎ মাথা ফেলে দিলে যে অবস্থায় থাকে) একটু চিরে নিতে হবে। ২ টেবিল চামচ সয়াসস দিয়ে ভিজিয়ে রাখতে হবে ২০ থেকে ২৫ মিনিট। এবার পাউরুটিগুলো কিউব করে কেটে নিতে হবে। পাউরুটির ধারের শক্ত অংশগুলো ফেলে দিতে হবে। তেল ও পাউরুটি বাদে সব উপকরণ একসঙ্গে মাখাতে হবে। পাউরুটির একপাশে মসলা মাখিয়ে ওর ওপর সোজা করে মাছটি বসিয়ে দিতে হবে। মনে রাখতে হবে, তেল খুব গরম করতে হবে। পাউরুটিতে মসলা এবং মাছ বসানো অংশটি তেলের ভেতর আগে দিতে হবে। বাদামি রং করে ভেজে নামাতে হবে।";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.bideshi_9);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    case 9:
                        String name_obj9= "ফ্রাইড রাইস";
                        String upodetails_obj9= "সরু চাল ২০০ গ্রাম। মটরশুঁটি ছাড়ানো ১০০ গ্রাম। মোরগের কলিজা ৪টি। মোরগের মাংস ২০০ গ্রাম। চিংড়ি ৬০ গ্রাম। ডিম ৩টি। সয়াসস ২ টেবিল-চামচ। মরিচ গুঁড়া চা-চামচের ৪ ভাগের ১ ভাগ। অঙ্কুরিত ডাল ৭৫ গ্রাম। তেল ৫ টেবিল-চামচ। লবণ ও গোলমরিচ স্বাদমতো।";
                        String karjodtails_obj9= "চাল ধুয়ে ফুটন্ত লবণ পানিতে ১০ মিনিট ফোটান। ঝাঁঝরিতে ভাত ঢালুন। কলের নিচে ধরে ঠাণ্ডা পানিতে ভাত ধুয়ে নিন। পানি ঝরান। মটরশুঁটি, কলিজা, মাংস, চিংড়ি আলাদা আলাদা আধা সিদ্ধ করে ভাতের সঙ্গে মেশান। ডিমে সয়াসস, মরিচ, লবণ, গোলমরিচ ও চিনি দিয়ে ফেটিয়ে রাখুন। অঙ্কুরিত ডাল গামলায় নিয়ে উপরে ফুটন্ত পানি ঢালুন। সঙ্গে সঙ্গে পানি ঝরিয়ে ঠাণ্ডা পানিতে রাখুন। কড়াইয়ে তেল গরম করুন। ভাত দিয়ে ১০ মিনিট নেড়ে নেড়ে ভাজুন। অঙ্কুরিত ডাল দিয়ে একবার নাড়ুন। ফেটানো ডিম ঢেলে দিন। ডিম ঘন হতে আরম্ভ করলে মাঝে মাঝে নেড়ে মেশান। গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a9 = BitmapFactory.decodeResource(getResources(), R.drawable.bideshi_10);
                        ByteArrayOutputStream baos_a9 = new ByteArrayOutputStream();
                        bitmap_a9.compress(Bitmap.CompressFormat.PNG, 100, baos_a9);
                        byte[] b_a9 = baos_a9.toByteArray();

                        Intent Int_a9 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a9.putExtra("titel_name", name_obj9);
                        Int_a9.putExtra("upodetail_name", upodetails_obj9);
                        Int_a9.putExtra("karjodtails_name", karjodtails_obj9);

                        Int_a9.putExtra("picture", b_a9);

                        startActivity(Int_a9);

                        break;

                    case 10:

                        String name_obj10= "গ্রিল্ড চিজ এন্ড ভেজিটেবল স্যুপ";
                        String upodetails_obj10= "টমেটো, মাঝারি ৬টি। গাজর ঝুরি আধা কাপ। বাঁধাকপি ঝুরি ১ কাপ। তেল ২ টেবিল-চামচ। পেঁয়াজ কুচি ২ টেবিল-চামচ। তেজপাতা ১টি। কর্নফ্লাওয়ার ১ টেবিল-চামচ। দারুচিনি একটু বড় ২ টুকরা। লবঙ্গ ২টি। আস্ত গোলমরিচ ছেঁচা ৪টি। মটরশুঁটি সিদ্ধ আধা কাপ। টমেটো কুচি ১টি। চিনি আধা কাপ। পনির ঝুরি ৪ টেবিল-চামচ। লবণ স্বাদমতো।";
                        String karjodtails_obj10= "টমেটো বড় টুকরা করুন। ৫ কাপ পানি দিয়ে সিদ্ধ করে ব্লেন্ড করে ছেঁকে নিন। সসপ্যানে তেল গরম করে পেঁয়াজ ও তেজপাতা দিয়ে আধা মিনিট ভাজুন। গাজর ও বাঁধাকপি দিয়ে আরও ১ মিনিট ভাজুন। ছেঁকে নেওয়া টমেটোর রস দিন। অল্প পানিতে কর্নফ্লাওয়ার গুলে নাড়ুন। দারুচিনি, লবঙ্গ, গোলমরিচ পাতলা কাপড়ে পুটলি বেঁধে সুপে দিন। ২ চা-চামচ লবণ দিয়ে ২০ মিনিট সিদ্ধ করুন। মটরশুঁটি, টমেটো, চিনি ও সামান্য গোলমরিচের গুঁড়া দিয়ে একবার ফুটান। চুলা থেকে নামিয়ে মসলার পুটলি তুলে ফেলুন। পরিবেশনের বড় বাটিতে সুপ ঢালুন। উপরে পনির কুচি ছিটিয়ে দিন। ওভেনে দিয়ে ৫ মিনিট গ্রিল করুন। পাউরুটি টোস্ট দিয়ে পরিবেশন করতে পারেন।";

                        Bitmap bitmap_a10 = BitmapFactory.decodeResource(getResources(), R.drawable.bideshi_11);
                        ByteArrayOutputStream baos_a10 = new ByteArrayOutputStream();
                        bitmap_a10.compress(Bitmap.CompressFormat.PNG, 100, baos_a10);
                        byte[] b_a10 = baos_a10.toByteArray();

                        Intent Int_a10 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a10.putExtra("titel_name", name_obj10);
                        Int_a10.putExtra("upodetail_name", upodetails_obj10);
                        Int_a10.putExtra("karjodtails_name", karjodtails_obj10);

                        Int_a10.putExtra("picture", b_a10);

                        startActivity(Int_a10);
                        break;

                    case 11:
                        String name_obj11= "তিউনিশিয়ান মাটন স্টু ইন ক্লে পট";
                        String upodetails_obj11= "খাসির মাংস ২ কেজি, তেল ১ কাপ, মাখন ২ টেবিল চামচ, পেঁয়াজ কাটা ২ কাপ, সাদা গোলমরিচ গুঁড়া আধা চা চামচ, লবণ পরিমাণমতো, টমেটো পেস্ট ১ কাপ, বাদাম পেস্ট আধা কাপ, লাল মরিচ গুঁড়া ১ চা চামচ, হলুদ গুঁড়া ১ চা চামচ, দারুচিনি গুঁড়া আধা চা চামচ, জিরা গুঁড়া ১ চা চামচ, পানি পরিমাণমতো, পেস্তা পেস্ট আধা কাপ, স্যাফরন ১ চিমটি।";
                        String karjodtails_obj11= "একটি পাত্রে কাটা পেঁয়াজ, তেল, রসুন বাদামি রঙ না হওয়া পর্যন্ত ভাজতে থাকুন। এবার এর মধ্যে টমেটো পেস্ট, হলুদ, লাল মরিচ এবং লবণ দিয়ে ৫ মিনিট রাখুন। এরপর এতে মাংস দিয়ে ভালোভাবে মেশান। পানি দিয়ে মাঝারি আঁচে রান্না করুন। মাংস সিদ্ধ হয়ে গেলে ওভেনপ্রুফ মাটির পাত্রে ঢেলে তাতে সাদা গোলমরিচ গুঁড়া, দারুচিনি গুঁড়া, জিরা গুঁড়া, পেস্তা ও বাদাম পেস্ট দিয়ে ভালোভাবে মেশান, মাটির পাত্রটির ঢাকনা ময়দার পেস্ট দিয়ে বন্ধ করুন। এবার হালকা আঁচে ৪৫ মিনিট রান্না করুন।";

                        Bitmap bitmap_a11 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a11 = new ByteArrayOutputStream();
                        bitmap_a11.compress(Bitmap.CompressFormat.PNG, 100, baos_a11);
                        byte[] b_a11 = baos_a11.toByteArray();

                        Intent Int_a11 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a11.putExtra("titel_name", name_obj11);
                        Int_a11.putExtra("upodetail_name", upodetails_obj11);
                        Int_a11.putExtra("karjodtails_name", karjodtails_obj11);

                        Int_a11.putExtra("picture", b_a11);

                        startActivity(Int_a11);

                        break;

                    case 12:
                        String name_obj12= "থাই টম ইয়াম কুন";
                        String upodetails_obj12= "চিংড়ি ২৫০ গ্রাম, থাই আদা ১ টুকরা, মাশরুম ৪টি, লেমন গ্রাস ২টি, বড় পেঁয়াজ ১টি, থাই লেবুপাতা ৪টি (সবকিছু চারকোনা করে কেটে নিতে হবে), স্বাদ লবণ ১ চা চামচ, ফিশ সস ৩ টেবিল চামচ, লেবুর রস ২ টেবিল চামচ, লবণ পরিমাণমতো, চিনি ১ টেবিল চামচ বা পরিমাণমতো, সাদা গোলমরিচ গুঁড়া আধা চা চামচ, শুকনা মরিচ ১টি, ধনেপাতা কুচি ১ টেবিল চামচ, কার্নেশন মিল্ক ২ টেবিল চামচ, টম ইয়াম পেস্ট ২ টেবিল চামচ,  স্টক ৫ কাপ।";
                        String karjodtails_obj12= "গরম স্টক চুলায় দিয়ে সব উপকরণ পর্যায়ক্রমে দিয়ে লবণ, চিনি ও টকের পরিমাণ চেখে দেখে কিছুক্ষণ চুলায় রেখে নামাতে হবে।";

                        Bitmap bitmap_a12 = BitmapFactory.decodeResource(getResources(), R.drawable.bideshi_13);
                        ByteArrayOutputStream baos_a12 = new ByteArrayOutputStream();
                        bitmap_a12.compress(Bitmap.CompressFormat.PNG, 100, baos_a12);
                        byte[] b_a12 = baos_a12.toByteArray();

                        Intent Int_a12 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a12.putExtra("titel_name", name_obj12);
                        Int_a12.putExtra("upodetail_name", upodetails_obj12);
                        Int_a12.putExtra("karjodtails_name", karjodtails_obj12);

                        Int_a12.putExtra("picture", b_a12);

                        startActivity(Int_a12);

                        break;

                    case 13:
                        String name_obj13= "গ্রেভি নুডলস";
                        String upodetails_obj13= "নুডলস ১০০ গ্রাম, ক্যাপসিকাম আধা কাপ, রেড ক্যাবেজ ১ কাপ, গাজর জুলিয়ান কাট ১ কাপ, বকচয় ১ কাপ, চিংড়ি আধা কাপ, বেবিকর্ন স্লাইস আধা কাপ, বাটন মাশরুম আধা কাপ, সুইট কর্ন কোয়ার্টার কাপ, তেল ৬ টেবিল চামচ, চিলি সস ১ চা চামচ, চিকেন স্টক দেড় কাপ, উস্টার সস ১ টেবিল চামচ, ফিশসস আধা চা চামচ, কর্নফ্লাওয়ার ২ টেবিল চামচ, রসুন কুচি ২ চা চামচ, কাঁচামরিচ ফালি ৬টি, গোলমরিচ গুঁড়ো আধা চা চামচ, টেস্টিং সল্ট কোয়ার্টার চা চামচ, লেবুর রস ১ টেবিল চামচ, ফিশসস ২ টেবিল চামচ, কাজুবাদাম ভাজা কোয়ার্টার কাপ।";
                        String karjodtails_obj13= "ক্যাপসিকাম, রেড ক্যাবেজ, গাজর, বকচয় ধুয়ে ঝুরি করে কাটুন। চিংড়ির লেজ রেখে মাথা ও খোসা ছাড়িয়ে ধুয়ে রাখুন। ফ্রাইপ্যানে ২ টেবিল চামচ তেল গরম করে চিংড়ি ১ মিনিট নেড়ে সব সবজি দিয়ে ২ মিনিট ভাজুন। এক কাপ চিকেন স্টক ও বাকি সব উপকরণ পরপর দিন। কর্নফ্লাওয়ার কোয়ার্টার কাপ স্টকে গুলে দিন। স্টারফ্রাই করে নামান। কোয়ার্টার কাপ তেলে রসুন কুচি ভেজে নুডলস, ফিশসস দিয়ে ২ মিনিট ভাজুন। গরম নুডলস একটি ছড়ানো ডিশে ঢালুন। উপরে গ্রেভি সবজি ছড়িয়ে দিন। কাজুবাদাম ছিটিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a13 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a13 = new ByteArrayOutputStream();
                        bitmap_a13.compress(Bitmap.CompressFormat.PNG, 100, baos_a13);
                        byte[] b_a13= baos_a13.toByteArray();

                        Intent Int_a13 = new Intent(Bide_shi.this, AllViewActivity.class);
                        Int_a13.putExtra("titel_name", name_obj13);
                        Int_a13.putExtra("upodetail_name", upodetails_obj13);
                        Int_a13.putExtra("karjodtails_name", karjodtails_obj13);

                        Int_a13.putExtra("picture", b_a13);

                        startActivity(Int_a13);

                        break;

                    case 14:

                        String name_obj14= "প্রন আদাবো";
                        String upodetails_obj14= "বড় সাইজের চিংড়ি আধা কেজি, কুচি করে কাটা রসুন ১ চা চামচ, সাদা গোলমরিচ গুঁড়া ১ চা চামচ, সাদা সিরকা ২ টেবিল চামচ, লবণ পরিমাণমতো, চিনি ২ চা চামচ, সয়াসস ১ টেবিল চামচ, গারলিক সস ১ টেবিল চামচ, ময়দা ১ টেবিল চামচ, পার্সলে পাতা ১ ছড়া, মাখন ৫০ গ্রাম।";
                        String karjodtails_obj14= "চিংড়ি লেজ ও মাথা রেখে খোসা ছাড়িয়ে পিঠের দিক অল্প চিরে শিরা বের করতে হবে। সিরকা, গোলমরিচ, লবণ, চিনি ১ কাপ পানিতে মিশিয়ে চিংড়িতে দিয়ে ৫ মিনিট ফুটিয়ে চুলা থেকে নামিয়ে আরও ৫-৭ মিনিট রেখে পানি থেকে চিংড়ি উঠিয়ে রাখতে হবে। সসের জন্য প্যানে ১ টেবিল চামচ মাখন গলিয়ে ময়দা মৃদু আঁচে বাদামি রং করে ভেজে অল্প অল্প করে চিংড়ি সেদ্ধ পানি মেশাতে হবে। ফ্রাইপ্যানে বাকি মাখন গলিয়ে রসুন দিয়ে ভেজে চিংড়ি দিয়ে বেশি জ্বালে ২ মিনিট ভেজে সয়াসস দিয়ে চুলা থেকে নামিয়ে সস মেশাতে হবে। পরিবেশন পাত্রে প্রন আদাবো ঢেলে সাদা গোলমরিচ গুঁড়া ও পার্সলে পাতা ছিটিয়ে দিয়ে গরম গরম পরিবেশন করতে হবে।";

                        Bitmap bitmap_a14 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a14 = new ByteArrayOutputStream();
                        bitmap_a14.compress(Bitmap.CompressFormat.PNG, 100, baos_a14);
                        byte[] b_a14 = baos_a14.toByteArray();

                        Intent Int_a14 = new Intent(Bide_shi.this, AllViewActivity.class);
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

       /////////////////////////////////////////////////////////////////////////////////////
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
        getMenuInflater().inflate(R.menu.bide_shi, menu);
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
            Intent intent= new Intent(Bide_shi.this,MachActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_mansho) {
            Intent intent= new Intent(Bide_shi.this,Mang_sho.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_chal) {
            Intent intent= new Intent(Bide_shi.this,Chal_dal.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_kabab) {
            Intent intent= new Intent(Bide_shi.this,Kabab.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_shak) {
            Intent intent= new Intent(Bide_shi.this,Shak_shobji.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_panio) {
            Intent intent= new Intent(Bide_shi.this,Panio.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_vorta) {
            Intent intent= new Intent(Bide_shi.this,Vorta.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_beking) {
            Intent intent= new Intent(Bide_shi.this,BekingActivity.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_dim) {
            Intent intent= new Intent(Bide_shi.this,Dim.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_soup) {
            Intent intent= new Intent(Bide_shi.this,Supe.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_tok) {
            Intent intent= new Intent(Bide_shi.this,Tok_jal_misti.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_bideshi) {
            Intent intent= new Intent(Bide_shi.this,Bide_shi.class);
            startActivity(intent);
            finish();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
