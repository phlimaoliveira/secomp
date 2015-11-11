package com.example.fox.androidsecomp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fox.androidsecomp.R;
import com.example.fox.androidsecomp.core.Noticia;
import com.example.fox.androidsecomp.core.Participante;

import java.util.ArrayList;

/**
 * Created by Fox on 10/11/2015.
 */
public class GridViewAdapter extends BaseAdapter {

    private ArrayList<Participante> mData = new ArrayList<Participante>();
    private LayoutInflater mInflater;

    public GridViewAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(Participante item) {
        mData.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Participante getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderParticipante holderParticipante;
        if (convertView == null) {
            holderParticipante = new ViewHolderParticipante();
            convertView = mInflater.inflate(R.layout.item_gridview, null);

            holderParticipante.imagemParticipante = (ImageView) convertView.findViewById(R.id.participante_imageview);
            holderParticipante.nomeParticipante = (TextView) convertView.findViewById(R.id.nome_participante);

            convertView.setTag(holderParticipante);
        } else {
            holderParticipante = (ViewHolderParticipante) convertView.getTag();
        }

        holderParticipante.imagemParticipante.setImageResource(mData.get(position).getImageParticipante());
        holderParticipante.nomeParticipante.setText(mData.get(position).getNomeParticipante());

        return convertView;
    }

    public static class ViewHolderParticipante {
        public ImageView imagemParticipante;
        public TextView nomeParticipante;
    }

}