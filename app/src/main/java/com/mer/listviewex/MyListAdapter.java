package com.mer.listviewex;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {

    ArrayList<String> list;
    Context context;

    public MyListAdapter(Context context, ArrayList<String> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.items, null);

        TextView textView = (TextView) view.findViewById(R.id.tvview);
        textView.setText(list.get(position));

//        MyViewHolder holder = new MyViewHolder();
//        holder.tvView = (TextView) view.findViewById(R.id.tvview);
//        holder.tvView.setText(list.get(position));

        Log.d("AppFlow", list.get(position));
        return view;
    }

    class MyViewHolder {
        TextView tvView;
    }
}
