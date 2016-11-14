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

public class Tok_jal_misti extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView list;

    String[] web = { "আমসত্ত্ব", "আমের মোরব্বা", "আমলকীর ঝাল-মিষ্টি আচার",
            "লেবুর আচার", "রেসিপিঃ কাঁচামরিচের আচার", "জলপাইয়ের ঝাল আচার",
            "আমলকী, রসুন ও আদার আচার ", "সাতকড়ার আচার" };

    Integer[] imageId = { R.drawable.tok_pic1, R.drawable.tok_pic2,
            R.drawable.tok_pic3, R.drawable.tok_pic4, R.drawable.tok_pic5,
            R.drawable.tok_pic6, R.drawable.tok_pic7, R.drawable.tok_pic8 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tok_jal_misti);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////working for addmob///////////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        /////////////////////working for addmob///////////////////////////////////////////////////

        CustomAdapter adapter = new CustomAdapter(Tok_jal_misti.this, web,
                imageId);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                // Toast.makeText(Tok_jal_misti.this, "You Clicked at " +web[+
                // position], Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        String name_ob = "আমসত্ত্ব";
                        String upodetails_ob = "কাঁচা আম আধা কেজি, চিনি ৭৫০ গ্রাম, সরিষার তেল কোয়ার্টার কাপ, রসুন বাটা ২ টেবিল চামচ।";
                        String karjodtails_ob = "তেল ছাড়া সব উপকরণ একসঙ্গে সিদ্ধ করে চেলে নিন। তারপর হাঁড়িতে তেল গরম করে সিদ্ধ আম দিয়ে অনবরত নাড়তে থাকুন। যতক্ষণ না ঘন আঠালো মণ্ড তৈরি হয়। তারপর কুলা অথবা গানতার মধ্যে ঢেলে দিয়ে রোদে ৪/৫ দিন শুকান। তারপর ছোট ছোট বরফির মতো করে কেটে পরিবেশন করুন।";

                        Bitmap bitmap = BitmapFactory.decodeResource(
                                getResources(), R.drawable.tok_pic1);
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                        byte[] b = baos.toByteArray();

                        Intent obj = new Intent(Tok_jal_misti.this,
                                AllViewActivity.class);
                        obj.putExtra("titel_name", name_ob);
                        obj.putExtra("upodetail_name", upodetails_ob);
                        obj.putExtra("karjodtails_name", karjodtails_ob);

                        obj.putExtra("picture", b);

                        startActivity(obj);

                        break;

                    case 1:
                        String name_ob1 = "আমের মোরব্বা";
                        String upodetails_ob1 = "বড় কাঁচা আম ৭-৮টি, চিনি দেড় কেজি, ফিটকিরি গুঁড়া ১ চা চামচ এবং পানি পরিমাণ মতো, তেজপাতা ২টি, এলাচ ১ টুকরা, চুন ভেজানো আধা চা চামচ।";
                        String karjodtails_ob1 = "আম ভালো করে ধুয়ে নিন। এরপর খোসা ছাড়িয়ে প্রতিটি আমের ২ টুকরা করে নিন। আমের আঁটি ফেলে পানিতে রাখুন অনেকক্ষণ। কাঁটা চামচ দিয়ে আমগুলো ভালো করে কেচে নিন। এরপর আমগুলো আবার পরিষ্কার পানিতে রাখুন। এভাবে ১ ঘণ্টা পরপর ২ থেকে ৩ বার পানি বদলিয়ে নিন। পরিষ্কার পানিতে চুন ও ফিটকিরি গুলে নিন। চুন ও ফিটকিরি গোলানো পানিতে প্রায় ৩-৪ ঘণ্টা ডুবিয়ে রাখুন। ২ ঘণ্টা পর পানি থেকে আমগুলো নিংড়িয়ে তুলুন। ফুটানো পানিতে আমগুলো দিয়ে কিছুক্ষণ ফুটিয়ে পানি ঝরিয়ে রাখুন। চিনিতে পরিমাণ মতো পানি দিয়ে সিরা তৈরি করুন। সিরায় আম দিয়ে জ্বাল দিতে থাকুন। আচার জ্বাল দেওয়া হলে সেটি নামিয়ে এক রাত রেখে দিন। পরের দিন আবার জ্বাল দিয়ে ঘন হলে তা নমিয়ে বয়ামে ভরে রাখুন।";

                        Bitmap bitmap1 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.tok_pic2);
                        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
                        bitmap1.compress(Bitmap.CompressFormat.PNG, 100, baos1);
                        byte[] b1 = baos1.toByteArray();

                        Intent obj1 = new Intent(Tok_jal_misti.this,
                                AllViewActivity.class);
                        obj1.putExtra("titel_name", name_ob1);
                        obj1.putExtra("upodetail_name", upodetails_ob1);
                        obj1.putExtra("karjodtails_name", karjodtails_ob1);

                        obj1.putExtra("picture", b1);

                        startActivity(obj1);

                        break;

                    case 2:
                        String name_ob2 = "আমলকীর ঝাল-মিষ্টি আচার";
                        String upodetails_ob2 = "আমলকী- আধা কেজি,সরিষা বাটা- ২ টেবিল চামচ,রসুন বাটা- ২ টেবিল চামচ,লবণ- স্বাদমতো,হলুদ গুঁড়া- ১ চা চামচ,মরিচ গুঁড়া- ২ টেবিল চামচ,ভিনেগার- আধা কাপ,শুকনা মরিচ- ৬টা,আদা কুচি- ২ টেবিল চামচ,পাঁচফোড়ন গুঁড়া- ২ টেবিল চামচ,সরিষার তেল- প্রয়োজনমতো";
                        String karjodtails_ob2 = "আমলকীগুলো টুথপিক বা কাঁটা চামচ দিয়ে ছিদ্র ছিদ্র করে বা কেঁচে নিন। এরপর ফিটকিরি মেশানো পানিতে ৭-৮ ঘণ্টা ডুবিয়ে রাখুন। মাঝে মাঝে পানি পালটে দিন। ফিটকিরি মেশানো পানি থেকে আমলকীগুলো তুলে ভালো করে ধুয়ে নিন এবং পানি ঝরতে দিন। একটি পাত্রে পানি নিয়ে তাতে লবণ দিয়ে গরম করুন। পানি ফুটে উঠলে তাতে আমলকীগুলো দিয়ে দিন। ১০ মিনিট পর পাত্রটি নামিয়ে ফেলুন এবং আবার পানি ঝরান। একটি পাত্রে সরিষার তেল নিয়ে চুলোতে বসান। তেল গরম হয়ে গেলে এতে রসুন বাটা দিয়ে হালকা ভেজে নিন। এরপর এতে আদা কুচি, হলুদ গুঁড়া, মরিচ গুঁড়া, শুকনা মরিচ, সরিষা বাটা ও সামান্য লবণ দিয়ে আরেকটু ভেজে নিন। এরপর এতে ভিনেগার ও চিনিটুকু ঢেলে দিয়ে নাড়তে থাকুন। চিনি গলে গেলে এতে আমলকীগুলো দিয়ে দিন। মাঝে মাঝে নেড়ে দিন। এরপর এতে পাঁচফোড়নের গুঁড়া ছিটিয়ে দিয়ে নেড়ে দিন। ৫ মিনিট পর নামিয়ে ফেলুন। আচার তৈরিতে চিনির পরিবর্তে গুড়ও ব্যবহার করতে পারেন। সেক্ষেত্রে গুড় আগেই গলিয়ে নিন। আচার ঠান্ডা হয়ে গেলে বয়ামে তুলে সংরক্ষণ করুন। প্রয়োজনে এতে বাড়তি সরিষার তেলও যোগ করতে পারেন।";

                        Bitmap bitmap2 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.tok_pic3);
                        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
                        bitmap2.compress(Bitmap.CompressFormat.PNG, 100, baos2);
                        byte[] b2 = baos2.toByteArray();

                        Intent obj2 = new Intent(Tok_jal_misti.this,
                                AllViewActivity.class);
                        obj2.putExtra("titel_name", name_ob2);
                        obj2.putExtra("upodetail_name", upodetails_ob2);
                        obj2.putExtra("karjodtails_name", karjodtails_ob2);

                        obj2.putExtra("picture", b2);

                        startActivity(obj2);

                        break;

                    case 3:
                        String name_ob3 = "লেবুর আচার";
                        String upodetails_ob3 = "লেবু টুকরো করা– ২ কাপ , সরিষা বাটা – ১ চা চামচ, পাঁচফোড়ন – ১ চা চামচ, আদা কুচি – ১ চা চামচ, রসুন বাটা – ১/২ চা চামচ,শু কনা মরিচ বাটা – ১ চা চামচ,তেঁতুল (গোলানো) – ১ টেঃ চামচ, চিনি – ১ ১/২ চা চামচ , সিরকা – ২ টেঃ চামচ , সরিষার তেল – ১/২ কাপ, সোডিয়াম বেঞ্জয়েট – ১/৮ চা চামচ, লবন – আন্দাজমত,";
                        String karjodtails_ob3 = "প্রথমে আচার তৈরির জন্য মোটা খোসার লম্বা লেবু বেছে নিতে হবে। লেবু ছোট ছোট টুকরা করে, রস চিপে আলাদা বাটিতে তুলে রাখতে হবে।\n– লেবুর তেঁতো ভাব দূর করার জন্য চুলায় একটি হাঁড়িতে পানি গরম করতে হবে, পানি ফুটে উঠলে লেবুর টুকরো গুলো পানিতে দিয়ে ১০ মিনিট সিদ্ধ করতে হবে। ১০ মিনিট পরে একটি ঝাঁজরিতে লেবু ছেঁকে পানি ফেলে দিয়ে কলের পানিতে ধুয়ে নিতে হবে। আবার লেবুর টুকরো গুলো সিদ্ধ দিন। এভাবে ২-৩ বার পানি বদলে ১০/১৫ মিনিট করে লেবু সিদ্ধ করলে লেবুর তেঁতো ভাব দূর হয়ে যাবে। (একটু লেবু মুখে দিয়ে দেখুন, যদি তিতা ভাব থেকে যায় তবে আরও একবার সিদ্ধ করে নিতে হবে)।\n– এবার একটি কড়াই তেল দিন। তেল হালকা গরম হতেই চুলার আঁচ কমিয়ে পাঁচফোড়ন দিন। পাঁচফোড়ন ফুটে উঠলে আদা দিয়ে সামান্য ভেঁজে একে একে সব বাটা মসলা দিন। একটু নাড়াচাড়া করে ১ টেবিল চামচ সিরকা দিয়ে মসলা কষান। মসলা কষানো হলে লেবু, লবন, চিনি ও আলাদা করে রাখা লেবুর রস দিন।\n-চুলার তাপ মাঝারী রেখে রান্না করুন এবং বাকি ১ টেবিল চামচ সিরকা দিন। মাঝে মাঝে নেড়ে দিবেন। আচারের উপর তেল ভেসে উঠলে চুলা বন্ধ করে ১/২ চা চামচ পানিতে সোডিয়াম বেঞ্জয়েট গুলে আচারে ভালভাবে মিশিয়ে দিন। সবশেষে পরিস্কার শুকনো কাচের বোয়ামে গরম আচার ঢালুন, আচারের তেল উপর পর্যন্ত থাকবে। প্রয়োজনে আচারের উপরে আরও একটু সরিষার তেল দিতে পারেন। আচার ঠাণ্ডা হলে বোয়ামের মুখ ঢাকনা দিয়ে বন্ধ করুন।";

                        Bitmap bitmap3 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.tok_pic4);
                        ByteArrayOutputStream baos3 = new ByteArrayOutputStream();
                        bitmap3.compress(Bitmap.CompressFormat.PNG, 100, baos3);
                        byte[] b3 = baos3.toByteArray();

                        Intent obj3 = new Intent(Tok_jal_misti.this,
                                AllViewActivity.class);
                        obj3.putExtra("titel_name", name_ob3);
                        obj3.putExtra("upodetail_name", upodetails_ob3);
                        obj3.putExtra("karjodtails_name", karjodtails_ob3);

                        obj3.putExtra("picture", b3);

                        startActivity(obj3);

                        break;

                    case 4:
                        String name_ob4 = "রেসিপিঃ কাঁচামরিচের আচার";
                        String upodetails_ob4 = "কাঁচা মরিচ ৫০টি, সরিষার তেল আধা কাপ, মরিচ গুঁড়া আধা চা-চামচ, পাঁচফোড়ন ১ চা-চামচ, রসুন বাটা ১ চা-চামচ, হলুদ গুঁড়া আধা চামচ, কাঁচা মারিচ বাটা ২ চা-চামচ, সিরকা আধা কাপ, চিনি আধা কাপ, তেঁতুল ১ টেবিল-চামচ, লবণ স্বাদমতো। ";
                        String karjodtails_ob4 = "তেল গরম করে এতে সব মসলা দিয়ে কষিয়ে নিন। তেঁতুল, সিরকা, চিনি ও লবণ দিন। এরপর মরিচ দিয়ে কিছুক্ষণ নেড়ে নামিয়ে ফেলুন।";

                        Bitmap bitmap4 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.tok_pic5);
                        ByteArrayOutputStream baos4 = new ByteArrayOutputStream();
                        bitmap4.compress(Bitmap.CompressFormat.PNG, 100, baos4);
                        byte[] b4 = baos4.toByteArray();

                        Intent obj4 = new Intent(Tok_jal_misti.this,
                                AllViewActivity.class);
                        obj4.putExtra("titel_name", name_ob4);
                        obj4.putExtra("upodetail_name", upodetails_ob4);
                        obj4.putExtra("karjodtails_name", karjodtails_ob4);

                        obj4.putExtra("picture", b4);

                        startActivity(obj4);

                        break;

                    case 5:
                        String name_ob5 = "জলপাইয়ের ঝাল আচার";
                        String upodetails_ob5 = "জলপাই- ১২-১৪ টি বড় সাইজের আস্ত রসুনের কোয়া - ২০-২২ টি আদা বাটা- ১ টেবিল চামচ সরিষা গুঁড়া- ১ টেবিল চামচ আস্ত সরিষা- চা চামচ পাঁচ ফোঁড়ন গুঁড়া- ১ টেবিল চামচ  আস্ত পাঁচ ফোঁড়ন - ১ টেবিল চামচ হলুদের গুঁড়া- ১/২ চা চামচ লাল মরিচের গুঁড়া- ১ চা চামচ বা স্বাদ অনুযায়ী জিরার গুঁড়া- ১/২ চা চামচ আস্ত লাল মরিচ - ৪ টি তেজপাতা- ২ টি ভিনেগার- ১/২ কাপ চিনি- ২ চা চামচ( আপনি চাইলে বেশিও দিতে পারেন)সরিষার তেল- আনুমানিক ১/২ কাপ লবন- ১/২ চা চামচ";
                        String karjodtails_ob5 = "1. জলপাই সিদ্ধ করে পানি ঝরিয়ে নিন। ছুরি দিয়ে জলপাই গুলি চারিদিকে চিরে দিন।\n2. একটি পাত্রে পাঁচ ফোঁড়ন গুঁড়া, সরিষার গুরা,হলুদ,মরিচ এবং জিরার গুঁড়া দিয়ে অল্প ভিনেগার দিয়ে পেস্ট তৈরি করুন। এখন জলপাই দিয়ে ভাল ভাবে মাখিয়ে কিছুক্ষন রেখে দিন।\n3. পাত্রে তেল গরম করে আস্ত সরিষা, আস্ত পাঁচ ফোঁড়ন, আস্ত লাল মরিচ এবং তেজপাতা দিয়ে কিছুক্ষন নেড়ে আস্ত রসুনের কোয়া, আদা বাটা এবং লবন দিয়ে কিছুক্ষন নাড়ুন। এখন জলপাই এবং বাকি সব বাটা মশলা দিয়ে ভাল ভাবে নাড়ুন। ভিনেগার এবং চিনি দিয়ে আনুমানিক ২ মিনিট এর মত নেড়ে ঢাকনা দিয়ে ঢেকে চুলার জ্বাল কমিয়ে দিন। ১৫-২০ মিনিট রান্না করুন। মাঝে মাঝে নেড়ে দিন। পাত্র থেকে নামিয়ে ঠাণ্ডা করে জারে ভরুন। অনেক দিনের জন্য সংরক্ষন করতে চাইলে মাঝে মাঝে রোদে দিন অথবা ফ্রিজে রাখুন।";

                        Bitmap bitmap5 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.tok_pic6);
                        ByteArrayOutputStream baos5 = new ByteArrayOutputStream();
                        bitmap5.compress(Bitmap.CompressFormat.PNG, 100, baos5);
                        byte[] b5 = baos5.toByteArray();

                        Intent obj5 = new Intent(Tok_jal_misti.this,
                                AllViewActivity.class);
                        obj5.putExtra("titel_name", name_ob5);
                        obj5.putExtra("upodetail_name", upodetails_ob5);
                        obj5.putExtra("karjodtails_name", karjodtails_ob5);

                        obj5.putExtra("picture", b5);

                        startActivity(obj5);

                        break;

                    case 6:
                        String name_ob6 = "আমলকী, রসুন ও আদার আচার";
                        String upodetails_ob6 = "আমলকী ৫০০ গ্রাম, রসুন ৫০ গ্রাম, আদা কুচি ১ টেবিল চামচ, লবণ পরিমাণ মতো, চিনি ১ চা চামচ, জিরা ও ধনিয়া গুঁড়া ১ টেবিল চামচ, হলুদের গুঁড়া আধা চা চামচ, পাঁচফোড়ন গুঁড়া ১ চা চামচ, কালো জিরা আধা চা চামচ, সরিষার তেল ৫০ গ্রাম, শুকনা মরিচ বাটা ১ চা চামচ, এলাচ ও দারুচিনি গুঁড়া আধা চা চামচ, সরিষা বাটা ১ চা চামচ।";
                        String karjodtails_ob6 = "আমলকী পানি ঝরিয়ে পাতলা কাপড় দিয়ে মুছে লম্বা চিকন করে কাটতে হবে। রসুনের খোসা ছাড়িয়ে ভালো করে কাপড় দিয়ে মুছে নিতে হবে। আদা ছিলে ধুয়ে ভালোভাবে মুছে নিয়ে কুচি করে কেটে নিতে হবে। চুলায় একটি কড়াইয়ে তেল গরম করে তার মধ্যে কালো জিরা দিয়ে আমলকী, রসুন, আদা কুচি ও লবণ দিয়ে ভালো করে নেড়ে পুরো মসলা গুঁড়া ও চিনি দিয়ে ভালোভাবে কিছুক্ষণ নাড়তে হবে। এলাচ ও দারুচিনি গুঁড়া দিতে হবে। তেল আচারের ওপর উঠে গেলে বোঝা যাবে আচার হয়ে গেছে। তখন নামিয়ে একটু রোদে দিয়ে বোয়ামে সংরক্ষণ করতে হবে।";

                        Bitmap bitmap6 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.tok_pic7);
                        ByteArrayOutputStream baos6 = new ByteArrayOutputStream();
                        bitmap6.compress(Bitmap.CompressFormat.PNG, 100, baos6);
                        byte[] b6 = baos6.toByteArray();

                        Intent obj6 = new Intent(Tok_jal_misti.this,
                                AllViewActivity.class);
                        obj6.putExtra("titel_name", name_ob6);
                        obj6.putExtra("upodetail_name", upodetails_ob6);
                        obj6.putExtra("karjodtails_name", karjodtails_ob6);

                        obj6.putExtra("picture", b6);

                        startActivity(obj6);

                        break;

                    case 7:
                        String name_ob7 = "সাতকড়ার আচার";
                        String upodetails_ob7 = "সাতকড়া-২-৩টি, সিরকা-২ কাপ, লবণ-৮ কাপ, সরিষার তেল-১ কাপ, রসুন বাটা-আড়াই চা চামচ, সরিষা বাটা-২ টেবিল চামচ, মরিচ গুঁড়া-৩ চা চামচ, পাঁচফোড়ন গুঁড়া-দেড় চা চামচ";
                        String karjodtails_ob7 = "সাতকড়া ভালোভাবে ধুয়ে বাতাসে শুকিয়ে নিন। টুকরা করে কাটুন। একটি মাটির পাত্রে সাতকড়া টুকরো, লবণ ও সিরকা মিশিয়ে কড়া রোদে দিন তিন-চার দিন। একটি পাত্রে সরিষার তেল গরম করুন। তাতে রসুন বাটা দিয়ে নাড়তে থাকুন। রসুন একটু ভাজা হলে তাতে একে একে বাকি মসলাগুলো দিয়ে কষান। সিরকা থেকে শুধু সাতকড়ার টুকরোগুলো নিয়ে ওই তেলে ছাড়ুন। ভালো করে কষান। লবণ মেশান। সিরকা স্বাদ অনুযায়ী মেশান। তেল ওপরে ভেসে উঠলে নামিয়ে নিন।";

                        Bitmap bitmap7 = BitmapFactory.decodeResource(
                                getResources(), R.drawable.tok_pic8);
                        ByteArrayOutputStream baos7 = new ByteArrayOutputStream();
                        bitmap7.compress(Bitmap.CompressFormat.PNG, 100, baos7);
                        byte[] b7 = baos7.toByteArray();

                        Intent obj7 = new Intent(Tok_jal_misti.this,
                                AllViewActivity.class);
                        obj7.putExtra("titel_name", name_ob7);
                        obj7.putExtra("upodetail_name", upodetails_ob7);
                        obj7.putExtra("karjodtails_name", karjodtails_ob7);

                        obj7.putExtra("picture", b7);

                        startActivity(obj7);

                        break;

                    default:
                        break;
                }

            }

        });
///////////////////////////////////////////////////////////////////////////////////////////
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
        getMenuInflater().inflate(R.menu.tok_jal_misti, menu);
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
            Intent intent= new Intent(Tok_jal_misti.this,MachActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_mansho) {
            Intent intent= new Intent(Tok_jal_misti.this,Mang_sho.class);
            startActivity(intent);

        } else if (id == R.id.nav_chal) {
            Intent intent= new Intent(Tok_jal_misti.this,Chal_dal.class);
            startActivity(intent);

        } else if (id == R.id.nav_kabab) {
            Intent intent= new Intent(Tok_jal_misti.this,Kabab.class);
            startActivity(intent);

        } else if (id == R.id.nav_shak) {
            Intent intent= new Intent(Tok_jal_misti.this,Shak_shobji.class);
            startActivity(intent);

        } else if (id == R.id.nav_panio) {
            Intent intent= new Intent(Tok_jal_misti.this,Panio.class);
            startActivity(intent);

        }else if (id == R.id.nav_vorta) {
            Intent intent= new Intent(Tok_jal_misti.this,Vorta.class);
            startActivity(intent);

        }else if (id == R.id.nav_beking) {
            Intent intent= new Intent(Tok_jal_misti.this,BekingActivity.class);
            startActivity(intent);

        }else if (id == R.id.nav_dim) {
            Intent intent= new Intent(Tok_jal_misti.this,Dim.class);
            startActivity(intent);

        }else if (id == R.id.nav_soup) {
            Intent intent= new Intent(Tok_jal_misti.this,Supe.class);
            startActivity(intent);

        }else if (id == R.id.nav_tok) {
            Intent intent= new Intent(Tok_jal_misti.this,Tok_jal_misti.class);
            startActivity(intent);

        }else if (id == R.id.nav_bideshi) {
            Intent intent= new Intent(Tok_jal_misti.this,Bide_shi.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
