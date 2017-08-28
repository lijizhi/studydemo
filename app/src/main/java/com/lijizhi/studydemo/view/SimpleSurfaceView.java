package com.lijizhi.studydemo.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.view
  *  文件名: SimpleSurfaceView
  *  创建者 : LJZ
  *  创建时间:2017/8/10 0010 下午 8:42
  *  描述    直播界面点赞效果
*/
public class SimpleSurfaceView extends SurfaceView implements SurfaceHolder.Callback,Runnable{

// 子线程标志位
private boolean isRunning;

//画笔
private Paint mPaint;

    public SimpleSurfaceView(Context context) {
        super(context,null);
    }

    public SimpleSurfaceView(Context context, AttributeSet attrs) {
        super(context,attrs);
        initView();

    }

    private void initView() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void run() {

    }
}




