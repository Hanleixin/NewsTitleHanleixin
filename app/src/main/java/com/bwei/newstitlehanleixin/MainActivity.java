package com.bwei.newstitlehanleixin;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.bwei.newstitlehanleixin.fragment.FragmentCare;
import com.bwei.newstitlehanleixin.fragment.FragmentMine;
import com.bwei.newstitlehanleixin.fragment.FragmentVideo;
import com.bwei.newstitlehanleixin.fragment.FramentHome;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    Button home;
    Button video;
    Button care;
    Button mine;

    RelativeLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("Oliver","onCreate并引入布局文件");
        setContentView(R.layout.activity_main);

        //查找相关控件的方法
        getID();

    }

    //查找相关控件的方法
    public void getID(){

        home = (Button) findViewById(R.id.bth_main_home);
        video = (Button) findViewById(R.id.bth_main_scover);
        care = (Button) findViewById(R.id.bth_main_care);
        mine= (Button) findViewById(R.id.bth_main_mine);

        home.setOnClickListener(this);
        video.setOnClickListener(this);
        care.setOnClickListener(this);
        mine.setOnClickListener(this);
    }

     public void selected(){

         home.setSelected(false);
         video.setSelected(false);
         care.setSelected(false);
         mine.setSelected(false);

         home.setTextColor(getResources().getColor(R.color.main_button_select_before));
         video.setTextColor(getResources().getColor(R.color.main_button_select_before));
         care.setTextColor(getResources().getColor(R.color.main_button_select_before));
         mine.setTextColor(getResources().getColor(R.color.main_button_select_before));

     }

    @Override
    public void onClick(View view) {

        selected();

        switch (view.getId()){

            case R.id.bth_main_home:
                home.setSelected(true);
                home.setTextColor(getResources().getColor(R.color.all_background_title));
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_framelayout,new FramentHome()).commit();
                break;
            case R.id.bth_main_scover:
                video.setSelected(true);
                video.setTextColor(getResources().getColor(R.color.all_background_title));
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_framelayout,new FragmentVideo()).commit();
                break;
            case R.id.bth_main_care:
                care.setSelected(true);
                care.setTextColor(getResources().getColor(R.color.all_background_title));
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_framelayout,new FragmentCare()).commit();
                break;
            case R.id.bth_main_mine:
                mine.setSelected(true);
                mine.setTextColor(getResources().getColor(R.color.all_background_title));
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_framelayout,new FragmentMine()).commit();
                break;
        }
    }
}
