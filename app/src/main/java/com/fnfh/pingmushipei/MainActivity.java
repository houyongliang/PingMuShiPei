package com.fnfh.pingmushipei;

import android.os.Bundle;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.zhy.autolayout.AutoLayoutActivity;

import java.util.List;


public class MainActivity extends AutoLayoutActivity implements View.OnClickListener {
    String [] str= {"HHH","WWW","QQQ"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        RecyclerView ry= (RecyclerView) findViewById(R.id.ry);
        ry.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter=new MyAdapter(  this,str);
        ry.setAdapter(myAdapter);

    }



    @Override
    public void onClick(View view) {


    }


}
