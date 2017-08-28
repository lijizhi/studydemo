package com.lijizhi.studydemo.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.lijizhi.studydemo.R;
import com.xys.libzxing.zxing.encoding.EncodingUtils;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.ui
  *  文件名: QrCodeActivity
  *  创建者 : LJZ
  *  创建时间:2017/8/15 0015 下午 7:08
  *  描述    生成二维码
*/
public class QrCodeActivity extends BaseActivity {

    //我的二维码
    private ImageView iv_qr_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);

        initView();
    }

    private void initView() {

        iv_qr_code = (ImageView) findViewById(R.id.iv_qr_code);
        //屏幕的宽
        int width = getResources().getDisplayMetrics().widthPixels;
        Bitmap qrCodeBitmap = EncodingUtils.createQRCode("我是悠客", width / 2, width / 2,BitmapFactory.decodeResource(getResources(), R.mipmap.ic_heart));
       iv_qr_code.setImageBitmap(qrCodeBitmap);
    }
}
