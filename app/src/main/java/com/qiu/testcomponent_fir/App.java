package com.qiu.testcomponent_fir;

import android.app.Application;

import com.xiaojinzi.component.Component;
import com.xiaojinzi.component.Config;
import com.xiaojinzi.component.impl.BuildConfig;
import com.xiaojinzi.component.impl.application.ModuleManager;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        // 初始化
        Component.init(BuildConfig.DEBUG, Config.with(this).build());
        // 如果你依赖了 rx 版本,需要配置这句代码,否则删除这句
        // RxErrorIgnoreUtil.ignoreError();
        // 注册其他业务模块,注册的字符串是上面各个业务模块配置在 build.gradle 中的 HOST
        ModuleManager.getInstance().registerArr("app","module1","paymodule");
        // 让框架在 Debug 的时候检查.
        if (BuildConfig.DEBUG) {
            // 框架还带有检查重复的路由和重复的拦截器等功能,在 `debug` 的时候开启它
            Component.check();
        }

    }

}
