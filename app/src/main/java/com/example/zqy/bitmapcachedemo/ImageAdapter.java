package com.example.zqy.bitmapcachedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zqy on 17/12/12.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> urlList;
    private ImageLoader mImageLoader;

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
        mImageLoader = new ImageLoader(mContext);
        initList();
    }

    private void initList() {
        urlList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            urlList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513137608651&di=c79f05b93ecbce0884d86bff6425a88c&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fcrop%253D0%252C0%252C640%252C920%2Fsign%3D5db570ce753e6709aa4f1fbf06f7b30d%2Fa686c9177f3e6709330ec91631c79f3df9dc55c9.jpg");
        }
    }

    @Override
    public int getCount() {
        return urlList.size();
    }

    @Override
    public Object getItem(int position) {
        return urlList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_gridview, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.item_square);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        SquareImageView imageView = viewHolder.imageView;
//        String tag = (String) imageView.getTag();
        String uri = urlList.get(position);
//        if (tag==null||!tag.equals(urlList.get(position))) {
//            imageView.setImageResource(R.mipmap.ic_launcher);
//        } else {
//            imageView.setTag(tag);
            mImageLoader.bindBitmap(uri,imageView,imageView.getWidth(),imageView.getHeight());
//        }
        return convertView;
    }

    class ViewHolder {
        SquareImageView imageView;
    }
}
