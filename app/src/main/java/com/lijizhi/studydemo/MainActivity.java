package com.lijizhi.studydemo;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.iflytek.cloud.SpeechSynthesizer;
import com.lijizhi.studydemo.fragment.FuFragment;
import com.lijizhi.studydemo.fragment.GirlFragment;
import com.lijizhi.studydemo.fragment.PersonFragment;
import com.lijizhi.studydemo.fragment.WeiFragment;
import com.lijizhi.studydemo.ui.SettingActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     //toolbar
    private  Toolbar toolbar;
    //TabLayout
    private TabLayout mTabLayout;
    //ViewPage
    private ViewPager mViewPage;
    //Title
    private List<String> mTitle;
    //Fragment
    private List<Fragment>mFragment;
    //悬浮窗
    private FloatingActionButton fab_setting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.Toolbar) ;
        setSupportActionBar(toolbar);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
        initData();
        initView();




    }

    //初始化数据
    private void initData() {
        mTitle=new ArrayList<>();
        mTitle.add(getString(R.string.fu));
        mTitle.add(getString(R.string.girl));
        mTitle.add(getString(R.string.wei));
        mTitle.add(getString(R.string.person));

        mFragment=new ArrayList<>();
        mFragment.add(new FuFragment());

        mFragment.add(new GirlFragment());
        mFragment.add(new WeiFragment());

        mFragment.add(new PersonFragment());
    }

    //初始化view
    private void initView() {
        fab_setting=(FloatingActionButton)findViewById(R.id.fab_setting);
        fab_setting.setOnClickListener(this);
        //默认隐藏
        fab_setting.setVisibility(View.GONE);
        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mViewPage=(ViewPager) findViewById(R.id.mViewPager);
        //预加载
        mViewPage.setOffscreenPageLimit(mFragment.size());


        //mviewpage的滑动监听
         mViewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                                              }

           @Override
           public void onPageSelected(int position) {
                Log.i("TAG","position:" +position);

                if (position == 0) {
                    fab_setting.setVisibility(View.GONE);
                } else {
                    fab_setting.setVisibility(View.VISIBLE);
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //设置适配器
        mViewPage.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //选中的item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }
            //返回的个数
            @Override
            public int getCount() {
                return mFragment.size();
            }
            //设置标题
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        //绑定
           mTabLayout.setupWithViewPager(mViewPage);

    }


    //悬浮窗控件的点击跳转方法
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.fab_setting:
              startActivity(new Intent(this,SettingActivity.class));
                break;

        }
    }
}
