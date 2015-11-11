package com.example.fox.androidsecomp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fox.androidsecomp.R;
import com.example.fox.androidsecomp.core.Noticia;
import com.example.fox.androidsecomp.core.Programacao;

import java.util.ArrayList;

/**
 * Created by Fox on 11/11/2015.
 */
public class ListViewProgramacao extends BaseAdapter {

    private ArrayList<Programacao> mData = new ArrayList<Programacao>();
    private LayoutInflater mInflater;

    public ListViewProgramacao(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(Programacao item) {
        mData.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Programacao getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holderProgramacao;
        if (convertView == null) {
            holderProgramacao = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_programacao_listview, null);

            holderProgramacao.horario = (TextView) convertView.findViewById(R.id.horario_textview);
            holderProgramacao.nomePalestra = (TextView) convertView.findViewById(R.id.nome_palestra_textview);
            holderProgramacao.local = (TextView) convertView.findViewById(R.id.local_palestra_textview);

            convertView.setTag(holderProgramacao);
        } else {
            holderProgramacao = (ViewHolder) convertView.getTag();
        }

        holderProgramacao.horario.setText(mData.get(position).getHorario());
        holderProgramacao.nomePalestra.setText(mData.get(position).getNomePalestra());
        holderProgramacao.local.setText(mData.get(position).getLocal());

        return convertView;
    }

    public static class ViewHolder {
        public TextView horario;
        public TextView nomePalestra;
        public TextView local;
    }

}
