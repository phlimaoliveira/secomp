package com.example.fox.androidsecomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.fox.androidsecomp.adapter.ListViewProgramacao;
import com.example.fox.androidsecomp.core.Programacao;

public class ProgramacaoActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listViewProgramacao;
    private ListViewProgramacao adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacao);

        listViewProgramacao = (ListView) findViewById(R.id.listview_programacao);
        adapter = new ListViewProgramacao(getApplicationContext());

        setUpToolbar();

        adapter.addItem(new Programacao("19 as 20h", "Abertura oficial com show da dupla Hugo e Diego e composição da mesa diretiva.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Palestra: Carol Gazarini e Chris Oliveira (AJE Jataí) – Pense globalmente e execute localmente: as novas fronteiras do agronegócio.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Palestra: Dr. Ariovaldo Luchiari Junior (Embrapa) – Tenologias da Informação e Comunicações Aplicadas à Produção Agrícola – AGROTICS.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Abertura oficial com show da dupla Hugo e Diego e composição da mesa diretiva.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Palestra: Carol Gazarini e Chris Oliveira (AJE Jataí) – Pense globalmente e execute localmente: as novas fronteiras do agronegócio.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Palestra: Dr. Ariovaldo Luchiari Junior (Embrapa) – Tenologias da Informação e Comunicações Aplicadas à Produção Agrícola – AGROTICS.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Abertura oficial com show da dupla Hugo e Diego e composição da mesa diretiva.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Palestra: Carol Gazarini e Chris Oliveira (AJE Jataí) – Pense globalmente e execute localmente: as novas fronteiras do agronegócio.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Palestra: Dr. Ariovaldo Luchiari Junior (Embrapa) – Tenologias da Informação e Comunicações Aplicadas à Produção Agrícola – AGROTICS.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Abertura oficial com show da dupla Hugo e Diego e composição da mesa diretiva.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Palestra: Carol Gazarini e Chris Oliveira (AJE Jataí) – Pense globalmente e execute localmente: as novas fronteiras do agronegócio.", "CCE"));
        adapter.addItem(new Programacao("19 as 20h", "Palestra: Dr. Ariovaldo Luchiari Junior (Embrapa) – Tenologias da Informação e Comunicações Aplicadas à Produção Agrícola – AGROTICS.", "CCE"));

        listViewProgramacao.setAdapter(adapter);
    }

    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_programacao);
        // Adiciona o botão de voltar na ActionBar
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().show();
    }

}
