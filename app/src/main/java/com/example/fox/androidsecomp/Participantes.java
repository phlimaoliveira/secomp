package com.example.fox.androidsecomp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.fox.androidsecomp.adapter.GridViewAdapter;
import com.example.fox.androidsecomp.core.Participante;

public class Participantes extends AppCompatActivity {

    private Toolbar toolbar;
    private GridView gridViewParticipantes;
    private GridViewAdapter gridViewAdapter;

    public final static String POSITION_PARTICIPANTE = "com.secomp.android.PARTICIPANTE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes);

        setUpToolbar();

        gridViewParticipantes = (GridView) findViewById(R.id.participantes_gridview);
        gridViewAdapter = new GridViewAdapter(getApplicationContext());
        carregaParticipantes();

        gridViewParticipantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailParticipantes = new Intent(getApplicationContext(), DetailParticipantes.class);
                detailParticipantes.putExtra(POSITION_PARTICIPANTE, position);
                startActivity(detailParticipantes);
            }
        });
    }

    public void carregaParticipantes() {
        Participante p;
        p = new Participante(R.drawable.chris_oliveira, "Chris Oliveira");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.carol_gazzarini, "Carol Gazarini");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.amarildo, "Amarildo");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.fabelia_oliveira, "Fabélia Oliveira");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.jocemar_garcia, "Jocemar Garcia");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.ariovaldo, "Ariovaldo");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.vandre_holanda_sales, "Vandré Holanda");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.paulo_henrique, "Paulo Henrique");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.daniel_canedo, "Daniel Canedo");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.adelino_carvalho, "Adelino Carvalho");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.fabricio, "Fabricio");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.ricardo_peres, "Ricardo Peres");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.carlos_brait, "Carlos Brait");
        gridViewAdapter.addItem(p);
        p = new Participante(R.drawable.newton_cabral, "Newton Barbosa");
        gridViewAdapter.addItem(p);
        gridViewParticipantes.setAdapter(gridViewAdapter);
    }

    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_participantes);
        toolbar.setTitle("Participantes");
        // Adiciona o botão de voltar na ActionBar
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().show();
    }
}
