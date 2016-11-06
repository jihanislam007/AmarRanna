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

public class Supe extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;

    String[] web = { "চিকেন নুডুলস স্যুপ", "চিকেন কর্ণ স্যুপ",
            "সুইট কর্ণ চিকেন সুপ", "পালং ও বেবি কর্ণের স্যুপ ",
            "ইন্ডিয়ান চিকেন স্যুপ ", "মিষ্টি কুমড়ার স্যুপ ", "নুডলস স্যুপ",
            "স্পাইসি থাই স্যুপ রেসিপি"

    };

    Integer[] imageId = { R.drawable.sup_1, R.drawable.sup_2, R.drawable.sup_3,
            R.drawable.sup_4, R.drawable.sup_5, R.drawable.sup_6,
            R.drawable.sup_7, R.drawable.sup_8 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CustomAdapter adapter = new CustomAdapter(Supe.this, web, imageId);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                // Toast.makeText(Sup.this, "You Clicked at " +web[+ position],
                // Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        String name_obj0 = "চিকেন নুডুলস স্যুপ।";
                        String upodetails_obj0 = "মাখন ২ টেবিল চামচ, গাজর ১ কাপ, আধা কাপ পেঁয়াজ, দারুচিনি ১ টুকরো,ছোট ছোট টুকরো করা মাংস, মাংসের স্টক ৪ কাপ, সয়াসস ১ চা চামচ, রসুন কুচি ১/২ চা চামচ, গোলমরিচের গুঁড়া ১/২ চা চামচ, লেবুর রস ১ টেবিল চামচ, কাঁচা মরিচ কুচি ১ টেবিল চামচ, সিদ্ধ এগ নুডুলস এক কাপ, লবণ সামান্য।";
                        String karjodtails_obj0 = "মুরগির হাড় গুলো ধুয়ে সামান্য আদা বাটা, রসুন বাটা ও লবণ, ১ টি তেজপাতা ও দুই লিটার পানিতে সেদ্ধ করুন। পানি শুকিয়ে অর্ধেক হয়ে গেলে নামিয়ে ছেঁকে নিন। তৈরি হয়ে গেল মুরগির স্টক। মুরগির মাংস লবণ এবং সয়াসস মেখে ২০ মিনিট রেখে দিন। পাত্রে মাখন গরম করে পেঁয়াজ ও রসুন কুচি দিয়ে লাল করে ভেজে মাংস ও গাজর দিন। এবার গোলমরিচের গুড়া দিয়ে আগেই করে রাখা চিকেন স্টক দিয়ে দিন। স্যুপ ফুটে উঠলে এতে নুডুলস দিন, এ সময় ঘন ঘন নাড়তে হবে। সবশেষে সয়াসস, সিরকা দিন। ফুটে উঠলে কাঁচামরিচ কুচি, লেবুর রস দিয়ে নামিয়ে গরম গরম পরিবেশন করুন দারুণ মজার চিকেন নুডুলস স্যুপ।";

                        Bitmap bitmap_a = BitmapFactory.decodeResource(getResources(), R.drawable.sup_1);
                        ByteArrayOutputStream baos_a = new ByteArrayOutputStream();
                        bitmap_a.compress(Bitmap.CompressFormat.PNG, 100, baos_a);
                        byte[] b_a = baos_a.toByteArray();

                        Intent mas_a = new Intent(Supe.this, AllViewActivity.class);
                        mas_a.putExtra("titel_name", name_obj0);
                        mas_a.putExtra("upodetail_name", upodetails_obj0);
                        mas_a.putExtra("karjodtails_name", karjodtails_obj0);

                        mas_a.putExtra("picture", b_a);

                        startActivity(mas_a);

                        break;

                    case 1:
                        String name_obj1 = "চিকেন কর্ণ স্যুপ";
                        String upodetails_obj1 = "- মুরগির মাংস ১/২ কাপ\n- মুরগির হাড়(স্টকের জন্য)\n- ডিম ফেটানো ২টা\n- চিনি দেড় চা চামচ\n- কর্ণফ্লাওয়ার ২টে.চা\n- লবণ দেড় চা চামচ\n- কাঁচামরিচ কুচি ১ টেবিল চামচ\n- গোলমরিচের গুড়া স্বাদ মতো\n- স্বাদমতো লবন দেড় চা চামচ\n- বেবি কর্ন/ভুট্টা ১/২ কাপ";
                        String karjodtails_obj1 = "মুরগির হাড়গুলি ২ লিটার পানিতে ২ঘন্টা সিদ্ধ করে নিন।স্টক ছেঁকে ১লিটার স্টক মেপে নিন।মাংস, ছোট কুচি করে নিন।এবার চুলায় একটি হাড়িতে স্টক বসিয়ে দিন।স্টকে মাংস, লবণ, স্বাদলবণ,গোল মরিচের গুড়া, কাঁচা মরিচ কুচি, চিনি এবং বেবি কর্ন/ভুট্টা একসাথে মিশিয়ে নিন।একটি কাপে সামান্য পানিতে কর্নফ্লাওয়ার গুলে স্টকে দিয়ে দিন।স্যুপ ক্রমাগত নাড়তে থাকুন।ফুটে উঠার ১-২ মিনিট পরে সুপ ঘন হয়ে আসলে ফেটানো ডিম ধীরে ধীরে দিয়ে হালকা  নেড়ে দিন।চুলা থেকে নামিয়ে গরম গরম পরিবেশন করুন মজাদার কর্ন স্যুপ।";

                        Bitmap bitmap_a1 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.sup_2);
                        ByteArrayOutputStream baos_a1 = new ByteArrayOutputStream();
                        bitmap_a1.compress(Bitmap.CompressFormat.PNG, 100, baos_a1);
                        byte[] b_a1 = baos_a1.toByteArray();

                        Intent Int_a1 = new Intent(Supe.this, AllViewActivity.class);
                        Int_a1.putExtra("titel_name", name_obj1);
                        Int_a1.putExtra("upodetail_name", upodetails_obj1);
                        Int_a1.putExtra("karjodtails_name", karjodtails_obj1);

                        Int_a1.putExtra("picture", b_a1);

                        startActivity(Int_a1);

                        break;

                    case 2:

                        String name_obj2 = "সুইট কর্ণ চিকেন সুপ ";
                        String upodetails_obj2 = "১.  চিকেন ১ টা।\n২.  ভুট্টা ৩ টা।\n৩. কর্ণফ্লাওয়ার ১ চামচ।\n৪. পেঁয়াজ ১ টা।\n৫. আদা কুচি ২ টেবিল চামচ।\n৬. মরিচ ৫ টা।\n৭. গরম মশলা ১/২ চা চমচ।\n৮.  গোলমরিচ  ৮ টা।\n৯. মাখন ২ চামচ।\n১০.  লবন পরিমানমত।\n১১. চিনি ১/২ চামচ। ";
                        String karjodtails_obj2 = "মুরগি টুকরো করে গোটা ভুট্টা, পেঁয়াজ, আদা-কুচি, মরিচ, লবন দিয়ে জলে সেদ্ধ করুন। সেদ্ধ হলে ভুট্টা থেকে দানা খুলে আলাদা রাখুন। মাংস ঝুরা করে নিন। বাকি সুপ ছেঁকে গরম মশলা, মাখন দিয়ে জ্বালে বসান। অল্প জলে কর্ণফ্লাওয়ার, চিনি গুলে সুপে ঢেলে নাড়ুন। ফুটে উঠলে ভুট্টা দানা ও মাংস ঝুরা ঢেলে নাড়তে থাকুন। তারপর গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a2 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.sup_3);
                        ByteArrayOutputStream baos_a2 = new ByteArrayOutputStream();
                        bitmap_a2.compress(Bitmap.CompressFormat.PNG, 100, baos_a2);
                        byte[] b_a2 = baos_a2.toByteArray();

                        Intent Int_a2 = new Intent(Supe.this, AllViewActivity.class);
                        Int_a2.putExtra("titel_name", name_obj2);
                        Int_a2.putExtra("upodetail_name", upodetails_obj2);
                        Int_a2.putExtra("karjodtails_name", karjodtails_obj2);

                        Int_a2.putExtra("picture", b_a2);

                        startActivity(Int_a2);
                        break;

                    case 3:
                        String name_obj3 = "পালং ও বেবি কর্ণের স্যুপ ";
                        String upodetails_obj3 = "৩/৪ কাপ পালংশাক কাটা, ১/৪ বেবি কর্ণ, ১ টেবিল চামচ মাখন, ২ টেবিল চামচ পেঁয়াজ কুচি, দেড় কাপ দুধ, ১ চা চামচ কর্ণফ্লাওয়ার ও ১ টেবিল চামচ ঠান্ডা দুধের মিশ্রিণ এবং লবণ পরিমাণমতো।";
                        String karjodtails_obj3 = "পালং শাক এবং বেবি কর্ণের মিশ্রণে তৈরি স্যুপ শীতকালের একটি অতুলনীয় খাদ্য।একটি কড়াইয়ে মাখন গরম করে পেঁয়াজ কুচি ও লবণ দিয়ে হালকা আঁচে ১-২ মিনিট ভাজুন। এরপর পালংশাক কাটা ও বেবি কর্ণ দিয়ে নাড়তে থাকুন। একটু পর দেড় কাপ পানি ও দুধ মিশিয়ে ৩ মিনিট ভালোভাবে ফুটান। এতে কর্ণফ্লাওয়ার ও দুধের মিশ্রিণ এবং লবণ দিয়ে নাড়তে থাকুন। চুলা থেকে নামিয়ে একটু ঠান্ডা করে হ্যান্ড ব্লেন্ডার দিয়ে ব্লেন্ড করে আবারো চুলায় বসিয়ে ২ মিনিট ফুটিয়ে এর উপর গোল মরিচের গুড়া ছড়িয়ে দিন। এবার গরম গরম পরিবেশন করুন।";

                        Bitmap bitmap_a3 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.sup_4);
                        ByteArrayOutputStream baos_a3 = new ByteArrayOutputStream();
                        bitmap_a3.compress(Bitmap.CompressFormat.PNG, 100, baos_a3);
                        byte[] b_a3 = baos_a3.toByteArray();

                        Intent Int_a3 = new Intent(Supe.this, AllViewActivity.class);
                        Int_a3.putExtra("titel_name", name_obj3);
                        Int_a3.putExtra("upodetail_name", upodetails_obj3);
                        Int_a3.putExtra("karjodtails_name", karjodtails_obj3);

                        Int_a3.putExtra("picture", b_a3);

                        startActivity(Int_a3);

                        break;

                    case 4:
                        String name_obj4 = "ইন্ডিয়ান চিকেন স্যুপ ";
                        String upodetails_obj4 = "মুরগির মাংস ছোট ছোট টুকরো করে কাটা, মাংসের স্টক ৪ কাপ, মাখন ২ টেবিল চামচ, গাজর ১ কাপ, আধা কাপ পেঁয়াজ কুচি, রসুন কুচি ১/২ চা চামচ, দারুচিনি ১ টুকরো, টেস্টিং সল্ট ১ চা চামচ, সয়াসস ১ চা চামচ, গোলমরিচের গুঁড়া ১/২ চা চামচ, লেবুর রস ১ টেবিল চামচ, কাঁচা মরিচ কুচি ১ টেবিল চামচ, সিদ্ধ এগ নুডুলস এক কাপ, লবণ স্বাদমতো।";
                        String karjodtails_obj4 = "মুরগির মাংস ভাল করে ধুয়ে সামান্য আদা বাটা, রসুন বাটা , লবন, ১ টি তেজপাতা দুই লিটার পানিতে সিদ্ধ করুন। পানি শুকিয়ে অর্ধেক হয়ে গেলে নামিয়ে ছেঁকে নিন। তৈরি হয়ে গেল মুরগির স্টক।এবার মুরগির মাংস, লবণ এবং সয়াসস মেখে ২০ মিনিট রেখে দিন। পাত্রে মাখন গরম করে পেঁয়াজ ও রসুন কুচি দিয়ে লাল করে ভেজে মাংস ও গাজর দিন। এবার গোলমরিচের গুঁড়া দিয়ে আগেই করে রাখা চিকেন স্টক দিয়ে দিন। স্যুপ ফুটে উঠলে এতে এগ নুডুলস দিন। এ সময় ঘন ঘন নাড়তে থাকুন। সবশেষে টেস্টিং সল্ট, সয়াসস, সিরকা দিন। ফুটে উঠলে কাঁচামরিচ কুচি, লেবুর রস দিয়ে নামিয়ে গরম গরম পরিবেশন করুন দারুণ মজার চিকেন নুডুলস স্যুপ। আপনি চাইলে স্যুপে ইচ্ছেমতো শীতের সবজি ব্যবহার করতে পারেন।";

                        Bitmap bitmap_a4 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.sup_5);
                        ByteArrayOutputStream baos_a4 = new ByteArrayOutputStream();
                        bitmap_a4.compress(Bitmap.CompressFormat.PNG, 100, baos_a4);
                        byte[] b_a4 = baos_a4.toByteArray();

                        Intent Int_a4 = new Intent(Supe.this, AllViewActivity.class);
                        Int_a4.putExtra("titel_name", name_obj4);
                        Int_a4.putExtra("upodetail_name", upodetails_obj4);
                        Int_a4.putExtra("karjodtails_name", karjodtails_obj4);

                        Int_a4.putExtra("picture", b_a4);

                        startActivity(Int_a4);

                        break;

                    case 5:
                        String name_obj5 = "মিষ্টি কুমড়ার স্যুপ ";
                        String upodetails_obj5 = "মিষ্টিকুমড়া টুকরো করে কাটা ২৫০ গ্রাম ( খোসা এবং বীজ ছাড়ানো), মাখন ১ টেবিল চামচ, গাজর মাঝারি আকারের ১টি, পেঁয়াজ কুচি ১ টেবিল চামচ, রসুন কুচি ১/২ চা চামচ, লেমন গ্রাস ২ টুকরা, চিকেন স্টক ২ কাপ, খোসা ছাড়ানো চিংড়ি/মুরগির কুচি ৩ টেবিল চামচ, গোল মরিচ গুড়া ১/৪ চা চামচ, টেস্টিং সল্ট ১/২ চা চামচ, লবণ পরিমাণমতো এবং ঘন দুধ ২ টেবিল চামচ।";
                        String karjodtails_obj5 = "শীতের সন্ধ্যায় কনকনে ঠান্ডায় এক বাটি মিষ্টিকুমড়ার স্যুপ আপনার শরীরের উষ্ণতা বজায় রাখবে।প্রথমে একটি কড়াইয়ে মাখন দিয়ে টুকরো মিষ্টি কুমড়াগুলো কয়েক মিনিট নাড়ুন । এরপর এতে টুকরো করা গাজর , স্বাদমতো লবন ও গোলমরিচের গুড়ো দিয়ে ৫ মিনিট নাড়ুন।কুমড়ো ও গাজর দিয়ে পানি ছাড়তে শুরু করলে এতে পেঁয়াজ কুচি, রসুন কুচি, জিরা গুড়া ও চিংড়ি কুচি অর্ধেক দিতে হবে। এবার এতে চিকেন স্টক ঢেলে মৃদু আঁচে আরো ৫ মিনিট রাখুন। এরপর মিশ্রণটি ঠান্ডা করে ব্লেন্ডারে দিয়ে মিহি তরলে পরিণত করুন।\nএবার একটি প্যানে অল্প তেলে বাকি অর্ধেক চিংড়ি কুঁচি এক মিনিটের মতো ভেজে তুলে রাখতে হবে। এরপর এতে ব্লেন্ড করা সবজি ঢেলে দিতে হবে। এতে লেমন গ্রাস ও টেস্টিং সল্ট দিয়ে অনবরত নাড়তে থাকুন। দুই মিনিট পর চুলা থেকে নামিয়ে উপরে সামান্য ক্রিম ও চিংড়ি দিয়ে সাজিয়ে গরম গরম পরিবেশন করতে হবে।";

                        Bitmap bitmap_a5 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.sup_6);
                        ByteArrayOutputStream baos_a5 = new ByteArrayOutputStream();
                        bitmap_a5.compress(Bitmap.CompressFormat.PNG, 100, baos_a5);
                        byte[] b_a5 = baos_a5.toByteArray();

                        Intent Int_a5 = new Intent(Supe.this, AllViewActivity.class);
                        Int_a5.putExtra("titel_name", name_obj5);
                        Int_a5.putExtra("upodetail_name", upodetails_obj5);
                        Int_a5.putExtra("karjodtails_name", karjodtails_obj5);

                        Int_a5.putExtra("picture", b_a5);

                        startActivity(Int_a5);

                        break;

                    case 6:

                        String name_obj6 = "নুডলস স্যুপ";
                        String upodetails_obj6 = "প্যাকেট নুডলস ১টি, সয়া সস ৩-৪ চামচ, টমেটো সস পরিমানমতো, মরিচের গুঁড়ো আধা চা চামচ, তেল, একটা কাঁচা মরিচ ও লবণ সামান্য।";
                        String karjodtails_obj6 = "নুডলস স্যুপ খেতে কার না ভালো লাগে। কিন্তু কাজের চাপে হয়তো বাইরে যেতে পারছেন না। আবারও নুডলস স্যুপও খেতে ইচ্ছা করছে। সেক্ষেত্রে দেরি না করে নিজেই বানিয়ে ফেলুন মজাদার নুডলস স্যুপ। আসুন আজ তাহলে জেনে নিই মজাদার নুডলস স্যুপ রান্নার কৌশল:\n\nদুই কাপ পানি নিয়ে একটু তেল, একটা কাঁচা মরিচ ও অল্প লবণ দিয়ে চুলায় বসান। এর মধ্যে ‌সয়া সস, টমেটো সস ও মরিচের গুঁড়ো দিন। ভাল করে ফুটিয়ে প্যাকেটের নুডলস ঢেলে দিন। এবার ৫ মিনিট জ্বালিয়ে নুডলসের মশলা এর মধ্যে ঢেলে নেড়ে দিন। পরে বাটিতে ঢেলে ৫ মিনিট ঠান্ডা করুন। ব্যস, ঝটপট তৈরি হয়ে গেল নুডলস স্যুপ। এবার নিজের ইচ্ছামতো পরিবেশন করুন।";

                        Bitmap bitmap_a6 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.sup_7);
                        ByteArrayOutputStream baos_a6 = new ByteArrayOutputStream();
                        bitmap_a6.compress(Bitmap.CompressFormat.PNG, 100, baos_a6);
                        byte[] b_a6 = baos_a6.toByteArray();

                        Intent Int_a6 = new Intent(Supe.this, AllViewActivity.class);
                        Int_a6.putExtra("titel_name", name_obj6);
                        Int_a6.putExtra("upodetail_name", upodetails_obj6);
                        Int_a6.putExtra("karjodtails_name", karjodtails_obj6);

                        Int_a6.putExtra("picture", b_a6);

                        startActivity(Int_a6);
                        break;

                    case 7:
                        String name_obj7 = "স্পাইসি থাই স্যুপ রেসিপি";
                        String upodetails_obj7 = " ৪-৫ কাপ চিকেন স্টক\n- ১ টেবিল চামচ তেল\n-আধা কাপ মুরগির মাংস চিকন লম্বাটে করে কাটা আধা কাপ খোসা ছাড়ানো চিংড়ি মাছ\n-২ টি ডিমের কুসুম\n-৩-৪ টেবিল চামচ চিলি সস\n- ২ টেবিল চামচ  ১ টেবিল চামচ সয়াসস\n- ৭=৮ টি কাঁচামরিচ ফালি\n- কর্নফ্লাওয়ার ২ টেবিল চামচ\n- টেস্টিং সল্ট ১ চা চামচ  লেবুর রস ১ চা চামচ\n- ৪/৫ টি লেমন গ্রাস/ থাইল গ্রাস\n- চিনি ১ চা চামচ\n- লবণ স্বাদমতো ";
                        String karjodtails_obj7 = "মুরগীর মাংসের হাড় নিয়ে ১০-১২ কাপ পানিতে একটু লবণ দিয়ে সিদ্ধ করতে থাকুন। পানি শুকিয়ে অর্ধেক হলে চিকেন স্টক তৈরি হয়ে যাবে। এরপর ছেঁকে নিয়ে চিকেন স্টক চুলায় বসিয়ে দিন।\n\n চিকেন স্টকে মাংস, চিংড়ি মাছ, লেমন/থাই গ্রাস, সয়াসস, চিলি সস, টমেটো সস, লবণ, চিনি ও টেস্টিং সল্ট দিয়ে দিন ও নেড়ে মিশিয়ে নিন ভালো করে। ডিমের কুসুম একটি বাটিতে নিয়ে ভালো করে ফেটিয়ে নিন এবং স্টকে ডিম দিয়ে ভালো করে নেড়ে দিন যাতে পুরোপুরি মিশে যায়।\n\n মাংস ও চিংড়ি সেদ্ধ হওয়া পর্যন্ত অল্প আঁচে স্টক জ্বাল দিতে থাকুন। সেদ্ধ হয়ে গেলে আধা কাপ পানিতে কর্ণ ফ্লাওয়ার গুলিয়ে স্টকে দিয়ে দিন।\n\n খুব দ্রুত ও ঘন ঘন নাড়তে নেড়ে কর্নফ্লাওয়ার মিশিয়ে নিন। নতুবা কর্ন ফ্লাওয়ার দলা ধরে যাবে।\n\n ২-৩ মিনিট নেড়ে ঘন হয়ে এলে এতে লেবুর রস ও কাঁচা মরিচ ফালি দিয়ে একটু নেড়ে নিন।লবণের স্বাদ বুঝে নিন এবং এরপর চুলা থাকে নামিয়ে নিন। ব্যস, এবার গরম গরম স্পাইসি থাই স্যুপের মজা নিন হালকা এই শীতে।";

                        Bitmap bitmap_a7 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.sup_8);
                        ByteArrayOutputStream baos_a7 = new ByteArrayOutputStream();
                        bitmap_a7.compress(Bitmap.CompressFormat.PNG, 100, baos_a7);
                        byte[] b_a7 = baos_a7.toByteArray();

                        Intent Int_a7 = new Intent(Supe.this, AllViewActivity.class);
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
        getMenuInflater().inflate(R.menu.supe, menu);
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
