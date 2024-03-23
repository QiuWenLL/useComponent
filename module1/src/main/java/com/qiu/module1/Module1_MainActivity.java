package com.qiu.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.xiaojinzi.component.anno.RouterAnno;
import com.xiaojinzi.component.impl.Router;

@RouterAnno(
        host = "module1",
        path="module1/module1_main"
)
public class Module1_MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moudel1_main);


//        findViewById(R.id.text_module).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Router.with(getApplicationContext())
//                        .host("app")
//                        .path("app/main")
//                        .navigate();
//            }
//        });

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