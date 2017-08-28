package com.lijizhi.studydemo.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import static android.R.attr.id;
import static android.support.v7.appcompat.R.id.home;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.ui
  *  文件名: BaseActivity
  *  创建者 : LJZ
  *  创建时间:2017/8/6 0006 下午 9:11
  *  描述    Activity的基类
*/
/*  要做的事情
    1.统一的属性
    2统一的接口
    3统一的方法
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //显示返回键

    }
       //菜单栏操作
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case android.R.id.home:
               finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}



