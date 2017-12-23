package com.example.zqy.bitmapcachedemo;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by zqy on 17/12/11.
 */

public class LoaderResult {

    ImageView imageView;
    String uri;
    Bitmap bitmap;

    public LoaderResult(ImageView imageView, String uri, Bitmap bitmap) {
         this.imageView = imageView;
         this.uri = uri;
         this.bitmap = bitmap;
    }
}
