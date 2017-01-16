package com.fnfh.pingmushipei;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;


/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/12/28.
 */

public class UseDeviceSizeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
