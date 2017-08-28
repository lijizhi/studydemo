package com.lijizhi.studydemo.utils;

import android.content.Context;
import android.content.SharedPreferences;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.utils
  *  文件名: ShareUtil
  *  创建者 : LJZ
  *  创建时间:2017/8/7 0007 上午 10:43
  *  描述    SharePreferences封装
*/
public class ShareUtil {
    public static final String NAME ="config";
   //键值(string)
    public static void putString(Context mContext,String key,String value){
        SharedPreferences sp=mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putString(key,value).commit();

    }
    //键 默认值(string)
    public  static String getString(Context mContext,String key,String defValue){
        SharedPreferences sp=mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sp.getString(key,defValue);
    }
    //键值(int)
    public static void putInt(Context mContext,String key, int value){
        SharedPreferences sp=mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putInt(key,value).commit();

    }
    //键 默认值(int)
    public  static int getInt(Context mContext, String key, int defValue){
        SharedPreferences sp=mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sp.getInt(key,defValue);
    }

    //键值(int)
    public static void putBoolean(Context mContext,String key, boolean value){
        SharedPreferences sp=mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).commit();

    }
    //键 默认值(int)
    public  static boolean getBoolean(Context mContext, String key, boolean defValue){
        SharedPreferences sp=mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sp.getBoolean(key,defValue);
    }

    //删除单个
    public  static void deleShare(Context mContext,String key) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().remove(key).commit();
    }

    //删除全部
    public static void deleAll(Context mContext) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }


}



























