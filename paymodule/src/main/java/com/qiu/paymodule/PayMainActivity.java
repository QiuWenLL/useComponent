package com.qiu.paymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.xiaojinzi.component.anno.RouterAnno;
import com.xiaojinzi.component.impl.Router;

@RouterAnno(
        host = "paymodule",
        path = "pay_main"
)
public class PayMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_main);
    }



    /**
     *
     * 跳转到 main activity
     *
     * @param view
     */
    public void GoMain(View view){
        Router.with(this)
                .host("app")
                .path("app/main")
                .navigate();
    }

    /**
     *
     * 跳转到 module activity
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