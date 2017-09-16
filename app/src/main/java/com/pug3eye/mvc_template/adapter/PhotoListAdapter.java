package com.pug3eye.mvc_template.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.pug3eye.mvc_template.dao.PhotoItemDao;
import com.pug3eye.mvc_template.manager.PhotoListManager;
import com.pug3eye.mvc_template.view.PhotoListItem;

/**
 * Created by pug3eye on 13/09/2017.
 */

public class PhotoListAdapter extends BaseAdapter{

    // How many item?
    @Override
    public int getCount() {
        if (PhotoListManager.getInstance().getDao() == null)
            return 0;
        if (PhotoListManager.getInstance().getDao().getData() == null)
            return 0;
        return PhotoListManager.getInstance().getDao().getData().size();
    }

    @Override
    public Object getItem(int position) {
        return PhotoListManager.getInstance().getDao().getData().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

//    @Override
//    public int getViewTypeCount() {
//        return 2;
//        // return is maximum view type
//    }
//
//    @Override
//    public int getItemViewType(int position) {
//        return position % 2 == 0 ? 0 : 1;
//        // ex. 0 is PhotoListItem , 1 is TextView
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        if (getItemViewType(position) == 0) {
        PhotoListItem item;
        if (convertView != null)
            item = (PhotoListItem) convertView;
        else
            item = new PhotoListItem(parent.getContext());
//        } else {
//            TextView item;
//            if (convertView != null)
//                item = (TextView) convertView;
//            else
//                item = new TextView(parent.getContext());
//            item.setText("Position: " + position);
//            return item;
//        }
        PhotoItemDao dao = (PhotoItemDao) getItem(position);
        item.setTvName(dao.getTitle());
        item.setTvDescription("(" + dao.getSlug() + ").  " + dao.getContent());
        item.setIvImg(dao.getFeaturedImage());

        return item;

    }
}
