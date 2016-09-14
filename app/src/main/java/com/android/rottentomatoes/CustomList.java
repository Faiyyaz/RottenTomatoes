package com.android.rottentomatoes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Faiyyaz on 29-Aug-16.
 */
public class CustomList extends BaseAdapter {

    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    private final String[] date;
    private static zzz
    public CustomList(Activity context,
                      String[] web, Integer[] imageId, String[]date) {
        super(context, R.layout.list_single, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
        this.date=date;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        TextView txtdate = (TextView) rowView.findViewById(R.id.date);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);
        txtdate.setText(date[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
