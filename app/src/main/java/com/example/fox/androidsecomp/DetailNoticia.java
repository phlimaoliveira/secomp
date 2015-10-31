package com.example.fox.androidsecomp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fox.androidsecomp.core.Noticia;

public class DetailNoticia extends AppCompatActivity {

    private Toolbar toolbar;

    private ImageView imageNoticia;
    private TextView tituloNoticia;
    private TextView descricaoNoticia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_noticia);

        Intent intent = getIntent();
        Integer position = intent.getIntExtra(MainActivity.POSITION_NOTICIA, 0);

        imageNoticia = (ImageView) findViewById(R.id.image_view_detail_noticia);
        tituloNoticia = (TextView) findViewById(R.id.title_noticia_detail_textview);
        descricaoNoticia = (TextView) findViewById(R.id.descricao_noticia_detail_textview);

        setUpToolbar();
        toolbar.setTitle("Notícias");

        loadNoticia(position);
    }

    public void loadNoticia(int position) {
        Noticia noticia = MainActivity.noticias.get(position);

        imageNoticia.setImageResource(noticia.getImagem());
        tituloNoticia.setText(noticia.getTituloNoticia());
        descricaoNoticia.setText(noticia.getDescricao());

    }

    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_detail);
        toolbar.setTitle("Notícias");
        // Adiciona o botão de voltar na ActionBar
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().show();
    }
}
