package com.lijizhi.studydemo.ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.lijizhi.studydemo.R;
import com.lijizhi.studydemo.utils.UtilTools;

import java.util.ArrayList;
import java.util.List;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.ui
  *  文件名: AboutActivity
  *  创建者 : LJZ
  *  创建时间:2017/8/23 0023 上午 5:22
  *  描述    关于软件
*/
public class AboutActivity extends BaseActivity {

    private ListView mListView;
    private List<String> mList = new ArrayList<>();
    private ArrayAdapter<String>mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        initView();
    }

    //初始化View
    private void initView() {
        mListView = (ListView) findViewById(R.id.mListView);

        mList.add(getString(R.string.text_app_name) + getString(R.string.app_name));
        mList.add(getString(R.string.text_version) + UtilTools.getVersion(this));


        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mList);
        //设置适配器
        mListView.setAdapter(mAdapter);
    }
}
