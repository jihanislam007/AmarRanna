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

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Mang_sho extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;

    String[] web = {
            "গরুর মাংসের শুঁটকি ",
            "কাটা মসলায় গরুর মাংস",
            "গ্রিল বিফ",
            "বিফ বিন্দা আলু",
            "তাক্কা",
            "হান্টার বিফ",
            "নলার ঝোল",
            "ঝুরা মাংস",
            "হাঁড়িবন্ধ",
            "নারকেলের দুধে কাটা মসলার মাংস",
            "চুইঝালে মাংস ভুনা",
            "গরুর মাংসের গ্লাসি",
            "বিফ ভিন্দালু",
            "মেথি ভুনা",
            "ছ্যাঁচা কিমা",
            "গরুর কালো ভুনা",
            "কাঁচা আমে সবজি মাংস",
            "ধনেপাতা বাটা দিয়ে বিফ",
            "বিফ কালিয়া",
            "বিফ ফ্রাই",
            "নবাবি বিফ",
            "মাংসের কোরমা",
            "গরুর ঝাল ভুনা",
            "ছোলার ডালে মাংস",
            "কষানো খাসির মাংস",
            "আস্ত লেগ রোস্ট",
            "খাসির রানের রোস্ট",
            "খাসির ঝাল মাংস",
            "খাসির রগেন জোশ",
            "খাসির কোরমা",
            "মাংসের চাপ",
            "মুরগির কাটলেট",
            "শাহী আস্ত চিকেন রোস্ট",
            "মুরগির রোস্ট",
            "মুরগির শাহি কোরমা",
            "গ্রিল মুরগি",
            "ঝাল চিকেন ভুনা",
            "কবুতরের পোলাও",
            "কবুতরের স্যুপ",
            "কবুতরের ঝোল তরকারি"
    } ;





    Integer[] imageId = {
            R.drawable.mangsho_1,
            R.drawable.mangsho_2,
            R.drawable.mangsho_3,
            R.drawable.image,
            R.drawable.mangsho_5,
            R.drawable.mangsho_6,
            R.drawable.mangsho_7,
            R.drawable.mangsho_8,
            R.drawable.mangsho_9,
            R.drawable.mangsho_10,
            R.drawable.mangsho_11,
            R.drawable.mangsho_12,
            R.drawable.mangsho_13,
            R.drawable.mangsho_14,
            R.drawable.mangsho_15,
            R.drawable.mangsho_16,
            R.drawable.mangsho_17,
            R.drawable.mangsho_18,
            R.drawable.mangsho_19,
            R.drawable.mangsho_20,
            R.drawable.mangsho_21,
            R.drawable.mangsho_22,
            R.drawable.mangsho_23,
            R.drawable.mangsho_24,
            R.drawable.mangsho_25,
            R.drawable.mangsho_26,
            R.drawable.mangsho_27,
            R.drawable.image,
            R.drawable.mangsho_29,
            R.drawable.mangsho_30,
            R.drawable.mangsho_31,
            R.drawable.mangsho_32,
            R.drawable.mangsho_33,
            R.drawable.mangsho_34,
            R.drawable.mangsho_35,
            R.drawable.mangsho_36,
            R.drawable.mangsho_37,
            R.drawable.mangsho_38,
            R.drawable.mangsho_39,
            R.drawable.mangsho_40

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mang_sho);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        CustomAdapter adapter = new CustomAdapter(Mang_sho.this, web, imageId);

        list=(ListView)findViewById(R.id.mangsholistView);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch (position) {
                    case 0:
                        String name_obj0= "গরুর মাংসের শুঁটকি ";
                        String upodetails_obj0= "২ কাপ, পেঁয়াজ কুচি ১ কাপ, রসুন কুচি আধা কাপ, এলাচ ৪টি, দারুচিনি ৪ টুকরা, তেজপাতা ২টি, হলুদ গুঁড়া ১ চা চামচ, মরিচগুঁড়া ২ চা চামচ, আদা বাটা ১ চা চামচ, রসুন বাটা আধা চা চামচ, পেঁয়াজ বাটা ১ চা চামচ, তেল আধা কাপ, লবণ পরিমাণ মতো।";
                        String karjodtails_obj0= "প্রথমে গরুর মাংসের শুঁটকি ভালোভাবে সিদ্ধ করে পাটায় ছেঁচে নিন। কড়াইতে তেল দিয়ে এলাচ, দারুচিনি, তেজপাতা, পেঁয়াজ কুচি, রসুন কুচি দিন। পেঁয়াজ ও রসুন নরম হয়ে এলে সামান্য পানি ও মসলা দিয়ে কষান। এরপর মাংস দিয়ে খানিকটা পানি দিন। মাংস হয়ে তেল ওপরে উঠে এলে নামিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_1);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "কাটা মসলায় গরুর মাংস";
                        String upodetails_obj1= "গরুর মাংস ১ কেজি, পেঁয়াজ ৪ টুকরা করা ১ কাপ, আদা চাক চাক টুকরো করা কোয়ার্টার কাপ, রসুনা মোটা টুকরা করা কোয়ার্টার কাপ, শুকনা মরিচ বিচি ফেলে দেওয়া ৭-৮টি, দারুচিনি ৩ টুকরা, এলাচ ৪টি, জায়ফল-জৈয়ত্রী ১ চা চামচ, জিরা ভাজা (আস্ত) ১ চা চামচ, বেরেস্তা আধা কাপ, চিনি ১ চা চামচ, কাঁচামরিচ ৫-৬টি, ঘি ২ টেবিল চামচ, লবণ পরিমাণ মতো।";
                        String karjodtails_obj1= "গরুর মাংস লবণ ও টক দই মাখিয়ে আধা ঘণ্টা মেরিনেট করুন। এবার আদা, রসুন, শুকনামরিচ, কাঁচামরিচ, এলাচ, দারুচিনি, জয়ফল, জৈয়ত্রী, জিরা দিয়ে আরও আধা ঘণ্টা মেরিনেট করুন। প্যানে তেল গরম করে মাংস দিয়ে কষিয়ে নিন। ভালো করে কষানো হলে পরিমাণ মতো পানি দিয়ে মাংস সিদ্ধ করুন। মাংস সিদ্ধ হয়ে গেলে বেরেস্তা, ঘি ও চিনি দিয়ে মৃদু আঁচে বসিয়ে রাখুন। মাংস হয়ে গেলে নামিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_2);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "গ্রিল বিফ";
                        String upodetails_obj2= "মাংসের পাতলা টুকরা ৬ পিস, সরিষা বাটা ২ টেবিল চামচ, ওয়েস্টার সস ২ টেবিল চামচ, লবণ পরিমাণমতো, গোলমরিচ পরিমাণ মতো, আদা বাটা ১ টেবিল চামচ, রসুন বাটা ১ টেবিল চামচ, গুঁড়া মরিচ ১ টেবিল চামচ, টক দই ২ টেবিল চামচ।";
                        String karjodtails_obj2= "মাংস কাটতে হবে হাড় ছাড়া। তারপর সব উপকরণ দিয়ে ম্যারিনেট করতে হবে। গ্রিলের ওপর দিয়ে দুই পাশই গ্রিল করতে হবে বাদামি রঙ না হওয়া পর্যন্ত। তারপর পরিবেশন করুন।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_3);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "বিফ বিন্দা আলু";
                        String upodetails_obj3= "১ কেজি গরুর মাংস, আদা ও রসুন বাটা ২০০ গ্রাম, গুঁড়া মরিচ ২ টেবিল চামচ, হলুদের গুঁড়া ২ টেবিল চামচ, জিরা গুঁড়া ১ টেবিল চামচ, ধনিয়া গুঁড়া ১ চা চামচ, পেঁয়াজ ১/২ কেজি, সিরকা ১/২ কাপ, তিনটা আলু, ১৫০ গ্রাম তেল, ১ চা চামচ গরম মসলা, ২ কাপ টক দই।";
                        String karjodtails_obj3= "প্রথমে একটি কড়াইয়ে তেল দিতে হবে। তেল গরম হয়ে গেলে পেঁয়াজ দিয়ে ব্রাউন রঙ করতে হবে। তারপর আদা রসুন বাটা দিতে হবে। একটু পাকানোর পর মরিচ, হলুদ, জিরা ও ধনিয়া গুঁড়া দিয়ে একটু পানি দিয়ে পাকাতে হবে। তারপর কিউব করা কাটা গরুর মাংস দিয়ে ১৫ মিনিট কষাতে হবে। তারপর আলু চার কাপ পানি দিয়ে অল্প তাপে ৪৫ মিনিট পাকাতে হবে। এরপর দই ও সিরকা ও কাঁচামরিচ দিয়ে পাকিয়ে নিতে হবে এবং লবণ দিতে হবে পরিমাণমতো।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "তাক্কা";
                        String upodetails_obj4= "গরুর পেছনের রানের চাকা মাংস ১ কেজি, তেল আধা কাপ, লেবুর রস বা সিরকা ৩ টেবিল চামচ, লবণ স্বাদমতো, আদা বাটা ১ টেবিল চামচ, গোলমরিচের গুঁড়া আধা চা-চামচ, পেঁয়াজ (মিহি স্লাইস) ১ কাপ, গরম মসলা বাটা ১ চা-চামচ।";
                        String karjodtails_obj4= "হাড় ও চর্বি ছাড়িয়ে মাংস ধুয়ে পানি ঝরিয়ে নিন। মাংসের সঙ্গে সিরকা অথবা লেবুর রস এবং আদা বাটা মিশিয়ে মেখে নিন। একটি স্টিলের ট্রেতে মাংস নিয়ে চারপাশ উল্টেপাল্টে ভালো করে কেচে নিন। এভাবে কেচে তিন-চার ঘণ্টা রেখে দিন। এক ঘণ্টা অন্তর মাংস বের করে চারপাশ ভালো করে কেচে নেবেন। ম্যারিনেট হয়ে গেলে ভালো করে কয়েকবার ধুয়ে নিয়ে ডুবো পানিতে সেদ্ধ করে নিন। মাংস উঠিয়ে গোলমরিচের গুঁড়া ও গরম মসলা বাটা দিয়ে মেখে নিন। কড়াইয়ে তেল গরম করে পেঁয়াজ বাদামি করে ভেজে মাংসের চাকা দিয়ে এপিঠ-ওপিঠ করে ভালো করে ভেজে নিন। নামিয়ে কেটে সালাদ ও বাকরখানি বা পরোটার সঙ্গে পরিবেশন করুন। তাক্কা ১০-১২ দিন রেফ্রিজারেটরে রেখে খাওয়া যায়।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_5);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "হান্টার বিফ";
                        String upodetails_obj5= "গরুর মাংসের চাকা (পেছনের রানের) ১ কেজি, সিরকা সিকি কাপ, লেবুর রস সিকি কাপ, ক্যারামেল বা গুড় ১ টেবিল চামচ, মিট টেন্ডারাইজার (সোরা) সিকি চা-চামচ, বেকিং সোডা আধা চা-চামচ, লবণ ২ টেবিল চামচ অথবা স্বাদ অনুযায়ী।";
                        String karjodtails_obj5= "মাংসের চর্বি ও পর্দা ফেলে পরিষ্কার সুতি কাপড় দিয়ে পুরো টুকরাটার চারপাশ মুছে নিন। কিন্তু মাংসে কোনো পানি লাগাবেন না। সিরকা, লেবুর রস ও ক্যারামেল বা গুড় একত্রে মিশিয়ে মিশিয়ে নিন। লবণ ও সোডা গুঁড়া করে একত্রে মিশিয়ে অন্য একটি পাত্রে বেকিং সোডার সঙ্গে মিলিয়ে রাখুন। মাংসের ওপর লবণ ও সোরা এবং বেকিং সোডা মেখে সিরকার মিশ্রণ মিশিয়ে একটি স্টিলের পাত্রে নিয়ে কাঁটা চামচ দিয়ে কেচে নিন। এভাবে অল্প অল্প করে সিরকা, গুড় ও লেবুর রসের মিশ্রণ দিয়ে মাংস চারপাশ থেকে ভালো করে কেচে নিন। কেচা হয়ে গেলে মাংস থেকে পানি বের হবে। এই পানিতে মাংস চুবিয়ে ঠান্ডা খোলা বাতাসে দু-তিন দিন রাখুন। অতিরিক্ত গরম পড়লে রেফ্রিজারেটরেও রাখা যায়। এবার প্রচুর পরিমাণ পানিতে মাংস অনেকবার ধুয়ে নিন। তারপর ডুবো পানিতে সেদ্ধ করুন। একটি প্লেটে বা ট্রেতে নিয়ে মাংস খোলা বাতাসে রাখুন। মাংসের পানি একেবারে টেনে শুকিয়ে গেলে ঢেকে রেফ্রিজারেটরে রাখুন। রেফ্রিজারেটর ছাড়াও হান্টার বিফ তিন-চার দিন বাইরেও রাখা যায়।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "নলার ঝোল";
                        String upodetails_obj6= "গরুর পায়া ১ কেজি, পেঁয়াজ কুচি ১ কাপ, আদা কুচি ২ টেবিল চামচ, হলুদ গুঁড়া আধা চা-চামচ, মরিচ গুঁড়া ১ চা-চামচ, আদা কুচি ২ চা-চামচ, আদা কুচি ২ টেবিল চামচ, বড় ও ছোট এলাচি ৭-৮টা, শাহি জিরা ১ চা-চামচ, গোলমরিচ গুঁড়া ১ চা-চামচ, এলাচি ও দারুচিনি কয়েকটা, তেজপাতা ২-৩টা, লবণ স্বাদমতো, বাদাম বাটা ১ টেবিল চামচ, পানি ৫-৬ কাপ।";
                        String karjodtails_obj6= "তেলে পেঁয়াজ ভেজে সব মসলা কষিয়ে গুরুর পায়া দিয়ে ভালোভাবে কষিয়ে পানি দিতে হবে। অল্প আঁচে ৫-৬ ঘণ্টা সেদ্ধ করতে হবে। নামিয়ে ভাত অথবা নানরুটির সঙ্গে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_7);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "ঝুরা মাংস";
                        String upodetails_obj7= "গরুর মাস ১ কেজি, পেঁয়াজ কুচি দেড় কাপ, আদা বাটা ১ টেবিল চামচ, রসুন বাটা ১ চা-চামচ, লবণ স্বাদমতো, গোলমরিচ বাটা ১ চা-চামচ, জিরা বাটা ১ চা-চামচ, ধনে বাটা ১ চা-চামচ, বাদাম বাটা আধা চা-চামচ, হলুদ গুঁড়া আধা চা-চামচ, মরিচ গুঁড়া আধা চা-চামচ, মরিচ গুঁড়া ১ চা-চামচ, সরষে বাটা আধা চা-চামচ, এলাচি-দারুচিনি-লবঙ্গ কয়েকটা, তেজপাতা ৩-৪টা, তেল ১ কাপ, গরম মসলা গুঁড়া আধা চা-চামচ।";
                        String karjodtails_obj7= "তেলে আধা কাপ পেঁয়াজ কুচি বাদামি করে ভেজে সব মসলা কষিয়ে মাংস দিয়ে দিতে হবে। আন্দাজমতো পানি দিয়ে মাংস সেদ্ধ করে নিতে হবে। মাংসের পানি শুকিয়ে গেলে নামিয়ে নিতে হবে। এবার মাংস নেড়েচেড়ে ঝুরা করে নিতে হবে। অল্প তেলে ১ কাপ পেঁয়াজ বাদামি করে ভেজে ঝুরা মাংস দিয়ে নাড়তে হবে। ভাজা ভাজা হয়ে গেলে গরম মসলা ও গোলমরিচের গুঁড়া দিয়ে নামিয়ে নিতে হবে।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_8);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "হাঁড়িবন্ধ";
                        String upodetails_obj8= "গরুর চর্বিসহ মাংস ৫ কেজি, পেঁয়াজ মোটা কুচি ৬ কাপ, আদা মিহি কুচি ১ কাপ, রসুনের কোয়া ১ কাপ, শুকনা মরিচ ফালি আধা কাপ, গোলমরিচ গুঁড়া ১ টেবিল-চামচ, টকদই ২ কাপ, মিষ্টিদই আধা কাপ, লবণ স্বাদমতো, সরিষার তেল ৪ কাপ, তেজপাতা ৬টি, দারচিনি ১০ টুকরা, ছোট এলাচ ১০টি, লবঙ্গ ১২টি, বড় এলাচ ৪টি, কাঁচা মরিচ ১০-১২টি।";
                        String karjodtails_obj8= "চর্বিসহ মাংস বড় টুকরা করে ধুয়ে পানি ঝরিয়ে বড় হাঁড়িতে সব উপকরণ দিয়ে মাখিয়ে নিন। হাঁড়ি ভরে পানি দিন। ময়দা পানি দিয়ে মথে হাঁড়ির চারপাশে লাগিয়ে ঢাকনা দিয়ে এমনভাবে ঢেকে দিন যেন বাষ্প বের হতে না পারে। এবার হাঁড়ি চুলায় দিয়ে মাঝারি জ্বালে রান্না করুন। ভালো করে ফুটে উঠলে চুলা থেকে নামিয়ে রাখুন। প্রতিদিন দুবার করে ফোটান। এভাবে ঝোল শুকিয়ে তেলের ওপর এলে আধা কাপ বেরেস্তা ও ১ চা-চামচ গরম মসলার গুঁড়া দিয়ে নামান। মজাদার হাঁড়িবন্ধ পোলাও, ভুনা খিচুড়ি, পরোটার সঙ্গে গরম গরম পরিবেশন করা যায়।";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_9);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    case 9:
                        String name_obj9= "নারকেলের দুধে কাটা মসলার মাংস";
                        String upodetails_obj9= "গরু বা খাসির মাংস ২ কেজি, পেঁয়াজকুচি ২ কাপ, রসুনকুচি ১ টেবিল-চামচ, আদা মিহি কুচি ৩ টেবিল-চামচ, আস্ত রসুন ৮-১০টি, পেঁয়াজ বেরেস্তা ১ কাপ, লবণ স্বাদমতো, আধা ভাঙা গোলমরিচ ১ চা-চামচ, শুকনা মরিচ ৮-১০টি, সরিষার তেল ১ কাপ, তেজপাতা ৪টি, দারচিনি ৬ টুকরা, এলাচ ৬টি, লবঙ্গ ৮টি, টকদই আধকাপ, কাঁচা মরিচ ৭-৮টি, চিনি ১ চামচ বা স্বাদমতো, নারকেলের দুধ ৬ কাপ।";
                        String karjodtails_obj9= "মাংস টুকরা করে ধুয়ে পানি ঝরিয়ে বেরেস্তা, কাঁচা মরিচ, নারকেলের দুধ বাদে বাকি সব উপকরণ দিয়ে মাখিয়ে ২-৩ ঘণ্টা রাখতে হবে। এরপর নারকেলের দুধ দিয়ে মাঝারি আঁচে রান্না করতে হবে। মাংস সেদ্ধ হয়ে ঝোল কমে এলে বেরেস্তা, কাঁচা মরিচ দিয়ে অল্প জ্বালে কিছুক্ষণ চুলায় রেখে নামাতে হবে।";

                        Bitmap bitmap_a9 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_10);
                        ByteArrayOutputStream baos_a9 = new ByteArrayOutputStream();
                        bitmap_a9.compress(Bitmap.CompressFormat.PNG, 100, baos_a9);
                        byte[] b_a9 = baos_a9.toByteArray();

                        Intent Int_a9 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a9.putExtra("titel_name", name_obj9);
                        Int_a9.putExtra("upodetail_name", upodetails_obj9);
                        Int_a9.putExtra("karjodtails_name", karjodtails_obj9);

                        Int_a9.putExtra("picture", b_a9);

                        startActivity(Int_a9);

                        break;

                    case 10:

                        String name_obj10= "চুইঝালে মাংস ভুনা";
                        String upodetails_obj10= "গরুর মাংস ২ কেজি, চুইঝাল মাঝারি টুকরা করে কাটা ২ কাপ, আদাবাটা ২ টেবিল-চামচ, রসুনবাটা ১ টেবিল-চামচ, মরিচগুঁড়া ১ টেবিল-চামচ, হলুদগুঁড়া ১ চা-চামচ, জিরাবাটা ১ চা-চামচ, পেঁয়াজকুচি ১ কাপ, লবণ স্বাদমতো, টকদই আধা কাপ, তেজপাতা ৪টি, দারচিনি ৪ টুকরা, এলাচ ৪টি, লবঙ্গ ৬টি, কাঁচা মরিচ ৫-৬টি, সরিষার তেল ১ কাপ, গরম মসলার গুঁড়া ১ চা-চামচ, জিরা ভাজা গুঁড়া আধা চা-চামচ।";
                        String karjodtails_obj10= "মাংস ধুয়ে লবণ ও টকদই দিয়ে মাখিয়ে ১ ঘণ্টা রাখুন। তেল গরম করে পেঁয়াজ ভেজে তাতে সব মসলা কষিয়ে মাংস ও চুইঝাল দিয়ে কয়েকবার কষান। পরে পানি দিন। মাংসের ঝোল শুকিয়ে তেলের ওপর এলে গরম মসলার গুঁড়া, জিরা ভাজা গুঁড়া দিয়ে নামান।";

                        Bitmap bitmap_a10 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_11);
                        ByteArrayOutputStream baos_a10 = new ByteArrayOutputStream();
                        bitmap_a10.compress(Bitmap.CompressFormat.PNG, 100, baos_a10);
                        byte[] b_a10 = baos_a10.toByteArray();

                        Intent Int_a10 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a10.putExtra("titel_name", name_obj10);
                        Int_a10.putExtra("upodetail_name", upodetails_obj10);
                        Int_a10.putExtra("karjodtails_name", karjodtails_obj10);

                        Int_a10.putExtra("picture", b_a10);

                        startActivity(Int_a10);
                        break;

                    case 11:
                        String name_obj11= "গরুর মাংসের গ্লাসি";
                        String upodetails_obj11= "গরুর মাংস দেড় কেজি বড় টুকরা করে কেটে নিতে হবে। পেঁয়াজবাটা আধাকাপ, আদাবাটা দুই টেবিল-চামচ, রসুনবাটা ১ চা-চামচ, ধনেবাটা ১ চা-চামচ, পোস্তবাটা ১ টেবিল-চামচ, দুধ ১ কাপ, কাঁচা মরিচ ১০টি, সাদা গোলমরিচের গুঁড়া ১ চা-চামচ, টকদই ১ কাপ, লবণ পরিমাণমতো, ঘি ১ কাপ, মাওয়া ২ টেবিল-চামচ, এলাচি ৪টা, দারচিনি ৪ টুকরা, তেজপাতা ২টা, মিষ্টি দই ২ টেবিল-চামচ, পেঁয়াজকুচি ২ কাপ, জয়ত্রী-জায়ফলগুঁড়া আধা চা-চামচ, গরম মসলাগুঁড়া ১ চা-চামচ, গোলাপজল ১ চা-চামচ।";
                        String karjodtails_obj11= "পেঁয়াজবাটা, আদা, রসুনবাটা, ধনেবাটা, জয়ত্রী-জয়ফল, সাদা গোল মরিচগুঁড়া, সিকি কাপ টকদই ও ঘি একটি পাত্রে ভালোমতো মাখিয়ে নিয়ে এভাবেই চুলায় এক ঘণ্টা রাখুন। এবার এর ওপর লবণ, দারচিনি, এলাচি, তেজপাতা দিন। অন্য একটি পাত্রে এক কাপ ঘি গরম করে পেঁয়াজ বাদামি করে ভেজে মসলা মাখানো মাংস দিয়ে ভালোভাবে কষিয়ে নিন। দেখে নিন, মাংস সেদ্ধ হলো কি না। এবার কাঁচা মরিচ ও গরম মসলা মাংসের ওপর ছড়িয়ে দিয়ে কিছুক্ষণ চুলায় রেখে নামিয়ে ফেলুন। হয়ে গেল গরুর মাংসের গ্লাসি। এবার গরম গরম পরিবেশন।";

                        Bitmap bitmap_a11 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_12);
                        ByteArrayOutputStream baos_a11 = new ByteArrayOutputStream();
                        bitmap_a11.compress(Bitmap.CompressFormat.PNG, 100, baos_a11);
                        byte[] b_a11 = baos_a11.toByteArray();

                        Intent Int_a11 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a11.putExtra("titel_name", name_obj11);
                        Int_a11.putExtra("upodetail_name", upodetails_obj11);
                        Int_a11.putExtra("karjodtails_name", karjodtails_obj11);

                        Int_a11.putExtra("picture", b_a11);

                        startActivity(Int_a11);

                        break;

                    case 12:
                        String name_obj12= "বিফ ভিন্দালু";
                        String upodetails_obj12= "হাড় ছড়ানো গরুর মাংস ১ কেজি, জিরা গুঁড়া আধা চা চামচ, ধনে গুঁড়া ১ টেবিল চামচ, এলাচ গুঁড়া আধা চা চামচ, মেথি গুঁড়া ১ চা চামচ, মরিচ গুঁড়া ২ চা চামচ, হলুদ গুঁড়া ১ চা চামচ, সরিষা গুঁড়া ১ চা চামচ, ঘি অথবা তেল ২ টেবিল চামচ, পেঁয়াজ মাঝারি ৩টি, আদা বাটা ৩ চা চামচ, রসুন বাটা ২ চা চামচ, ভিনেগার আধা কাপ, চিনি পরিমাণমতো, দারুচিনি ১টি, ছোট আলু ২০০ গ্রাম।";
                        String karjodtails_obj12= "কড়াইয়ে তেল গরম করে স্লাইস পেঁয়াজ বাদামি করে তার মধ্যে গরুর মাংস ছেড়ে দিতে হবে। এর পর একে একে সব মসলা দিয়ে ভালোমতো নাড়তে হবে। মাঝারি আঁচে মাংস ভালোমতো কষিয়ে এর মধ্যে ছোট ছোট আলু দিতে হবে। একটু পানি দিয়ে মাংস ঢেকে দিতে হবে। মাংস সিদ্ধ হলে এর মধ্যে ভিনেগার এবং ২ চামচ চিনি দিতে হবে। এর পর গরম মসলার গুঁড়া ছড়িয়ে দিয়ে গরম গরম বিফ ভিন্দালু পরিবেশন করতে হবে।";

                        Bitmap bitmap_a12 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_13);
                        ByteArrayOutputStream baos_a12 = new ByteArrayOutputStream();
                        bitmap_a12.compress(Bitmap.CompressFormat.PNG, 100, baos_a12);
                        byte[] b_a12 = baos_a12.toByteArray();

                        Intent Int_a12 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a12.putExtra("titel_name", name_obj12);
                        Int_a12.putExtra("upodetail_name", upodetails_obj12);
                        Int_a12.putExtra("karjodtails_name", karjodtails_obj12);

                        Int_a12.putExtra("picture", b_a12);

                        startActivity(Int_a12);

                        break;

                    case 13:
                        String name_obj13= "মেথি ভুনা";
                        String upodetails_obj13= "গরুর বুকের মাংস ১ কেজি, দেশি পেঁয়াজ বাটা আধা কাপ, আদা বাটা ২ টেবিল চামচ, রসুন বাটা ১ টেবিল চামচ, হলুদের গুঁড়া দেড় চা-চামচ, মরিচের গুঁড়া ২ চা-চামচ, ধনে গুঁড়া ২ চা-চামচ, জিরা ও গোলমরিচ দেড় চা-চামচ, তেজপাতা ২টি, দারচিনি ৪ টুকরা, এলাচি ৪টি, লবণ দেড় থেকে ২ চা-চামচ অথবা স্বাদ অনুযায়ী, তেল আধা কাপের একটু বেশি, মেথি সিকি চামচ, পেঁয়াজ মিহি টুকরা ১ কাপ।";
                        String karjodtails_obj13= "মাংস টুকরো করে ধুয়ে পানি ঝরিয়ে নিন। মেথি, আধা কাপ তেল এবং পেঁয়াজের টুকরা বাদে অন্য সব উপকরণ একত্রে ১ টেবিল চামচ তেল দিয়ে মেখে হাত ধোয়া পানি দিয়ে ঢেকে মাঝারি আঁচে চুলায় বসিয়ে দিন।১০ মিনিট পর ঢাকনা খুলে চুলার আঁচ সামান্য বাড়িয়ে ৩ থেকে ৪ কাপ পানি দিয়ে নেড়ে ঢেকে দিন। ১৫ মিনিট পর আঁচ কমিয়ে নেড়ে আবারও ঢেকে দিন। পানি প্রায় শুকিয়ে মাংস সেদ্ধ হয়ে এলে পাশের চুলায় ফ্রাইপ্যানে আধা কাপ তেলে মেথির ফোড়ন দিন। তারপর এতে পেঁয়াজ সোনালি রং করে ভেজে মাংস তরকারি বাগার দিন। তেল ও বেরেস্তার সঙ্গে মাংস যেন ভালো করে মিশে, সেটা খেয়াল রাখবেন। আধা কাপ গরম পানি দিয়ে মৃদু আঁচে ঢেকে রান্না করুন। মাংসের গায়ে মসলা লেগে ভুনা ভুনা হয়ে তেলের ওপরে উঠলে নামিয়ে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a13 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_14);
                        ByteArrayOutputStream baos_a13 = new ByteArrayOutputStream();
                        bitmap_a13.compress(Bitmap.CompressFormat.PNG, 100, baos_a13);
                        byte[] b_a13= baos_a13.toByteArray();

                        Intent Int_a13 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a13.putExtra("titel_name", name_obj13);
                        Int_a13.putExtra("upodetail_name", upodetails_obj13);
                        Int_a13.putExtra("karjodtails_name", karjodtails_obj13);

                        Int_a13.putExtra("picture", b_a13);

                        startActivity(Int_a13);

                        break;

                    case 14:

                        String name_obj14= "ছ্যাঁচা কিমা";
                        String upodetails_obj14= "গরুর পেছনের রানের হাড় ছাড়া মাংস ১ কেজি, পেঁয়াজ গোল পাতলা করে কাটা ২ কাপ, তেল ১ কাপ বা আধা কাপ, সিরকা দেড় টেবিল চামচ, ১ টেবিল চামচ গোটা জিরার সঙ্গে আধা চা-চামচ গোটা গোলমরিচের বাটা। দারচিনি ৪-৫ টুকরা, ছোট এলাচি ৬টি, লবঙ্গ ২টি একত্রে পাটায় বাটা। জায়ফল বাটা সিকি চামচ, জয়ত্রী বাটা ১ চিমটি, আদা বাটা ২ টেবিল চামচ, রসুন বাটা ১ টেবিল চামচ, ধনে গুঁড়া ১ চা-চামচ, গরম পানি ৫ কাপ, লবণ ২ চা-চামচ অথবা স্বাদ অনুযায়ী।";
                        String karjodtails_obj14= "গরুর মাংস চর্বি ছাড়িয়ে ছোট ছোট পাতলা টুকরা করে কেটে ধুয়ে পানি ঝরিয়ে নিন। মাংসগুলো পাটায় থেঁতো করে ছেঁচে নিন। কড়াইয়ে আধা কাপ তেল গরম করে মৃদু আঁচে ১ কাপ পেঁয়াজ সোনালি করে ভেজে নিন। তাতে পাটায় থেঁতো করা মাংসগুলো দিয়ে ভেজে নিন। আঁচ মাঝারি রাখবেন। সিরকা ও লবণ দিয়ে আরও কিছুক্ষণ মাংসটা ভেজে ঢেকে দিন। মাংস ভাজা ভাজা হলে বাকি তেল এবং পেঁয়াজ বাদে অন্য সব মসলা দিয়ে ভালো করে কষিয়ে নিন। ১ কাপ ফুটন্ত গরম পানি দিয়ে আরও কিছুক্ষণ কষিয়ে বাকি ৪ কাপ গরম পানি দিয়ে নেড়ে ঢেকে দিন। মাংস পানি টেনে নিলে চুলার আঁচ কিছুটা কমিয়ে দিন। ফ্রাইপ্যানে বাকি আধা কাপ তেল গরম করে অবশিষ্ট পেঁয়াজ অল্প আঁচে সোনালি করে ভেজে তেলসহ বেরেস্তা মাংসে দিয়ে ভালো করে মিশিয়ে নাড়ুন এবাং ঢেকে দিন। ১০ মিনিট পর ঢাকনা খুলে আরও একবার ভালো করে নেড়ে ঢেকে দিন। মাংস থেকে তেল ছাড়া শুরু করলে চুলা বন্ধ করে ১০ মিনিট দমে রাখুন। বেরেস্তা মাংসে মেশানোর আগে কিছু বেরেস্তা উঠিয়ে রাখুন। এবারে পরিবেশনের পাত্রে বেড়ে ওপর থেকে বেরেস্তা ছিটিয়ে গরম গরম পরিবেশন করুন। পোলাও, পরোটা বা ভাত—যেকোনো কিছুর সঙ্গে খেতে ভালো লাগবে।";

                        Bitmap bitmap_a14 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_15);
                        ByteArrayOutputStream baos_a14 = new ByteArrayOutputStream();
                        bitmap_a14.compress(Bitmap.CompressFormat.PNG, 100, baos_a14);
                        byte[] b_a14 = baos_a14.toByteArray();

                        Intent Int_a14 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a14.putExtra("titel_name", name_obj14);
                        Int_a14.putExtra("upodetail_name", upodetails_obj14);
                        Int_a14.putExtra("karjodtails_name", karjodtails_obj14);

                        Int_a14.putExtra("picture", b_a14);

                        startActivity(Int_a14);
                        break;

                    case 15:
                        String name_obj15= "গরুর কালো ভুনা";
                        String upodetails_obj15= "গরু মাংস ১ কেজি, তেল ১ কাপ, হলুদ ১ চা চামচ, মরিচের গুঁড়া ১ টেবিল চামচ, আদা বাটা ১ টেবিল চামচ, রসুন বাটা ১ টেবিল চামচ, জিরা বাটা ১ টেবিল চামচ, এলাচ, দারুচিনি ৩টা/৪টা, তেজপাতা ২টা, লবঙ্গ, গোলমরিচ ৩টা/৪টা, লবণ পরিমাণমতো, পিঁয়াজ কুচি মোটা করে ১ কাপ, পানি পরিমাণমতো।";
                        String karjodtails_obj15= "মাংস মাঝারি আকারে কেটে ধুয়ে পানি ঝরাতে হবে, তারপর একটা পাত্রে মাংসের সব মসলা দিয়ে কষাতে হবে। ভালোভাবে কষানো হলে মাংসের ওপর তেল উঠে গেলে আবার ২/৩ কাপ পানি দিয়ে মাংস সিদ্ধ করে নিতে হবে। এরপর আরেকটি পাত্রে তেল দিয়ে অল্প তাপে মাংস কালো করে ভাজতে হবে। কালো হয়ে গেলে মাংস নামিয়ে পরিবেশন করতে হবে।";

                        Bitmap bitmap_a15 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_16);
                        ByteArrayOutputStream baos_a15 = new ByteArrayOutputStream();
                        bitmap_a15.compress(Bitmap.CompressFormat.PNG, 100, baos_a15);
                        byte[] b_a15 = baos_a15.toByteArray();

                        Intent Int_a15 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a15.putExtra("titel_name", name_obj15);
                        Int_a15.putExtra("upodetail_name", upodetails_obj15);
                        Int_a15.putExtra("karjodtails_name", karjodtails_obj15);

                        Int_a15.putExtra("picture", b_a15);

                        startActivity(Int_a15);

                        break;

                    case 16:
                        String name_obj16= "কাঁচা আমে সবজি মাংস";
                        String upodetails_obj16= "কাঁচা আম ১টি (পাতলা করে কাটা), টমেটো ১টি, ক্যাপসিকাম আধা কাপ, বরবটি সেদ্ধ আধা কাপ, সেদ্ধ বেবিকর্ন আধা কাপ, সবজি ছোট ছোট করে কেটে নিতে হবে। সেদ্ধ সয়াবিন আধা কাপ, গরুর মাংস ৫০০ গ্রাম (পাতলা করে কেটে, থেতো করা) টমেটো সস ২ টেবিল চামচ, পেঁয়াজ (মোটা করে কাটা) ১ কাপ, আদা বাটা ১ টেবিল চামচ, থেতো করা রসুন ১ চা-চামচ, গোলমরিচের গুঁড়া আধা চা-চামচ, সিরকা ২ টেবিল চামচ, গরম মসলা ১ চা-চামচ, সরিষা পেস্ট ১ চা-চামচ, লবণ স্বাদমতো, তেল প্রয়োজনমতো।";
                        String karjodtails_obj16= "মাংসের সঙ্গে সব মসলা মাখিয়ে ১ ঘণ্টা মেরিনেট করে রাখতে হবে। ফ্রাইপ্যানে প্রয়োজনমতো তেল দিয়ে তাতে মাংসগুলো ভেজে তুলে রাখতে হবে। বাকি মসলায় পেঁয়াজসহ সব সবজি মাখিয়ে মাংস ভাজা তেলে একটু নাড়াচাড়া করে ভাজা মাংসের ওপর সাজিয়ে পরিবেশন করা যায় মজাদার আম মাংস।";

                        Bitmap bitmap_a16 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_17);
                        ByteArrayOutputStream baos_a16= new ByteArrayOutputStream();
                        bitmap_a16.compress(Bitmap.CompressFormat.PNG, 100, baos_a16);
                        byte[] b_a16 = baos_a16.toByteArray();

                        Intent Int_a16 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a16.putExtra("titel_name", name_obj16);
                        Int_a16.putExtra("upodetail_name", upodetails_obj16);
                        Int_a16.putExtra("karjodtails_name", karjodtails_obj16);

                        Int_a16.putExtra("picture", b_a16);

                        startActivity(Int_a16);

                        break;

                    case 17:

                        String name_obj17= "ধনেপাতা বাটা দিয়ে বিফ";
                        String upodetails_obj17= "গরুর মাংস ৫০০ গ্রাম, পেঁয়াজ বাটা ১ কাপ, আদা ও রসুন বাটা ২ টেবিল চামচ, লবণ স্বাদ অনুযায়ী ধনেপাতা বাটা ১/২ কাপ বা ১ কাপ। কাঁচামরিচ বাটা ২ টেবিল চামচ। তেল পরিমাণমতো।";
                        String karjodtails_obj17= "গরুর মাংস ভালো করে পানি দিয়ে ধুয়ে ফেলুন। একটি পাতিলে তেল গরম করে তাতে বাটা পেঁয়াজ, আদা ও রসুন এবং লবণ দিয়ে মসলা ভালো করে কষিয়ে তাতে গরুর মাংস, ধনেপাতা ও কাঁচা মরিচ বাটা দিয়ে আরও কিছুক্ষণ কষিয়ে পরিমাণমতো পানি দিয়ে ঢেকে রান্না করুন। মাংস বেশ ভুনাভুনা হলে নামিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a17 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_18);
                        ByteArrayOutputStream baos_a17 = new ByteArrayOutputStream();
                        bitmap_a17.compress(Bitmap.CompressFormat.PNG, 100, baos_a17);
                        byte[] b_a17 = baos_a17.toByteArray();

                        Intent Int_a17 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a17.putExtra("titel_name", name_obj17);
                        Int_a17.putExtra("upodetail_name", upodetails_obj17);
                        Int_a17.putExtra("karjodtails_name", karjodtails_obj17);

                        Int_a17.putExtra("picture", b_a17);

                        startActivity(Int_a17);
                        break;

                    case 18:
                        String name_obj18= "বিফ কালিয়া";
                        String upodetails_obj18= "গরুর মাংস ১ কেজি, পেঁয়াজ টুকরা করা ১ বাটি, আদা বাটা ২ টেবিল চামচ, রসুন বাটা ১ টেবিল চামচ, হলুদ গুঁড়া ২ টেবিল চামচ, মরিচ গুঁড়া ১ টেবিল চামচ, তেজপাতা ৪টি, গরম মসলা টেলে গুঁড়া করা (এলাচ, দারুচিনি, জায়ফল, লবঙ্গ, গোলমরিচ, ধনিয়া, শুকনা মরিচ) সব মিলিয়ে ২ টেবিল চামচ, টক দই ৪০০ গ্রাম, লেবুর রস ২ টেবিল চামচ, গুঁড়া দুধ তরল ১ কাপ, চিনি ১ চামচ, আলুবোখারা ২-৩টি, গোলাপজল ১/২ চা চামচ, কাঁচামরিচ ১০-১২টি এবং পানি পরিমাণমতো।";
                        String karjodtails_obj18= "প্রথমে মাংসের টুকরাগুলো ভালো করে ধুয়ে নিন। তারপর একটি পাত্রে মাংস নিয়ে তাতে টক দই, অল্প গরম মসলা, বাকি সব বাটা ও গুঁড়া মসলা এবং স্বাদ অনুযায়ী লবণ দিয়ে প্রায় ৩-৪ ঘণ্টা মাখিয়ে রাখুন (চিনি, গোলাপজল ও দুধ ছাড়া)। একটি পাতিলে তেল গরম করে তাতে পেঁয়াজ ও তেজপাতা হালকা ভেজে মাখানো গরুর মাংস দিয়ে ভালো করে কষাতে হবে। মাংস বেশ ভুনাভুনা হয়ে এলে তাতে গোলাপজল, পরিমাণমতো পানি, দুধ, চিনি, লেবুর রস, আলুবোখারা এবং কাঁচামরিচ দিয়ে আধা ঘণ্টা ঢেকে রান্না করে পরিবেশন করুন।";

                        Bitmap bitmap_a18 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_19);
                        ByteArrayOutputStream baos_a18 = new ByteArrayOutputStream();
                        bitmap_a18.compress(Bitmap.CompressFormat.PNG, 100, baos_a18);
                        byte[] b_a18 = baos_a18.toByteArray();

                        Intent Int_a18 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a18.putExtra("titel_name", name_obj18);
                        Int_a18.putExtra("upodetail_name", upodetails_obj18);
                        Int_a18.putExtra("karjodtails_name", karjodtails_obj18);

                        Int_a18.putExtra("picture", b_a18);

                        startActivity(Int_a18);

                        break;

                    case 19:
                        String name_obj19= "বিফ ফ্রাই";
                        String upodetails_obj19= "গরুর হাড়ছাড় মাংস ১ কেজি লম্বা করে কেটে নিতে হবে, সিরকা হাফ কাপ, মরিচ গুঁড়া ১ টেবিল চামচ, লবণ স্বাদ অনুযায়ী, আদা ও রসুন বাটা ১ টেবিল চামচ, ভাজার জন্য তেল এবং ভাজার সময় মোটা করে পেঁয়াজ কাটা হাপ কাপ ও আস্ত কাঁচামরিচ ৫-৬টি।";
                        String karjodtails_obj19= "প্রথমে গরুর মাংস ভালো করে ধুয়ে নিয়ে পানি ছেঁকে অল্প করে ছেঁচে নিয়ে তাতে একে একে সব মসলা বাটা ও গুঁড়া, লবণ ও সিরকা নিয়ে মাখিয়ে একদিন ফ্রিজে রেখে পরিমাণমতো পানি দিয়ে চুলায় মাখামাখা করে সিদ্ধ করে নিতে হবে। তারপর একটি ফ্রাই প্যানে তেল গরম করে তাতে পেঁয়াজের টুকরা ও কাঁচামরিচ দিয়ে হালকা ভেজে তাতে সিদ্ধ মাংস দিয়ে ভাজা ভাজা করে একটি প্লেটে সাজিয়ে পরিবেশন করুন বিফ ভাজা।";

                        Bitmap bitmap_a19 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_20);
                        ByteArrayOutputStream baos_a19 = new ByteArrayOutputStream();
                        bitmap_a19.compress(Bitmap.CompressFormat.PNG, 100, baos_a19);
                        byte[] b_a19 = baos_a19.toByteArray();

                        Intent Int_a19 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a19.putExtra("titel_name", name_obj19);
                        Int_a19.putExtra("upodetail_name", upodetails_obj19);
                        Int_a19.putExtra("karjodtails_name", karjodtails_obj19);

                        Int_a19.putExtra("picture", b_a19);

                        startActivity(Int_a19);

                        break;

                    case 20:
                        String name_obj20= "নবাবি বিফ";
                        String upodetails_obj20= "গরুর মাংস ১ কেজি হাড় ছাড়া, পেঁয়াজ ২০০ গ্রাম, আদাবাটা ১ টেবিল চামচ, রসুনবাটা ১ টেবিল চামচ, জিরা ১ টেবিল চামচ, গরম মশলা ১ টেবিল চামচ, ডিম ২টা, টক দই ১ কাপ, মাওয়া ২ টেবিল চামচ, তেল ৭৫ গ্রাম, ঘি ৭৫ গ্রাম, কাঁচামরিচ ৫০ গ্রাম, পেস্তাবাদাম পেস্ট ১ টেবিল চামচ, কাজু বাদাম পেস্ট ১ টেবিল চামচ, টমেটো ২টা, কিশমিশ ৩০ গ্রাম, লবণ স্বাদমতো।";
                        String karjodtails_obj20= "গরুর মাংস ধুয়ে পানি ঝরিয়ে নিন। তারপর ডিম, মাওয়া, ঘি ছাড়া বাকি সব উপকরণ একসঙ্গে মিলিয়ে চুলায় চড়ান। রান্না করুন কিছুক্ষণ, মাঝে নেড়ে দিতে হবে যেন লেগে না যায়। পানি শুকিয়ে তেল ওপরে উঠে এলে পানি দিয়ে আরও কিছুক্ষণ রান্না করতে হবে। সিদ্ধ হয়ে গেলে মাংস একটি পাত্রে নামিয়ে রাখতে হবে। একটি পাত্রে ঘি দিয়ে তাতে পেঁয়াজ, রসুন, এলাচ, দারুচিনি ভাজতে হবে। মশলা বাদামি হয়ে এলে তাতে নামিয়ে রাখা মাংসগুলো দিয়ে কিছুক্ষণ রান্না করতে হবে। ভাজা ভাজা হলে তাতে মাংসের জমানো ঝোল দিয়ে রান্না করতে হবে। মাখা মাখা হয়ে এলে এতে কিশমিশ ও মাওয়া দিয়ে নামিয়ে নিন। ডিম ভেজে জুলিয়ান কাট কেটে গরম পরিবেশন করুন নবাবি বিফ।";

                        Bitmap bitmap_a20 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_21);
                        ByteArrayOutputStream baos_a20 = new ByteArrayOutputStream();
                        bitmap_a20.compress(Bitmap.CompressFormat.PNG, 100, baos_a20);
                        byte[] b_a20 = baos_a20.toByteArray();

                        Intent Int_a20 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a20.putExtra("titel_name", name_obj20);
                        Int_a20.putExtra("upodetail_name", upodetails_obj20);
                        Int_a20.putExtra("karjodtails_name", karjodtails_obj20);

                        Int_a20.putExtra("picture", b_a20);

                        startActivity(Int_a20);

                        break;

                    case 21:

                        String name_obj21= "মাংসের কোরমা";
                        String upodetails_obj21= "গরুর মাংস ১ কেজি, পেঁয়াজ বাটা ৩ টেবিল চামচ, আদা বাটা ১ টেবিল চামচ, রসুন বাটা ২ চা চামচ, পেঁয়াজ কুচি ৪ ভাগের ১ কাপ, টক দই হাফ কাপ, আলু মাঝারি ৫-৬টি, এলাচ ২ টুকরো, দারুচিনি ২-৩ টুকরো, কেওড়া জল ২ টেবিল চামচ, চিনি ১ টেবিল চামচ, লেবুর রস ১ টেবিল চামচ, লবণ পরিমাণমতো।";
                        String karjodtails_obj21= "প্রথমে মাংস টুকরো করে কেটে ধুয়ে নিন। সব বাটা মসলা ও গরম মসলা, দই ৪ ভাগের এক কাপ মাংসে মেখে ঢেকে চুলায় দিন। মাংস কষানো হলে চিনি ও লবণ দিন। পরিমাণমতো পানি দিয়ে ঢেকে দিন। আলু খোসা ছাড়িয়ে ২ টুকরো করে নিন। বাকি ঘিয়ে আলু অল্প ভেজে তুলে রাখুন। ওই ঘিয়ে কাটা পেঁয়াজ কুচি দিয়ে ভেজে মাংস ও আলু দিয়ে কষিয়ে নিন। মাংস ভাজা হলে কেওড়া জল দিন। মাংস কষানো হলে পরিমাণমতো পানি দিন। ঢেকে মাঝারি আঁচে রান্না করুন ১০-১২ মিনিট। আঁচ কমিয়ে ওপরে লেবুর রস ছিটিয়ে দিয়ে ২-৩ মিনিট দমে রাখুন।";

                        Bitmap bitmap_a21 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_22);
                        ByteArrayOutputStream baos_a21 = new ByteArrayOutputStream();
                        bitmap_a21.compress(Bitmap.CompressFormat.PNG, 100, baos_a21);
                        byte[] b_a21 = baos_a21.toByteArray();

                        Intent Int_a21 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a21.putExtra("titel_name", name_obj21);
                        Int_a21.putExtra("upodetail_name", upodetails_obj21);
                        Int_a21.putExtra("karjodtails_name", karjodtails_obj21);

                        Int_a21.putExtra("picture", b_a21);

                        startActivity(Int_a21);

                        break;

                    case 22:
                        String name_obj22= "গরুর ঝাল ভুনা";
                        String upodetails_obj22= "গরুর গোশত ১ কেজি, আদা বাটা ২ টেবিল চামচ, রসুন বাটা ২ টেবিল চামচ, পেঁয়াজ বাটা ১ কাপ, লবণ প্রয়োজনমতো, পেঁয়াজ বেরেস্তা ১ কাপ, শুকনা মরিচ ১০-১২টা, সয়াবিন তেল পৌনে ১ কাপ।";
                        String karjodtails_obj22= "আদা, রসুন, পেঁয়াজ বাটা দিয়ে মাংস আধা ঘণ্টা ম্যারিনেট করে রাখতে হবে। তেলে পেঁয়াজ ভেজে বেরেস্তা করে এবং শুকনা মরিচ ভেজে তুলে রাখতে হবে। ওই তেলে মাখানো মাংস দিয়ে অল্প আঁচে রান্না করতে হবে। প্রয়োজনে অল্প গরম পানি দিতে হবে। সেদ্ধ হলে পেঁয়াজ বেরেস্তা ও শুকনা মরিচ গুঁড়া করে দিতে হবে। ১৫ মিনিট দমে রেখে নামিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a22 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_23);
                        ByteArrayOutputStream baos_a22 = new ByteArrayOutputStream();
                        bitmap_a22.compress(Bitmap.CompressFormat.PNG, 100, baos_a22);
                        byte[] b_a22 = baos_a22.toByteArray();

                        Intent Int_a22 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a22.putExtra("titel_name", name_obj22);
                        Int_a22.putExtra("upodetail_name", upodetails_obj22);
                        Int_a22.putExtra("karjodtails_name", karjodtails_obj22);

                        Int_a22.putExtra("picture", b_a22);

                        startActivity(Int_a22);

                        break;

                    case 23:
                        String name_obj23= "ছোলার ডালে মাংস";
                        String upodetails_obj23= "গরুর মাংস ৫০০ গ্রাম, ছোলার ডাল ২৫০ গ্রাম, আদা বাটা ২ টেবিল চামচ, রসুন বাটা ২ টেবিল চামচ, জিরা বাটা ১ টেবিল চামচ, পেঁয়াজ কুচি ১ কাপ, হলুদ গুঁড়া ১ চা চামচ, কাঁচামরিচ ৫-৬টি, শুকনা মরিচ গুঁড়া ১ চা চামচ, লবণ পরিমাণমতো, তেজপাতা ২-৩টি, দারুচিনি ২-৩টি, এলাচ-লবঙ্গ ২-৩টি, গরম মসলা গুঁড়া ২ চা চামচ, সয়াবিন তেল ১/৪ কাপ, ঘি ১ টেবিল চামচ।";
                        String karjodtails_obj23= "প্রথমে একটি কড়াইয়ে সয়াবিন তেল দিয়ে এলাচ, লবঙ্গ, দারুচিনি তেজপাতা ও পেঁয়াজ কুচি একটু লাল করে ভেজে আদা বাটা, রসুন বাটা, জিরা বাটা, হলুদ গুঁড়া, শুকনা মরিচ গুঁড়া, গরম মসলা গুঁড়া ও লবণ দিয়ে মসলা কষিয়ে মাংস দিয়ে আবার একটু কষিয়ে ভিজিয়ে রাখা ডাল দিতে হবে। ডাল ও মাংস একসঙ্গে অল্প আঁচে রান্না করতে হবে। নামানোর আগে ঘি ও কাঁচামরিচ ফালি দিয়ে নামাতে হবে।";

                        Bitmap bitmap_a23 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_24);
                        ByteArrayOutputStream baos_a23 = new ByteArrayOutputStream();
                        bitmap_a23.compress(Bitmap.CompressFormat.PNG, 100, baos_a23);
                        byte[] b_a23 = baos_a23.toByteArray();

                        Intent Int_a23 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a23.putExtra("titel_name", name_obj23);
                        Int_a23.putExtra("upodetail_name", upodetails_obj23);
                        Int_a23.putExtra("karjodtails_name", karjodtails_obj23);

                        Int_a23.putExtra("picture", b_a23);

                        startActivity(Int_a23);

                        break;

                    case 24:
                        String name_obj24= "কষানো খাসির মাংস";
                        String upodetails_obj24= "খাসির মাংস আধা কেজি, টক দই ১০০ গ্রাম। পেঁয়াজ বাটা ও পেঁয়াজ কুচি, আদা বাটা, রসুন বাটা, জিরা বাটা পরিমাণমতো। হলুদের গুঁড়া ও শুকনা মরিচ, এলাচি দানা, সাত-আটটা দারুচিনি, সয়াবিন তেল, লবণ পরিমাণমতো।";
                        String karjodtails_obj24= "টকদই, পেঁয়াজ বাটা, আদা বাটা, রসুন বাটা, জিরা বাটা দিয়ে মাংস মাখিয়ে রেখে দিন আধা ঘণ্টা। পাত্রে তেল নিয়ে গরম করে তাতে পেঁয়াজ কুচি, এলাচি দানা, দারুচিনি দানা ফাটিয়ে ছেড়ে দিন। পেঁয়াজ বাদামি হয়ে এলে তাতে মাংস ছেড়ে দিন। ১৫-২০ মিনিট নাড়াচাড়া করুন। তেল মাংসের ওপর উঠে এলে দুই কাপ পানি দিয়ে মিনিট দশেক জ্বাল দিন। মাংস সেদ্ধ হয়ে গেলে নামানোর দুই মিনিট আগে কয়েকটি কাঁচা মরিচ মাঝখানে লম্বালম্বি কেটে ছেড়ে দিন। নামিয়ে মাংসের ওপর টমেটো ও ধনেপাতা কুচি ছড়িয়ে দিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a24 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_25);
                        ByteArrayOutputStream baos_a24 = new ByteArrayOutputStream();
                        bitmap_a24.compress(Bitmap.CompressFormat.PNG, 100, baos_a24);
                        byte[] b_a24 = baos_a24.toByteArray();

                        Intent Int_a24 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a24.putExtra("titel_name", name_obj24);
                        Int_a24.putExtra("upodetail_name", upodetails_obj24);
                        Int_a24.putExtra("karjodtails_name", karjodtails_obj24);

                        Int_a24.putExtra("picture", b_a24);

                        startActivity(Int_a24);

                        break;

                    case 25:
                        String name_obj25= "আস্ত লেগ রোস্ট";
                        String upodetails_obj25= "খাসির আস্ত রান ১টি, পেঁয়াজ কুচি ২ টেবিল চামচ, পেঁয়াজ বাটা ২ টেবিল-চামচ, পেঁয়াজ বেরেস্তা ১ কাপ, আদা বাটা ১ চা-চামচ, রসুন বাটা ১ চা-চামচ, মরিচ গুঁড়া ১ টেবিল-চামচ, জিরা ১ চা-চামচ, দারচিনি, এলাচ, লবঙ্গ, কালো গোলমরিচ ও তেজপাতা পছন্দ মতো, শুকনা মরিচ ৬টি, টকদই আধা কাপ, চিনি ১ চা-চামচ, জায়ফল-জয়ত্রী-পোস্তদানা একসঙ্গে বাটা ২ টেবিল-চামচ, দুধ দেড় কাপ, কেওড়াজল ১ টেবিল-চামচ, তেঁতুলের মাড় ১ টেবিল-চামচ, ঘি ২ টেবিল-চামচ, তেল আধা কাপ, চিনি ১ টেবিল-চামচ, লবণ প্রয়োজনমতো।";
                        String karjodtails_obj25= "প্রথমে আস্ত রান কাঁটা চামচ দিয়ে কেচে নিয়ে পেঁয়াজ, রসুন আদা, জিরা, দারচিনি, তেজপাতা এলাচ ও লবঙ্গ, শুকনা মরিচ, গোলমরিচ, লবণ, টকদই, চিনি ও তেল দিয়ে মেরিনেট করে ১ ঘণ্টা রেখে দিন। পরিমাণ মতো পানি দিয়ে মশলাসহ রান সেদ্ধ করুন। পেঁয়াজ বেরেস্তা, ঘি ও তেঁতুল বাদে দুধ, জায়ফল-জয়ত্রী-পোস্তদানাসহ ওপরের অন্য সব উপকরণ একসঙ্গে দিয়ে নাড়তে থাকুন। মশলা রানের গায়ে লেগে তেল উঠে এলে তেঁতুলের মাড় দিয়ে দিন। সব শেষে পেঁয়াজ বেরেস্তা ও ঘি দিয়ে নামিয়ে নিন দারুণ মজার জিভে পানি আনা খাসির আস্ত লেগ রোস্ট। পরোটার সাথে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a25 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_26);
                        ByteArrayOutputStream baos_a25 = new ByteArrayOutputStream();
                        bitmap_a25.compress(Bitmap.CompressFormat.PNG, 100, baos_a25);
                        byte[] b_a25 = baos_a25.toByteArray();

                        Intent Int_a25 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a25.putExtra("titel_name", name_obj25);
                        Int_a25.putExtra("upodetail_name", upodetails_obj25);
                        Int_a25.putExtra("karjodtails_name", karjodtails_obj25);

                        Int_a25.putExtra("picture", b_a25);

                        startActivity(Int_a25);

                        break;

                    case 26:
                        String name_obj26= "খাসির রানের রোস্ট";
                        String upodetails_obj26= "১ কেজি ওজনের খাসির রান, সোয়া কাপ মিষ্টি দই, আদা বাটা ১ টেবিল চামচ, রসুন বাটা আধা টেবিল চামচ, সয়াবিন তেল আধা কাপ, গরমমসলা, জয়ফল-জয়ত্রী বাটা আদা চা-চামচ, টমেটো কুচি ১ কাপ, পেঁপে বাটা ২ চা-চামচ, দুধের ননি আধা কাপ, পেঁয়াজ ২ কাপ, ময়দা ১ টেবিল চামচ, বাদাম কুচি ও কিশমিশ পরিমাণ মতো।";
                        String karjodtails_obj26= "খাসির রান ভালোভাবে পরিষ্কার করে ধুয়ে পানি ঝরিয়ে নিতে হবে। প্রয়োজনে শুকনো কাপড় দিয়ে পানি শুষে নিতে হবে। এবার ময়দা ও লবণ মাখিয়ে হাড়সহ রানটি তেলের মধ্যে কম জ্বালে ১০ মিনিটের মতো ভেজে নিতে হবে। এবার একটি বড় হাঁড়িতে অন্য সব উপকরণ দিয়ে খাসির রানটি ডুবো পানিতে ঢাকনা দিয়ে ডেকে দুই থেকে তিন ঘণ্টা সেদ্ধ করতে হবে। পানি শুকিয়ে এলে প্রয়োজনে আবার পানি দিতে হবে। পানিটা ঘন হয়ে এলে এর সঙ্গে কিশমিশ ও বাদাম মিশিয়ে নামিয়ে নিতে হবে।";

                        Bitmap bitmap_a26 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_27);
                        ByteArrayOutputStream baos_a26 = new ByteArrayOutputStream();
                        bitmap_a26.compress(Bitmap.CompressFormat.PNG, 100, baos_a26);
                        byte[] b_a26 = baos_a26.toByteArray();

                        Intent Int_a26 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a26.putExtra("titel_name", name_obj26);
                        Int_a26.putExtra("upodetail_name", upodetails_obj26);
                        Int_a26.putExtra("karjodtails_name", karjodtails_obj26);

                        Int_a26.putExtra("picture", b_a26);

                        startActivity(Int_a26);

                        break;

                    case 27:

                        String name_obj27= "খাসির ঝাল মাংস";
                        String upodetails_obj27= "খাসির মাংস ১ কেজি, ছোট আলু ১৫টি, টক দই আধা কাপ, আদা বাটা ১ টেবিল চামচ, রসুন বাটা ১ টেবিল চামচ, মরিচের গুঁড়া ২ টেবিল চামচ, এলাচি ৩টি, দারুচিনি ৪-৫টি, তেজপাতা ৩টি, ধনের গুঁড়া ১ চা-চামচ, হলুদের গুঁড়া ১ চা-চামচ, পেঁয়াজের কুচি আধা কাপ, তেল আধা কাপ, লবণ পরিমাণমতো, জিরার গুঁড়া ১ চা-চামচ, কাঁচা মরিচ ৪-৫টি।";
                        String karjodtails_obj27= "খাসির মাংসগুলো কেটে ধুয়ে টক দই দিয়ে ২০ মিনিট রেখে দিতে হবে। এরপর আদা বাটা, রসুন বাটা ও লবণ মাখিয়ে আরও ১৫ মিনিট রেখে দিতে হবে। পাত্রে তেল গরম করে তাতে পেঁয়াজের কুচি ভেজে বাদামি করতে হবে। এবার এর মধ্যে আবার আদা বাটা, রসুন বাটা, মরিচের গুঁড়া, ধনে গুঁড়া, হলুদের গুঁড়া, এলাচি, দারুচিনি, তেজপাতা ও লবণ একসঙ্গে মিশিয়ে সামান্য পানি দিয়ে ভালোভাবে মসলাগুলো কষিয়ে নিতে হবে। ছোট আলুগুলো আগেই সেদ্ধ করে নিতে হবে। এবার কষানো মসলায় ছোট আলু ও মাংসগুলো ঢেলে দিন। সামান্য পানি দিয়ে সেদ্ধ করতে দিন। পানি কমে এলে তাতে জিরার গুঁড়া ও কাঁচা মরিচ দিয়ে আবার ঢেকে দিন। ভুনা ভুনা হলে নামিয়ে ফেলুন।";

                        Bitmap bitmap_a27 = BitmapFactory.decodeResource(getResources(), R.drawable.image);
                        ByteArrayOutputStream baos_a27 = new ByteArrayOutputStream();
                        bitmap_a27.compress(Bitmap.CompressFormat.PNG, 100, baos_a27);
                        byte[] b_a27 = baos_a27.toByteArray();

                        Intent Int_a27 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a27.putExtra("titel_name", name_obj27);
                        Int_a27.putExtra("upodetail_name", upodetails_obj27);
                        Int_a27.putExtra("karjodtails_name", karjodtails_obj27);

                        Int_a27.putExtra("picture", b_a27);

                        startActivity(Int_a27);
                        break;

                    case 28:
                        String name_obj28= "খাসির রগেন জোশ";
                        String upodetails_obj28= "খাসির মাংস ১ কেজি, আদা বাটা ৩ চামচ, খাসির পায়ের লম্বা হাড় ৪০০ গ্রাম, রসুন বাটা ২ চা চামচ, পেঁয়াজ বাটা ২ টে. চামচ, জিরা বাটা ১ চা চামচ, মরিচ গুঁড়া ১ চা চামচ, হলুদ গুঁড়া ১ চা চামচ, লবণ পরিমাণমতো, সাদা গোলমরিচ গুঁড়া ১ চা চামচ, গরম মসলা গুঁড়া ১ চা চামচ, জায়ফল গুঁড়া সিকি চা চামচ, পাকা পেঁপে বাটা ১ টে. চামচ, গাজর বাটা ১ টে. চামচ, টমেটো পিউরি ২ টে. চামচ, আদাকুচি ১ চা চামচ, রসুনকুচি আধা চা চামচ, দারুচিনি ৬ টুকরা, এলাচ ৪টি, লবঙ্গ ৬টি, তেজপাতা ২টি, তেল ৬ টে. চামচ, রগেন জোশ অর্থাৎ খাসির হাড়ের স্টেক ২ কাপ, ঘি ২ টে. চামচ, চিনি ১ চা চামচ,।";
                        String karjodtails_obj28= "মাংস টুকরা করে গরম মসলার গুঁড়া বাদে সব বাটা মসলা, গুঁড়া মসলা, তেল, লবণ, দারুচিনি, এলাচ, লবঙ্গ দিয়ে কষাতে হবে। অল্প অল্প করে পানি দিয়ে মাংস ভুনতে হবে। মাংস সিদ্ধ হয়ে পানি শুকিয়ে গেলে টমেটো পিউরি দিয়ে কিছুক্ষণ নাড়াচাড়া করে নামাতে হবে। অন্য পাত্রে খাসির হাড় ১ চা চামচ, আদা বাটা, ২ টুকরা দারুচিনি, ১টে তেজপাতা, আধা চা চামচ শুকনা মরিচের গুঁড়া লবণ দিয়ে ডুবো পানিতে সেদ্ধ করতে হবে এক ঘন্টা। ঠান্ডা করে হাড়ের মধ্য থেকে চামচ বা কাঠি দিয়ে ভেতরের সাদা তেলতেলে অংশ বের করে রাখতে হবে। স্টেক আলাদা রাখতে হবে। ঘি গরম করে আদা-রসুন কুচি ভেজে পেঁপে বাটা ও গাজর দিয়ে কিছুক্ষণ ভুনে হাড়ের ভেতর থেকে বের করা অংশ দিয়ে কিছুক্ষণ ভুনে রান্না করা মাংস দিয়ে কিছুক্ষণ ভুনে রগেন জোশ দিয়ে গরম মসলার গুঁড়া ও কাঁচামরিচ দিয়ে নামাতে হবে। ধনেপাতা কুচি ছিটিয়ে দিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a28 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_29);
                        ByteArrayOutputStream baos_a28 = new ByteArrayOutputStream();
                        bitmap_a28.compress(Bitmap.CompressFormat.PNG, 100, baos_a28);
                        byte[] b_a28 = baos_a28.toByteArray();

                        Intent Int_a28 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a28.putExtra("titel_name", name_obj28);
                        Int_a28.putExtra("upodetail_name", upodetails_obj28);
                        Int_a28.putExtra("karjodtails_name", karjodtails_obj28);

                        Int_a28.putExtra("picture", b_a28);

                        startActivity(Int_a28);

                        break;

                    case 29:
                        String name_obj29= "খাসির কোরমা";
                        String upodetails_obj29= "খাসির মাংস এক কেজি, আদাবাটা এক টেবিল-চামচ, দারচিনি বড় চার টুকরা, তেজপাতা দুটি, লবণ দুই চা-চামচ, ঘি আধা কাপ, কাঁচা মরিচ আটটি, কেওড়া দুই টেবিল-চামচ, তরল দুধ দুই টেবিল-চামচ, পেঁয়াজবাটা সিকি কাপ, রসুনবাটা দুই চা-চামচ, এলাচি চারটি, টক দই আধা কাপ, চিনি চার চা-চামচ, দেশি পেঁয়াজকুচি আধ কাপ, লেবুর রস এক টেবিল-চামচ, জাফরান আধা চা-চামচ, (দুই টেবিল-চামচ তরল দুধে ভিজিয়ে ঢেকে রাখুন)।";
                        String karjodtails_obj29= "মাংস টুকরো করে ধুয়ে পানি ঝরিয়ে নিন। সব বাটা মসলা, গরম মসলা, টক দই, সিকি কাপ ঘি ও লবণ দিয়ে মেখে হাত ধোয়া পানি দিয়ে ঢেকে মাঝারি আঁচে চুলায় বসিয়ে দিন। মাংস সেদ্ধ না হলে আরও পানি দিন। পানি অর্ধেক টেনে গেলে কেওড়া ও কাঁচা মরিচ দিয়ে আবার হালকা নেড়ে ঢেকে দিন। ১৫ থেকে ২০ মিনিট পর পাশের চুলায় বাকি ঘি গরম করে পেঁয়াজকুচি সোনালি রং করে ভেজে মাংসের হাঁড়িতে দিয়ে বাগার দিন। তারপর চিনি দিয়ে নেড়ে ঢেকে দিন। পাঁচ মিনিট পর ঢাকনা খুলে দুধে ভেজানো জাফরান ওপর থেকে ছিটিয়ে দিয়ে আরও পাঁচ মিনিট ঢেকে রাখুন। তারপর ঢাকনা খুলে লেবুর রস দিয়ে হালকা নেড়ে আঁচ একেবারে কমিয়ে তাওয়ার ওপর ঢেকে প্রায় ২০ মিনিট থেকে আধা ঘণ্টার মতো দমে রাখুন। যখন কোরমা মাখা মাখা হয়ে বাদামি রং হবে এবং মসলা থেকে তেল ছাড়া শুরু করবে, তখন নামিয়ে পরিবেশন।";

                        Bitmap bitmap_a29 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_30);
                        ByteArrayOutputStream baos_a29 = new ByteArrayOutputStream();
                        bitmap_a29.compress(Bitmap.CompressFormat.PNG, 100, baos_a29);
                        byte[] b_a29 = baos_a29.toByteArray();

                        Intent Int_a29 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a29.putExtra("titel_name", name_obj29);
                        Int_a29.putExtra("upodetail_name", upodetails_obj29);
                        Int_a29.putExtra("karjodtails_name", karjodtails_obj29);

                        Int_a29.putExtra("picture", b_a29);

                        startActivity(Int_a29);

                        break;

                    case 30:
                        String name_obj30= "মাংসের চাপ";
                        String upodetails_obj30= "খাসির হাড়ছাড়া পেছনের রানের মাংস-৮ টুকরো (পাতলা স্লাইস) টকদই-১০০ গ্রাম, কাঁচা পেঁপে বাটা-আধা কাপ, পেঁয়াজ কুচি ২টি, পেঁয়াজ বাটা-২টি, আদা বাটা-২ চা চামচ, রসুন-৬ কোয়া (বাটা), হলুদ-সামান্য, মরিচ বাটা-২ চা চামচ, গরম মসলা গুঁড়ো-১ চা চামচ, চিনি-১ চা চামচ, লবণ-আন্দাজমত, ঘি-১০০ গ্রাম।";
                        String karjodtails_obj30= "মাংস পাতলা স্লাইস করে ধুয়ে নিন। মাংসের সঙ্গে লবণ টকদই ও পেঁপে বাটা মাখিয়ে ঘণ্টাখানেক রেখে দিন। এরপর মাংসের মধ্যে সমস্ত বাটা মসলা মিশিয়ে আরও ২-৩ ঘণ্টা রাখুন। তাওয়া বা ননস্টিক ফ্রাইপ্যানে ঘি গরম করে কুচানো পেঁয়াজ হালকা করে ভেজে তাকে মসলা মাখানো মাংসের টুকরোগুলো ঢেলে একটু এপিঠ ওপিঠ ভেজে ঢেকে রান্না করুন। মাংসের থেকে যে পানি বের হবে সেটা কম আঁচে রেখেই শুকিয়ে নিন। যখন দেখবেন পানি একেবারে শুকিয়ে গেছে তখন আঁচ বাড়িয়ে মাংসগুলো ভেজে নামিয়ে নিন।";

                        Bitmap bitmap_a30 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_31);
                        ByteArrayOutputStream baos_a30 = new ByteArrayOutputStream();
                        bitmap_a30.compress(Bitmap.CompressFormat.PNG, 100, baos_a30);
                        byte[] b_a30 = baos_a30.toByteArray();

                        Intent Int_a30 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a30.putExtra("titel_name", name_obj30);
                        Int_a30.putExtra("upodetail_name", upodetails_obj30);
                        Int_a30.putExtra("karjodtails_name", karjodtails_obj30);

                        Int_a30.putExtra("picture", b_a30);

                        startActivity(Int_a30);

                        break;

                    case 31:

                        String name_obj31= "মুরগির কাটলেট";
                        String upodetails_obj31= "মুরগির মাংসের কিমা ৪০০ গ্রাম, আদা বাটা ২ চা-চামচ, রসুন বাটা ২ চা-চামচ, কাঁচা মরিচ (মিহি কুচি) ৪টি, পেঁয়াজ মিহি কুচি ৪ টেবিল চামচ, তাবাস্কো সস ১ টেবিল চামচ, সয়াসস ১ টেবিল চামচ, লবণ সিকি চা-চামচ বা স্বাদ অনুযায়ী, পুদিনাপাতা কুচি ৪ টেবিল চামচ, কর্নফ্লাওয়ার ২ চা-চামচ, ডিমের সাদা অংশ ৪টি, ময়দা আধা কাপ, শুকনা মরিচ গুঁড়া ১ টেবিল চামচ, কালো গোলমরিচ গুঁড়া দেড় চা-চামচ, ব্রেড ক্রাম্ব ৪ কাপ, চিনি আধা চা-চামচ, লেবুর রস ২ চা-চামচ, তেল ভাজার জন্য।";
                        String karjodtails_obj31= "তেল, ডিম, ব্রেড ক্রাম্ব, ময়দা ও মরিচ গুঁড়া বাদে কিমার সঙ্গে অন্যান্য সমস্ত উপকরণ একত্রে মিশিয়ে ভালো করে মেখে নিন। একটি প্লেটে ময়দার সঙ্গে মরিচ গুঁড়া মিশিয়ে ছড়িয়ে রাখুন। ডিমের সাদা অংশ বাকি গোলমরিচ এবং সামান্য লবণ দিয়ে ফেটে নিন। (ভাজার ঠিক আগে ডিম ফেটবেন)। এবার একটু করে কিমার মিশ্রণ হাতের তালুতে নিয়ে কাটলেটের আকৃতি দিয়ে তৈরি করে মরিচ গুঁড়া মেশানো ময়দায় গড়িয়ে একটি ট্রেতে রাখুন। এভাবে সবগুলো কাটলেট তৈরি করে ট্রেতে সাজিয়ে ফ্রিজে রেখে দিন কিছুক্ষণ। অন্য একটি প্লেটে ব্রেড ক্রাম্ব ছড়িয়ে রাখুন। প্রতিটি কাটলেট প্রথমে ডিমে চুবিয়ে ব্রেড ক্রাম্বে গড়িয়ে আবার ডিমে চুবিয়ে ব্রেড ক্রাম্বে সাজিয়ে আরও কিছুক্ষণ ফ্রিজে রেখে দিন। তবে ট্রের ওপর একটি কাগজ বিছিয়ে নিয়ে তারপর কাটলেটগুলো রেখে ফ্রিজে রাখবেন। কড়াই বা ফ্রাইপ্যানে তেল গরম করে অল্প আঁচে সোনালি করে কাটলেট ভেজে তেল ছেঁকে উঠিয়ে নিন। চাটনি বা সসের সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a31 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_32);
                        ByteArrayOutputStream baos_a31 = new ByteArrayOutputStream();
                        bitmap_a31.compress(Bitmap.CompressFormat.PNG, 100, baos_a31);
                        byte[] b_a31= baos_a31.toByteArray();

                        Intent Int_a31 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a31.putExtra("titel_name", name_obj31);
                        Int_a31.putExtra("upodetail_name", upodetails_obj31);
                        Int_a31.putExtra("karjodtails_name", karjodtails_obj31);

                        Int_a31.putExtra("picture", b_a31);

                        startActivity(Int_a31);
                        break;

                    case 32:
                        String name_obj32= "শাহী আস্ত চিকেন রোস্ট";
                        String upodetails_obj32= "একটি ফার্মের বড় মুরগি (দেড় থেকে ২ কেজি ওজনের), আদা বাটা ১ টেবিল চামচ, রসুন বাটা ২ টেবিল চামচ, পেঁয়াজ বাটা আধা কাপ, ঘন দুধ ১ কাপ, মাওয়া আধা কাপ, গোলাপজল সামান্য, জর্দার রং আধা চা চামচ, লেবুর রস ২ টেবিল চামচ, টক দই ১ কাপ, মিষ্টি দই ২ টেবিল চামচ, ঘি আধা কাপ, বেরেস্তা করা পেঁয়াজ ১ কাপ, গুঁড়া মরিচ সামান্য, গরম মশলা গুঁড়া ২ টেবিল চামচ, গাজর বড় বড় করে কাটা, ডিম সিদ্ধ ৪টি, বাদাম কুচি ২ টেবিল চামচ, কিশমিশ ১ চা চামচ, তেল ১ কাপ।";
                        String karjodtails_obj32= "প্রথমে আস্ত মুরগির চামড়া ফেলে পরিষ্কার করে ধুয়ে নিন। ছুরি দিয়ে মুরগির মাংস মাঝখানে চিরে দিন। আস্ত চিকেনে সব উপকরণ ভালো করে মাখিয়ে প্রায় ২ ঘণ্টা রাখুন ফ্রিজে। এর পর চিকেনের পা ২টি সুতা দিয়ে বাঁধুন। একটি বড় পাতিলে তেল ও ঘি একসঙ্গে গরম করে এতে পেঁয়াজ বাদামি করে ভেজে তুলুন। ওই তেলে মাখানো মুরগি দিন। ঢেকে রান্না করুন। আঁচ কমিয়ে রাখুন। মাঝে মাঝে চিকেন উল্টিয়ে দিন (চিকেনের উপরে বড় বড় টুকরো গাজর, ফুলকপি, সিদ্ধ ডিম ভরে দিতে পারেন)। চিকেন মাখামাখা হলে এতে গুঁড়া দুধ, চিলিসস, গোলাপজল, চিনি, লেবুর রস এবং বাদাম ও কিশমিশ দিয়ে আরও কিছুক্ষণ দমে রাখুন। আস্ত চিকেন সোনালী রঙের হলে নামিয়ে পরিবেশন করুন ।";

                        Bitmap bitmap_a32 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_33);
                        ByteArrayOutputStream baos_a32 = new ByteArrayOutputStream();
                        bitmap_a32.compress(Bitmap.CompressFormat.PNG, 100, baos_a32);
                        byte[] b_a32 = baos_a32.toByteArray();

                        Intent Int_a32 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a32.putExtra("titel_name", name_obj32);
                        Int_a32.putExtra("upodetail_name", upodetails_obj32);
                        Int_a32.putExtra("karjodtails_name", karjodtails_obj32);

                        Int_a32.putExtra("picture", b_a32);

                        startActivity(Int_a32);
                        break;

                    case 33:
                        String name_obj33= "মুরগির রোস্ট";
                        String upodetails_obj33= "মুরগি ১ পিস, আদা-রসুন বাটা ৫ টেবিল চামচ, কাজুবাদাম ৫ টেবিল চামচ, টক দই ৪ টেবিল চামচ, পেঁয়াজ ১৫০ গ্রাম, তেল ১৫০ গ্রাম, কাঁচামরিচ ১০ পিস, দুধ ২৫০ গ্রাম, মাওয়া ৫০ গ্রাম, জিরা গুঁড়া ১০ গ্রাম, ধনে গুঁড়া ১০ গ্রাম, টমেটো কেচাপ ২০ গ্রাম, সাদা গোলমরিচ ১০ গ্রাম, এলাচ ৫ পিস, দারুচিনি ৫ পিস, কিশমিশ ১০ গ্রাম, লবণ পরিমাণমতো, তেজপাতা ৫ পিস, জয়ত্রী ৫ গ্রাম ও জায়ফল আধা পিস।";
                        String karjodtails_obj33= "একটা মুরগি ৪ পিস করে কাটতে হবে। লবণ, হলুদ ও আদা-রসুন মাখিয়ে ভাজতে হবে। তারপর তেলের মধ্যে পেঁয়াজ, আদা ও রসুন বাটা দিয়ে ভুনতে হবে। এতে আরও কাঁচামরিচ, টক দই, কাজুবাদাম, কিশমিশ, সাদা গোলমরিচ দিয়ে ভুনতে হবে। ভুনা হলে এর মধ্যে ভাজা চিকেন দিয়ে সঙ্গে গুঁড়াদুধ, ঘি, গরম মসলা গুঁড়া, মাওয়া, গোলাপজল ও অল্প পরিমাণ পানি দিয়ে মুরগিটাকে আরও কিছুক্ষণ রান্না করে নামাতে হবে। সঙ্গে জাফরান পোলাও ও ভাজা কাজুবাদাম দিয়ে গরম গরম মুরগির রোস্ট পরিবেশন করুন।";

                        Bitmap bitmap_a33 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_34);
                        ByteArrayOutputStream baos_a33 = new ByteArrayOutputStream();
                        bitmap_a33.compress(Bitmap.CompressFormat.PNG, 100, baos_a33);
                        byte[] b_a33 = baos_a33.toByteArray();

                        Intent Int_a33 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a33.putExtra("titel_name", name_obj33);
                        Int_a33.putExtra("upodetail_name", upodetails_obj33);
                        Int_a33.putExtra("karjodtails_name", karjodtails_obj33);

                        Int_a33.putExtra("picture", b_a33);

                        startActivity(Int_a33);

                        break;

                    case 34:
                        String name_obj34= "মুরগির শাহি কোরমা";
                        String upodetails_obj34= "মুরগির মাংস দেড় কেজি, আদা বাটা ১ চা-চামচ, রসুন বাটা আধা চা-চামচ, লবণ ১ চা-চামচ (স্বাদমতো), পেঁয়াজ বেরেস্তা বাটা ১ চা-চামচ, পোস্তদানা বাটা ১ চা-চামচ, বাদাম বাটা ১ চা-চামচ, কিশমিশ বাটা আধা চা-চামচ, পেঁয়াজ বাটা ১ টেবিল চামচ, দুধ দেড় কাপ, তেজপাতা ২টি, এলাচি ৪-৫টি, দারুচিনি ২ টুকরা, ঘি ২ টেবিল চামচ, চিনি আধা চা-চামচ, পেঁয়াজ বেরেস্তা ১ টেবিল চামচ।";
                        String karjodtails_obj34= "ঘিয়ে সব মসলা কষিয়ে মাংস দিয়ে দিন। মাংস কষিয়ে দুধ দিয়ে ঢেকে দিন। প্রয়োজনে সামান্য পানি দিন। সেদ্ধ হলে চিনি ও বেরেস্তা দিয়ে নামিয়ে নিন।";

                        Bitmap bitmap_a34 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_35);
                        ByteArrayOutputStream baos_a34 = new ByteArrayOutputStream();
                        bitmap_a34.compress(Bitmap.CompressFormat.PNG, 100, baos_a34);
                        byte[] b_a34 = baos_a34.toByteArray();

                        Intent Int_a34 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a34.putExtra("titel_name", name_obj34);
                        Int_a34.putExtra("upodetail_name", upodetails_obj34);
                        Int_a34.putExtra("karjodtails_name", karjodtails_obj34);

                        Int_a34.putExtra("picture", b_a34);

                        startActivity(Int_a34);

                        break;

                    case 35:
                        String name_obj35= "গ্রিল মুরগি";
                        String upodetails_obj35= "মুরগি ১টি, আদা বাটা ২ চা-চামচ, রসুন বাটা ১ চা-চামচ, পেঁয়াজ বাটা আধা চা-চামচ, লেবুর রস ১ চা-চামচ, টক দই ২ টেবিল চামচ, মরিচ বাটা ১ চা-চামচ, লবণ ১ চা-চামচ (স্বাদমতো), জায়ফল বাটা সিকি চা-চামচ, তন্দুরি মসলা দেড় চা-চামচ, ঘি ৩ টেবিল চামচ, বাদাম বাটা ১ টেবিল চামচ।";
                        String karjodtails_obj35= "মুরগিতে সব মসলা মেখে রাখতে হবে তিন-চার ঘণ্টা। এরপর চুলায় গ্রিল করে নিতে হবে অথবা ইলেকট্রিক ওভেনে গ্রিলে ৪৫-৫০ মিনিট গ্রিল করে নিতে হবে। মাঝখানে ২-৩ বার ঘি ব্রাশ করতে হবে। বিভিন্ন রকম সবজি, পেঁয়াজ, সামান্য লবণ ও গোলমরিচ মেখে গ্রিল করে অথবা তাওয়ায় অল্প তেলে নাড়াচাড়া করে মুরগির সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a35 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_36);
                        ByteArrayOutputStream baos_a35 = new ByteArrayOutputStream();
                        bitmap_a35.compress(Bitmap.CompressFormat.PNG, 100, baos_a35);
                        byte[] b_a35 = baos_a35.toByteArray();

                        Intent Int_a35 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a35.putExtra("titel_name", name_obj35);
                        Int_a35.putExtra("upodetail_name", upodetails_obj35);
                        Int_a35.putExtra("karjodtails_name", karjodtails_obj35);

                        Int_a35.putExtra("picture", b_a35);

                        startActivity(Int_a35);

                        break;

                    case 36:
                        String name_obj36= "ঝাল চিকেন ভুনা";
                        String upodetails_obj36= "মুরগির মাংস ১ কেজি মাঝারি টুকরো করা, পেঁয়াজ মোটা করে কাটা ১ কাপ, আদা বাটা ১ টেবিল চামচ, রসুন বাটা ১ টেবিল চামচ, জিরা গুঁড়া আধা টেবিল চামচ, হলুদ গুঁড়া ১ টেবিল চামচ, মরিচ গুঁড়া ৩ টেবিল চামচ, এলাচ, দারুচিনি, গোলমরিচ, লবঙ্গ সব মিলিয়ে ২০ গ্রাম, তেজপাতা ২টি, চিনি ১ চা চামচ, লবণ স্বাদ অনুযায়ী, তেল (সয়াবিন) ও পানি পরিমাণমতো।";
                        String karjodtails_obj36= "প্রথমে মুরগির টুকরোগুলো ভালো করে ধুয়ে নিতে হবে। তারপর একটি পাতিলে তেল গরম করে তাতে একে একে পেঁয়াজ, তেজপাতা ও গরম মসলা দিয়ে হালকা ভেজে প্রথমে মুরগির মাংস ও লবণ দিয়ে আবার একটু ভেজে নিয়ে একে একে সব বাটা ও গুঁড়া মসলা এবং পরিমাণমতো পানি দিয়ে মুরগি ভালো করে কষিয়ে নিয়ে আধা ঘণ্টা নিভে আঁচে চুলোয় রেখে দিন। মুরগির গ্রেভি ঘন হয়ে এলে সেটি নামিয়ে একটি ডিশে ঢেলে সাজিয়ে পরিবেশন করুন ঝাল চিকেন ভুনা।";

                        Bitmap bitmap_a36 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_37);
                        ByteArrayOutputStream baos_a36 = new ByteArrayOutputStream();
                        bitmap_a36.compress(Bitmap.CompressFormat.PNG, 100, baos_a36);
                        byte[] b_a36 = baos_a36.toByteArray();

                        Intent Int_a36 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a36.putExtra("titel_name", name_obj36);
                        Int_a36.putExtra("upodetail_name", upodetails_obj36);
                        Int_a36.putExtra("karjodtails_name", karjodtails_obj36);

                        Int_a36.putExtra("picture", b_a36);

                        startActivity(Int_a36);

                        break;

                    case 37:

                        String name_obj37= "কবুতরের পোলাও";
                        String upodetails_obj37= "পোলাওয়ের চাল ১ কেজি, কবুতর ৬টি, ঘি আধা কাপ, তেল ১ কাপ, আদা বাটা ২ টেবিল চামচ, রসুন বাটা ১ টেবিল চামচ, পোস্তদানা বাটা ২ টেবিল চামচ, বাদাম বাটা ২ টেবিল চামচ, টক দই আধা কাপ, মিষ্টি দই সিকি কাপ, দুধ ১ কাপ, পেঁয়াজ বাটা সিকি কাপ, পেঁয়াজ কুচি ২ কাপ, জায়ফল-জয়ত্রী গুঁড়া আধা চা-চামচ, গরম মসলার গুঁড়া ১ চা-চামচ, সাদা গোলমরিচ গুঁড়া ১ চা-চামচ, মাওয়া গুঁড়া সিকি কাপ, দারুচিনি ৮ টুকরা, এলাচ ৮টি, লবঙ্গ ৬টি, তেজপাতা ২টি, জাফরান আধা চা-চামচ, গোলাপজল ২ টেবিল চামচ, পেস্তাবাদাম কুচি ২ টেবিল চামচ, কিশমিশ ১ টেবিল চামচ, কাঁচা মরিচ ৫-৬টি, আলুবোখারা ৮-১০টি।";
                        String karjodtails_obj37= "চাল ধুয়ে পানি ঝরিয়ে রাখতে হবে। ২ টেবিল চামচ দুধ ও গোলাপজলে জাফরান ভিজিয়ে রাখতে হবে। প্রতিটি কবুতরের চামড়া ছাড়িয়ে ধুয়ে পানি ঝরাতে হবে। ঘি, তেল একসঙ্গে গরম করে পেঁয়াজ বেরেস্তা করে আদা, রসুন, পেঁয়াজ বাটা দিয়ে ভুনে কবুতরের মাংস দিয়ে কষাতে হবে। এতে লবণ ও গোলমরিচ গুঁড়া দিতে হবে। ১০ মিনিট পর টক-মিষ্টি দই, পোস্তদানা বাটা, ১ টেবিল চামচ বাদাম বাটা, অর্ধেক গরম মসলা, জায়ফল-জয়ত্রী গুঁড়া ও আলুবোখারা দিতে হবে। মাংস ভালো করে ভুনে অল্প পানি দিয়ে সেদ্ধ করতে হবে। মাংস তেলের ওপর উঠলে মাংস উঠিয়ে রেখে সেই হাঁড়িতে ৩ কাপ গরম পানি দিয়ে চাল দিতে হবে। এবার বাকি গরম মসলা ও লবণ দিতে হবে। ফুটে উঠলে ২ টেবিল চামচ লেবুর রস দিতে হবে। চালের পানি কমে গেলে দুধের সঙ্গে ১ টেবিল চামচ বাদাম বাটা গুলিয়ে দিয়ে ১০ মিনিট দমে রাখতে হবে। কিছু মাওয়া গুঁড়া পোলাওয়ে দিতে হবে। এবার পোলাওয়ের হাঁড়ি থেকে কিছুটা পোলাও উঠিয়ে নিয়ে মাংস বিছিয়ে দিয়ে তার ওপর কিছু মাওয়া, গরম মসলার গুঁড়া, মিশ্রিত জাফরান দিতে হবে। এবার বাকি পোলাও দিয়ে কাঁচা মরিচ, মাওয়া, গরম মসলার গুঁড়া, জাফরান দিয়ে হাঁড়ির ঢাকনা ভালো করে বন্ধ করে ঢাকনার ওপর গরম পানির হাঁড়ি বসিয়ে মৃদু জ্বালে ১৫-২০ মিনিট রাখতে হবে। নামিয়ে গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a37 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_38);
                        ByteArrayOutputStream baos_a37 = new ByteArrayOutputStream();
                        bitmap_a37.compress(Bitmap.CompressFormat.PNG, 100, baos_a37);
                        byte[] b_a37 = baos_a37.toByteArray();

                        Intent Int_a37 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a37.putExtra("titel_name", name_obj37);
                        Int_a37.putExtra("upodetail_name", upodetails_obj37);
                        Int_a37.putExtra("karjodtails_name", karjodtails_obj37);

                        Int_a37.putExtra("picture", b_a37);

                        startActivity(Int_a37);
                        break;

                    case 38:
                        String name_obj38= "কবুতরের স্যুপ";
                        String upodetails_obj38= "কবুতর ১টি, পানি ৩ লিটার, আদা বাটা ১ চা চামচ, রসুন বাটা হাফ চা চামচ, গোল মরিচ গুঁড়া হাফ চা চামচ, পেঁয়াজ কুচি ২ টেবিল চামচ, তেল ১ টেবিল চামচ, লবণ পরিমাণমতো।";
                        String karjodtails_obj38= "প্রথমে কবুতরের পালক ফেলে পরিষ্কার করে কেটে ধুয়ে নিন। এবার হাঁড়িতে পানি গরম করে কবুতর ও আদা-রসুন বাটা দিয়ে দিন। গোলমরিচ গুঁড়া ও লবণ দিন। পানি টগবগ করে ফুটতে ফুটতে যখন ঘন হয়ে যাবে তখন নামিয়ে ছেঁকে নিন। অন্য কড়াইয়ে তেল দিয়ে পেঁয়াজ ফোড়ন দিয়ে এর মধ্যে ঢেলে দিন। গরম গরম পরিবেশন করুন মজাদার কবুতরের স্যুপ।";

                        Bitmap bitmap_a38 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_39);
                        ByteArrayOutputStream baos_a38 = new ByteArrayOutputStream();
                        bitmap_a38.compress(Bitmap.CompressFormat.PNG, 100, baos_a38);
                        byte[] b_a38 = baos_a38.toByteArray();

                        Intent Int_a38 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a38.putExtra("titel_name", name_obj38);
                        Int_a38.putExtra("upodetail_name", upodetails_obj38);
                        Int_a38.putExtra("karjodtails_name", karjodtails_obj38);

                        Int_a38.putExtra("picture", b_a38);

                        startActivity(Int_a38);

                        break;

                    case 39:
                        String name_obj39= "কবুতরের ঝোল তরকারি";
                        String upodetails_obj39= "কবুতর ২টি, পেঁয়াজ কুচি ১ টেবিল চামচ, পেঁয়াজ বাটা ২ টেবিল চামচ, আদা বাটা ১ চা চামচ, রসুন বাটা হাফ চা চামচ, হলুদ গুঁড়া হাফ চা চামচ, মরিচ গুঁড়া ১ চা চামচ, ধনে গুঁড়া হাফ চা চামচ, গোলমরিচ গুঁড়া হাফ চা চামচ, তেজপাতা ১টি, এলাচ ২টি, দারুচিনি ২-৩ টুকরা, তেল ৪ ভাগের এক কাপ, লবণ পরিমাণমতো।";
                        String karjodtails_obj39= "প্রথমে কবুতরের পালক তুলে পরিষ্কার করে নিন। এবার আগুনের ওপর ধরে চামড়ার ছোট পালকগুলো পুড়ে পরিষ্কার করে নিন। ছোট ছোট টুকরা করে কেটে ধুয়ে নিন। এবার কড়াইয়ে তেল গরম করে পেঁয়াজ কুচি ভেজে আদা ও রসুন বাটা দিয়ে দিন। আদা-রসুন বাটা ভাজা হলে এলাচ, দারুচিনি, তেজপাতা দিয়ে দিন। সব গুঁড়া মসলা সামান্য পানি দিয়ে গুলিয়ে দিয়ে দিন। মসলা কষানো হলে মাংসগুলো দিয়ে দিন। মাংস কষানো হলে পরিমাণমতো পানি দিয়ে ঢেকে দিন। ঝোল টগবগ করে ফুটে উঠলে স্বাদ দেখে নামিয়ে নিন।";

                        Bitmap bitmap_a39 = BitmapFactory.decodeResource(getResources(), R.drawable.mangsho_40);
                        ByteArrayOutputStream baos_a39 = new ByteArrayOutputStream();
                        bitmap_a39.compress(Bitmap.CompressFormat.PNG, 100, baos_a39);
                        byte[] b_a39 = baos_a39.toByteArray();

                        Intent Int_a39 = new Intent(Mang_sho.this, AllViewActivity.class);
                        Int_a39.putExtra("titel_name", name_obj39);
                        Int_a39.putExtra("upodetail_name", upodetails_obj39);
                        Int_a39.putExtra("karjodtails_name", karjodtails_obj39);

                        Int_a39.putExtra("picture", b_a39);

                        startActivity(Int_a39);

                        break;




                    default:
                        break;
                }

            }


        });

        //////////////////////////////////////////////////////////////////////

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
        getMenuInflater().inflate(R.menu.mang_sho, menu);
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
            Intent intent= new Intent(Mang_sho.this,MachActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_mansho) {
            Intent intent= new Intent(Mang_sho.this,Mang_sho.class);
            startActivity(intent);

        } else if (id == R.id.nav_chal) {
            Intent intent= new Intent(Mang_sho.this,Chal_dal.class);
            startActivity(intent);

        } else if (id == R.id.nav_kabab) {
            Intent intent= new Intent(Mang_sho.this,Kabab.class);
            startActivity(intent);

        } else if (id == R.id.nav_shak) {
            Intent intent= new Intent(Mang_sho.this,Shak_shobji.class);
            startActivity(intent);

        } else if (id == R.id.nav_panio) {
            Intent intent= new Intent(Mang_sho.this,Panio.class);
            startActivity(intent);

        }else if (id == R.id.nav_vorta) {
            Intent intent= new Intent(Mang_sho.this,Vorta.class);
            startActivity(intent);

        }else if (id == R.id.nav_beking) {
            Intent intent= new Intent(Mang_sho.this,BekingActivity.class);
            startActivity(intent);

        }else if (id == R.id.nav_dim) {
            Intent intent= new Intent(Mang_sho.this,Dim.class);
            startActivity(intent);

        }else if (id == R.id.nav_soup) {
            Intent intent= new Intent(Mang_sho.this,Supe.class);
            startActivity(intent);

        }else if (id == R.id.nav_tok) {
            Intent intent= new Intent(Mang_sho.this,Tok_jal_misti.class);
            startActivity(intent);

        }else if (id == R.id.nav_bideshi) {
            Intent intent= new Intent(Mang_sho.this,Bide_shi.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
