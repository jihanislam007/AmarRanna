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
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MachActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;
    String[] web = {
            "ডাব ইলিশ",
            "ইলিশের মালাইকারি",
            "বেগুন ইলিশ",
            "তন্দুরি ইলিশ",
            "আস্ত ইলিশের কাবাব",
            "ইলিশ মাছের ভর্তা",
            "সরিষা বাটা ইলিশ",
            "তেল কই",
            "কৈ মাছ ভাজি",
            "কই-পালংয়ের ঝাল ঝোল",
            "আলু-করলায় কাতলের ঝোল",
            "চিতল মাছের কোপ্তা কাবাব",
            "টাকি মাছের ভর্তা",
            "আস্ত তেলাপিয়া ভাজি",
            "ক্যাপসিকাম ও সবজিতে তেলাপিয়া",
            "করলার ঝোলে পাঁচমিশালি মাছ",
            "পুঁই ডাঁটায় পাঙ্গাশ",
            "বোয়াল মাছের দই কস্তুরি",
            "মুড়িঘন্ট",
            "ফুলকপি ও রুই মাছের ঝোল"
    } ;





    Integer[] imageId = {
            R.drawable.mas_1,
            R.drawable.mas_2,
            R.drawable.mas_3,
            R.drawable.mas_4,
            R.drawable.mas_5,
            R.drawable.mas_6,
            R.drawable.mas_7,
            R.drawable.mas_8,
            R.drawable.mas_9,
            R.drawable.mas_10,
            R.drawable.mas_11,
            R.drawable.mas_12,
            R.drawable.mas_13,
            R.drawable.mas_14,
            R.drawable.mas_15,
            R.drawable.mas_16,
            R.drawable.mas_17,
            R.drawable.mas_18,
            R.drawable.mas_19,
            R.drawable.mas_20,

    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mach);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CustomAdapter adapter = new CustomAdapter(MachActivity.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch (position) {
                    case 0:
                        String name_obj0= "ডাব ইলিশ";
                        String upodetails_obj0= "ইলিশ ৪ টুকরা, ডাব ১টা (পানি ও নরম মালাইসহ), পেঁয়াজবাটা ১ টেবিল চামচ, পোস্তদানাবাটা আধা চা-চামচ, হলুদ গুঁড়া আধা চা-চামচ, মরিচ গুঁড়া আধা চা-চামচ, রসুনবাটা সিকি চা-চামচ, কাঁচা মরিচ ৪-৫টা, অ্যালুমিনিয়াম ফয়েল প্রয়োজনমতো, লবণ স্বাদমতো, তেল আধা কাপ।";
                        String karjodtails_obj0= "ডাবের পানি ও শাঁস বের করে নিয়ে খোলাটাকে ২ ফালি করে কেটে রাখুন। ডাবের নরম শাঁস কুচি করে নিন। পেঁয়াজ আর পোস্তদানা কিছুটা ডাবের পানি দিয়ে পাতলা করে বেটে নিন। ফয়েল বাদে বাকি সব উপকরণ একসঙ্গে মিশিয়ে নিন। বাকি ডাবের পানিসহ এই মিশ্রণ দিয়ে মাছের টুকরাগুলো মেখে আধা ঘণ্টা রেখে দিন। মাখানো মাছ প্যানে ঢেলে ঢাকনা দিয়ে কম আঁচে ১২-১৫ মিনিট রান্না করে নিন। মাঝে একবার খুব সাবধানে মাছ উল্টে দিন। চুলা থেকে নামিয়ে প্রতিটি ডাবের খোলায় ঝোল-মসলাসহ ২ টুকরা মাছ নিয়ে অ্যালুমিনিয়াম ফয়েল দিয়ে ঢেকে দিন। ১৮০ ডিগ্রি সেলসিয়াস তাপে প্রি-হিট করা ওভেনে ৭-৮ মিনিট বেক করে নিন। নামিয়ে ফয়েল খুলে ডাবের খোলাতেই সরাসরি পরিবেশন করুন।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_1);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "ইলিশের মালাইকারি";
                        String upodetails_obj1= "ইলিশ মাছ ৬ টুকরা, নারিকেল দুধ দেড় কাপ, এলাচ-দারুচিনি ২টি, আদা বাটা আধা চা-চামচ, রসুন বাটা আধা চা-চামচ, পেঁয়াজ বাটা আধা কাপ, মরিচের গুঁড়া আধা চা-চামচ, টক দই আধা কাপ, কাঁচামরিচ ৬-৭টি, লবণ স্বাদমতো, চিনি ১ চা-চামচ, পেঁয়াজ কুচি ২ টেবিল চামচ, তেল পৌনে ১ কাপ, বেরেস্তা আধা কাপ ও ঘি ১ টেবিল চামচ।";
                        String karjodtails_obj1= "মাছ ধুয়ে পরিষ্কার করে নিতে হবে। প্যানে তেল ও ঘি দিয়ে এলাচ ও দারুচিনি দিয়ে পেঁয়াজ কুচি দিয়ে ভাজতে হবে। ভাজা ভাজা হয়ে গেলে সব বাটা ও গুঁড়া মসলা দিয়ে সামান্য পানি দিয়ে কষাতে হবে। কষানো হলে ইলিশ মাছ দিতে হবে। নারিকেল দুধ দিতে হবে। ঝোল কমে এলে কাঁচামরিচ, চিনি ও বেরেস্তা দিতে হবে। কিছুক্ষণ রেখে নামিয়ে পরিবেশন করতে হবে।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_2);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "বেগুন ইলিশ";
                        String upodetails_obj2= "ইলিশ মাছ ৬ টুকরো, বেগুন ৩টি, পেঁয়াজ কুচি ১ টেবিল চামচ, পেঁয়াজ বাটা ২ টেবিল চামচ, হলুদ গুঁড়া ১ চা-চামচ, মরিচ গুঁড়া দেড় চা-চামচ, সরিষা বাটা ২ টেবিল চামচ, লবণ স্বাদমতো, তেল আধা কাপ ও কাঁচামরিচ ৪-৫টি।";
                        String karjodtails_obj2= "প্রথমে বেগুন চাক-চাক করে কেটে লবণ-পানিতে ভিজিয়ে নিতে হবে। এবার বেগুনে হলুদ ও লবণ মাখিয়ে হালকা ভেজে নিতে হবে। এরপর প্যানে তেল দিয়ে তাতে পেঁয়াজ কুচি দিয়ে ভেজে নিতে হবে। সামান্য পানি দিয়ে সব বাটা ও গুঁড়া মসলা দিয়ে কষাতে হবে। সামান্য পানি দিয়ে মাছ ছেড়ে দিতে হবে। মাছ হয়ে এলে বেগুন দিয়ে কাঁচামরিচ দিতে হবে। তেলের উপর উঠে এলে নামিয়ে পরিবেশন করতে হবে।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_3);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "তন্দুরি ইলিশ";
                        String upodetails_obj3= "ইলিশ মাছ ১টি, মিষ্টি দই ৪ টে. চামচ, টক দই ৪ টেবিল চামচ, শুকনো মরিচ টালাগুঁড়া ১ টে. চামচ, বা পরিমাণমতো, লবণ পরিমাণমতো, তন্দুরি মসলা সিকি চা চামচ, ধনে টালাগুঁড়া ১ চা চামচ, আদা বাটা সিকি চা চামচ, সরষের তেল ৪ টেবিল চামচ, লেবুর রস ১ টেবিল চামচ, মাখন ২ টে. চামচ।";
                        String karjodtails_obj3= "১. মাছ আঁশ ছাড়িয়ে ছুরি দিয়ে পেটের দিকে লম্বা করে চিরে ভেতরের ময়লা পরিষ্কার করে নিতে হবে। মাথার ফুলকো ফেলে দিয়ে ধুয়ে পানি ঝরাতে হবে।\n২. ছুরি দিয়ে মাছের দুই দিকে চিরে মাখন ও লেবুর রস বাদে বাকি সব উপকরণ দিয়ে মেখে দুই ঘন্টা রাখতে হবে।\n৩. মসলা মাখানো মাছে দুই কাপ পানি দিয়ে অল্প জ্বালে রান্না করতে হবে। মাঝে একবার উল্টে দিতে হবে। মাছের পানি শুকিয়ে গেলে চুলা বন্ধ করে দিতে হবে।\n৪. মাখন গলিযে লেবুর রস মিলিয়ে মাছের দুই পাশে মাখনের মিশ্রণ ব্রাশ করে বেকিং ডিশে রেখে তন্দুরিতে অথবা প্রিহিটেড ওভেনে ২০০ সেন্টিগ্রেড তাপে ২০-২৫ মিনিট রাখতে হবে। গরম তন্দুরি ইলিশ পোলাও, খিচুড়ি অথবা গরম ভাতের সঙ্গে পরিবেশন করা যায়।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_4);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "আস্ত ইলিশের কাবাব";
                        String upodetails_obj4= "ইলিশ মাছ ১টি, পেঁয়াজ কুচি ২ টেবিল চামচ, পেঁয়াজ বাটা ২ টেবিল চামচ, আদা বাটা আধা চা চামচ, রসুন বাটা আধা চা চামচ, মরিচ গুঁড়া ১ চা চামচ, হলুদ গুঁড়া আধা চা চামচ, কাঁচামরিচ ৬টি, লেবুর রস ৪ টেবিল চামচ, চিনি ১ চামচ, সস ২ টেবিল চামচ, তেল ৪ টেবিল চামচ, লবণ পরিমাণ মতো, পানি আধা লিটার।";
                        String karjodtails_obj4= "মাছের আঁশ ছাড়িয়ে পেটের দিকে সামান্য কেটে ময়লা পরিষ্কার করে নিন। এরপর প্রেসার কুকারে মাছ ও সব উপকরণ দিয়ে মৃদু আঁচে ৩০ মিনিট রান্না করুন। তারপর একটি ননস্টিক প্যানে মাছটি আস্তে করে ঢেলে সস দিয়ে গ্রেভি করে নামিয়ে নিন। সাজিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_5);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "ইলিশ মাছের ভর্তা";
                        String upodetails_obj5= "ইলিশ মাছের টুকরো ৩-৪টি, পেঁয়াজ কুচি আধা কাপ, ধনেপাতা কুচি ১ টেবিল চামচ, কাঁচামরিচ কুচি ১ চা চামচ, শুকনো মরিচ ১টি, হলুদ গুঁড়া ১ চা চামচ, মরিচ গুঁড়া ১ চা চামচ, লবণ স্বাদ অনুযায়ী, সরিষা তেল ভাজার জন্য।";
                        String karjodtails_obj5= "মাছের টুকরো ভালো করে ধুয়ে এতে মসলা ও লবণ মাখিয়ে কিছুক্ষণ রেখে দিন। কড়াইয়ে তেল গরম করে মাছগুলো ভালো করে ভেজে নিন। পেঁয়াজ, ধনেপাতা ও কাঁচামরিচ কুচি মচমচে করে ভেজে নিন। মাছ ঠাণ্ডা হলে কাঁটা বেছে নিন। এখন মাছের সঙ্গে ভাজা উপকরণগুলো ভালো করে হাত দিয়ে মাখিয়ে তৈরি করুন মজাদার ভর্তা।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "সরিষা বাটা ইলিশ";
                        String upodetails_obj6= "ইলিশ মাছ ৪ টুকরো, হলুদ গুঁড়া ১ চা চামচ, লবণ স্বাদ অনুযায়ী, সরিষার তেল পরিমাণমতো, সরিষা বাটা ২ টেবিল চামচ, কাঁচামরিচ ফালি করা ৮-১০টি, পেঁয়াজ বাটা আধা কাপ।";
                        String karjodtails_obj6= "মাছের টুকরোগুলো ভালো করে ধুয়ে রাখুন। কড়াইয়ে তেল গরম করে নিন। তারপর একে একে সব বাটা ও গুঁড়া উপকরণ এবং লবণ দিয়ে মসলা ভালো করে কষান। মসলা কষানো হয়ে গেলে তাতে মাছের টুকরো, কাঁচামরিচ এবং সামান্য পানি দিয়ে ঢেকে ৫ মিনিট মাখামাখা করে রান্না করে নামিয়ে পরিবেশন করুন গরম ভাতের সঙ্গে।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_7);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "তেল কই";
                        String upodetails_obj7= "কই মাছ ৪টি, সরিষার তেল ৫-৬ চা-চামচ পেঁয়াজবাটা ১ টেবিল চামচ, রসুন ও কাঁচা মরিচ (টেলে বেটে নেওয়া) ১ চা-চামচ, জিরাবাটা আধা চা-চামচ, হলুদগুঁড়া ১ চা-চামচ, মরিচগুঁড়া ১ চা-চামচ, লবণ স্বাদমতো, ধনেপাতা কুচি ১ টেবিল চামচ, লেবুর রস ১ টেবিল চামচ, কাঁচা মরিচ ফালি ২-৩টি।";
                        String karjodtails_obj7= "প্রথমে মাছ কেটে ভালো করে পানি ঝরাতে হবে। তারপর লেবুর রস, লবণ, সামান্য হলুদ ও মরিচগুঁড়া এবং ১ টেবিল চামচ সরিষার তেল দিয়ে মাখিয়ে ১০ মিনিট মেরিনেট করে রাখতে হবে। ফ্রাইপ্যানে তেল দিয়ে তাতে কই মাছগুলো ভেজে নিন। এবার বাকি তেল ও মসলা দিয়ে ভুনে ১ কাপ পানি দিয়ে তাতে ভাজা মাছগুলো দিতে হবে। কিছুক্ষণ পর একবার মাছ উল্টে দিয়ে ধনে পাতা ও কাঁচা মরিচ ফালি দিতে হবে। তেল ওপরে উঠে এলে নামিয়ে পরিবেশন করুন মজাদার তেল কই।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_8);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "কৈ মাছ ভাজি";
                        String upodetails_obj8= "কৈ মাছ পরিষ্কার করে ধোয়া ৮টি, রসুন বাটা আধা চা-চামচ, ধনেপাতা গুঁড়া ১ চা-চামচ, কাঁচামরিচ/শুকনা মরিচ গুঁড়া ১ চা-চামচ, হলুদ গুঁড়া সামান্য, লেবুর রস ১ টেবিল চামচ, লবণ স্বাদমত, তেল পরিমাণমত (ভাজার জন্য)।";
                        String karjodtails_obj8= "কড়াইতে তেল দিয়ে গরম হলে একে একে কৈ মাছ ছেড়ে বাদামি বর্ণের করে ভেজে মচমচে কৈ মাছ ভাজা পরিবেশন করুন।";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_9);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    case 9:
                        String name_obj9= "কই-পালংয়ের ঝাল ঝোল";
                        String upodetails_obj9= "কই মাছ ৬টি, পালংশাক ২৫০ গ্রাম, তেল ছোট কাপের ১ কাপ, টমেটো কুচি ১টি, পেঁয়াজ বাটা ২ টেবিল চামচ, রসুন বাটা ১ চা চামচ, কাটা পেঁয়াজ ১ কাপ, রসুন কুচি ১ চা চামচ, হলুদ, মরিচ ও ধনেগুঁড়া ১ চা চামচ করে, পানি, লবণ ও কাঁচামরিচ পরিমাণমতো।";
                        String karjodtails_obj9= "লবণ ও হলুদ দিয়ে মাছ একটু হালকা আঁচে আধা ভাজা করে রাখতে হবে। এবার ওই তেলেই রসুন ও পেঁয়াজ কুচি দিয়ে টমেটো, বাটা মসলা ও গুঁড়া মসলা সামান্য পানি দিয়ে রান্না করতে হবে। মসলা কষানো হলে এতে শাক দিতে হবে। একটু পরে ভাজা মাছ ও আরও একটু লবণ দিয়ে ৫-৬ মিনিট রেখে পরিমাণমতো ঝোল দিতে হবে। রান্না হয়ে এলে কাঁচামরিচ দিয়ে কিছুক্ষণ দমে রেখে নামাতে হবে।";

                        Bitmap bitmap_a9 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_10);
                        ByteArrayOutputStream baos_a9 = new ByteArrayOutputStream();
                        bitmap_a9.compress(Bitmap.CompressFormat.PNG, 100, baos_a9);
                        byte[] b_a9 = baos_a9.toByteArray();

                        Intent Int_a9 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a9.putExtra("titel_name", name_obj9);
                        Int_a9.putExtra("upodetail_name", upodetails_obj9);
                        Int_a9.putExtra("karjodtails_name", karjodtails_obj9);

                        Int_a9.putExtra("picture", b_a9);

                        startActivity(Int_a9);

                        break;

                    case 10:

                        String name_obj10= "আলু-করলায় কাতলের ঝোল";
                        String upodetails_obj10= "কাতল মাছ ৪ টুকরা (রুই বা অন্য মাছও ব্যবহার করতে পারেন), করলা অর্ধেক, আলু ১টি (বড়), পেঁয়াজ ১টি (বড়), হলুদ গুঁড়া ১ চা চামচ, ধনে গুঁড়া ১ চা চামচ, জিরা গুঁড়ো আধা চা চামচ, কাঁচা মরিচ ৩-৪টি (ফালি করা), লবণ স্বাদমতো, তেল প্রয়োজনমতো।";
                        String karjodtails_obj10= "করলা শুধু বিচি (পুরো বুক ফেলে দেবেন না) ফেলে লম্বা করে কেটে লবণ মাখিয়ে রেখে দিন। রান্নার আগে পানি দিয়ে বেশ কয়েকবার ভালো করে ধুয়ে নিন। আলুও লম্বা করে কেটে পানিতে ভিজিয়ে রাখুন। মাছের টুকরোয় হলুদ, লবণ আর অল্প খানিকটা তেল মেখে হালকা করে ভেজে তুলে রাখুন। এবার পেঁয়াজ সোনালি করে ভেজে তাতে হলুদ গুঁড়া, ধনে-জিরা গুঁড়া আর লবণ দিয়ে কষিয়ে তারপর তাতে করলা আর আলু দিয়ে ৩-৪ মিনিট কষিয়ে গরম পানি দিয়ে সেদ্ধ হওয়ার জন্য ঢাকনা দিয়ে ঢেকে দিন। করলা-আলু সেদ্ধ হয়ে গেলে ফালি করা কাঁচা মরিচ দিয়ে নামিয়ে নিন।";

                        Bitmap bitmap_a10 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_11);
                        ByteArrayOutputStream baos_a10 = new ByteArrayOutputStream();
                        bitmap_a10.compress(Bitmap.CompressFormat.PNG, 100, baos_a10);
                        byte[] b_a10 = baos_a10.toByteArray();

                        Intent Int_a10 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a10.putExtra("titel_name", name_obj10);
                        Int_a10.putExtra("upodetail_name", upodetails_obj10);
                        Int_a10.putExtra("karjodtails_name", karjodtails_obj10);

                        Int_a10.putExtra("picture", b_a10);

                        startActivity(Int_a10);
                        break;

                    case 11:
                        String name_obj11= "চিতল মাছের কোপ্তা কাবাব";
                        String upodetails_obj11= "চিতল মাছের পিঠের দিকের অংশ ৩০০ গ্রাম, ২ পিস পাউরুটি (অল্প তরল দুধে ভিজিয়ে রাখুন), বিট লবণ সামান্য, সাধারণ লবণ স্বাদ অনুযায়ী, লাল মরিচের গুঁড়া ১ চা চামচ, আদা বাটা আধা চা চামচ, রসুন বাটা ১ চা চামচ, পেঁয়াজ মিহি করে কাটা আধা কাপ, ধনেপাতা ও কাঁচামরিচ কুচি ১ টেবিল চামচ, টকদই ২ টেবিল চামচ, সরিষা তেল পরিমাণমতো কাবাব মাখানোর জন্য, গরম মসলা  গুঁড়া ১ চা চামচ (কাবাবের জন্য), ভাজার জন্য তেল।";
                        String karjodtails_obj11= "প্রথমে মাছের টুকরোগুলো ভালো করে ধুয়ে পাটায় ছেঁচে কাঁটা বেছে নিন। তারপর ব্লেন্ডারে পেঁয়াজ, ধনেপাতা, কাঁচামরিচ ও সরিষা তেল বাদে বাকি সব উপকরণসহ চিতল মাছ মিহি করে বেটে নিন। এরপর পরিমাণমতো তেলে মিহি করা পেঁয়াজ বেরেস্তা করে তুলে রাখুন। এখন একটি বাটিতে বাটা মাছের সঙ্গে বেরেস্তা পেঁয়াজ, সরিষার তেল এবং ধনেপাতা ও কাঁচামরিচ কুচি ভালো করে হাত দিয়ে মাখিয়ে গোল গোল করে গরম গরম ডুবন্ত তেলে ভেজে সাজিয়ে পরিবেশন করুন চিতল মাছের কোপ্তা কাবাব।";

                        Bitmap bitmap_a11 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_12);
                        ByteArrayOutputStream baos_a11 = new ByteArrayOutputStream();
                        bitmap_a11.compress(Bitmap.CompressFormat.PNG, 100, baos_a11);
                        byte[] b_a11 = baos_a11.toByteArray();

                        Intent Int_a11 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a11.putExtra("titel_name", name_obj11);
                        Int_a11.putExtra("upodetail_name", upodetails_obj11);
                        Int_a11.putExtra("karjodtails_name", karjodtails_obj11);

                        Int_a11.putExtra("picture", b_a11);

                        startActivity(Int_a11);

                        break;

                    case 12:
                        String name_obj12= "টাকি মাছের ভর্তা";
                        String upodetails_obj12= "টাকি মাছ মাঝারি ৪-৫টি, পেঁয়াজ কুচি ২ টেবিল চামচ, ধনেপাতা কুচি ১ টেবিল চামচ, কাঁচামরিচ কুচি ১ চা চামচ, লবণ স্বাদ অনুযায়ী এবং তেল ভাজার জন্য (সরিষার তেল), হলুদ গুঁড়া ১ চা-চামচ, মরিচ গুঁড়া আধা চা-চামচ।";
                        String karjodtails_obj12= "প্রথমে মাছের আঁশ ফেলে দিন। এরপর মাছের মাথা বাদ দিয়ে ভালো করে পরিষ্কার করে ধুয়ে পানি ঝরিয়ে রাখুন। মাছে গুঁড়া মসলা ও লবণ মাখিয়ে কিছুক্ষণ রাখুন। তারপর তেল গরম করে ভালো করে ভাজুন। যেন মাছ কাঁচা না থাকে। মাছ ঠাণ্ডা হলে কাঁটা বেছে নিন। মাছের সঙ্গে ধনেপাতা, কাঁচামরিচ ও পেঁয়াজ কুচি ভালো করে হাত দিয়ে মাখিয়ে ভর্তা তৈরি করুন টাকি মাছের।";

                        Bitmap bitmap_a12 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_13);
                        ByteArrayOutputStream baos_a12 = new ByteArrayOutputStream();
                        bitmap_a12.compress(Bitmap.CompressFormat.PNG, 100, baos_a12);
                        byte[] b_a12 = baos_a12.toByteArray();

                        Intent Int_a12 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a12.putExtra("titel_name", name_obj12);
                        Int_a12.putExtra("upodetail_name", upodetails_obj12);
                        Int_a12.putExtra("karjodtails_name", karjodtails_obj12);

                        Int_a12.putExtra("picture", b_a12);

                        startActivity(Int_a12);

                        break;

                    case 13:
                        String name_obj13= "আস্ত তেলাপিয়া ভাজি";
                        String upodetails_obj13= "গোটা তেলাপিয়া মাছ মাঝারি একটি, ফিশ সস ২ টেবিল-চামচ, লেবুর রস ২ টেবিল-চামচ, আদাবাটা আধা চা-চামচ, রসুনবাটা ১ চা-চামচ, জিরাবাটা ১ চা-চামচ, পেঁয়াজবাটা ২ টেবিল-চামচ, মরিচগুঁড়া ১ চা-চামচ, হলুদগুঁড়া আধা চা-চামচ, লবণ স্বাদমতো, কাঁচামরিচ ৫-৬টি, টমেটো সস সিকি কাপ, ধনেপাতাকুচি ১ টেবিল-চামচ, তেল পৌনে দুই কাপ।";
                        String karjodtails_obj13= "মাছ পরিষ্কার করে ছুরি দিয়ে দুই পাশ থেকে চিরে নিয়ে মাছের গায়ে দাগ কেটে রাখতে হবে। ফিশ সস, লেবুর রস, সামান্য হলুদ, লবণ একসঙ্গে মিলিয়ে মাছের দুই পাশে ও পেটের ভেতর ভালো করে লাগিয়ে ২৫-৩০ মিনিট ম্যারিনেট করে রাখতে হবে। দেড় কাপ তেল গরম করে মাছ বাদামি রং করে ভেজে তেল থেকে মাছ উঠিয়ে পরিবেশন পাত্রে রাখতে হবে। সিকি কাপ তেল গরম করে সব বাটা ও গুঁড়া মসলা কষিয়ে লবণ, টমেটো সস, কাঁচা মরিচ, ধনেপাতাকুচি দিয়ে কিছুক্ষণ ভুনে মাছের ওপর ঢেলে দিয়ে গরম গরম পরিবেশন করতে হবে।";

                        Bitmap bitmap_a13 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_14);
                        ByteArrayOutputStream baos_a13 = new ByteArrayOutputStream();
                        bitmap_a13.compress(Bitmap.CompressFormat.PNG, 100, baos_a13);
                        byte[] b_a13= baos_a13.toByteArray();

                        Intent Int_a13 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a13.putExtra("titel_name", name_obj13);
                        Int_a13.putExtra("upodetail_name", upodetails_obj13);
                        Int_a13.putExtra("karjodtails_name", karjodtails_obj13);

                        Int_a13.putExtra("picture", b_a13);

                        startActivity(Int_a13);

                        break;

                    case 14:

                        String name_obj14= "ক্যাপসিকাম ও সবজিতে তেলাপিয়া";
                        String upodetails_obj14= "আধা কেজি ওজনের তেলাপিয়া মাছ ১টি, লেবুর রস ২ টেবিল-চামচ, মরিচগুঁড়া ২ টেবিল-চামচ, আদাবাটা ২ চা-চামচ, রসুনবাটা ১ চা-চামচ, ফিশ সস ৩ টেবিল-চামচ, লবণ সামান্য, লাল-হলুদ-সবুজ ক্যাপসিকাম টুকরা ১ কাপ, বেবিকর্ন-ফুলকপি-বরবটি-গাজর-সিম ১ কাপ, টমেটো টুকরা করে কাটা সিকি কাপ, পেঁয়াজ পাপড়ি (ভাঁজ খোলা) সিকি কাপ, কাঁচা মরিচ ৫-৬টি, অলিভ অয়েল ৩ টেবিল-চামচ, কর্নফ্লাওয়ার ১ টেবিল-চামচ, ময়দা ৩ টেবিল-চামচ, সাদা গোলমরিচগুঁড়া ১ চা-চামচ, তেল ভাজার জন্য, চিনি ১ চা-চামচ, রসুনকুচি ১ চা-চামচ।";
                        String karjodtails_obj14= "মাছ ধুয়ে পরিষ্কার করে পানি ঝরিয়ে নিন। মাছের গায়ে বরফি আকারে দাগ কেটে লেবুর রস দিন। মরিচগুঁড়া অর্ধেক, আদা-রসুনবাটা অর্ধেক, ফিশ সস ও সামান্য লবণ মিলিয়ে মাছের দুই পিঠে ও পেটে ভালো করে লাগিয়ে ৩০-৩৫ মিনিট ম্যারিনেট করতে হবে। মাছের দুই পিঠে ময়দা লাগিয়ে ডুবো গরম তেলে বাদামি রং না হওয়া পর্যন্ত ভাজতে হবে। সার্ভিং ডিশে রাখুন। অলিভ অয়েল গরম করে তাতে রসুন বাদামি রং না হওয়া পর্যন্ত ভাজতে হবে। এরপর তাতে আদা-রসুনবাটা, ফিশ সসসহ পর্যায়ক্রমে বাকি সব সবজি দিয়ে কিছুক্ষণ কষিয়ে ১ কাপ পানি দিতে হবে। ফুটে উঠলে লবণ, টমেটো, ক্যাপসিকাম, পেঁয়াজের পাপড়িগুলো দিতে হবে। আধা কাপ কুসুম গরম পানিতে কর্নফ্লাওয়ার গুলিয়ে, চিনি, লেবুর রস মিলিয়ে দিন। কাঁচা মরিচ গোলমরিচগুঁড়া মিলিয়ে মাছের ওপর ঢেলে দিতে হবে। গরম গরম সাদা ভাত, ফ্রায়েড রাইস, পোলাওয়ের সঙ্গে পরিবেশন করা যায়।";

                        Bitmap bitmap_a14 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_15);
                        ByteArrayOutputStream baos_a14 = new ByteArrayOutputStream();
                        bitmap_a14.compress(Bitmap.CompressFormat.PNG, 100, baos_a14);
                        byte[] b_a14 = baos_a14.toByteArray();

                        Intent Int_a14 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a14.putExtra("titel_name", name_obj14);
                        Int_a14.putExtra("upodetail_name", upodetails_obj14);
                        Int_a14.putExtra("karjodtails_name", karjodtails_obj14);

                        Int_a14.putExtra("picture", b_a14);

                        startActivity(Int_a14);
                        break;

                    case 15:
                        String name_obj15= "করলার ঝোলে পাঁচমিশালি মাছ";
                        String upodetails_obj15= "মাছ ২৫০ গ্রাম, করলা দুইটা, পেঁয়াজ কুচি চার টেবিল চামচ, কুমড়ার বড়ি ১০/১৫ পিস, কাঁচামরিচ সাত-আটটা। হলুদ গুঁড়া আধা চা-চামচ, আদা বাটা এক চা-চামচ, রসুন বাটা এক চা-চামচ, সরিষা বাটা এক টেবিল-চামচ, সরিষার তেল সিকি কাপ।";
                        String karjodtails_obj15= "করলা লম্বা আঙুলের মতো কাটতে হবে। দুই টেবিল-চামচ তেলে বড়িগুলো হালকা ভেজে নিতে হবে। পাত্রে তেল দিয়ে কষাতে হবে। মসলার গন্ধ গেলে ঝোলের জন্য পানি দিতে হবে দুই কাপ। পানি ফুটে উঠলে মাছ, করলা ও বড়ি দিয়ে ঢেকে দিতে হবে। জোরে জ্বাল দিতে হবে। অল্প সময়ে চুলার আঁচে রাখতে হবে। কারণ বেশি জ্বাল দিলে করলা তেতো হয়ে যাবে। ঝোলটা নিজের পছন্দমতো করে নিতে হবে। সরিষা বাটা ছাড়াও এই ঝোল রান্না করা যাবে।";

                        Bitmap bitmap_a15 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_16);
                        ByteArrayOutputStream baos_a15 = new ByteArrayOutputStream();
                        bitmap_a15.compress(Bitmap.CompressFormat.PNG, 100, baos_a15);
                        byte[] b_a15 = baos_a15.toByteArray();

                        Intent Int_a15 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a15.putExtra("titel_name", name_obj15);
                        Int_a15.putExtra("upodetail_name", upodetails_obj15);
                        Int_a15.putExtra("karjodtails_name", karjodtails_obj15);

                        Int_a15.putExtra("picture", b_a15);

                        startActivity(Int_a15);

                        break;

                    case 16:
                        String name_obj16= "পুঁই ডাঁটায় পাঙ্গাশ";
                        String upodetails_obj16= "পুঁই ডাঁটা শাক ১ কেজি, মাছ ৮-১০ টুকরা, তেল ৫০ গ্রাম, পেঁয়াজ কুচি ১ টেবিল চামচ, হলুদ গুঁড়া দেড় চা চামচ, মরিচ গুঁড়া ১ চা চামচ, আদা বাটা ১ চা চামচ, রসুন বাটা ১ চা চামচ, আলুর টুকরা ১০-১২টি, লবণ স্বাদমতো।";
                        String karjodtails_obj16= "হলুদ ও লবণ দিয়ে মাছ ও আলুগুলো ভেজে রাখুন। এখন কড়াইতে তেলে পেঁয়াজ ভেজে সব মশলা ও লবণ দিয়ে কষিয়ে তাতে পুঁই ডাঁটা শাক ঢেলে কষান। এরই মধ্যে চার টুকরা মাছ কাঁটা ফেলে ভেঙে শাকের সঙ্গে কষাতে থাকুন। শাক একটু নরম হয়ে এলে প্রথমে আলু ও পরে বাকি মাছ ও গরম পানি দিয়ে রান্না করুন। সব উপকরণ সিদ্ধ হয়ে তরকারির ঝোল একটু ঘন হয়ে এলে নামিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a16 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_17);
                        ByteArrayOutputStream baos_a16= new ByteArrayOutputStream();
                        bitmap_a16.compress(Bitmap.CompressFormat.PNG, 100, baos_a16);
                        byte[] b_a16 = baos_a16.toByteArray();

                        Intent Int_a16 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a16.putExtra("titel_name", name_obj16);
                        Int_a16.putExtra("upodetail_name", upodetails_obj16);
                        Int_a16.putExtra("karjodtails_name", karjodtails_obj16);

                        Int_a16.putExtra("picture", b_a16);

                        startActivity(Int_a16);

                        break;

                    case 17:

                        String name_obj17= "বোয়াল মাছের দই কস্তুরি";
                        String upodetails_obj17= "বোয়াল মাছ ছয় টুকরা, টক দই দুই টেবিল-চামচ, ধনে, হলুদ, মরিচ ও চিনি আধা চা-চামচ করে, রসুন ও আদাবাটা আধা চা-চামচ করে, পেঁয়াজ কুচি এক কাপ, রসুন কুচি সামান্য, তেল আধা কাপ, কুচি করা টমেটো একটি, জিরা গুঁড়া এক চা-চামচ, লবণ, চিনি, কাঁচামরিচ ও ধনেপাতা পরিমাণমতো।";
                        String karjodtails_obj17= "লবণ ও হলুদ দিয়ে মাছ হালকা ভাজতে হবে। টক দইয়ের সঙ্গে সব বাটা ও গুঁড়া মসলা ভালোভাবে ফেটতে হবে। এবার তেল গরম করে রসুন ও পেঁয়াজ ভেজে মাখানো মসলা একটু পানি দিয়ে কষাতে হবে। টমেটো, লবণ ও চিনি দিয়ে মাছ দিতে হবে। দুই মিনিট পর পরিমাণমতো পানি দিয়ে পাঁচ-ছয় মিনিট রান্না করতে হবে। এবার ওপরে কাঁচামরিচ দিয়ে হালকা আঁচে দুই মিনিট রেখে ধনেপাতা দিয়ে নামাতে হবে।";

                        Bitmap bitmap_a17 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_18);
                        ByteArrayOutputStream baos_a17 = new ByteArrayOutputStream();
                        bitmap_a17.compress(Bitmap.CompressFormat.PNG, 100, baos_a17);
                        byte[] b_a17 = baos_a17.toByteArray();

                        Intent Int_a17 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a17.putExtra("titel_name", name_obj17);
                        Int_a17.putExtra("upodetail_name", upodetails_obj17);
                        Int_a17.putExtra("karjodtails_name", karjodtails_obj17);

                        Int_a17.putExtra("picture", b_a17);

                        startActivity(Int_a17);
                        break;

                    case 18:
                        String name_obj18= "মুড়িঘন্ট";
                        String upodetails_obj18= "২ কেজি ওজনের রুই মাছের মাথা ১টি, পেঁয়াজ কুচি সিকি কাপ, পেঁয়াজ বাটা ২ টেবিল চামচ, জিরা বাটা ১ চা-চামচ, আদা বাটা ১ চা-চামচ, রসুন বাটা ১ চা-চামচ, হলুদ গুঁড়া ১ চা-চামচ, মরিচ গুঁড়া ১ চা-চামচ, গোলমরিচ গুঁড়া ১ চা-চামচ, কাঁচা মরিচ ফালি ৮-১০টি, কারি পাউডার ১ চা-চামচ, আদা মিহি কুচি ১ চা-চামচ, রসুন কুচি ১ চা-চামচ, দারুচিনি ২ টুকরা, এলাচ ২ টুকরা, লবণ পরিমাণমতো, তেজপাতা ২টি, আলু ছোট টুকরা আধা কাপ, পোলাওর চাল ৪ টেবিল-চামচ, মুগডাল আধা কাপ, তেল সিকি কাপ, ঘি সিকি কাপ, মেথি সিকি চা-চামচ, চিনি আধা চা-চামচ।";
                        String karjodtails_obj18= "মুগডাল ও চাল ধুয়ে ১ ঘণ্টা ভিজিয়ে রেখে পানি ঝরাতে হবে। মাছের মাথা ছোট টুকরা করে মাছের অংশ ও মুড়ো আলাদা করে রাখতে হবে। ৪ টেবিল চামচ ঘি গরম করে তাতে আলু ভেজে তুলে নিয়ে চাল ও ডাল ভাজতে হবে। অন্য পাত্রে তেল গরম করে মেথির ফোড়ন দিয়ে আদা, রসুন, পেঁয়াজ কুচি ভেজে সব বাটা মসলা ও গুঁড়া মসলা দিয়ে কষিয়ে মাছের অংশ রেখে মুড়ো দিয়ে কষাতে হবে। এবার তাতে চাল, ডাল দিয়ে ডুবো পানি দিয়ে সিদ্ধ করতে হবে। এই সময় লবণ, তেজপাতা, দারুচিনি, এলাচ, গোলমরিচ দিতে হবে। মাছের মুড়ো সিদ্ধ হয়ে পানি শুকিয়ে এলে মুড়োটা ভেঙে উঠিয়ে রেখে ওই হাঁড়িতে বাকি কাটা মাছ ও আলু দিয়ে কষিয়ে নিতে হবে। আবার মাছের মুড়ো ঢেলে দিয়ে ৫ থেকে ৬ কাপ পানি দিয়ে ঢেকে মৃদু আঁচে রান্না করতে হবে।ঝোল কমে এলে চিনি, কারি পাউডার, কাঁচা মরিচ দিয়ে কিছুক্ষণ চুলায় রেখে নামাতে হবে। চুলা থেকে নামিয়ে বাকি ঘি মুড়িঘন্টের ওপর দিয়ে নেড়ে দিতে হবে। ";

                        Bitmap bitmap_a18 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_19);
                        ByteArrayOutputStream baos_a18 = new ByteArrayOutputStream();
                        bitmap_a18.compress(Bitmap.CompressFormat.PNG, 100, baos_a18);
                        byte[] b_a18 = baos_a18.toByteArray();

                        Intent Int_a18 = new Intent(MachActivity.this, AllViewActivity.class);
                        Int_a18.putExtra("titel_name", name_obj18);
                        Int_a18.putExtra("upodetail_name", upodetails_obj18);
                        Int_a18.putExtra("karjodtails_name", karjodtails_obj18);

                        Int_a18.putExtra("picture", b_a18);

                        startActivity(Int_a18);

                        break;

                    case 19:
                        String name_obj19= "ফুলকপি ও রুই মাছের ঝোল";
                        String upodetails_obj19= "রুই মাছ ৮ টুকরা। ফুল কপির ফুল ৮-১০টি। পেঁয়াজ বাটা দুই টেবিল চামচ। রসুন বাটা এক চা চামচ। হলুদ ও ধনে গুঁড়া আধা চা চামচ করে। মরিচ গুঁড়া ঝাল অনুযায়ী। টমেটো কুচি একটি। তেল এক কাপ। পানি প্রয়োজনমতো। জিরা গুঁড়া এক চা চামচ। কাঁচা মরিচ চারটি। ধনেপাতা সামান্য।";
                        String karjodtails_obj19= "মাছ ধুয়ে অল্প হলুদ ও লবণ দিয়ে ভাজতে হবে। এবার ওই তেলে ফুলকপি অল্প আঁচে ভেজে বাকি তেলে রসুন ও পেঁয়াজ কুচি দিয়ে টমেটো ও অন্য সব মসলা দিয়ে রান্না করতে হবে। এবার প্রথমে ফুলকপি দিয়ে তিন মিনিট রান্না করে মাছ ভাজা দিয়ে আরও তিন মিনিট রান্না করে ঝোল দিতে হবে। হয়ে এলে ওপরে কাঁচা মরিচ, ধনেপাতা ও জিরার গুঁড়া ছিটিয়ে অল্প আঁচে আরও দুই-তিন মিনিট রেখে নামাতে হবে।";

                        Bitmap bitmap_a19 = BitmapFactory.decodeResource(getResources(), R.drawable.mas_20);
                        ByteArrayOutputStream baos_a19 = new ByteArrayOutputStream();
                        bitmap_a19.compress(Bitmap.CompressFormat.PNG, 100, baos_a19);
                        byte[] b_a19 = baos_a19.toByteArray();

                        Intent Int_a19 = new Intent(MachActivity.this, AllViewActivity.class);
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
        getMenuInflater().inflate(R.menu.mach, menu);
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
