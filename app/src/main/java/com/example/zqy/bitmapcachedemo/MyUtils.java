package com.example.zqy.bitmapcachedemo;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by zqy on 17/12/11.
 */

public class MyUtils {
    public static void close(Closeable closeable) {

        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
