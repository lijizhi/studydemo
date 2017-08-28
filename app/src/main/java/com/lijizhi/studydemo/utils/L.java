package com.lijizhi.studydemo.utils;

import android.util.Log;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.utils
  *  文件名: L
  *  创建者 : LJZ
  *  创建时间:2017/8/7 0007 上午 10:23
  *  描述    TODO
*/
public class L {
    //开关
    public static final boolean DEBUG = true;
    //TAG
    public  static final String TAG ="StudyDemo";
    //五个等级
    public static void d(String text){
        if (DEBUG){
            Log.d(TAG,text);
        }
    }
    public  static void i(String text){
        if(DEBUG){
            Log.i(TAG,text);
        }

    }
    public static  void w(String text){
        if (DEBUG){
            Log.e(TAG,text);
        }
    }
    public static  void e(String text){
        if (DEBUG){
            Log.e(TAG,text);
        }
    }

}
