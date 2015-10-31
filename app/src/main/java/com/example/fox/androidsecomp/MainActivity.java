package com.example.fox.androidsecomp;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.fox.androidsecomp.adapter.ListViewAdapter;
import com.example.fox.androidsecomp.core.Noticia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Noticia> noticias;

    public final static String POSITION_NOTICIA = "com.secomp.android.TITLE_CATEGORIA";

    public Toolbar toolbar;
    public DrawerLayout drawerLayout;
    public NavigationView navigationView;

    private ListView listNoticias;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        noticias = new ArrayList<Noticia>();
        loadNoticias();

        setContentView(R.layout.activity_main);

        // Inicializa o drawerLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        // Configura o toolbar e o navDrawer
        setUpToolbar();
        toolbar.setTitle("XI Secomp");
        setUpNavDrawer();

        // Inicializa o listview e o adapter
        listNoticias = (ListView) findViewById(R.id.listview_noticias);
        adapter = new ListViewAdapter(getApplicationContext());

        // Carrega as noticias para o listView
        for(int i=0; i<MainActivity.noticias.size(); i++) {
            adapter.addItem(MainActivity.noticias.get(i));
        }

        // Seta o adapter no listView
        listNoticias.setAdapter(adapter);

        // Listener do listNoticias
        listNoticias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), DetailNoticia.class);
                intent.putExtra(POSITION_NOTICIA, position);
                startActivity(intent);
            }
        });
    }

    public void loadNoticias() {
        for(int i=0; i<3; i++) {
            noticias.add(noticia1());
            noticias.add(noticia2());
            noticias.add(noticia3());
        }
    }

    public Noticia noticia1() {
        Noticia noticia = new Noticia();

        noticia.setImagem(R.drawable.noticia1);
        noticia.setImagemAuthor(R.drawable.secomp);
        noticia.setNomeAuthor("XI Secomp");
        noticia.setTituloNoticia("Vandré Sales, fundador da Startup Tippz Mobile palestrará na XI Secomp");
        String texto = "Vandré Sales é professor licenciado em Física pela Unicamp e Engenheiro de Computação pela UFG.\n\n" +
                "Fundou o escritório colaborativo PontoGet Coworking em Goiânia e atua no cenário empreendedor digital de Goiás incentivando o desenvolvimento de novas Startups no Centro-Oeste.\n\n" +
                "Atualmente é Diretor de Empreendedorismo, Inovação e Startups pela COMTEC e facilitador do Startup Weekend acompanhando a modelagem de mais de 100 novas Startups.\n\n" +
                "Já palestrou e ministrou diversos workshops em eventos e instituições como: TEDx, Amcham, Unicamp, UFG, Sebrae, dentre outros.\n\n" +
                "Fundou a empresa PontoGet Inovação de Desenvolvimento de Novos Negócios Digitais.\n\n" +
                "Criou a Startup Tippz Mobile – App para controle de contas em bares e restaurantes que permite a análise de comportamento de consumo e interação direta entre clientes e grandes marcas de bebidas. O Tippz foi uma das empresas selecionadas pelo programa Startup Brasil do Governo Federal. A Startup foi a grande vencedora do StartupTur (concurso na área de turismo, gastronomia e hotelaria) e também venceu o Concurso Nacional de Startups 2014, promovido pela ABStartups, Anjos do Brasil, CONAJE e Brazil Innovators, sendo 1º lugar dentre 600 empresas inscritas.Tippz foi escolhida pela Coca-Cola Company Brasil como uma das 10 empresas de inovação do Brasil, apresentando suas soluções durante o Pitch Corporate Coca-Cola in Company 2015 promovido pela ABStartups.Foi selecionada como finalista no Venture Fórum 2015 ABVCAP e DemoDay Startup Brasil Turma 2. E aprovada, também, para o Demo Day 2015 San Francisco – Califórnia pelo Programa Startup Brasil / APEX.";
        noticia.setDescricao(texto);
        return noticia;
    }

    public Noticia noticia2() {
        Noticia noticia = new Noticia();

        noticia.setImagem(R.drawable.noticia2);
        noticia.setImagemAuthor(R.drawable.secomp);
        noticia.setNomeAuthor("XI Secomp");
        noticia.setTituloNoticia("Abertura do evento será realizada pela dupla sertaneja Hugo e Diego");
        String texto = "";
        noticia.setDescricao(texto);
        return noticia;
    }

    public Noticia noticia3() {
        Noticia noticia = new Noticia();

        noticia.setImagem(R.drawable.noticia3);
        noticia.setImagemAuthor(R.drawable.secomp);
        noticia.setNomeAuthor("XI Secomp");
        noticia.setTituloNoticia("Secomp 2015 contará com a presença da Orquestra de Violeiros de Jataí");
        String texto = "";
        noticia.setDescricao(texto);
        return noticia;
    }

    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("XI Secomp");

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().show();
    }

    private void setUpNavDrawer() {
        if (toolbar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationIcon(R.drawable.ic_drawer);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            });
        }
    }



}
