package com.bwie.bannerdemo;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * author:Created by WangZhiQiang on 2017-10-10.
 * 系统启动 会先运行这个MApp,所以我们在这里进行初始化 框架 组件等等;
 */

public class MApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化组件
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(configuration);

    }
}
