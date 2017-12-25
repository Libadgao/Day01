package com.bwie.bannerdemo;

import android.content.Context;
import android.widget.ImageView;

import com.youth.banner.loader.ImageLoader;
/**
 * Created by Administrator on 2017/2/14.
 */

/**
 * 图片加载器类; 专门让你重写显示图片的方法displayImage,
 * 具体怎么重写呢, 你想怎么重写,你就怎么重写;
 */
public class BannerImageLoader extends ImageLoader {


    /**
     * @param context
     * @param obj       这个传过来的的是图片接口
     * @param imageView
     */
    @Override
    public void displayImage(Context context, Object obj, ImageView imageView) {

        com.nostra13.universalimageloader.core.ImageLoader imageLoaderInstance = com.nostra13.universalimageloader.core.ImageLoader.getInstance();
        imageLoaderInstance.displayImage((String) obj, imageView);

    }
}
