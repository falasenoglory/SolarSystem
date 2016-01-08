package sidespell.tech.solarsystem.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import sidespell.tech.solarsystem.R;

public class MainActivity extends AppCompatActivity {

    private Spinner spnPlanet;
    private ImageView imgPlanet;
    private TextView text;
    private static int[] Planet={R.drawable.mercury,R.drawable.venus,R.drawable.earth,
            R.drawable.mars,R.drawable.jupiter,R.drawable.saturn,R.drawable.uranus,R.drawable.neptune,R.drawable.pluto};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spnPlanet = (Spinner) findViewById(R.id.spnPlanet);
        imgPlanet = (ImageView) findViewById(R.id.imgPlanet);
        text = (TextView) findViewById(R.id.txtChooseAPlanet);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnPlanet.setAdapter(adapter);


        spnPlanet.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                if (spnPlanet.getSelectedItem().toString().equals("Mercury")) {
                    imgPlanet.setImageResource(R.drawable.mercury);
                } else if (spnPlanet.getSelectedItem().toString().equals("Venus")) {
                    imgPlanet.setImageResource(R.drawable.venus);

                } else if (spnPlanet.getSelectedItem().toString().equals("Earth")) {
                    imgPlanet.setImageResource(R.drawable.earth);
                } else if (spnPlanet.getSelectedItem().toString().equals("Mars")) {
                    imgPlanet.setImageResource(R.drawable.mars);
                } else if (spnPlanet.getSelectedItem().toString().equals("Jupiter")) {
                    imgPlanet.setImageResource(R.drawable.jupiter);
                } else if (spnPlanet.getSelectedItem().toString().equals("Saturn")) {
                    imgPlanet.setImageResource(R.drawable.saturn);
                } else if (spnPlanet.getSelectedItem().toString().equals("Uranus")) {
                    imgPlanet.setImageResource(R.drawable.uranus);
                }
                else if (spnPlanet.getSelectedItem().toString().equals("Neptune")) {
                    imgPlanet.setImageResource(R.drawable.neptune);
                }
                else if (spnPlanet.getSelectedItem().toString().equals("Pluto")) {
                    imgPlanet.setImageResource(R.drawable.pluto);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }

}
