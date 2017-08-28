package com.lijizhi.studydemo.application;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.lijizhi.studydemo.utils.StaticClass;
import com.tencent.bugly.crashreport.CrashReport;

import cn.bmob.v3.Bmob;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.application
  *  文件名:    BaseApplication
  *  创建者 :   LJZ
  *  创建时间:  2017/8/6 0006 下午 9:05
  *  描述   Application
 */
public class BaseApplication extends Application {
    //创建

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化bugly
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_KEY, true);
        //初始化Bmob
        Bmob.initialize(this, StaticClass.BMOB_KEY);
        // 将“12345678”替换成您申请的APPID，申请地址：http://www.xfyun.cn
// 请勿在“=”与appid之间添加任何空字符或者转义符
        SpeechUtility.createUtility(getApplicationContext(), SpeechConstant.APPID + "=" + StaticClass.VOICE_KEY);
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现

    }
}




