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

public class Shak_shobji extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;

    String[] web = {
            "ঢ্যাঁড়সের দোলমা",
            "মিষ্টি কুমড়ার পাপড়ি",
            "বেগুন মাসালা ফ্রাই",
            "পুরভরা বাঁধাকপি",
            "টক-মিষ্টি আচারী বেগুন",
            "শাকে জলপাই",
            "সবজির টিকিয়া",
            "শসা-ইলিশে মাখামাখি",
            "মটরশুঁটির চটপটি",
            "আলু মটরের ভুনা"
    } ;





    Integer[] imageId = {
            R.drawable.shak_1,
            R.drawable.shak_2,
            R.drawable.shak_3,
            R.drawable.shak_4,
            R.drawable.shak_5,
            R.drawable.shak_6,
            R.drawable.shak_7,
            R.drawable.shak_8,
            R.drawable.shak_9,
            R.drawable.shak_10,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shak_shobji);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        CustomAdapter adapter = new CustomAdapter(Shak_shobji.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                //    Toast.makeText(Shak_shobji.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        String name_obj0= "ঢ্যাঁড়সের দোলমা";
                        String upodetails_obj0= "ঢ্যাঁড়স ২৫০ গ্রাম, চিংড়ি ১ কাপ, পেঁয়াজ কুচি ১ কাপ, হলুদগুঁড়া ১ চা-চামচ, মরিচগুঁড়া ১ চা-চামচ, টমেটো ১টা, টকদই ১ টেবিল চামচ, পেঁয়াজ বাটা ১ চা-চামচ, কাঁচা মরিচ কুচি ১ টেবিল চামচ, জিরাগুঁড়া ১ চা-চামচ, ধনেগুঁড়া ১ চা-চামচ, ধনেপাতা কুচি সামান্য।";
                        String karjodtails_obj0= "ঢ্যাঁড়স ধুয়ে পানি ঝরিয়ে নিন, মাঝে চিরে ভেতরের বিচি বের করে নিন। অল্প তেলে পেঁয়াজ ২ টেবিল চামচ, চিংড়ি (ছোট ছোট টুকরা করে কাটা), আধা চা-চামচ হলুদ ও মরিচগুঁড়া, ধনে ও জিরাগুঁড়া আধা চামচ, কাঁচা মরিচ কুচি ও সামান্য লবণ দিয়ে ভেজে নিন। ঢ্যাঁড়সের ভেতর চিংড়ির পুর ঢুকিয়ে দিন যাতে ঢ্যাঁড়স ভেঙে বা ফেটে না যায়। এবার অন্য পাত্রে ১ টেবিল চামচ তেলে বাকি সব উপকরণ ভেজে তাতে পুর ভরা ঢ্যাঁড়স ঢেলে ঢেকে দিন। চুলায় একটু রেখে ধনেপাতা দিয়ে নামিয়ে নিন।";

                        Bitmap bitmap_a0 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_1);
                        ByteArrayOutputStream baos_a0 = new ByteArrayOutputStream();
                        bitmap_a0.compress(Bitmap.CompressFormat.PNG, 100, baos_a0);
                        byte[] b_a0 = baos_a0.toByteArray();

                        Intent Int_a0 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a0.putExtra("titel_name", name_obj0);
                        Int_a0.putExtra("upodetail_name", upodetails_obj0);
                        Int_a0.putExtra("karjodtails_name", karjodtails_obj0);

                        Int_a0.putExtra("picture", b_a0);

                        startActivity(Int_a0);

                        break;

                    case 1:
                        String name_obj1= "মিষ্টি কুমড়ার পাপড়ি";
                        String upodetails_obj1= "মিষ্টি কুমড়া স্লাইস করে কাটা এক কাপ, বেসন ২ টেবিল চামচ, ময়দা ১/২ কাপ, কর্নফ্লাওয়ার ১ টেবিল চামচ, তিল পরিমাণমতো, হলুদের গুঁড়া ১ চা চামচ, মরিচের গুঁড়া ১ চা চামচ, লবণ স্বাদমতো, তেল পরিমাণমতো।";
                        String karjodtails_obj1= "মিষ্টি কুমড়া ও তেল বাদে বাকি সব উপকরণ একসঙ্গে মিশিয়ে পরিমাণমতো পানি দিয়ে গোলা তৈরি করে নিতে হবে। মিষ্টি কুমড়ায় লবণ মেখে গোলায় ডুবিয়ে তিল ছিটিয়ে ডুবো তেলে ভেজে পরিবেশন করতে হবে।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_2);
                        ByteArrayOutputStream baos_a1= new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2= "বেগুন মাসালা ফ্রাই";
                        String upodetails_obj2= "কচি ছোট বা মাঝারি আকারের বেগুন (লম্বালম্বি করে কাটা) ১ কেজি, লবণ আধা চা-চামচ+দেড় চা-চামচ, টমেটো কুচি ছোট ৪টি, কাঁচা মরিচ ফালি ৬টি, লাল মরিচের গুঁড়া ১ চা-চামচ, ধনেগুঁড়া ১ চা-চামচ, মেথিগুঁড়া আধা চা-চামচ, নারকেল বাটা আধা কাপ, ধনেপাতা কুচি ১ টেবিল-চামচ, চিনি ১ টেবিল-চামচ, ঘন তেঁতুলের ক্বাথ ২ টেবিল-চামচ, সরষের তেল ১ কাপ+২ টেবিল-চামচ, হলুদগুঁড়া আধা চা-চামচ+ আধা চা-চামচ, পেঁয়াজ (মিহি কুচি) ১ কাপ, গোটা শুকনা মরিচ ৮টি, জিরা গুঁড়া (ভাজা) ১ চা-চামচ, এলাচি গুঁড়া আধা চা-চামচ, রসুনবাটা ১ চা-চামচ, শাহি গরমমসলার গুঁড়া ১ চা-চামচ, রোস্টেড চিনাবাদামগুঁড়া ২ টেবিল-চামচ, সাদা তিল (ভেজে বেটে নেওয়া) দেড় টেবিল-চামচ, সাদা তিল (ভাজা) ১ টেবিল-চামচ।";
                        String karjodtails_obj2= "বেগুনের বোঁটাসহ লম্বালম্বি করে কেটে নিয়ে সিকি চামচ হলুদগুঁড়া ও আধা চা-চামচ লবণ মেখে ৩০ মিনিট রেখে দিন। এরপর বেগুন থেকে বের হওয়া কালো পানিগুলো ফেলে দিয়ে ভালো করে ধুয়ে পানি ঝরিয়ে নিন। এবার একটি বাটিতে বেগুনগুলো আধা চা-চামচ হলুদ ও আধা চা-চামচ লবণ দিয়ে কিছুক্ষণ মেখে রেখে দিন। কড়াই বা প্যানে আধা কাপ তেল গরম করে বেগুনগুলো ভাজি করে তেল ছেঁকে উঠিয়ে রাখুন। একই তেলে গোটা শুকনো মরিচের ফোঁড়ন দিয়ে পেঁয়াজকুচি হালকা বাদামি করে ভেজে টমেটো কুচি দিয়ে কিছুক্ষণ রান্না করে নিন। কাঁচা মরিচ ফালি, লাল মরিচের গুঁড়া এবং চিনি দিয়ে কিছুক্ষণ কষিয়ে নিন। আঁচ কমিয়ে কিছুক্ষণ ঢেকে রাখুন। একটি বাটিতে ১ কাপ কুসুম গরম পানিতে ধনে, জিরা, এলাচি ও মেথি ইত্যাদি গুঁড়া মসলা, রসুন, নারকেল এবং তিল বাটা একত্রে ভালো করে মিশিয়ে কড়াই বা প্যানে ঢেলে ভালোভাবে কষিয়ে নিন। এরপর খানিকটা গরম পানি দিয়ে ও বাকি লবণ দিয়ে আরও কিছুক্ষণ কষিয়ে নিয়ে তেঁতুলের ক্বাথ দিয়ে মিশিয়ে নেড়ে ভেজে রাখা বেগুনগুলো দিয়ে দিন। ওপরে গরমমসলার ফাকি ছিটিয়ে দিয়ে হালকা নেড়ে নিন। বেগুনগুলো যেন না ভেঙে যায়। এবার ১ টেবিল-চামচ সরষের তেল ও ধনেপাতা কুচি ছিটিয়ে ঢেকে চুলা বন্ধ করে দিন। সবশেষে পাত্রে বেড়ে কিছু রোস্টেড সাদা তিল, ধনেপাতা কুচি ও রোস্টেড চিনাবাদামগুঁড়া ছিটিয়ে সাজিয়ে পরিবেশন করুন।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_3);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3= "পুরভরা বাঁধাকপি";
                        String upodetails_obj3= "বাঁধাকপি বড় ১টা, মাখন ১৫০ গ্রাম, মুরগির মাংস ২২৫ গ্রাম (সেদ্ধ করে কুচি করা), পাউরুটি ৫০ গ্রাম, সবজিসেদ্ধ পানি ১ কাপ, পেঁয়াজ ২টি, গাজর ১ কাপ, কাঁচা মরিচকুচি ১ টেচিল চামচ, লবণ স্বাদমতো, গোলমরিচগুঁড়া ১ চা-চামচ, পেঁয়াজকুচি আধা কাপ।";
                        String karjodtails_obj3= "ফুটন্ত লবণ-পানিতে গোটা বাঁধাকপি পাঁচ মিনিট সেদ্ধ করে পানি ঝরিয়ে নিন। পানিটা রেখে দিন। কপির ওপরে কেটে ভেতরটা গর্ত করে নিন। ওপরের কাটা অংশ দিয়ে ঢাকনার মতো বানিয়ে নিন। প্যানে ৭০ গ্রাম মাখন গরম করে একটি পেঁয়াজকুচি দিয়ে ভুনে নিন। হালকা বাদামি হলে সেদ্ধ মাংস ও কাঁচা মরিচ দিয়ে দুই বা তিন মিনিট নাড়াচাড়া করুন। দুধে পাউরুটি ভিজিয়ে অতিরিক্ত দুধ চিপে ফেলে দিন। রান্না করা মাংসে ভেজানো পাউরুটি, লবণ ও গোলমরিচ দিয়ে মিলিয়ে পুর তৈরি করে নিন। এবার বাঁধাকপিতে পুর ভরে ঢাকনা দিয়ে সাজিয়ে দিন। ওভেনপ্রুভ ডিশে বাকি মাখন গলিয়ে গাজর ও ভাঁজে খোলা পেঁয়াজ বিছিয়ে দিন। এতে কপিসেদ্ধ পানি দিয়ে পুরভরা কপি বসিয়ে অল্প আঁচে রান্না করুন দেড় বা দুই ঘণ্টা। ঢাকনা দিতে হবে। ওভেন প্রিহিট করে নিতে হবে।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_4);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4= "টক-মিষ্টি আচারী বেগুন";
                        String upodetails_obj4= "বড় ১টি বেগুন, হলুদ গুঁড়া ১ চা চামচ, পাঁচ ফোড়ন ১ চা চামচ, পেঁয়াজ বাটা ১ কাপ, রসুন বাটা ১ টেবিল চামচ, মরিচ গুঁড়া ১ চা চামচ, চিনি ১ টেবিল চামচ, তেঁতুল গোলা ৪ টেবিল চামচ, তেল আধা কাপ, লবণ পরিমাণমতো।";
                        String karjodtails_obj4= "বেগুনটি লম্বালম্বি করে কেটে দুভাগ করতে হবে। মশলা ভেতরে ভালভাবে ঢোকার জন্য বেগুনের ভেতর ছুরি দিয়ে কয়েকটি চিড় দিন। এবার বেগুনে সামান্য হলুদ-লবন মাখিয়ে হালকা করে ভেজে নিন। প্যানে পাঁচ ফোড়ন, পেঁয়াজ-মরিচ বাটা, হলুদ ও লবণ দিয়ে একটু কষিয়ে নিতে হবে। কষানো শেষে চিনি, তেতুল গোলা দিয়ে ভুনা করতে থাকুন। মশলা একটু ভুনা হয়ে আসলে বেগুন দিয়ে প্যান ঢেকে মিনিট পাঁচেক রান্না করতে হবে। ব্যস হয়ে গেল টক-মিষ্টি আচারী বেগুন।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_5);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5= "শাকে জলপাই";
                        String upodetails_obj5= "লাল শাক ৩ কাপ, কচুর ছড়া ১ কাপ, জলপাই ৭-৮টা, যেকোনো মাছ ৬ টুকরা, পেঁয়াজ কুচি ২ টেবিল চামচ, বাটা পেঁয়াজ ১ টেবিল চামচ, রসুন কুচি ১ টেবিল চামচ, হলুদ গুঁড়া আধা চা-চামচ, মরিচ গুঁড়া ১ চা-চামচ, লবণ স্বাদমতো, মেথি গুঁড়া আধা চা-চামচ, কাঁচা মরিচ ৩-৪টা, ধনেপাতা ১ টেবিল চামচ।";
                        String karjodtails_obj5= "মাছে হলুদ, লবণ মেখে ভেজে নিন। কচুর ছড়া লবণ দিয়ে সেদ্ধ করে নিন। তেলে পেঁয়াজ ও সব মসলা কষিয়ে সেদ্ধ ছড়া ও জলপাই দিয়ে দিন। অল্প পানি দিন। এবার শাক, মাছ ও কাঁচা মরিচ দিন। সবশেষে ধনেপাতা দিয়ে নামিয়ে নিন। গরম গরম ভাতের সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6= "সবজির টিকিয়া";
                        String upodetails_obj6= "সেদ্ধ বুটের ডাল ২০০ গ্রাম, সেদ্ধ পালংশাক এক কাপ, সেদ্ধ গাজর কুচি আধাকাপ, সেদ্ধ ফুলকপি আধা কাপ, সেদ্ধ মটরশুঁটি আধা কাপ, আদা-রসুন বাটা এক টেবিল চামচ, কাবাব মশলা আধা চা চামচ, গরম মশলা এক চা চামচ, পেঁয়াজ কুচি আধা কাপ, পেঁয়াজ পাতা কুচি দুই টেবিল চামচ, ধনেপাতা কুচি এক টেবিল চামচ, চিড়া আধা কাপ, তেল ভাজার জন্য, লবণ স্বাদমতো।";
                        String karjodtails_obj6= "একটি কড়াইয়ে তেল দিন। তেল গরম হলে পেঁয়াজ, আদা, রসুন, কাঁচামরিচ লাল করে বেরেস্তা করুন। চিড়া বেছে ধুয়ে পনি ঝরিয়ে নিন। বুটের ডাল বাটা সেদ্ধ শাকসবজি চিড়া ও লবণ দিয়ে ভালো করে মেখে ভাজা মশলা, গরম মশলা, কাবাব মশলা, পেঁয়াজ, ধনেপাতা কুচি মিশিয়ে নিন। এবার গোল গোল বলের মতো পানিতে হাত দিয়ে চেপে চ্যাপ্টা করে গরম ডুবো তেলে হাল্কা মৃদু আঁচে লাল বাদামি করে ভেজে তেল ঝরিয়ে সস বা চাটনির সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_7);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7= "শসা-ইলিশে মাখামাখি";
                        String upodetails_obj7= "শসা টুকরা করা ২ কাপ, ইলিশ মাছ ৪ টুকরা, পেয়াঁজ বাটা ২ টেবিল চামচ, নারকেলের দুধ ১ কাপ, হলুদ গুঁড়া আধা চা-চামচ, মরিচগুঁড়া আধা চা-চামচ, কাঁচামরিচ ২-৩টি, লবণ স্বাদমতো, তেল প্রয়োজনমতো।";
                        String karjodtails_obj7= "মাছ কেটে ধুয়ে হলুদ, মরিচ ও লবণ মেখে গরম তেলে ভেজে তুলে রাখুন। এবার কড়াইয়ে আরও কিছু তেল দিয়ে তাতে পেঁয়াজ বাটা, হলুদ গুঁড়া, মরিচ গুঁড়া, লবণ দিয়ে একটু কষিয়ে নারকেলের দুধ এবং শসার টুকরোগুলো দিন৷ একটু নেড়েচেড়ে পরিমাণমতো পানি দিয়ে ঢেকে দিন। ফুটে উঠলে ভাজা ইলিশ মাছ দিন৷ শসা এবং মাছ মাখামাখা হলে কাঁচামরিচ দিয়ে নামিয়ে ভাতের সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_8);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a7.putExtra("titel_name", name_obj7);
                        Int_a7.putExtra("upodetail_name", upodetails_obj7);
                        Int_a7.putExtra("karjodtails_name", karjodtails_obj7);

                        Int_a7.putExtra("picture", b_a7);

                        startActivity(Int_a7);

                        break;

                    case 8:
                        String name_obj8= "মটরশুঁটির চটপটি";
                        String upodetails_obj8= "মটরশুঁটি ২ কাপ, আলু টুকরা করে কাটা ১ কাপ, ভাজা ধনে গুঁড়া ১ চা চামচ, জিরা গুঁড়া ১ চা চামচ, শুকনা মরিচ গুঁড়া ১ চা চামচ, তেঁতুলের মাড় আধা কাপ, পেঁয়াজ কুচি আধা কাপ, ধনে পাতা কুচি ২ টেবিল চামচ, কাঁচামরিচ কুচি ১ টেবিল চামচ, চিনি সামান্য, লবণ স্বাদমতো।";
                        String karjodtails_obj8= "আলু ও মটরশুঁটি সিদ্ধ করে সব মসলা মেশাতে হবে। পরিমাণমতো পানিতে দিয়ে জ্বাল দিতে হবে। ফুটে উঠলে তেঁতুল মাড় ও চিনি দিয়ে নামাতে হবে। পাত্রে ঢেলে পেঁয়াজ কুচি, মরিচ কুচি ও ধনে পাতা কুচি দিয়ে সাজিয়ে পরিবেশন করতে হবে।";

                        Bitmap bitmap_a8 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_9);
                        ByteArrayOutputStream baos_a8 = new ByteArrayOutputStream();
                        bitmap_a8.compress(Bitmap.CompressFormat.PNG, 100, baos_a8);
                        byte[] b_a8 = baos_a8.toByteArray();

                        Intent Int_a8 = new Intent(Shak_shobji.this, AllViewActivity.class);
                        Int_a8.putExtra("titel_name", name_obj8);
                        Int_a8.putExtra("upodetail_name", upodetails_obj8);
                        Int_a8.putExtra("karjodtails_name", karjodtails_obj8);

                        Int_a8.putExtra("picture", b_a8);

                        startActivity(Int_a8);

                        break;

                    case 9:
                        String name_obj9= "আলু মটরের ভুনা";
                        String upodetails_obj9= "আলু কিউব করে কাটা ১ কাপ, মটরশুঁটি ১ কাপ, আদা-রসুন বাটা ১ চা চামচ, এলাচ-দারুচিনি ২-৩ টুকরা, ঘি আধা কাপ, হলুদ গুঁড়া আধা চা চামচ, মরিচ গুঁড়া আধা চা চামচ, কাঁচামরিচ ফালি ২-৩টি, পেঁয়াজ কুচি ১ টেবিল চামচ, পেঁয়াজ বাটা ১ টেবিল চামচ, জিরা গুঁড়া আধা চা চামচ, লবণ স্বাদমতো।";
                        String karjodtails_obj9= "প্যানে ঘি দিয়ে এলাচ, দারুচিনি ও আলু ভেজে নিতে হবে। এবার সব মসলা ও সামান্য পানি দিয়ে কষিয়ে নিতে হবে। মটরশুঁটি ঢেলে অল্প পানি দিয়ে মৃদু আঁচে রান্না করুন। আলু-মটর সিদ্ধ হয়ে গেলে নামিয়ে ভাত বা রুটির সঙ্গে পরিবেশন করুন।";

                        Bitmap bitmap_a9 = BitmapFactory.decodeResource(getResources(), R.drawable.shak_10);
                        ByteArrayOutputStream baos_a9 = new ByteArrayOutputStream();
                        bitmap_a9.compress(Bitmap.CompressFormat.PNG, 100, baos_a9);
                        byte[] b_a9 = baos_a9.toByteArray();

                        Intent Int_a9 = new Intent(Shak_shobji.this, AllViewActivity.class);
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
////////////////////////////////////////////////////////////////////////////////////////
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
        getMenuInflater().inflate(R.menu.shak_shobji, menu);
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
