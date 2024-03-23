package com.qiu.testcomponent_fir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.xiaojinzi.component.anno.RouterAnno;
import com.xiaojinzi.component.impl.Router;


@RouterAnno(
        host = "app",
        path = "app/main"
)

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     *
     * 跳转到 second activity
     *
     * @param view
     */
    public void GoSecond(View view){
        Router.with(this)
                .host("app")
                .path("app/second")
                .navigate();
    }


    /**
     *
     * 跳转到 second activity
     *
     * @param view
     */
    public void GoPayMain(View view){
        Router.with(this)
                .host("paymodule")
                .path("pay_main")
                .navigate();
    }


    /**
     *
     * 跳转到 second activity
     *
     * @param view
     */
    public void GoModuleMain(View view){
        Router.with(this)
                .host("module1")
                .path("module1/module1_main")
                .navigate();
    }

}