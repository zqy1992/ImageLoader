package com.example.zqy.bitmapcachedemo;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.FileDescriptor;

/**
 * Created by zqy on 17/12/11.
 */

public class ImageResizer {

    private static final String TAG = "ImageResizer";

    public Bitmap decodeSampleFromResource(Resources res, int resId, int reqWidth, int reqHeight) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res,resId,options);
    }

    public Bitmap decodeSampleFromFileDescriptor(FileDescriptor fd, int reqWidth, int reqHeight) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fd, null, options);
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fd, null, options);
    }

    private int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        if (reqWidth == 0 || reqHeight == 0) {
            return 1;
        }

        int width = options.outWidth;
        int height = options.outHeight;
        int inSampleSize = 1;

        if (width < reqWidth || height < reqHeight) {
            return inSampleSize;
        }
        inSampleSize *= 2;
        while (width /inSampleSize>=reqWidth&&height/inSampleSize>=reqHeight){
            inSampleSize *=2;
        }
        Log.e(TAG, "inSampleSize: "+inSampleSize);
       return inSampleSize;
    }
}
