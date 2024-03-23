package com.qiu.testcomponent_fir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.xiaojinzi.component.anno.RouterAnno;
import com.xiaojinzi.component.impl.Router;

@RouterAnno(
        host = "app",
        path="app/second"
)
public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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

}