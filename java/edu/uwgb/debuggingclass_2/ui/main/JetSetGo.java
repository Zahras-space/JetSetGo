package edu.uwgb.debuggingclass_2.ui.main;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import edu.uwgb.debuggingclass_2.R;
import edu.uwgb.debuggingclass_2.ui.*;
import android.widget.Button;

public class JetSetGo extends AppCompatActivity {
    private String currentValue = "";
    private String lastValue = "";
    private String operation = "";
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;
    private Scene scene5;
    private Scene scene6;
    private Scene scene7;
    private Scene scene8;
    private Scene scene9;
    private Scene scene10;
    private Scene scene11;
    private Scene scene12;
    private Scene scene13;

    private Scene scene14;
    private Scene scene15;
    private Scene scene16;
    private Scene scene17;
    private Scene scene18;
    private Scene scene19;
    private Scene scene20;
    private Scene scene21;
    private Scene scene22;
    private Scene scene23;
    private Scene scene24;
    private Scene scene25;
    private Scene scene26;
    private Scene scene27;
    private Scene scene28;

    private Button launch_btn;

        public static boolean isNetworkAvailable(Context context) {
            ConnectivityManager connectivityManager =
                    (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

            if (connectivityManager != null) {
                NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
                return activeNetwork != null && activeNetwork.isConnected();
            }
            return false;
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        if (isNetworkAvailable(this)) {
            Toast.makeText(this, "Internet is connected!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_SHORT).show();
        }

        scene1 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.activity_calculator, this);
        scene2 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.activity_calculator2, this);
        scene3 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.cities, this);
        scene4 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.chicagopage, this);
        scene5 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.chicagoattractions_new, this);
        scene6 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.chicagorestraunts, this);
        scene7 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.chicagoride, this);
        scene8 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.activity_main, this);
        scene9 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.orlandopage, this);
        scene10 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.orlandoattractions, this);
        scene11 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.orlandorestraunts, this);
        scene12 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.orlandoride, this);
        scene13 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.lasvegaspage, this);
        scene14 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.lvattractions, this);
        scene15 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.lvrestraunts, this);
        scene16 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.lvride, this);
        scene17 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.miamipage, this);
        scene18 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.miamiattractions, this);
        scene19 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.miamirestraunts, this);
        scene20 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.miamiride, this);
        scene21 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.washingtonpage, this);
        scene22 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.washingtonattractions, this);
        scene23 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.washingtonrestraunts, this);
        scene24 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.washingtonride, this);
        scene25 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.newyorkpage, this);
        scene26 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.newyorkattractions, this);
        scene27 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.newyorkrestraunts, this);
        scene28 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.newyorkride, this);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
                navigate("Miami"); // Call the method you want

        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        if (intent != null && "callMethod".equals(intent.getStringExtra("action"))) {
            navigate(intent.getStringExtra("cityname")); // Call the method
        }
    }
    protected void navigate(String cityName) {
        switch (cityName) {
            case "New York":
                TransitionManager.go(scene25);
                break;
            case "Los Vegas":
                TransitionManager.go(scene13);
                break;
            case "Chicago":
                TransitionManager.go(scene4);
                break;
            case "Orlando":
                TransitionManager.go(scene9);
                break;
            case "Washington DC":
                TransitionManager.go(scene21);
                break;
            case "Miami":
                TransitionManager.go(scene17);
                break;
            default:
                Toast.makeText(this, "City Not Available", Toast.LENGTH_SHORT).show();
                break;
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                TransitionManager.go(scene1);

            case R.id.item2:
                TransitionManager.go(scene2);

            case R.id.item3:
                TransitionManager.go(scene3);

        }
        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_xml, menu);
        return true;
    }

    // PAGES NAVIGATION //
    public void handleButtonClick(View view) {

        switch (view.getId()) {
            case R.id.chicago:
                TransitionManager.go(scene4);
                break;
            case R.id.cattractions:
                TransitionManager.go(scene5);
                break;
            case R.id.cride:
                TransitionManager.go(scene7);
                break;
            case R.id.crestraunts:
                TransitionManager.go(scene6);
                break;

            case R.id.orlando:
                TransitionManager.go(scene9);
                break;
            case R.id.oattractions:
                TransitionManager.go(scene10);
                break;
            case R.id.orestraunts:
                TransitionManager.go(scene11);
                break;
            case R.id.oride:
                TransitionManager.go(scene12);
                break;


            case R.id.lasvegas:
                TransitionManager.go(scene13);
                break;
            case R.id.lvattractions:
                TransitionManager.go(scene14);
                break;
            case R.id.lvrestraunts:
                TransitionManager.go(scene15);
                break;
            case R.id.lvride:
                TransitionManager.go(scene16);
                break;

            case R.id.miami:
                TransitionManager.go(scene17);
                break;
            case R.id.mattractions:
                TransitionManager.go(scene18);
                break;
            case R.id.mrestraunts:
                TransitionManager.go(scene19);
                break;
            case R.id.mride:
                TransitionManager.go(scene20);
                break;

            case R.id.washington:
                TransitionManager.go(scene21);
                break;
            case R.id.wattractions:
                TransitionManager.go(scene22);
                break;
            case R.id.wrestraunts:
                TransitionManager.go(scene23);
                break;
            case R.id.wride:
                TransitionManager.go(scene24);
                break;


            case R.id.newyork:
                TransitionManager.go(scene25);
                break;
            case R.id.newyork1:
                TransitionManager.go(scene25);
                break;
            case R.id.nattractions:
                TransitionManager.go(scene26);
                break;
            case R.id.nrestraunts:
                TransitionManager.go(scene27);
                break;
            case R.id.nride:
                TransitionManager.go(scene28);
                break;


            case R.id.search_bar:
        //        TransitionManager.go(scene8);
                Intent intent = new Intent(JetSetGo.this, MainActivity.class);
                startActivityForResult(intent, 1);
               // startActivity(page);
                break;

            case R.id.launch:
                String geoUri = "geo:41.8781,87.6298";
                Intent page = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                startActivity(page);
                break;

            default:
                Toast.makeText(this, "No action defined for this button", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //ULRS::RESTRAUNTSS UBER LYFTT //
    public void gotopage(View view) {
        Intent openURL = new Intent(android.content.Intent.ACTION_VIEW);

        switch (view.getId()) {
            case R.id.uber:
                openURL.setData(Uri.parse("https://m.uber.com/go/home?effect="));
                startActivity(openURL);
                break;
            case R.id.lyft:
                openURL.setData(Uri.parse("https://www.lyft.com/rider/open-app?referrer=singular_click_id%3D03e4a642-91f2-45f8-acf6-ed0e27f1f77f"));
                startActivity(openURL);
                break;

               ////////////////CHICAGOO////////////////////////////////
            case R.id.ctabus:
                openURL.setData(Uri.parse("https://ctabustracker.com/home"));
                startActivity(openURL);
                break;
            case R.id.ctatrain:
                openURL.setData(Uri.parse("https://www.transitchicago.com/traintracker/"));
                startActivity(openURL);
                break;

                //////////////////ORLANDO/////////////////////////////////
            case R.id.lynx:
                openURL.setData(Uri.parse("https://www.golynx.com/maps-schedules/routes-schedules.stml"));
                startActivity(openURL);
                break;
            case R.id.lymmo:
                openURL.setData(Uri.parse("https://www.golynx.com/plan-trip/riding-lynx/lymmo/"));
                startActivity(openURL);
                break;
            case R.id.adega:
                openURL.setData(Uri.parse("https://adegagaucha.com/"));
                startActivity(openURL);
                break;
            case R.id.havens:
                openURL.setData(Uri.parse("https://www.havenlakenona.com/"));
                startActivity(openURL);
                break;
            case R.id.boathouse:
                openURL.setData(Uri.parse("https://theboathouseorlando.com/"));
                startActivity(openURL);
                break;

                //////////////LAS VEGAS//////////////////////////////////
            case R.id.lvdeuce:
                openURL.setData(Uri.parse("https://www.rtcsnv.com/ways-to-travel/schedules-maps/"));
                startActivity(openURL);
                break;
            case R.id.lvmonorail:
                openURL.setData(Uri.parse("https://www.lvmonorail.com/"));
                startActivity(openURL);
                break;
            case R.id.skyfall:
                openURL.setData(Uri.parse("https://delanolasvegas.mgmresorts.com/en/nightlife/skyfall-lounge.html"));
                startActivity(openURL);
                break;
            case R.id.prime:
                openURL.setData(Uri.parse("https://bellagio.mgmresorts.com/en/restaurants/prime-steakhouse.html"));
                startActivity(openURL);
                break;
            case R.id.eggscellent:
                openURL.setData(Uri.parse("https://eggscellent.restaurants-world.com/"));
                startActivity(openURL);
                break;




            //////////////MIAMI//////////////////////////////////
            case R.id.metrorail:
                openURL.setData(Uri.parse("https://www.miamidade.gov/global/transportation/metrorail.page"));
                startActivity(openURL);
                break;
            case R.id.metrobus:
                openURL.setData(Uri.parse("https://www.miamidade.gov/global/transportation/metrobus.page"));
                startActivity(openURL);
                break;
            case R.id.houseoffood:
                openURL.setData(Uri.parse("https://houseoffoodporn.com/"));
                startActivity(openURL);
                break;
            case R.id.lamar:
                openURL.setData(Uri.parse("https://www.lamarsf.com/"));
                startActivity(openURL);
                break;
            case R.id.crazyaboutyou:
                openURL.setData(Uri.parse("https://passionrestaurantgroup.com/restaurants/crazy-about-you/"));
                startActivity(openURL);
                break;

            //////////////WASHINGTON//////////////////////////////////
            case R.id.wmatabus:
                openURL.setData(Uri.parse("https://www.wmata.com/service/bus/"));
                startActivity(openURL);
                break;
            case R.id.wmatatrain:
                openURL.setData(Uri.parse("https://www.wmata.com/service/rail/"));
                startActivity(openURL);
                break;
            case R.id.jhollinger:
                openURL.setData(Uri.parse("https://jhollingers.com/"));
                startActivity(openURL);
                break;
            case R.id.melina:
                openURL.setData(Uri.parse("https://www.melinagreek.com/"));
                startActivity(openURL);
                break;
            case R.id.cielo:
                openURL.setData(Uri.parse("https://www.cielo-rojo.com/"));
                startActivity(openURL);
                break;


            //////////////NEW YORK//////////////////////////////////
            case R.id.mtasubway:
                openURL.setData(Uri.parse("https://new.mta.info/guides/riding-the-subway"));
                startActivity(openURL);
                break;
            case R.id.omnybus:
                openURL.setData(Uri.parse("https://new.mta.info/guides/riding-the-bus"));
                startActivity(openURL);
                break;
            case R.id.gage:
                openURL.setData(Uri.parse("https://www.gageandtollner.com/"));
                startActivity(openURL);
                break;
            case R.id.gramercy:
                openURL.setData(Uri.parse("https://www.gramercytavern.com/"));
                startActivity(openURL);
                break;
            case R.id.kochi:
                openURL.setData(Uri.parse("https://www.kochinyc.com/"));
                startActivity(openURL);
                break;


        }
    }


    public void gotopagetest(View view) {
        // Get the URL from the tag
        String url = (String) view.getTag();

        // Check if the URL is not null
        if (url != null) {
            Intent openURL = new Intent(Intent.ACTION_VIEW);
            openURL.setData(Uri.parse(url));
            startActivity(openURL);
        } else {
            // Handle the case where no URL is provided
            Toast.makeText(this, "No URL provided", Toast.LENGTH_SHORT).show();
        }
    }

}
