package com.lokoimmeuble.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText query = findViewById(R.id.search_query);
        Button btn = findViewById(R.id.search_button);
        btn.setOnClickListener(v -> Toast.makeText(this, "Recherche: " + query.getText(), Toast.LENGTH_SHORT).show());

        // Setup RecyclerView with sample properties
        RecyclerView rv = findViewById(R.id.properties_recycler);
        List<Property> sample = new ArrayList<>();
        sample.add(new Property("Appartement 2 chambres — Lomé", "120 000 FCFA"));
        sample.add(new Property("Studio meublé — Agoè", "80 000 FCFA"));
        sample.add(new Property("Maison 3 chambres — Tokoin", "220 000 FCFA"));

        PropertyAdapter adapter = new PropertyAdapter(sample);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
}
