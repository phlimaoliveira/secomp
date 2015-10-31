package com.example.fox.androidsecomp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fox.androidsecomp.R;
import com.example.fox.androidsecomp.core.Noticia;

import java.util.ArrayList;

/**
 * Created by Fox on 30/10/2015.
 */
public class ListViewAdapter extends BaseAdapter {

    private ArrayList<Noticia> mData = new ArrayList<Noticia>();
    private LayoutInflater mInflater;

    public ListViewAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(Noticia item) {
        mData.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Noticia getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holderNoticia;
        if (convertView == null) {
            holderNoticia = new ViewHolder();
            convertView = mInflater.inflate(R.layout.list_item, null);

            holderNoticia.imagemNoticia = (ImageView) convertView.findViewById(R.id.image_item_listview);
            holderNoticia.imagemAuthor = (ImageView) convertView.findViewById(R.id.image_author);
            holderNoticia.tituloNoticia = (TextView) convertView.findViewById(R.id.title_noticia_textview);
            holderNoticia.nomeAuthor = (TextView) convertView.findViewById(R.id.author_noticia_textview);

            convertView.setTag(holderNoticia);
        } else {
            holderNoticia = (ViewHolder) convertView.getTag();
        }

        holderNoticia.imagemNoticia.setImageResource(mData.get(position).getImagem());
        holderNoticia.imagemAuthor.setImageResource(mData.get(position).getImagemAuthor());
        holderNoticia.tituloNoticia.setText(mData.get(position).getTituloNoticia());
        holderNoticia.nomeAuthor.setText(mData.get(position).getNomeAuthor());

        return convertView;
    }

    public static class ViewHolder {
        public ImageView imagemNoticia;
        public ImageView imagemAuthor;
        public TextView tituloNoticia;
        public TextView nomeAuthor;
    }

}
