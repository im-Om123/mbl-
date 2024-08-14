package com.mblprg.unit_6_listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] title;
    String[] description;
    int[] image;
    public MyListAdapter(Activity context, String[] title, String[] description, int[] image) {
        super(context, R.layout.custom_list_layout,title);
        this.context=context;
        this.title=title;
        this.description=description;
        this.image=image;
    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_list_layout,null,true);

        TextView txtTitle=(TextView) rowView.findViewById(R.id.titleText);
        ImageView imageView=rowView.findViewById(R.id.image);
        TextView txtDescription=(TextView) rowView.findViewById(R.id.text2);

        txtTitle.setText(title[position]);
        txtDescription.setText(description[position]);
        imageView.setImageResource(image[position]);
        return rowView;
    };

}
