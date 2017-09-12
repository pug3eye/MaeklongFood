package com.pug3eye.mvc_template.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.pug3eye.mvc_template.view.PhotoListItem;

/**
 * Created by pug3eye on 13/09/2017.
 */

public class PhotoListAdapter extends BaseAdapter{

    // How many item?
    @Override
    public int getCount() {
        return 10000;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return new PhotoListItem(parent.getContext());
    }
}
