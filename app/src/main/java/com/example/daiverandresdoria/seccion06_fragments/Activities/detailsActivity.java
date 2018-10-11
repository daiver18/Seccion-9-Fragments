package com.example.daiverandresdoria.seccion06_fragments.Activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daiverandresdoria.seccion06_fragments.Fragments.DetailsFragments;
import com.example.daiverandresdoria.seccion06_fragments.R;

public class detailsActivity extends AppCompatActivity {
    private String messaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        if (getIntent().getExtras() != null){
            messaje = getIntent().getStringExtra("messaje");
        }

        DetailsFragments detailsFragments = (DetailsFragments) getSupportFragmentManager().findFragmentById(R.id.DetailsFragment);
        detailsFragments.renderizarText(messaje);
    }
}
