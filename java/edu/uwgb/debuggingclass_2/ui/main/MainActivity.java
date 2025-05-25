package edu.uwgb.debuggingclass_2.ui.main;

import static android.support.v4.content.ContextCompat.startActivity;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.support.v7.app.AppCompatActivity;
import android.app.Fragment;
import android.widget.Toast;

import java.util.ArrayList;
import edu.uwgb.debuggingclass_2.R;
import edu.uwgb.debuggingclass_2.ui.main.JetSetGo;



public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private SearchView searchView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> cityList;
    //private Scene scene4 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.chicagopage, this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        searchView = findViewById(R.id.searchView);

        // Sample city data
        cityList = new ArrayList<>();
        cityList.add("New York");
        cityList.add("Los Vegas");
        cityList.add("Chicago");
        cityList.add("Orlando");
        cityList.add("Washington DC");
        cityList.add("Miami");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cityList);
        listView.setAdapter(adapter);

        // Handle item clicks
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedCity = adapter.getItem(position);
            if (selectedCity != null) {
                Intent intent = new Intent(MainActivity.this, JetSetGo.class);
                switch (selectedCity) {
                    case "New York":
                      //  Intent intent = new Intent(MainActivity.this, JetSetGo.class);
                        intent.putExtra("action", "callMethod");
                        intent.putExtra("cityname",selectedCity);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        setContentView(R.layout.newyorkpage);
                        startActivity(intent);
                        finish();
                        break;
                    case "Los Vegas":
                       // Intent intent = new Intent(MainActivity.this, JetSetGo.class);
                        intent.putExtra("action", "callMethod");
                        intent.putExtra("cityname",selectedCity);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        setContentView(R.layout.lasvegaspage);
                        startActivity(intent);
                        finish();
                        break;
                    case "Chicago":
                       // Intent intent = new Intent(MainActivity.this, JetSetGo.class);
                        intent.putExtra("action", "callMethod");
                        intent.putExtra("cityname",selectedCity);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        setContentView(R.layout.chicagopage);
                        startActivity(intent);
                        finish();
                        break;
                    case "Orlando":
                     //   Intent intent = new Intent(MainActivity.this, JetSetGo.class);
                        intent.putExtra("action", "callMethod");
                        intent.putExtra("cityname",selectedCity);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        setContentView(R.layout.orlandopage);
                        startActivity(intent);
                        finish();
                        break;
                    case "Washington DC":
                      //  Intent intent = new Intent(MainActivity.this, JetSetGo.class);
                        intent.putExtra("action", "callMethod");
                        intent.putExtra("cityname",selectedCity);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        setContentView(R.layout.washingtonpage);
                        startActivity(intent);
                        finish();
                        break;
                    case "Miami":
                     //   Intent intent = new Intent(MainActivity.this, JetSetGo.class);
                        intent.putExtra("action", "callMethod");
                        intent.putExtra("cityname",selectedCity);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        setContentView(R.layout.miamipage);
                        startActivity(intent);
                        finish();
                        break;
                    default:
                        Toast.makeText(this, "City Not Available", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        // Set up search functionality
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_xml, menu);
        return true;
    }
}