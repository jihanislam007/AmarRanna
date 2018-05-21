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

public class BekingActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;

    String[] web = {
            "বিজয় কুকি ",
            "রিং কুকিজ",
            "সুইট বল কুকিজ",
            "কর্নফ্লেক্স কুকিজ",
            "বাটার কুকিজ",
            "মাখন কেক",
            "চকলেট লেয়ার কেক",
            "গাজরের কেক",
            "তালের কেক",
            "রয়েল আইসিন কেক"
    } ;





    Integer[] imageId = {
      //      R.drawable.beking_1,
            R.drawable.image,
            R.drawable.image,
     //       R.drawable.beking_4,
            R.drawable.image,
            R.drawable.image,
    //        R.drawable.beking_7,
            R.drawable.image,
     //       R.drawable.beking_9,
     //       R.drawable.beking_10
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beking);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        CustomAdapter adapter = new CustomAdapter(BekingActivity.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub


                switch (position) {
                    case 0:
                        String name_obj0= "বিজয় কুকি";
                        String upodetails_obj0= "৩ কাপ ময়দা, ৩/৪ চা চামচ বেকিং পাউডার, ১/৪ চা চামচ লবণ, ১ কাপ মাখন, ১ কাপ চিনি, ১ টি ফেটা ডিম, ১ টেবিল চামচ দুধ, পাউডার চিনি খামির বেলার জন্য, ১ চা চামচ ভ্যানিলা এক্সট্র্যাক্ট।";
                        String karjodtails_obj0= "ময়দা, বেকিং পাউডার এবং লবণ একসঙ্গে মিশিয়ে চালনি দিয়ে ছাঁকুন। এগুলো সরিয়ে রাখুন। একটি বড় বাটির মধ্যে মাখন এবং চিনি মিক্সিং মেশিনে দিয়ে মিক্স করতে থাকুন। তারপর মাখন এবং চিনি যখন ক্রিমের মতো আকার ধারণ করবে, তখন ডিম ও দুধ দিয়ে আরো কিছুক্ষণ মেশান। তারপর দ্বিতীয় বারে বাকি ময়দাটা ডিম মিশ্রণের সঙ্গে মেশান। ময়দার খামিরের চার ভাগের এক ভাগ আলাদা করে এতে লাল রং মেশাবেন। মেশানোর পরে প্লাস্টিক দিয়ে মুড়িয়ে একে একটা সিলিন্ডারের আকৃতি দেবেন এবং ডিপ ফ্রিজের ভেতরে রেখে দেবেন। বাদবাকি খামিরকে সবুজ রং দেবেন এবং ফ্রিজের ভেতরে রেখে দেবেন। আধাঘণ্টা পরে এই খামিরকে পিঁড়িতে বেলবেন।\nপিঁড়িতে ময়দার বদলে পাউডার চিনি ছড়িয়ে দিন। তারপর সবুজ রঙের খামিরটাকে বেলতে থাকুন। ১/৪ ইঞ্চি পুরুত্ব হলে লাল রঙের খামিরকে এনে মাঝখানে রেখে চারদিকে সবুজ রঙের খামির দিয়ে মুড়ে দেবেন। তারপর প্লাস্টিক দিয়ে মুড়িয়ে বর্গাকারের আকৃতি দেবেন এবং আবার ফ্রিজে রেখে দেবেন।\n১-২ ঘণ্টা পরে এই বর্গাকৃতির খামিরকে বের ফ্রিজ থেকে বের করে প্লাস্টিক সরিয়ে ১/৪ ইঞ্চি পুরু করে স্লাইস করুন। তারপর বেকিং ট্রেতে নিয়ে ৩৭৫ ডিগ্রি ফা. তাপমাত্রায় রেখে ১৫-২০ মিনিট বেক করুন। তারপর ঠাণ্ডা করে সুন্দর পাত্রে পরিবেশন করুন।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.nav);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "রিং কুকিজ";
                        String upodetails_obj1= "বাটার ২০০ গ্রাম, আইসিং সুগার ১০০ গ্রাম, ময়দা ১৫০ গ্রাম, ভেনিলা ১/২ চামচ, বেকিং পাউডার ১ চা চামচ, গুঁড়া দুধ ২ টেবিল চামচ, ফ্রুট কালার (যে কোনো) সামান্য।";
                        String karjodtails_obj1= "প্রথমে একটি পাত্রে বাটার ও আইসিং সুগার দিয়ে ভালো করে বিট করতে হবে যেন চিনি গলে যায়। এরপর ভেনিলা দিয়ে ময়দা, গুঁড়া দুধ, বেকিং পাউডার এক সঙ্গে চেলে মিশ্রণের সঙ্গে মেখে রুটির মতো খামি তৈরি করতে হবে। খামি দুই ভাগে ভাগ করে এক ভাগের সঙ্গে সবুজ রঙ মেশাতে হবে। এরপর একটার মধ্যে আরেকটা দিয়ে রোল করে কেটে ১৫০ ডিগ্রি সেন্টিগ্রেড তাপে ১০-১৫ মিনিট বেক করতে হবে।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "সুইট বল কুকিজ";
                        String upodetails_obj2= "ময়দা ৩ কাপ, আইসিং সুগার ১ কাপ, ডালডা গ্রেট ২ কাপ, ডিম ২টা, সুইট বল পরিমাণমতো, গোলাপজল সামান্য, খাবার সোডা সামান্য, গুঁড়া দুধ ৩ টেবিল চামচ।";
                        String karjodtails_obj2= "ডালডা একটু নরম করে তার মধ্যে আইসিং সুগার দিয়ে বিট করতে হবে। ময়দা ও খাবার সোডা, গুঁড়া দুধ চেলে নিতে হবে। ডিম ও গোলাপজল দিয়ে আবার বিট করতে হবে। এরপর ময়দার মিশ্রণ মিশিয়ে রুটির মতো ডো করতে হবে। বিস্কুটের ডাইসে কেটে ওপরে সুইট দিয়ে ১৫০ সেন্টিগ্রেট তাপে ২০-২৫ মিনিট বেক করুন।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "কর্নফ্লেক্স কুকিজ";
                        String upodetails_obj3= "বাটার ১০০ গ্রাম, ব্রাউন সুগার ৭৫ গ্রাম, ডিম ১টা, চকোলেট পাউডার ২ টেবিল চামচ, ময়দা ১ কাপ, নারিকেল কোরা ১/৩ কাপ, চকোলেট ভেনিলা ১.২ চা চামচ, কর্নফ্লেক্স পরিমাণমতো।";
                        String karjodtails_obj3= "প্রথমে একটি পাত্রে বাটার একটু নরম করে ব্রাউন সুগার দিয়ে বিট করতে হবে। এরপর ডিম, নারিকেল কোরা এবং ভেনিলা দিয়ে আবার বিট করতে হবে। ময়দা, চকোলেট পাউডার একসঙ্গে চেলে মিশ্রণে মেশাতে হবে। কর্নফ্লেক্স একটু ভেঙে খামি ছোট গোল করে কর্নফ্লেক্সে গড়াতে হবে। এরপর কনভেনশন ওভেনে ১৮০ ডিগ্রি সেন্টিগ্রেড তাপে ২০-২৫ মিনিট বেক করুন।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.nav);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "বাটার কুকিজ";
                        String upodetails_obj4= "ময়দা পৌনে ২ কাপ, গুঁড়ো দুধ পৌনে ১ কাপ, বেকিং পাউডার আধা চা চামচ, ওট ১ কাপ, চিনি ২ টেবিল চামচ, সফট মাখন ১৭৫ গ্রাম, কনডেন্সড মিল্ক সিকি কাপ।";
                        String karjodtails_obj4= "ময়দা, গুঁড়ো দুধ ও বেকিং পাউডার একসঙ্গে চেলে নিতে হবে। বোলে মাখন ও চিনি বিট করতে হবে। হালকা ও ফাঁপিয়ে ওঠা পর্যন্ত। এখন কনডেন্সড মিল্ক দিয়ে বিট করতে হবে। এই মিশ্রণে ময়দার মিশ্রণ ও ওট মিলিয়ে ডো বানাতে হবে। ডো আধা ঘণ্টা নরমাল ফ্রিজে রেখে দিতে হবে। পিঁড়ির ওপর পলিথিন বিছিয়ে এর ওপরে ডো, তারপর পলিথিন দিয়ে ডো মোটা করে বেলে নিতে হবে। মানুষের শেপের ছাঁচ বা কাটার দিয়ে কেটে গ্রিজ করা বেকিং ট্রেতে সাজিয়ে বেক করতে হবে। প্রিহিটেড ওভেনে ১২০ ডিগ্রি সেলসিয়াসে ৪০ থেকে ৪৫ মিনিট। ঠান্ডা করে চকলেট দিয়ে নাম লিখতে হবে। সব কুকি নরমাল ফ্রিজে রাখতে হবে, মচমচে থাকবে।\n\nলেখার জন্য চকলেটের প্রস্তুতি:\n ৬০ গ্রাম চকলেট ডবল বয়লারে গলিয়ে ঠান্ডা করে পাইপিং ব্যাগ বা কোণে ভরে কুকির ওপর লিখতে হবে।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "মাখন কেক";
                        String upodetails_obj5= "কেকের জন্য : মাখন ১২৫ গ্রাম, ভ্যানিলা এসেন্স ১ চা-চামচ, ব্লেন্ড করা চিনি সোয়া এক কাপ, ময়দা দেড় কাপ, বেকিং পাউডার ১ চা-চামচ, সোডিয়াম বাই কার্বোনেট সিকি চা-চামচ, দুধ আধা কাপ।\n\nফ্রস্টিংয়ের জন্য :\n মাখন আধা কাপ, আইসিং সুগার ২ কাপ, লবণ ১ চিমটি, ক্রিম ২ টেবিল চামচ।";
                        String karjodtails_obj5= "কেকের সব উপকরণ একত্রে মিশিয়ে মসৃণ ব্যাটার তৈরি করুন, যতক্ষণ পর্যন্ত ফ্যাকাশে রং ধারণ না করে। একটি গোল বেকিং প্যানে মাখন ব্রাশ করে নিন। তাতে কেকের ব্যাটার ঢেলে প্রি-হিটেড ওভেনে ১৮০ ডিগ্রি সেলসিয়াস তাপে এ দেড় থেকে পৌনে ২ ঘণ্টা বেক করুন। কেক হয়েছে কি না, দেখার জন্য কাঁচি বা ছুরির আগা ঢুকিয়ে পরীক্ষা করে নিন। একটি পরিষ্কার বাটিতে মাখন ও এক চিমটে লবণ মসৃণ করে বিট করে নিন। এবার মাখনে ১ চা-চামচ করে আইসিং সুগার দিয়ে বিট করতে থাকুন। যখন আইসিং সুগার জমাট বাঁধবে, তখন পরিমাণমতো ক্রিম দিয়ে বিট করে নরম করে নিন। বাটার ক্রিম ফ্রস্টিং তৈরি হয়ে গেল। এটি কেকের ওপরে ব্রাশ করে নিয়ে মনের মতো নকশা করুন।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "চকলেট লেয়ার কেক";
                        String upodetails_obj6= "ময়দা দেড় কাপ, ডিম ৪টি, চিনি দেড় কাপের একটু কম, মাখন ১০০ গ্রাম, সয়াবিন তেল আধা কাপ, বেকিং পাউডার ১ চা-চামচ, গুঁড়া দুধ ২ টেবিল-চামচ, ভ্যানিলা সিকি চা-চামচ, চকোলেট দেড় প্যাকেট, মাখন ২ টেবিল-চামচ, কোকো পাউডার ২ টেবিল-চামচ। সব উপকরণ সিকি কাপ পানি দিয়ে গুলিয়ে নিতে হবে।";
                        String karjodtails_obj6= "ডিমের সাদা অংশ ফেটিয়ে ফেনা তুলে তাতে চিনি মেশাতে হবে। তারপর কুসুম মেশাতে হবে। এতে ময়দা, গুঁড়া দুধ, বেকিং পাউডার ঢেলে দিয়ে মেশাতে হবে। মাখন ও তেল একত্রে গলিয়ে ডিমের মিশ্রণে মেশাতে হবে। এতে ভ্যানিলা দিতে হবে। তৈরি মিশ্রণ তিন ভাগে ভাগ করে এক ভাগের সঙ্গে কোকো পাউডার মিশিয়ে নিতে হবে। এবার এক ভাগ মিশ্রণ ওভেন প্রুফ পাত্রে বসিয়ে তার ওপর কোকো পাউডারের মিশ্রণ বসাতে হবে। এর ওপর আরেক ভাগ মিশ্রণ দিয়ে মাইক্রোওয়েভে ১০০ ডিগ্রি সেলসিয়াসে ৬ মিনিট বেক করতে হবে। বের করে চকলেট গলিয়ে কেকের ওপর ঢেলে পছন্দমতো সাজিয়ে পরিবেশন।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.nav);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "গাজরের কেক";
                        String upodetails_obj7= "ডিম ৪টি, ময়দা ১ কাপ, চিনি ১ কাপ, তেল ও ঘি ১ কাপ, ঘিয়ে ভাজা গাজর কুচি ১ কাপ, গুঁড়া দুধ ২ টেবিল চামচ, বেকিং পাউডার দেড় টেবিল চামচ, ক্রিম সাজানোর জন্য।";
                        String karjodtails_obj7= "ডিম ভালোভাবে চিনি দিয়ে বিট করুন। এতে অল্প অল্প ময়দা দিয়ে বিট করুন। তারপর দুধ, বেকিং পাউডার, গাজর কুচি দিয়ে ভালোভাবে বিট করুন। ঘি ও তেল মেশান। একটি সস প্যানে তেল মেখে, কাগজে তেল মাখিয়ে মিশ্রণটি ঢেলে দিন। অন্য একটি পাত্রে বালি বিছিয়ে কেকের পাত্রটি ঢেকে বসিয়ে দিন। ৪৫ মিনিট পর কেকটি ফুলে উঠলে নামিয়ে ফেলুন। ঠাণ্ডা হলে ক্রিম দিয়ে সাজিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "তালের কেক";
                        String upodetails_obj8= "ময়দা ১ কাপ, ডিম ৪টা, বাটার ১ কাপ, তালের গোলা ২ টেবিল চামচ, বেকিং পাউডার আধা চা চামচ, কেক ইম্প্র্রভার আধা চা চামচ, চিনি আধা কাপ।";
                        String karjodtails_obj8= "ময়দা ও বেকিং পাউডার চেলে নিন, একটা পাত্রে বাটার ও চিনি বিট করে এতে একটা একটা ডিম দিয়ে বিট করে নিন। এবার তালের গোলা ও ময়দা দিয়ে আলতো করে মিশিয়ে ডায়াসে ঢেলে প্রিহিট ওভেনে ১৬০০ তাপে ২০ মিনিট বেক করে নিন।";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.nav);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    case 9:
                        String name_obj9= "রয়েল আইসিন কেক";
                        String upodetails_obj9= "মাখন ৫০০ গ্রাম, চিনি ৫০০ গ্রাম, ডিম ১০টা, ময়দা ৬২৫ গ্রাম, বেকিং পাউডার ৫ গ্রাম, ভ্যানিলা ৫ মিলি লিটার, চেরি ১০০ গ্রাম, কমলার খোসা ১০০ গ্রাম, কাঠবাদাম কুচি ১০০ গ্রাম, কিশমিশ ১০০ গ্রাম, গুঁড়া চিনি ৫০০ গ্রাম, ৩টা ডিমের সাদা অংশ।";
                        String karjodtails_obj9= "মাখন ও চিনি ডিমের সঙ্গে মিশিয়ে বিট করুন। ময়দা ও বেকিং পাউডার ছেঁকে নিয়ে মিশিয়ে দিন। এবার ভ্যানিলা, চেরি, কমলার খোসা, কাঠবাদাম কুচি কিশমিশ দিয়ে ভালো করে খামির তৈরি করুন। এবার এটাকে ১৮০ ডিগ্রি সেন্টিগ্রেট তাপমাত্রায় আঁচ দিন। ৩০ থেকে ৩৫ মিনিট পর নামিয়ে ঠান্ডা করে নিন। চিনির গুঁড়া ও ডিমের সাদা অংশ দিয়ে রয়েল আইসিন তৈরি করুন। ঠান্ডা কেক সাইজ করে কেটে নিয়ে রয়েল আইসিন দিয়ে সাজিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a9 = BitmapFactory.decodeResource(getResources(), R.drawable.nav);
                        ByteArrayOutputStream baos_a9 = new ByteArrayOutputStream();
                        bitmap_a9.compress(Bitmap.CompressFormat.PNG, 100, baos_a9);
                        byte[] b_a9 = baos_a9.toByteArray();

                        Intent Int_a9 = new Intent(BekingActivity.this, AllViewActivity.class);
                        Int_a9.putExtra("titel_name", name_obj9);
                        Int_a9.putExtra("upodetail_name", upodetails_obj9);
                        Int_a9.putExtra("karjodtails_name", karjodtails_obj9);

                        Int_a9.putExtra("picture", b_a9);

                        startActivity(Int_a9);

                        break;




                    default:
                        break;
                }

            }


        });

///////////////////////////////////////////////////////////////////////////////////////////////////
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
        getMenuInflater().inflate(R.menu.beking, menu);
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
            Intent intent= new Intent(BekingActivity.this,MachActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_mansho) {
            Intent intent= new Intent(BekingActivity.this,Mang_sho.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_chal) {
            Intent intent= new Intent(BekingActivity.this,Chal_dal.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_kabab) {
            Intent intent= new Intent(BekingActivity.this,Kabab.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_shak) {
            Intent intent= new Intent(BekingActivity.this,Shak_shobji.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_panio) {
            Intent intent= new Intent(BekingActivity.this,Panio.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_vorta) {
            Intent intent= new Intent(BekingActivity.this,Vorta.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_beking) {
            Intent intent= new Intent(BekingActivity.this,BekingActivity.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_dim) {
            Intent intent= new Intent(BekingActivity.this,Dim.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_soup) {
            Intent intent= new Intent(BekingActivity.this,Supe.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_tok) {
            Intent intent= new Intent(BekingActivity.this,Tok_jal_misti.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.nav_bideshi) {
            Intent intent= new Intent(BekingActivity.this,Bide_shi.class);
            startActivity(intent);
            finish();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
