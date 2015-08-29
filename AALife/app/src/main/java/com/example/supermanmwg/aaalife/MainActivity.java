package com.example.supermanmwg.aaalife;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import bmobbeans.PersonBean;
import cn.bmob.push.BmobPush;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;
import cn.bmob.v3.listener.SaveListener;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this, "33f482017fa5c338ea3b59d21798623f");
        initPushMessage();

        Button mOnClick = (Button) findViewById(R.id.onclick);

        mOnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPerson();
            }
        });
    }

    private void addPerson() {
        final PersonBean p2 = new PersonBean();
        p2.setName("lucky");
        p2.setAddress("北京海淀");
        p2.save(this, new SaveListener() {
            @Override
            public void onSuccess() {
                // TODO Auto-generated method stub
                Log.d("haha", "添加数据成功，返回objectId为：" + p2.getObjectId());
            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                Log.d("haha", "创建数据失败：" + msg);
            }
        });
    }

    private void initPushMessage() {
        BmobInstallation.getCurrentInstallation(this).save();
        BmobPush.startWork(this, "33f482017fa5c338ea3b59d21798623f");
    }
}
