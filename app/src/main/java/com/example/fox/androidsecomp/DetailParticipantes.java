package com.example.fox.androidsecomp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fox.androidsecomp.core.Biografia;
import com.example.fox.androidsecomp.core.Participante;

public class DetailParticipantes extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView imageViewParticipante;
    private TextView descricaoParticipante;
    private TextView nomeParticipante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_participantes);

        imageViewParticipante = (ImageView) findViewById(R.id.participante_detail_imageview);
        descricaoParticipante = (TextView) findViewById(R.id.descricao_participante_textview);
        nomeParticipante = (TextView) findViewById(R.id.nome_participante_textview);

        setUpToolbar();

        Intent intent = getIntent();
        int position = intent.getIntExtra(Participantes.POSITION_PARTICIPANTE, 0);
        carregaParticipante(position);
    }

    public void carregaParticipante(int position) {
        Biografia bio = new Biografia();
        if(position == 0) {
            Participante p = bio.chrisOliveira();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 1) {
            Participante p = bio.carolGazarini();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 2) {
            Participante p = bio.amarildo();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 3) {
            Participante p = bio.fabeliaOliveira();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 4) {
            Participante p = bio.jocemarGarcia();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 5) {
            Participante p = bio.ariovaldo();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 6) {
            Participante p = bio.vandreHolanda();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 7) {
            Participante p = bio.pauloHenrique();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 8) {
            Participante p = bio.danielCanedo();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 9) {
            Participante p = bio.adelinoCarvalho();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 10) {
            Participante p = bio.fabricio();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 11) {
            Participante p = bio.ricardoPeres();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 12) {
            Participante p = bio.carlosBrait();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        } else if(position == 13) {
            Participante p = bio.newtonCabral();
            nomeParticipante.setText(p.getNomeParticipante());
            imageViewParticipante.setImageResource(p.getImageParticipante());
            descricaoParticipante.setText(p.getDescricaoParticipante());
        }
    }

    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_detail_participante);
        // Adiciona o botão de voltar na ActionBar
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().show();
    }
}
