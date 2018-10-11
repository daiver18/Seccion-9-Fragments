package com.example.daiverandresdoria.seccion06_fragments.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daiverandresdoria.seccion06_fragments.Fragments.DataFragments;
import com.example.daiverandresdoria.seccion06_fragments.Fragments.DetailsFragments;
import com.example.daiverandresdoria.seccion06_fragments.R;

public class MainActivity extends FragmentActivity implements DataFragments.DataListener {
    private boolean isMultiPanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMultiPanel();
    }

    @Override
    public void sendData(String text) {
        //llamar al medodo para renderizar texto en el detailsFragment y pasarle
        //el String que tenemos en este mismo metodo

        if (isMultiPanel){
            DetailsFragments detailsFragments = (DetailsFragments) getSupportFragmentManager().findFragmentById(R.id.DetailsFragment);
            detailsFragments.renderizarText(text);
        }else{
            Intent intent = new Intent(this, detailsActivity.class);
            intent.putExtra("messaje",text);
            startActivity(intent);
        }
    }

    public void setMultiPanel(){
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.DetailsFragment) != null);
    }
}
