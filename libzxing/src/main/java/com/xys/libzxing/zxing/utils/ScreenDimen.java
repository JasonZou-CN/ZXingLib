package com.xys.libzxing.zxing.utils;

import android.content.Context;

import java.lang.reflect.Field;

/**
 * @项目 ZXingLib
 * @类名 com.xys.libzxing.zxing.utils
 * @描述 略
 * @创建人 jasonzou
 * @创建时间 2018/1/16 15:13
 */
public class ScreenDimen {
    public static int getStatusBarHeight(Context context) {
        try {
            Class<?> c = Class.forName("com.android.internal.R$dimen");
            Object obj = c.newInstance();
            Field field = c.getField("status_bar_height");
            int x = Integer.parseInt(field.get(obj).toString());
            return context.getResources().getDimensionPixelSize(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int dip2px(Context context, int pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue * scale + 0.5f);
    }
}
